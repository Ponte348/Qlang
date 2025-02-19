package InterpretadorPil.Pil;

import java.util.HashMap;
import java.util.Scanner;
import org.antlr.v4.runtime.ParserRuleContext;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends PilBaseVisitor<Value> {
   private HashMap<String, Value> variables = new HashMap<>();
   private HashMap<String, String> types = new HashMap<>();
   private String errorMessage = "";
   private ParserRuleContext ctx_error;

   public Interpreter(HashMap<String, String> variableTypes) {
      this.types = variableTypes;
   }

   @Override public Value visitProgram(PilParser.ProgramContext ctx) {
      Value res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Value visitCompoundStatement(PilParser.CompoundStatementContext ctx) {
      Value res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Value visitBreakStatement(PilParser.BreakStatementContext ctx) {
      Value res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Value visitAssignmentStatement(PilParser.AssignmentStatementContext ctx) {
      Value res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Value visitWriteStatement(PilParser.WriteStatementContext ctx) {
      Value res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Value visitIfclauseStatement(PilParser.IfclauseStatementContext ctx) {
      Value res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Value visitLoopclauseStatement(PilParser.LoopclauseStatementContext ctx) {
      Value res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Value visitAssignExpr(PilParser.AssignExprContext ctx) {
      if (ErrorHandling.error()){
         if (ctx.expr().getText().equals("error")){
            String var = ctx.idset().getText();
            String type = types.get(var);
            BooleanValue boolVal = (BooleanValue) visit(ctx.expr());
            variables.put(var, boolVal);
            return boolVal;
         }
         return null;
      }

      String var = ctx.idset().getText();
      String type = types.get(var);

      switch (type) {
         case "integer":
            IntegerValue intVal = (IntegerValue) visit(ctx.expr());
            variables.put(var, intVal);
            break;
         case "real":
            DoubleValue realVal = (DoubleValue) visit(ctx.expr());
            variables.put(var, realVal);
            break;
         case "text":
            TextValue textVal = (TextValue) visit(ctx.expr());
            variables.put(var, textVal);
            break;
         case "boolean":
            BooleanValue boolVal = (BooleanValue) visit(ctx.expr());
            variables.put(var, boolVal);
            break;
         default:
            break;
      }
      return null;
   }

   @Override public Value visitWriteExpr(PilParser.WriteExprContext ctx) {
      if (ErrorHandling.error())
         return null;

      String res = "";
      String temp = "";
      for(int i = 0; i < ctx.expr().size(); i++){
         temp = (String) ((Value) visit(ctx.expr(i))).getValue().toString();
         res += temp;
      }
      System.out.print(res);

      return null;
   }

   @Override public Value visitWritelnExpr(PilParser.WritelnExprContext ctx) {
      if (ErrorHandling.error())
         return null;

      String res = "";
      String temp = "";
      for(int i = 0; i < ctx.expr().size(); i++){
         visit(ctx.expr(i));
         if (ErrorHandling.error())
            return null;

         temp = (String) ((Value) visit(ctx.expr(i))).getValue().toString();
         res += temp;
      }
      System.out.println(res);
      return null;
   }

   @Override public Value visitIfStatement(PilParser.IfStatementContext ctx) {
      Value res = null;
      String elseStat = null;
      if (ctx.elseStat != null)
         elseStat = ctx.elseStat.getText();
      //String elseStat = ctx.elseStat.getText();
      BooleanValue boolVal = (BooleanValue) visit(ctx.expr());

      if (boolVal.getValue()){
         visit(ctx.compound(0));
         if (ctx.expr().getText().equals("error"))
            ErrorHandling.reset();
      }
      else if (elseStat != null){
         visit(ctx.compound(1));
      }
      return res;
   }

   @Override public Value visitLoopCompoundStatement(PilParser.LoopCompoundStatementContext ctx) {
      if (ErrorHandling.error())
         return null;

      Value res = null;
      String untilLoop = "";
      String whileLoop = "";

      if (ctx.Looper() != null)
         if (ctx.Looper().getText().equals("until"))
            untilLoop = ctx.Looper().getText();
         else
            whileLoop = ctx.Looper().getText();

      while(true){
         for(int i = 0; i < ctx.statementWithBreak().size(); i++)
            visit(ctx.statementWithBreak(i));

         BooleanValue boolVal = (BooleanValue) visit(ctx.expr());

         if (untilLoop.equals("until")){
            if (boolVal.getValue())
               break;
         }
         else if (whileLoop.equals("while")){
            if (!boolVal.getValue())
               break;
         }
         
         visit(ctx.compound());
      }

      return res;
   }

   @Override public Value visitLoopStatement(PilParser.LoopStatementContext ctx) {
      if (ErrorHandling.error())
         return null;

      Value res = null;
      
      String untilLoop = "";
      String whileLoop = "";

      if (ctx.Looper() != null)
         if (ctx.Looper().getText().equals("until"))
            untilLoop = ctx.Looper().getText();
         else
            whileLoop = ctx.Looper().getText();

      while(true){
         visit(ctx.compound());

         BooleanValue boolVal = (BooleanValue) visit(ctx.expr());
         if (untilLoop.equals("until")){
            if (boolVal.getValue())
               break;
         }
         else if (whileLoop.equals("while")){
            if (!boolVal.getValue())
               break;
         }
      }
      return res;
   }

   @Override public Value visitIdset(PilParser.IdsetContext ctx) {
      if (ErrorHandling.error())
         return null;

      Value res = null;
      if (variables.containsKey(ctx.ID().getText()))
         res = variables.get(ctx.ID().getText());
      return res;
   }

   @Override public Value visitExprMulDivMod(PilParser.ExprMulDivModContext ctx) {
      if (ErrorHandling.error())
         return null;

      Value leftVal = visit(ctx.expr(0));
      Value rightVal = visit(ctx.expr(1));
      String op = ctx.op.getText();

      if (op.equals("*"))
         return leftVal.multiply(rightVal);
      
      else if (op.equals(":")){
         if (rightVal.getValue().toString().equals("0")){
            this.errorMessage = "Division by zero";
            this.ctx_error = (ParserRuleContext) ctx;
            ErrorHandling.registerError();
            return null;
         }
         else
            return leftVal.divide(rightVal);
      }

      else if (op.equals("%"))
         return leftVal.mod(rightVal);
      
      else
         return null;
   }

   @Override public Value visitExprAddSub(PilParser.ExprAddSubContext ctx) {
      if (ErrorHandling.error())
         return null;

      Value leftVal = visit(ctx.expr(0));
      Value rightVal = visit(ctx.expr(1));
      String op = ctx.op.getText();

      if (op.equals("+"))
         return leftVal.add(rightVal);
      
      else if (op.equals("-"))
         return leftVal.subtract(rightVal);
      
      else
         return leftVal;
   }

   @Override public Value visitExprRead(PilParser.ExprReadContext ctx) {
      if (ErrorHandling.error())
         return null;

      Value res = visit(ctx.expr());
      System.out.print(res);
      Scanner scanner = new Scanner(System.in);
      String input = "";
      if (scanner.hasNextLine())
         input = scanner.nextLine();
      
      Value result = new TextValue(input);
      return new TextValue(input);
   }

   @Override public Value visitExprType(PilParser.ExprTypeContext ctx) {
      if (ErrorHandling.error())
         return null;

      if (ctx.type.getText().equals("text") && ctx.expr().getText().equals("error")){
         ErrorHandling.printError(this.ctx_error, this.errorMessage);
         return null;
      }

      Value temp = visit(ctx.expr());
      String type = ctx.type.getText();
      Value res = temp.convertTo(type);

      if (res == null){
         this.errorMessage = "Conversion to " + type + " is not supported";
         this.ctx_error = (ParserRuleContext) ctx;
         ErrorHandling.registerError();
      }

      return res;
   }

   @Override public Value visitExprIdset(PilParser.ExprIdsetContext ctx) {
      if (ErrorHandling.error())
         return null;

      Value res = visit(ctx.idset());
      return res;
   }

   @Override public Value visitExprCompare(PilParser.ExprCompareContext ctx) {
      if (ErrorHandling.error())
         return null;

      Value leftVal = visit(ctx.expr(0));
      Value rightVal = visit(ctx.expr(1));
      String op = ctx.op.getText();

      if (op.equals("="))
         return leftVal.equal(rightVal);
      
      else if (op.equals("/="))
         return leftVal.notEqual(rightVal);
      
      else if (op.equals("<"))
         return leftVal.lessThan(rightVal);
      
      else if (op.equals("<="))
         return leftVal.lessThanOrEqual(rightVal);
      
      else if (op.equals(">"))
         return leftVal.greaterThan(rightVal);
      
      else if (op.equals(">="))
         return leftVal.greaterThanOrEqual(rightVal);
      
      else
         return null;
   }

   @Override public Value visitExprBoolOp(PilParser.ExprBoolOpContext ctx) {
      if (ErrorHandling.error())
         return null;

      Value leftVal = visit(ctx.expr(0));
      Value rightVal = visit(ctx.expr(1));
      String op = ctx.op.getText();

      if (op.equals("and"))
         return leftVal.and(rightVal);
      
      else if (op.equals("or"))
         return leftVal.or(rightVal);
      
      else if (op.equals("xor"))
         return leftVal.xor(rightVal);
      
      else if (op.equals("implies"))
         return leftVal.implies(rightVal);
      
      else if (op.equals("andThen"))
         return leftVal.andThen(rightVal);
      
      else if (op.equals("orElse"))
         return leftVal.orElse(rightVal);
      
      else
         return leftVal;
   }

   @Override public Value visitExprUnary(PilParser.ExprUnaryContext ctx) {
      if (ErrorHandling.error())
         return null;

      Value val = visit(ctx.expr());
      String op = ctx.op.getText();

      if (op.equals("-"))
         return val.unaryMinus();
      
      else if (op.equals("not"))
         return val.not();
      else
         return val;
   }

   @Override public Value visitExprReal(PilParser.ExprRealContext ctx) {
      if (ErrorHandling.error())
         return null;

      return new DoubleValue(Double.parseDouble(ctx.REAL().getText()));
   }

   @Override public Value visitExprText(PilParser.ExprTextContext ctx) {
      if (ErrorHandling.error())
         return null;

      return new TextValue(ctx.TEXT().getText().replace("\"", ""));
   }

   @Override public Value visitExprParenthesis(PilParser.ExprParenthesisContext ctx) {
      if (ErrorHandling.error())
         return null;

      return visit(ctx.expr());
   }

   @Override public Value visitExprInteger(PilParser.ExprIntegerContext ctx) {
      if (ErrorHandling.error())
         return null;

      return new IntegerValue(Integer.parseInt(ctx.INTEGER().getText()));
   }

   @Override public Value visitExprBoolean(PilParser.ExprBooleanContext ctx) {
      if (ErrorHandling.error())
         return null;

      return new BooleanValue(Boolean.parseBoolean(ctx.BOOLEAN().getText()));
   }

   @Override public Value visitExprError(PilParser.ExprErrorContext ctx) {
      Value res = new BooleanValue(ErrorHandling.error());
      ErrorHandling.reset();
      return res;
   }

}
