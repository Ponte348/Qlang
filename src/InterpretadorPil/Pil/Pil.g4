grammar Pil;

program: compound? EOF;

compound:
    statementWithBreak* (statement | statementWithBreak)    #compoundStatement
    ;

statementWithBreak:
    statement ';'       #breakStatement
    ;

statement:
    assignment          #assignmentStatement
    | write             #writeStatement
    | ifclause          #ifclauseStatement
    | loopclause        #loopclauseStatement
    ;

assignment:
    idset ':=' expr                        #assignExpr
    ;

write:
    'write' expr (',' expr)*            #writeExpr
    | 'writeln' expr (',' expr)*        #writelnExpr
    ;

ifclause:
    'if' expr 'then' compound ('else' elseStat=compound)? 'end'  #ifStatement
    ;

loopclause:
    'loop' statementWithBreak* Looper expr 'do' compound 'end'  #loopCompoundStatement
    | 'loop' compound Looper expr 'do' 'end'         #loopStatement
    ;

idset: ID
    ;

expr returns [Type eType, String varName]: 
    '(' expr ')'                        #ExprParenthesis
    | op=('+' | '-' | 'not') expr       #ExprUnary
    | expr op=('*' | ':' | '%') expr    #ExprMulDivMod
    | expr op=('+' | '-') expr          #ExprAddSub
    | expr op=CompareOperator expr      #ExprCompare
    | expr op=BooleanOperator expr      #ExprBoolOp
    | idset                             #ExprIdset
    | INTEGER                           #ExprInteger
    | REAL                              #ExprReal
    | TEXT                              #ExprText
    | BOOLEAN                           #ExprBoolean
    | type=Types '(' expr ')'           #ExprType
    | 'read' expr                       #ExprRead
    | 'error'                           #ExprError
    ;

BOOLEAN: 'true' | 'false';
Looper: 'until' | 'while';
Types: 'integer' | 'real' | 'text';
CompareOperator: '=' | '/=' | '<' | '<=' | '>' | '>=';
BooleanOperator: 'and' | 'and' 'then' | 'or' | 'or' 'else' | 'xor' | 'implies';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
INTEGER: [0-9]+;
REAL: [0-9]+ '.' [0-9]+;
TEXT: '"' .*? '"';
String: '"' .*? '"';
WS: [ \t\r\n]+ -> skip;
Comment: '--' .*? '\n' -> skip; 
