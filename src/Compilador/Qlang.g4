grammar Qlang;

statList: statementComposition EOF;

statementComposition: (statements ';')* (statements ';'?);
statements:
	question				# questionOrder
	| variableDeclaration	# declarationOrder
	| assignment			# assignmentOrder
	| execution				# executionOrder
	| export				# exportOrder
	| code					# codeOrder
	| simpleCode			# simpleCodeOrder;

question:
	questionHole			# hole
	| questionOpen			# open
	| questionCodeHole		# codeHole
	| questionCodeOpen		# codeOpen
	| questionColeOutput	# coleOutput
	| questionMultiChoice	# multichoice
	| questionComposed		# Composed;

code: 'code' ID 'is' (PIL assignment?)+ 'end';
simpleCode:
	'println' (STRING | ID | ('text(' ID ')'))*
	| 'print' (STRING | ID | ('text(' ID ')'))*;

questionHole: 'hole' ID 'is' commandComposition 'end';
questionOpen: 'open' ID 'is' commandComposition 'end';
questionCodeHole: 'code-hole' ID 'is' commandComposition 'end';
questionCodeOpen: 'code-open' ID 'is' commandComposition 'end';
questionColeOutput:
	'code-output' ID 'is' commandComposition 'end';
questionMultiChoice:
	'multi-choice' ID 'is' commandComposition 'end';
questionComposed: 'composed' ID 'is' commandComposition 'end';

commandComposition: (command ';')* command?;

assignment:
	ID ':=' term		# IDAssignment
	| ID ':=' 'new' ID	# ReadAssignment
	| ID '->' term		# HoleQuestionAssignment;

term
	returns[Type eType, String varName]:
	'(' term ')'											# Parenthesisterm
	| term '|' term											# Stdoutterm
	| op = ('-' | '+' | 'not') term							# UnaryTerm
	| term op = ('*' | ':' | '%') term						# TermMultDivMod
	| term op = ('+' | '-') term							# TermAddMinus
	| term op = ('=' | '>=' | '<=' | '>' | '<' | '/=') term	# TermBinaryRelational
	| term op = (
		'and'
		| 'or'
		| 'xor'
		| 'implies'
		| 'and then'
		| 'or else'
	) term						# TermBinaryLogical
	| NUMBER (('/' NUMBER)?)	# Fraction
	| ID						# IDTerm
	| STRING					# TextTerm
	| 'read' STRING				# ReadTerm
	| type = (
		'integer'
		| 'real'
		| 'text'
		| 'question'
		| 'fraction'
		| 'code'
	) '(' term ')'	# TypeTerm
	| execution		# ExecutionTerm;

command:
	'print' (assignment | term)*							# PrintSentence
	| 'println' ((assignment | term) ('|program')?)*		# PrinttermSentence
	| 'uses code from ' STRING codeholeComposition? 'end'	# UsesCodeSentence
	| 'uses code ' ID codeholeComposition? 'end'			# UsesCodePil
	| 'choice' (term ',')? STRING 'end'						# ChoiceSentence
	| execution												# ExecutionSentence
	| assignment											# AssignmentCommand
	| variableDeclaration									# DeclarationCommand
	| ifLineSentence										# ifLine;

variableDeclaration:
	ID ':' type = (
		'integer'
		| 'real'
		| 'text'
		| 'question'
		| 'fraction'
		| 'code'
	);

ifLineSentence: ifBlock elseifBlock* elseBlock? 'end';
ifBlock: 'if' term 'then' (statements)+;
elseifBlock: 'elseif' term 'then' (statements)+;
elseBlock: 'else' (statements)+;

execution
	returns[Type eType, String varName]:
	'execute' (term ',')? (new = 'new')? ID;

export: 'export' ID 'to' exportedlocation;

exportedlocation
	returns[Type eType, String varName]: STRING;

codeholeComposition:
	(codehole ';')* (codehole | (codehole ';'));

codehole: (NUMBER ',')? (NUMBER ',')? (STRING | ID) (
		'line' NUMBER
	)?;

STARTPIL: '{' | '[' | '(' | '<';
FINISHPIL: '}' | ']' | ')' | '>';
PIL:
	'\'' STARTPIL .*? FINISHPIL '\''
	| '"' STARTPIL .*? FINISHPIL '"';

STRING: '"' .*? '"' | '\'' .*? '\'';
ID: [a-zA-Z_][a-zA-Z0-9._]*;
BOOLEAN: 'true' | 'false';
NUMBER: [0-9]+;

SKIPPING: [ \n\t]+ -> skip;
NEWterm: '\r'? '\n';
BLOCKCOMMENT: '#//' .*? '//#' -> skip;
SINGLECOMMENT: '#' .*? '\n' -> skip;