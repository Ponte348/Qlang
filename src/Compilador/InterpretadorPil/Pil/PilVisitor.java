package InterpretadorPil.Pil;

// Generated from Pil.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PilParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PilVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PilParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PilParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compoundStatement}
	 * labeled alternative in {@link PilParser#compound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(PilParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link PilParser#statementWithBreak}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(PilParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link PilParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(PilParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeStatement}
	 * labeled alternative in {@link PilParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStatement(PilParser.WriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifclauseStatement}
	 * labeled alternative in {@link PilParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfclauseStatement(PilParser.IfclauseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopclauseStatement}
	 * labeled alternative in {@link PilParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopclauseStatement(PilParser.LoopclauseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link PilParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(PilParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeExpr}
	 * labeled alternative in {@link PilParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteExpr(PilParser.WriteExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writelnExpr}
	 * labeled alternative in {@link PilParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWritelnExpr(PilParser.WritelnExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link PilParser#ifclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PilParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopCompoundStatement}
	 * labeled alternative in {@link PilParser#loopclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopCompoundStatement(PilParser.LoopCompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopStatement}
	 * labeled alternative in {@link PilParser#loopclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(PilParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PilParser#idset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdset(PilParser.IdsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMulDivMod}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMulDivMod(PilParser.ExprMulDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRead(PilParser.ExprReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprType}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprType(PilParser.ExprTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIdset}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIdset(PilParser.ExprIdsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolean(PilParser.ExprBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprText}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprText(PilParser.ExprTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParenthesis(PilParser.ExprParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprError}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprError(PilParser.ExprErrorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(PilParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCompare}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCompare(PilParser.ExprCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnary(PilParser.ExprUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBoolOp}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolOp(PilParser.ExprBoolOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprReal}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprReal(PilParser.ExprRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link PilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInteger(PilParser.ExprIntegerContext ctx);
}