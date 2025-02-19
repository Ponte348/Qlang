// Generated from Qlang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QlangParser#statList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatList(QlangParser.StatListContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#statementComposition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementComposition(QlangParser.StatementCompositionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code questionOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionOrder(QlangParser.QuestionOrderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationOrder(QlangParser.DeclarationOrderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOrder(QlangParser.AssignmentOrderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code executionOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecutionOrder(QlangParser.ExecutionOrderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exportOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportOrder(QlangParser.ExportOrderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codeOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeOrder(QlangParser.CodeOrderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCodeOrder}
	 * labeled alternative in {@link QlangParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCodeOrder(QlangParser.SimpleCodeOrderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hole}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHole(QlangParser.HoleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code open}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen(QlangParser.OpenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codeHole}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeHole(QlangParser.CodeHoleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codeOpen}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeOpen(QlangParser.CodeOpenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code coleOutput}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColeOutput(QlangParser.ColeOutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multichoice}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultichoice(QlangParser.MultichoiceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Composed}
	 * labeled alternative in {@link QlangParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposed(QlangParser.ComposedContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(QlangParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#simpleCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCode(QlangParser.SimpleCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#questionHole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionHole(QlangParser.QuestionHoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#questionOpen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionOpen(QlangParser.QuestionOpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#questionCodeHole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionCodeHole(QlangParser.QuestionCodeHoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#questionCodeOpen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionCodeOpen(QlangParser.QuestionCodeOpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#questionColeOutput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionColeOutput(QlangParser.QuestionColeOutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#questionMultiChoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionMultiChoice(QlangParser.QuestionMultiChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#questionComposed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionComposed(QlangParser.QuestionComposedContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#commandComposition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandComposition(QlangParser.CommandCompositionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDAssignment}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDAssignment(QlangParser.IDAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadAssignment}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadAssignment(QlangParser.ReadAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HoleQuestionAssignment}
	 * labeled alternative in {@link QlangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHoleQuestionAssignment(QlangParser.HoleQuestionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadTerm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadTerm(QlangParser.ReadTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermMultDivMod}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermMultDivMod(QlangParser.TermMultDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fraction}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFraction(QlangParser.FractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeTerm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTerm(QlangParser.TypeTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Stdoutterm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStdoutterm(QlangParser.StdouttermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermBinaryLogical}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermBinaryLogical(QlangParser.TermBinaryLogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDTerm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDTerm(QlangParser.IDTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExecutionTerm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecutionTerm(QlangParser.ExecutionTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermAddMinus}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAddMinus(QlangParser.TermAddMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextTerm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextTerm(QlangParser.TextTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryTerm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryTerm(QlangParser.UnaryTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermBinaryRelational}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermBinaryRelational(QlangParser.TermBinaryRelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesisterm}
	 * labeled alternative in {@link QlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisterm(QlangParser.ParenthesistermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintSentence}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintSentence(QlangParser.PrintSentenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrinttermSentence}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrinttermSentence(QlangParser.PrinttermSentenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UsesCodeSentence}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsesCodeSentence(QlangParser.UsesCodeSentenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UsesCodePil}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsesCodePil(QlangParser.UsesCodePilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChoiceSentence}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoiceSentence(QlangParser.ChoiceSentenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExecutionSentence}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecutionSentence(QlangParser.ExecutionSentenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentCommand}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentCommand(QlangParser.AssignmentCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclarationCommand}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationCommand(QlangParser.DeclarationCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifLine}
	 * labeled alternative in {@link QlangParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfLine(QlangParser.IfLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(QlangParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#ifLineSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfLineSentence(QlangParser.IfLineSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(QlangParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#elseifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifBlock(QlangParser.ElseifBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(QlangParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#execution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecution(QlangParser.ExecutionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(QlangParser.ExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#exportedlocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportedlocation(QlangParser.ExportedlocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#codeholeComposition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeholeComposition(QlangParser.CodeholeCompositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlangParser#codehole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodehole(QlangParser.CodeholeContext ctx);
}