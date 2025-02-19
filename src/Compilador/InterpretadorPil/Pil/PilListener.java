package InterpretadorPil.Pil;


// Generated from Pil.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PilParser}.
 */
public interface PilListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PilParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PilParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PilParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PilParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compoundStatement}
	 * labeled alternative in {@link PilParser#compound}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PilParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compoundStatement}
	 * labeled alternative in {@link PilParser#compound}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PilParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link PilParser#statementWithBreak}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(PilParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link PilParser#statementWithBreak}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(PilParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link PilParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PilParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link PilParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PilParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeStatement}
	 * labeled alternative in {@link PilParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(PilParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeStatement}
	 * labeled alternative in {@link PilParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(PilParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifclauseStatement}
	 * labeled alternative in {@link PilParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfclauseStatement(PilParser.IfclauseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifclauseStatement}
	 * labeled alternative in {@link PilParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfclauseStatement(PilParser.IfclauseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopclauseStatement}
	 * labeled alternative in {@link PilParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoopclauseStatement(PilParser.LoopclauseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopclauseStatement}
	 * labeled alternative in {@link PilParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoopclauseStatement(PilParser.LoopclauseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link PilParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(PilParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link PilParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(PilParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeExpr}
	 * labeled alternative in {@link PilParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWriteExpr(PilParser.WriteExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeExpr}
	 * labeled alternative in {@link PilParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWriteExpr(PilParser.WriteExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writelnExpr}
	 * labeled alternative in {@link PilParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWritelnExpr(PilParser.WritelnExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writelnExpr}
	 * labeled alternative in {@link PilParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWritelnExpr(PilParser.WritelnExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link PilParser#ifclause}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PilParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link PilParser#ifclause}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PilParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopCompoundStatement}
	 * labeled alternative in {@link PilParser#loopclause}.
	 * @param ctx the parse tree
	 */
	void enterLoopCompoundStatement(PilParser.LoopCompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopCompoundStatement}
	 * labeled alternative in {@link PilParser#loopclause}.
	 * @param ctx the parse tree
	 */
	void exitLoopCompoundStatement(PilParser.LoopCompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopStatement}
	 * labeled alternative in {@link PilParser#loopclause}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(PilParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopStatement}
	 * labeled alternative in {@link PilParser#loopclause}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(PilParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PilParser#idset}.
	 * @param ctx the parse tree
	 */
	void enterIdset(PilParser.IdsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PilParser#idset}.
	 * @param ctx the parse tree
	 */
	void exitIdset(PilParser.IdsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMulDivMod}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDivMod(PilParser.ExprMulDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMulDivMod}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDivMod(PilParser.ExprMulDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRead(PilParser.ExprReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRead(PilParser.ExprReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprType}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprType(PilParser.ExprTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprType}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprType(PilParser.ExprTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIdset}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIdset(PilParser.ExprIdsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIdset}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIdset(PilParser.ExprIdsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolean(PilParser.ExprBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolean(PilParser.ExprBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprText}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprText(PilParser.ExprTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprText}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprText(PilParser.ExprTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParenthesis(PilParser.ExprParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParenthesis(PilParser.ExprParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprError}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprError(PilParser.ExprErrorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprError}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprError(PilParser.ExprErrorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(PilParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(PilParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCompare}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCompare(PilParser.ExprCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCompare}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCompare(PilParser.ExprCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(PilParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(PilParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBoolOp}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolOp(PilParser.ExprBoolOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBoolOp}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolOp(PilParser.ExprBoolOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReal}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReal(PilParser.ExprRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReal}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReal(PilParser.ExprRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(PilParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(PilParser.ExprIntegerContext ctx);
}