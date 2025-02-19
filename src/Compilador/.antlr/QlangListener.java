// Generated from /home/alof/Desktop/Compiladores/qlang-q05/src/Compilador/Qlang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QlangParser}.
 */
public interface QlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QlangParser#statList}.
	 * @param ctx the parse tree
	 */
	void enterStatList(QlangParser.StatListContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#statList}.
	 * @param ctx the parse tree
	 */
	void exitStatList(QlangParser.StatListContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#statementComposition}.
	 * @param ctx the parse tree
	 */
	void enterStatementComposition(QlangParser.StatementCompositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#statementComposition}.
	 * @param ctx the parse tree
	 */
	void exitStatementComposition(QlangParser.StatementCompositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code questionOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterQuestionOrder(QlangParser.QuestionOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code questionOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitQuestionOrder(QlangParser.QuestionOrderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationOrder(QlangParser.DeclarationOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationOrder(QlangParser.DeclarationOrderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOrder(QlangParser.AssignmentOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOrder(QlangParser.AssignmentOrderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code executionOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterExecutionOrder(QlangParser.ExecutionOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code executionOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitExecutionOrder(QlangParser.ExecutionOrderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exportOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterExportOrder(QlangParser.ExportOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exportOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitExportOrder(QlangParser.ExportOrderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code codeOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterCodeOrder(QlangParser.CodeOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code codeOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitCodeOrder(QlangParser.CodeOrderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCodeOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCodeOrder(QlangParser.SimpleCodeOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCodeOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCodeOrder(QlangParser.SimpleCodeOrderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hole}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void enterHole(QlangParser.HoleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hole}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void exitHole(QlangParser.HoleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code open}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void enterOpen(QlangParser.OpenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code open}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void exitOpen(QlangParser.OpenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code codeHole}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void enterCodeHole(QlangParser.CodeHoleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code codeHole}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void exitCodeHole(QlangParser.CodeHoleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code codeOpen}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void enterCodeOpen(QlangParser.CodeOpenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code codeOpen}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void exitCodeOpen(QlangParser.CodeOpenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code coleOutput}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void enterColeOutput(QlangParser.ColeOutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code coleOutput}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void exitColeOutput(QlangParser.ColeOutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multichoice}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void enterMultichoice(QlangParser.MultichoiceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multichoice}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void exitMultichoice(QlangParser.MultichoiceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Composed}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void enterComposed(QlangParser.ComposedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Composed}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 */
	void exitComposed(QlangParser.ComposedContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(QlangParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(QlangParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#simpleCode}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCode(QlangParser.SimpleCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#simpleCode}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCode(QlangParser.SimpleCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#questionHole}.
	 * @param ctx the parse tree
	 */
	void enterQuestionHole(QlangParser.QuestionHoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#questionHole}.
	 * @param ctx the parse tree
	 */
	void exitQuestionHole(QlangParser.QuestionHoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#questionOpen}.
	 * @param ctx the parse tree
	 */
	void enterQuestionOpen(QlangParser.QuestionOpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#questionOpen}.
	 * @param ctx the parse tree
	 */
	void exitQuestionOpen(QlangParser.QuestionOpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#questionCodeHole}.
	 * @param ctx the parse tree
	 */
	void enterQuestionCodeHole(QlangParser.QuestionCodeHoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#questionCodeHole}.
	 * @param ctx the parse tree
	 */
	void exitQuestionCodeHole(QlangParser.QuestionCodeHoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#questionCodeOpen}.
	 * @param ctx the parse tree
	 */
	void enterQuestionCodeOpen(QlangParser.QuestionCodeOpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#questionCodeOpen}.
	 * @param ctx the parse tree
	 */
	void exitQuestionCodeOpen(QlangParser.QuestionCodeOpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#questionColeOutput}.
	 * @param ctx the parse tree
	 */
	void enterQuestionColeOutput(QlangParser.QuestionColeOutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#questionColeOutput}.
	 * @param ctx the parse tree
	 */
	void exitQuestionColeOutput(QlangParser.QuestionColeOutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#questionMultiChoice}.
	 * @param ctx the parse tree
	 */
	void enterQuestionMultiChoice(QlangParser.QuestionMultiChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#questionMultiChoice}.
	 * @param ctx the parse tree
	 */
	void exitQuestionMultiChoice(QlangParser.QuestionMultiChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#questionComposed}.
	 * @param ctx the parse tree
	 */
	void enterQuestionComposed(QlangParser.QuestionComposedContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#questionComposed}.
	 * @param ctx the parse tree
	 */
	void exitQuestionComposed(QlangParser.QuestionComposedContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#commandComposition}.
	 * @param ctx the parse tree
	 */
	void enterCommandComposition(QlangParser.CommandCompositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#commandComposition}.
	 * @param ctx the parse tree
	 */
	void exitCommandComposition(QlangParser.CommandCompositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDAssignment}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterIDAssignment(QlangParser.IDAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDAssignment}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitIDAssignment(QlangParser.IDAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadAssignment}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterReadAssignment(QlangParser.ReadAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadAssignment}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitReadAssignment(QlangParser.ReadAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HoleQuestionAssignment}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterHoleQuestionAssignment(QlangParser.HoleQuestionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HoleQuestionAssignment}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitHoleQuestionAssignment(QlangParser.HoleQuestionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadTerm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterReadTerm(QlangParser.ReadTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadTerm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitReadTerm(QlangParser.ReadTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermMultDivMod}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermMultDivMod(QlangParser.TermMultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermMultDivMod}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermMultDivMod(QlangParser.TermMultDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fraction}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFraction(QlangParser.FractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fraction}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFraction(QlangParser.FractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeTerm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTypeTerm(QlangParser.TypeTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeTerm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTypeTerm(QlangParser.TypeTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Stdoutterm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterStdoutterm(QlangParser.StdouttermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Stdoutterm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitStdoutterm(QlangParser.StdouttermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermBinaryLogical}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermBinaryLogical(QlangParser.TermBinaryLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermBinaryLogical}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermBinaryLogical(QlangParser.TermBinaryLogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDTerm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterIDTerm(QlangParser.IDTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDTerm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitIDTerm(QlangParser.IDTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExecutionTerm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterExecutionTerm(QlangParser.ExecutionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExecutionTerm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitExecutionTerm(QlangParser.ExecutionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermAddMinus}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermAddMinus(QlangParser.TermAddMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermAddMinus}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermAddMinus(QlangParser.TermAddMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextTerm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTextTerm(QlangParser.TextTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextTerm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTextTerm(QlangParser.TextTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryTerm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterUnaryTerm(QlangParser.UnaryTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryTerm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitUnaryTerm(QlangParser.UnaryTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermBinaryRelational}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermBinaryRelational(QlangParser.TermBinaryRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermBinaryRelational}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermBinaryRelational(QlangParser.TermBinaryRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesisterm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisterm(QlangParser.ParenthesistermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesisterm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisterm(QlangParser.ParenthesistermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintSentence}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 */
	void enterPrintSentence(QlangParser.PrintSentenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintSentence}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 */
	void exitPrintSentence(QlangParser.PrintSentenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrinttermSentence}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 */
	void enterPrinttermSentence(QlangParser.PrinttermSentenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrinttermSentence}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 */
	void exitPrinttermSentence(QlangParser.PrinttermSentenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UsesCodeSentence}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 */
	void enterUsesCodeSentence(QlangParser.UsesCodeSentenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UsesCodeSentence}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 */
	void exitUsesCodeSentence(QlangParser.UsesCodeSentenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UsesCodePil}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 */
	void enterUsesCodePil(QlangParser.UsesCodePilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UsesCodePil}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 */
	void exitUsesCodePil(QlangParser.UsesCodePilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChoiceSentence}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 */
	void enterChoiceSentence(QlangParser.ChoiceSentenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChoiceSentence}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 */
	void exitChoiceSentence(QlangParser.ChoiceSentenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExecutionSentence}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 */
	void enterExecutionSentence(QlangParser.ExecutionSentenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExecutionSentence}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 */
	void exitExecutionSentence(QlangParser.ExecutionSentenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentCommand}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentCommand(QlangParser.AssignmentCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentCommand}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentCommand(QlangParser.AssignmentCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationCommand}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationCommand(QlangParser.DeclarationCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationCommand}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationCommand(QlangParser.DeclarationCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifLine}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 */
	void enterIfLine(QlangParser.IfLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifLine}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 */
	void exitIfLine(QlangParser.IfLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(QlangParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(QlangParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#ifLineSentence}.
	 * @param ctx the parse tree
	 */
	void enterIfLineSentence(QlangParser.IfLineSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#ifLineSentence}.
	 * @param ctx the parse tree
	 */
	void exitIfLineSentence(QlangParser.IfLineSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(QlangParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(QlangParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#elseifBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseifBlock(QlangParser.ElseifBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#elseifBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseifBlock(QlangParser.ElseifBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(QlangParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(QlangParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#execution}.
	 * @param ctx the parse tree
	 */
	void enterExecution(QlangParser.ExecutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#execution}.
	 * @param ctx the parse tree
	 */
	void exitExecution(QlangParser.ExecutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#export}.
	 * @param ctx the parse tree
	 */
	void enterExport(QlangParser.ExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#export}.
	 * @param ctx the parse tree
	 */
	void exitExport(QlangParser.ExportContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#exportedlocation}.
	 * @param ctx the parse tree
	 */
	void enterExportedlocation(QlangParser.ExportedlocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#exportedlocation}.
	 * @param ctx the parse tree
	 */
	void exitExportedlocation(QlangParser.ExportedlocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#codeholeComposition}.
	 * @param ctx the parse tree
	 */
	void enterCodeholeComposition(QlangParser.CodeholeCompositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#codeholeComposition}.
	 * @param ctx the parse tree
	 */
	void exitCodeholeComposition(QlangParser.CodeholeCompositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QlangParser#codehole}.
	 * @param ctx the parse tree
	 */
	void enterCodehole(QlangParser.CodeholeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QlangParser#codehole}.
	 * @param ctx the parse tree
	 */
	void exitCodehole(QlangParser.CodeholeContext ctx);
}