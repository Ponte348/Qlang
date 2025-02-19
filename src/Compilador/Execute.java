import org.stringtemplate.v4.*;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@SuppressWarnings("CheckReturnValue")
public class Execute extends QlangBaseVisitor<ST> {
   private STGroup stg = new STGroupFile("qlang.stg"); // stg file to be used
   protected int varCount = 0;
   protected String target = "java"; // default
   protected String nameGlobal = "";
   protected String variavelGlobal = "";
   protected boolean needsAssignment = true;
   protected boolean needsPrint = false;
   
   protected String newVarName() {
      varCount++;
      return "v"+varCount;
   }

   public boolean readFile(String file) {
      File f = new File(file);
      return f.exists() && !f.isDirectory();
   }

   protected ST binaryExpression(String e1Stats, String e2Stats, String type, String var, String e1Var, String op, String e2Var) {
      ST res = stg.getInstanceOf("binaryExpression");
      res.add("stat", e1Stats);
      res.add("stat", e2Stats);
      res.add("type", type);
      res.add("var", var);
      res.add("e1", e1Var);
      res.add("op", translateOp(op));
      res.add("e2", e2Var);
      return res;
   }

   protected String translateOp(String op) {
      String res = op;
      switch(op) {
         case "//":
            res = "/";
            break;
         case "\\\\":
            res = "%";
            break;
         case "=":
            res = "==";
            break;
         case "/=":
            res = "!=";
            break;
      }
      return res;
   }

   @Override public ST visitStatList(QlangParser.StatListContext ctx) {
      ST res = stg.getInstanceOf("module");
      res.add("name", "Qlang");
      res.add("statements", visit(ctx.statementComposition()));
      return res;
   }

   @Override public ST visitStatementComposition(QlangParser.StatementCompositionContext ctx) {
      ST res = stg.getInstanceOf("stats");
      for ( QlangParser.StatementsContext stmt : ctx.statements() ) {
         res.add("stat", visit(stmt));
      }
      return res;
   }

   @Override public ST visitQuestionOrder(QlangParser.QuestionOrderContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitDeclarationOrder(QlangParser.DeclarationOrderContext ctx) {
      ST res = null; //TEM QUE IR VISITAR O DECLARATION
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitAssignmentOrder(QlangParser.AssignmentOrderContext ctx) {
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitExecutionOrder(QlangParser.ExecutionOrderContext ctx) {
      ST res = null;
      needsPrint = true;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitExportOrder(QlangParser.ExportOrderContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitCodeOrder(QlangParser.CodeOrderContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitSimpleCodeOrder(QlangParser.SimpleCodeOrderContext ctx) {

      return visitChildren(ctx);
   }

   @Override public ST visitHole(QlangParser.HoleContext ctx) {

      return visitChildren(ctx);
   }

   @Override public ST visitOpen(QlangParser.OpenContext ctx) {

      return visitChildren(ctx);
   }

   @Override public ST visitCodeHole(QlangParser.CodeHoleContext ctx) {

      return visitChildren(ctx);
   }

   @Override public ST visitCodeOpen(QlangParser.CodeOpenContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitColeOutput(QlangParser.ColeOutputContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
      
   }

   @Override public ST visitMultichoice(QlangParser.MultichoiceContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitComposed(QlangParser.ComposedContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitCode(QlangParser.CodeContext ctx) {
      ST res = stg.getInstanceOf("defineCode");
      res.add("nome", ctx.ID().getText().replace(".", ""));
      res.add("var", ctx.ID().getText());
      String code = ctx.PIL(0).getText();
      code = code.substring(2, code.length()-2);
      String[] lines = code.split("\n");
      StringBuilder result = new StringBuilder();
      for (String line : lines) {
         // Escape backslashes and double quotes
         line = line.replace("\"", "\\\"");

         // Replace double quotes with single quotes for 'write' statements
         if (line.contains("write")) {
               line = line.replace("\"", "'");
         }

         if (result.length() > 0) {
               result.append("+ \n");
         }
         result.append("\"").append(line).append("\""); // Add quotes around each line individually
      }

      // Note: Removed extra quotes around the entire code string
      res.add("codeString", result.toString()); // Remove the extra quotes

      return res;
   }

   @Override
   public ST visitSimpleCode(QlangParser.SimpleCodeContext ctx) {
       String code = "";
       ST res = stg.getInstanceOf("simpleCode");
       for (int i = 1; i < ctx.getChildCount(); i++) {
         String childText = ctx.getChild(i).getText();
         if (childText.equals("text(")) {
             i++; // Move to the next child for the argument of text()
             String textArg = ctx.getChild(i).getText();
             if (textArg.startsWith("\"") && textArg.endsWith("\"")) {
                 // Remove quotes and escape double quotes within string literals
                 textArg = textArg.substring(1, textArg.length() - 1)
                                  .replace("\\", "\\\\")  // Escape backslashes first
                                  .replace("\"", "\\\""); // Escape double quotes
             } else {
                 // Convert to string if not a string literal
                 textArg = "Integer.toString(" + textArg + ")";
             }
             code += textArg; 
         } else {
             code += childText; 
         }
 
         if (i < ctx.getChildCount() - 2) {
             // Add comma only if it's not the last element
             code += " + "; 
         }
     }
   
       res.add("code", code);
       code.substring(0, code.length() - 2);
       return res;
   }
   
   
   @Override
   public ST visitQuestionHole(QlangParser.QuestionHoleContext ctx) {
       ST res = stg.getInstanceOf("createHoleQuestion");
       nameGlobal = ctx.ID().getText();
       nameGlobal = nameGlobal.replace(".", "");
       res.add("name", nameGlobal);
       res.add("ID", ctx.ID().getText());
   
       // Visit children and combine their results with res
       for (int i = 0; i < ctx.getChildCount(); i++) {
           ST childResult = visit(ctx.getChild(i));
           if (childResult != null) {
               res.add("children", childResult.render()); // Add rendered child result to the res template
           }
       }
   
       return res;
   }
   
   @Override public ST visitQuestionOpen(QlangParser.QuestionOpenContext ctx) {
      ST res = stg.getInstanceOf("createOpenQuestion");
      nameGlobal = ctx.ID().getText();
      nameGlobal = nameGlobal.replace(".", "");
      res.add("name", nameGlobal);
      res.add("ID", ctx.ID().getText());
      for (int i = 0; i < ctx.getChildCount(); i++) {
         ST childResult = visit(ctx.getChild(i));
         if (childResult != null) {
             res.add("children", childResult.render()); // Add rendered child result to the res template
         }
     }
   return res;
      //return res;
   }

   @Override
   public ST visitQuestionCodeHole(QlangParser.QuestionCodeHoleContext ctx) {
       ST res = stg.getInstanceOf("createCodeHoleQuestion");
       nameGlobal = ctx.ID().getText().replace(".", ""); 
       res.add("name", nameGlobal);
       res.add("ID", ctx.ID().getText());
   
       for (int i = 0; i < ctx.getChildCount(); i++) {
           try {
               ST childResult = visit(ctx.getChild(i));
               if (childResult != null) {
                   res.add("children", childResult.render());
               } else {
               }
           } catch (Exception e) {
           }
       }
       return res;
   }
   

   @Override public ST visitQuestionCodeOpen(QlangParser.QuestionCodeOpenContext ctx) {
      ST res = stg.getInstanceOf("createCodeOpenQuestion");
      nameGlobal = ctx.ID().getText();
      nameGlobal = nameGlobal.replace(".", "");
      res.add("name", nameGlobal);
      res.add("ID", ctx.ID().getText());
      for (int i = 0; i < ctx.getChildCount(); i++) {
         ST childResult = visit(ctx.getChild(i));
         if (childResult != null) {
             res.add("children", childResult.render()); // Add rendered child result to the res template
            }
      }
      return res;
   }

   @Override public ST visitQuestionColeOutput(QlangParser.QuestionColeOutputContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitQuestionMultiChoice(QlangParser.QuestionMultiChoiceContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitQuestionComposed(QlangParser.QuestionComposedContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitCommandComposition(QlangParser.CommandCompositionContext ctx) {
      ST res = stg.getInstanceOf("stats");
      for (int i = 0; i < ctx.getChildCount(); i++) {
          ST childResult = visit(ctx.getChild(i));
          if (childResult != null) {
              res.add("stat", childResult.render());
          }

      }
      return res;
   }

   @Override public ST visitIDAssignment(QlangParser.IDAssignmentContext ctx) {
      if (ctx.ID().getText().equals("result.name")) {
         ST res = stg.getInstanceOf("setName");
         res.add("var", ctx.term().getText());
         return res;
      }
      else if (ctx.ID().getText().equals("result.id")) {
         ST res = stg.getInstanceOf("setID");
         res.add("var", ctx.term().getText());
         return res;
      }
      else
      if (ctx.term() instanceof QlangParser.ReadTermContext) {
         variavelGlobal = ctx.ID().getText();
         return visit(ctx.term());
      }
      else{
      variavelGlobal = ctx.ID().getText();
      needsAssignment = false;
      ST res = stg.getInstanceOf("assignment");
      res.add("variable", ctx.ID().getText());
      res.add("text", visit(ctx.term()));
      needsAssignment = true;
      return res;
      }
   }

   @Override public ST visitReadAssignment(QlangParser.ReadAssignmentContext ctx) {
      ST res = stg.getInstanceOf("instanceOfQuestion");
      res.add("variable", ctx.ID(0).getText().replace(".", ""));
      res.add("question", ctx.ID(1).getText().replace(".", ""));
      return res;
      //return res;
   }

   @Override public ST visitHoleQuestionAssignment(QlangParser.HoleQuestionAssignmentContext ctx) {
      if (!"".equals(nameGlobal)) {
         ST res = stg.getInstanceOf("addSolution");
         res.add("name", nameGlobal);
         res.add("answer", ctx.term().getText());
         return res;
      }
      return visitChildren(ctx);
   }

   @Override public ST visitReadTerm(QlangParser.ReadTermContext ctx) {
      if (needsAssignment) {
         ST res = stg.getInstanceOf("readPrompt");
         res.add("text", ctx.STRING().getText());
         res.add("var", variavelGlobal);
         return res;
      }
      else{
         ST res = stg.getInstanceOf("readPromptNoAssign");
         res.add("text", ctx.STRING().getText());
         return res;
      }
      //return res;
   }

   @Override public ST visitTermMultDivMod(QlangParser.TermMultDivModContext ctx) {
      ST res = stg.getInstanceOf("binaryTerm");
      res.add("left", visit(ctx.term(0)));
      res.add("op", ctx.op.getText());
      res.add("right", visit(ctx.term(1)));
      return res;
   }

   @Override public ST visitFraction(QlangParser.FractionContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override
   public ST visitTypeTerm(QlangParser.TypeTermContext ctx) {
      if (ctx.type.getText().equals("integer")) {
         ST res = stg.getInstanceOf("integerTerm");
         res.add("value", visit(ctx.term()));
         return res;
      }
      else if (ctx.type.getText().equals("text")) {
         ST res = stg.getInstanceOf("textTerm");
         res.add("value", visit(ctx.term()));
         return res;
      }
      return visitChildren(ctx);
      //return res
   }

   @Override public ST visitStdoutterm(QlangParser.StdouttermContext ctx) {
      ST res = stg.getInstanceOf("executeWithArgument");
      res.add("question", ctx.term(0).getText());
      System.out.println(ctx.term(1).getText());
      String splitQuestion = ctx.term(1).getText().substring(7, ctx.term(1).getText().length());
      res.add("argument", splitQuestion);
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitTermBinaryLogical(QlangParser.TermBinaryLogicalContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitIDTerm(QlangParser.IDTermContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitExecutionTerm(QlangParser.ExecutionTermContext ctx) {
      return visit(ctx.execution());
   }

   @Override public ST visitTermAddMinus(QlangParser.TermAddMinusContext ctx) {
      return null;

   }

   @Override 
   public ST visitTextTerm(QlangParser.TextTermContext ctx) {
       if (!"".equals(nameGlobal)) {
           ST res = stg.getInstanceOf("addQuestionText");
           String textValue = ctx.STRING().getText();
   
           res.add("name", nameGlobal);
           res.add("text", textValue);
           return res;
       }
       return null;
   }
   

   @Override public ST visitUnaryTerm(QlangParser.UnaryTermContext ctx) {
      ST res = stg.getInstanceOf("statements");
      res.add("stat", visit(ctx.term()));
      ST decl = stg.getInstanceOf("decl");
      ctx.varName = newVarName();

      decl.add("type", ctx.eType.name());
      decl.add("var", ctx.varName);
      decl.add("value", ctx.term().varName);
      res.add("stat", decl.render());
      return res;
   }

   @Override public ST visitTermBinaryRelational(QlangParser.TermBinaryRelationalContext ctx) {
      ST res = stg.getInstanceOf("binaryTerm");
      res.add("left", visit(ctx.term(0)));
      res.add("op", ctx.op.getText());
      res.add("right", visit(ctx.term(1)));
      return res;
   }

   @Override public ST visitParenthesisterm(QlangParser.ParenthesistermContext ctx) {
      ST res = stg.getInstanceOf("parenthesis");
      res.add("term", visit(ctx.term()));
      return res;
   }

   @Override public ST visitPrintSentence(QlangParser.PrintSentenceContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override
   public ST visitPrinttermSentence(QlangParser.PrinttermSentenceContext ctx) {
      if (!"".equals(nameGlobal)) {
         ST res = stg.getInstanceOf("addTerm");

         // Create a list to store children
         List<ST> childrenResults = new ArrayList<>();

         for (int i = 0; i < ctx.getChildCount(); i++) {
               ST childResult = visit(ctx.getChild(i));
               if (childResult != null) {
                  childrenResults.add(childResult); 
               }
         }
         res.add("children", childrenResults);
         return res;
      }
      return null;
   }

   

   @Override public ST visitUsesCodeSentence(QlangParser.UsesCodeSentenceContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitUsesCodePil(QlangParser.UsesCodePilContext ctx) {
      ST res = stg.getInstanceOf("stats");
      ST sentence1 = stg.getInstanceOf("usesCode");
      sentence1.add("code", ctx.ID().getText().replace(".", ""));
      sentence1.add("var", nameGlobal);
      ST sentence2 = stg.getInstanceOf("stats");
      for (int i = 0; i < ctx.getChildCount(); i++) {
          ST childResult = visit(ctx.getChild(i));
          if (childResult != null) {
              sentence2.add("stat", childResult.render());
          }
      }
      res.add("stat", sentence1.render());
      res.add("stat", sentence2.render());
      return res;
   }

   @Override public ST visitChoiceSentence(QlangParser.ChoiceSentenceContext ctx) {
      ST res = null;
      return visitChildren(ctx);
   }

   @Override public ST visitExecutionSentence(QlangParser.ExecutionSentenceContext ctx) {
      ST res = visit(ctx.execution());
      return res;
   }

   @Override public ST visitAssignmentCommand(QlangParser.AssignmentCommandContext ctx) {
      ST res = visitChildren(ctx);
      return res;
   }

   @Override public ST visitDeclarationCommand(QlangParser.DeclarationCommandContext ctx) {
      ST res = visit(ctx.variableDeclaration());
      return res;
   }

   @Override public ST visitIfLine(QlangParser.IfLineContext ctx) {
      ST res = visit(ctx.ifLineSentence());
      return res;
   }

   @Override public ST visitVariableDeclaration(QlangParser.VariableDeclarationContext ctx) {
      ST res = stg.getInstanceOf("declareVariable");
      res.add("type", ctx.type.getText());
      res.add("variable", ctx.ID().getText());
      return res;
      //return res;
   }

   @Override public ST visitIfLineSentence(QlangParser.IfLineSentenceContext ctx) {
      ST res = stg.getInstanceOf("ifLine");
      res.add("ifBlock", visit(ctx.ifBlock()));
      for (QlangParser.ElseifBlockContext elifCtx : ctx.elseifBlock()) {
         res.add("elseifBlock", visit(elifCtx));
      }
      if (ctx.elseBlock() != null) {
         res.add("elseBlock", visit(ctx.elseBlock()));
      }
      return res;
   }

   @Override public ST visitIfBlock(QlangParser.IfBlockContext ctx) {
      ST res = stg.getInstanceOf("ifBlock");
      res.add("expr", visit(ctx.term()));
      for (QlangParser.StatementsContext stmtCtx : ctx.statements()) {
         res.add("statement", visit(stmtCtx));
      }
      return res;
   }

   @Override public ST visitElseifBlock(QlangParser.ElseifBlockContext ctx) {
      ST res = stg.getInstanceOf("elseifBlock");
      res.add("expr", visit(ctx.term()));
      for (QlangParser.StatementsContext stmtCtx : ctx.statements()) {
         res.add("statement", visit(stmtCtx));
      }
      return res;
   }

   @Override public ST visitElseBlock(QlangParser.ElseBlockContext ctx) {
      ST res = stg.getInstanceOf("elseBlock");
      for (QlangParser.StatementsContext stmtCtx : ctx.statements()) {
            res.add("statement", visit(stmtCtx));
      }
      return res;
   }

   @Override public ST visitExecution(QlangParser.ExecutionContext ctx) {
      if(!"".equals(nameGlobal)) {
         ST res = stg.getInstanceOf("executeQuestion");
         res.add("question", ctx.ID().getText().replace(".", ""));
         return res;
      }
      else if(needsPrint){
         ST res = stg.getInstanceOf("executeCodeWithPrint");
         res.add("code", ctx.ID().getText());
         needsPrint = false;
         return res;
      }
      else{
         ST res = stg.getInstanceOf("executeCode");
         res.add("code", ctx.ID().getText());
         return res;
      }
      //return res;
   }

   @Override public ST visitExport(QlangParser.ExportContext ctx) {
      ST res = stg.getInstanceOf("exportResults");
      res.add("name", ctx.exportedlocation().getText());
      return res;
   }

   @Override public ST visitExportedlocation(QlangParser.ExportedlocationContext ctx) {
      ST res = stg.getInstanceOf("exportedlocation");
      res.add("location", ctx.STRING().getText());
      return res;
   }

   @Override
   public ST visitCodeholeComposition(QlangParser.CodeholeCompositionContext ctx) {
      ST res = stg.getInstanceOf("stats");
      for (int i = 0; i < ctx.getChildCount(); i++) {
          ST childResult = visit(ctx.getChild(i));
          if (childResult != null) {
              res.add("stat", childResult.render());
          }
      }
      return res;
   }

   @Override public ST visitCodehole(QlangParser.CodeholeContext ctx) {
      ST res = stg.getInstanceOf("addCodeHoleSolution");
      res.add("answer", ctx.STRING().getText());
      res.add("var", nameGlobal);
      res.add("grade", ctx.NUMBER(0).getText());
      return res;
      
   }
}
