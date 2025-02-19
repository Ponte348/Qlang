package InterpretadorPil.Pil;

import java.util.HashMap;
import javax.swing.text.html.HTMLEditorKit.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings("CheckReturnValue")
public class SemanticAnalyser extends PilBaseVisitor<Boolean> {
   private HashMap<String, String> types = new HashMap<>();

   private final DoubleType realType = new DoubleType();
   private final IntegerType integerType = new IntegerType();
   private final BooleanType booleanType = new BooleanType();
   private final TextType textType = new TextType();

   public HashMap<String, String> getTypes() {
      return types;
   }

   @Override public Boolean visitProgram(PilParser.ProgramContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitCompoundStatement(PilParser.CompoundStatementContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitBreakStatement(PilParser.BreakStatementContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitAssignmentStatement(PilParser.AssignmentStatementContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitWriteStatement(PilParser.WriteStatementContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitIfclauseStatement(PilParser.IfclauseStatementContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitLoopclauseStatement(PilParser.LoopclauseStatementContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitAssignExpr(PilParser.AssignExprContext ctx) {
      Boolean res = visit(ctx.expr()) && visit(ctx.idset());
      String text = ctx.expr().getText();
      String var = ctx.idset().getText();

      if (text.startsWith("integer")) {
         types.put(var, "integer");
         return res;
      }
      else if (text.startsWith("real")) {
         types.put(var, "real");
         return res;
      }
      else if (text.startsWith("text")) {
         types.put(var, "text");
         return res;
      }

      if (res) {
         if (!"text".equals(ctx.expr().eType.getName()) && !"integer".equals(ctx.expr().eType.getName()) && !"real".equals(ctx.expr().eType.getName()) && !"boolean".equals(ctx.expr().eType.getName())) {
            ErrorHandling.printError(ctx, "Invalid type for assignment!");
            res = false;
         }
         types.put(var, ctx.expr().eType.getName());
      }
      return res;
   }

   @Override public Boolean visitWriteExpr(PilParser.WriteExprContext ctx) {
      return true;
   }

   @Override public Boolean visitWritelnExpr(PilParser.WritelnExprContext ctx) {
      return true;
   }

   @Override public Boolean visitIfStatement(PilParser.IfStatementContext ctx) {
      Boolean res = visit(ctx.expr());

      if (res){
         if (!ctx.expr().eType.getName().equals("boolean")){
            ErrorHandling.printError(ctx, "Invalid type for if condition!");
            res = false;
         }
      }

      return res;
   }

   @Override public Boolean visitLoopCompoundStatement(PilParser.LoopCompoundStatementContext ctx) {
      Boolean res = visit(ctx.expr());

      if (res){
         if (!ctx.expr().eType.getName().equals("boolean")){
            ErrorHandling.printError(ctx, "Invalid type for loop condition!");
            res = false;
         }
      }

      return res;
   }

   @Override public Boolean visitLoopStatement(PilParser.LoopStatementContext ctx) {
      Boolean res = visit(ctx.expr());

      if (res){
         if (!ctx.expr().eType.getName().equals("boolean")){
            ErrorHandling.printError(ctx, "Invalid type for loop condition!");
            res = false;
         }
      }

      return res;
   }

   @Override public Boolean visitIdset(PilParser.IdsetContext ctx) {
      return true;
   }

   @Override public Boolean visitExprMulDivMod(PilParser.ExprMulDivModContext ctx) {
      Boolean res = visit(ctx.expr(0)) && visit(ctx.expr(1)) &&
         checkNumericType(ctx, ctx.expr(0).eType) && checkNumericType(ctx, ctx.expr(1).eType);

      if (res)
         ctx.eType = fetchType(ctx.expr(0).eType, ctx.expr(1).eType);
      
      return res;
   }

   @Override public Boolean visitExprRead(PilParser.ExprReadContext ctx) {
      Boolean res = visit(ctx.expr());

      if (res){
         if (!ctx.expr().eType.getName().equals("text")){
            ErrorHandling.printError(ctx, "Invalid type for prompt!");
            res = false;
         }
         ctx.eType = textType;
      }

      return res;
   }

   @Override public Boolean visitExprType(PilParser.ExprTypeContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Boolean visitExprIdset(PilParser.ExprIdsetContext ctx) {
      Boolean res = visit(ctx.idset());
      String var = ctx.idset().getText();

      if (types.containsKey(var)){
         if (types.get(var).equals("integer"))
            ctx.eType = integerType;

         else if (types.get(var).equals("real"))
            ctx.eType = realType;
         
         else if (types.get(var).equals("text"))
            ctx.eType = textType;

         else if (types.get(var).equals("boolean"))
            ctx.eType = booleanType;

         else
            ctx.eType = null;
      }

      return res;
   }

   @Override public Boolean visitExprBoolean(PilParser.ExprBooleanContext ctx) {
      ctx.eType = booleanType;
      return true;
   }

   @Override public Boolean visitExprText(PilParser.ExprTextContext ctx) {
      ctx.eType = textType;
      return true;
   }

   @Override public Boolean visitExprParenthesis(PilParser.ExprParenthesisContext ctx) {
      Boolean res = visit(ctx.expr());
      if (res)
         ctx.eType = ctx.expr().eType;
      return res;
   }

   @Override public Boolean visitExprAddSub(PilParser.ExprAddSubContext ctx) {
      Boolean res = visit(ctx.expr(0)) && visit(ctx.expr(1)) &&
         checkNumericType(ctx, ctx.expr(0).eType) && checkNumericType(ctx, ctx.expr(1).eType);
      
      if (res)
         ctx.eType = fetchType(ctx.expr(0).eType, ctx.expr(1).eType);
      
      return res;
   }
   

   @Override public Boolean visitExprCompare(PilParser.ExprCompareContext ctx) {
      Boolean res = visit(ctx.expr(0)) && visit(ctx.expr(1));
      if (res){
         if (fetchType(ctx.expr(0).eType, ctx.expr(1).eType) == null){
            ErrorHandling.printError(ctx, "Invalid operands for comapare operator!");
            return false;
         } else {
            ctx.eType = booleanType;
         }
      }
      return res;
   }

   @Override public Boolean visitExprUnary(PilParser.ExprUnaryContext ctx) {
      Boolean res = false;
      if (ctx.op.getText().equals("not")){
         res = visit(ctx.expr());
         if (res){
            if (!ctx.expr().eType.getName().equals("boolean")){
               ErrorHandling.printError(ctx, "Logical operator applied to a non boolean operand!");
               res = false;
            }
            else{
               ctx.eType = booleanType;
            }
         }
      }
      else {
         res = visit(ctx.expr()) && checkNumericType(ctx, ctx.expr().eType);
         if (res){
            ctx.eType = ctx.expr().eType;
         }
      }
      return res;
   }

   @Override public Boolean visitExprBoolOp(PilParser.ExprBoolOpContext ctx) {
      Boolean res = visit(ctx.expr(0)) && visit(ctx.expr(1));
      if (res){

         if (!"boolean".equals(ctx.expr(0).eType.getName()) || !"boolean".equals(ctx.expr(1).eType.getName())){
            ErrorHandling.printError(ctx, "Logical operator applied to non bolean operands!");
            res = false;
         }
         else{
            ctx.eType = booleanType;
         }
      }

      return res;
   }

   @Override public Boolean visitExprReal(PilParser.ExprRealContext ctx) {
      ctx.eType = realType;
      return true;
   }

   @Override public Boolean visitExprInteger(PilParser.ExprIntegerContext ctx) {
      ctx.eType = integerType;
      return true;
   }

   @Override public Boolean visitExprError(PilParser.ExprErrorContext ctx) {
      ctx.eType = booleanType;
      return true;
   }

   private Boolean checkNumericType(ParserRuleContext ctx, Type type) {
      Boolean res = true;

      if (!type.isNumeric()) {
         ErrorHandling.printError(ctx, "Error: " + ctx.getText() + " is not a valid numeric operation");
         res = false;
      }
      return res;
   }

   private Type fetchType(Type type1, Type type2){
      Type res = null;
      if (type1.isNumeric() && type2.isNumeric())
      {
         if ("real".equals(type1.getName()))
            res = type1;
         else if ("real".equals(type2.getName()))
            res = type2;
         else
            res = type1;
      }
      else if ("boolean".equals(type1.getName()) && "boolean".equals(type2.getName()))
         res = type1;
      return res;
   }
}
