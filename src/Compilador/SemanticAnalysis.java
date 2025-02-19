import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;


@SuppressWarnings("CheckReturnValue")
public class SemanticAnalysis extends QlangBaseVisitor<Boolean> {

   private HashMap<String, Type> variables = new HashMap<>();
   private ArrayList<String> questions = new ArrayList<>();
   private ArrayList<String> code = new ArrayList<>();
   
   private Type getType(String type) {
      switch (type) {
         case "integer":
            return new IntegerType();
         case "boolean":
            return new BooleanType();
         case "text":
            return new TextType();
         case "fraction":
            return new FractionType();
         case "question":
            return new QuestionType();
         case "code":
            return new CodeType();
         default:
            System.out.println("Error: Type " + type + " not recognized.");
            return null;
      }
   } 

   @Override public Boolean visitStatList(QlangParser.StatListContext ctx) {
      Boolean res = true;
      variables.put("result.name", new TextType());
      variables.put("result.id", new IntegerType());
      variables.put("result.grade", new FractionType());
      variables.put("Algorithm", new QuestionType());
      variables.put("Q1", new QuestionType());
      variables.put("Q2", new QuestionType());

      return visit(ctx.statementComposition());
   }

   @Override public Boolean visitStatementComposition(QlangParser.StatementCompositionContext ctx) {
      Boolean res = true;
      for (QlangParser.StatementsContext statement : ctx.statements()) {
         res = res && visit(statement);
         if (!res) return res;
      }
      return res;
   }

   @Override public Boolean visitQuestionOrder(QlangParser.QuestionOrderContext ctx) {
      Boolean res = true;
      return visit(ctx.question());
      //return res;
   }

   @Override public Boolean visitDeclarationOrder(QlangParser.DeclarationOrderContext ctx) {
      Boolean res = true;
      return visit(ctx.variableDeclaration());
      //return res;
   }

   @Override public Boolean visitAssignmentOrder(QlangParser.AssignmentOrderContext ctx) {
      return visit(ctx.assignment());
      //return res;
   }

   @Override public Boolean visitExecutionOrder(QlangParser.ExecutionOrderContext ctx) {
      return visit(ctx.execution());
      //return res;
   }

   @Override public Boolean visitExportOrder(QlangParser.ExportOrderContext ctx) {
      return visit(ctx.export());
      //return res;
   }

   @Override public Boolean visitCodeOrder(QlangParser.CodeOrderContext ctx) {
      return visit(ctx.code());
      //return res;
   }

   @Override public Boolean visitSimpleCodeOrder(QlangParser.SimpleCodeOrderContext ctx) {
      return visit(ctx.simpleCode());
      //return res;
   }

   @Override public Boolean visitHole(QlangParser.HoleContext ctx) {

      return visit(ctx.questionHole());
      //return res;
   }

   @Override public Boolean visitOpen(QlangParser.OpenContext ctx) {
      return visit(ctx.questionOpen());
      //return res;
   }

   @Override public Boolean visitCodeHole(QlangParser.CodeHoleContext ctx) {
      return visit(ctx.questionCodeHole());
      //return res;
   }

   @Override public Boolean visitCodeOpen(QlangParser.CodeOpenContext ctx) {
      return visit(ctx.questionCodeOpen());
      //return res;
   }

   @Override public Boolean visitColeOutput(QlangParser.ColeOutputContext ctx) {
      return visit(ctx.questionColeOutput());
      //return res;
   }

   @Override public Boolean visitMultichoice(QlangParser.MultichoiceContext ctx) {
      return visit(ctx.questionMultiChoice());
      //return res;
   }

   @Override public Boolean visitComposed(QlangParser.ComposedContext ctx) {
      return visit(ctx.questionComposed());
      //return res;
   }

   @Override public Boolean visitCode(QlangParser.CodeContext ctx) {
      Boolean res = true;
      String id = ctx.ID().getText();

      if(questions.contains(id)){
         ErrorHandling.registerError();
         ErrorHandling.printError(ctx, id + " is not a valid code class.");
         return false;
      }

      if (code.contains(id)) {
         ErrorHandling.printWarning(ctx,id + " was already exists");
      }else{
         code.add(id);
      }
      code.add(id);
      return true;
      //return res;
   }

   @Override public Boolean visitSimpleCode(QlangParser.SimpleCodeContext ctx) {
      return true;
      //return res;
   }

   @Override public Boolean visitQuestionHole(QlangParser.QuestionHoleContext ctx) {
      String id = ctx.ID().getText();
      if (questions.contains(id)) {
         ErrorHandling.registerError();
         int line = ctx.getStart().getLine();
         ErrorHandling.printError(line, "Variable " + id + " already exists");
         return false;
      }
      questions.add(id);
      return visit(ctx.commandComposition());
      }

   @Override public Boolean visitQuestionOpen(QlangParser.QuestionOpenContext ctx) {
      
      String id = ctx.ID().getText();
      if (questions.contains(id)) {
         ErrorHandling.registerError();
         int line = ctx.getStart().getLine();
         ErrorHandling.printError(line, "Variable " + id + " already exists");
         return false;
      }
      questions.add(id);
      return visit(ctx.commandComposition());
}

   @Override public Boolean visitQuestionCodeHole(QlangParser.QuestionCodeHoleContext ctx) {
      String id = ctx.ID().getText();
      if (questions.contains(id)) {
         ErrorHandling.registerError();
         int line = ctx.getStart().getLine();
         ErrorHandling.printError(line, "Variable " + id + " already exists");
         return false;
      }
      questions.add(id);
      return visit(ctx.commandComposition());
   }

   @Override public Boolean visitQuestionCodeOpen(QlangParser.QuestionCodeOpenContext ctx) {
      String id = ctx.ID().getText();
      if (questions.contains(id)) {
         ErrorHandling.registerError();
         int line = ctx.getStart().getLine();
         ErrorHandling.printError(line, "Variable " + id + " already exists");
         return false;
      }
      questions.add(id);   
      System.out.println("QuestionCodeOpen: " + visit(ctx.commandComposition()));
      return visit(ctx.commandComposition());
      //return res;
   }

   @Override public Boolean visitQuestionColeOutput(QlangParser.QuestionColeOutputContext ctx) {
      String id = ctx.ID().getText();
      if (questions.contains(id)) {
         ErrorHandling.registerError();
         int line = ctx.getStart().getLine();
         ErrorHandling.printError(line, "Variable " + id + " already exists");
         return false;
      }
      questions.add(id);
      return visit(ctx.commandComposition());
      //return res;
   }

   @Override public Boolean visitQuestionMultiChoice(QlangParser.QuestionMultiChoiceContext ctx) {
      String id = ctx.ID().getText();
      if (questions.contains(id)) {
         ErrorHandling.registerError();
         int line = ctx.getStart().getLine();
         ErrorHandling.printError(line, "Variable " + id + " already exists");
         return false;
      }
      questions.add(id);
      return visit(ctx.commandComposition());
      //return res;
   }

   @Override public Boolean visitQuestionComposed(QlangParser.QuestionComposedContext ctx) {
      String id = ctx.ID().getText();
      if (questions.contains(id)) {
         ErrorHandling.registerError();
         int line = ctx.getStart().getLine();
         ErrorHandling.printError(line, "Variable " + id + " already exists");
         return false;
      }
      questions.add(id);
      return visit(ctx.commandComposition());
      //return res;
   }

   @Override
   public Boolean visitCommandComposition(QlangParser.CommandCompositionContext ctx) {
       Boolean res = true;
         for (QlangParser.CommandContext cmd : ctx.command()) {
            res = res && visit(cmd);
            if (!res) return res;
         }
         return res;
   }
   
   
   @Override public Boolean visitIDAssignment(QlangParser.IDAssignmentContext ctx) {
      Boolean res = true;
      String id = ctx.ID().getText();
      res = visit(ctx.term());      
      Type termtype = ctx.term().eType;

      if (!res) return false;

      if (!variables.containsKey(id)) {
         ErrorHandling.registerError();
         ErrorHandling.printError(ctx, "Variable " + id + " not declared");
         res= false;
      }else{
         Type idType = variables.get(id);
         if (!idType.name().equals(termtype.name())) {
            if(idType.conformsTo(termtype)){
               ErrorHandling.printError(ctx,"Assigmnet type mismatch");
            }else{
               ErrorHandling.registerError();
               ErrorHandling.printError(ctx, "Assignment type mismatch");
               res= false;
            }
         }
      }
      return res;
   }

   @Override public Boolean visitReadAssignment(QlangParser.ReadAssignmentContext ctx) {
      Boolean res = true;
      String id1 = ctx.ID(0).getText();
      String id2 = ctx.ID(1).getText();
      if (!variables.containsKey(id1)) {
         ErrorHandling.registerError();
         int line = ctx.getStart().getLine();
         ErrorHandling.printError(line, "Variable " + id1 + " not declared");
         return false;
      }
      if (questions.contains(id2)) { 
         if(variables.get(id1).name().equals("question")){
            return true;
         }
         else {
            ErrorHandling.registerError();
            int line = ctx.getStart().getLine();
            ErrorHandling.printError(line, "Variable " + id1 + " is not a question");
            return false;
         }
      }
      else if (code.contains(id2)) {
         if(variables.get(id1).name().equals("code")){
            return true;
         }
         else {
            ErrorHandling.registerError();
            int line = ctx.getStart().getLine();
            ErrorHandling.printError(line, "Variable " + id1 + " is not a code");
            return false;
         }
      }
      else {
         ErrorHandling.registerError();
         int line = ctx.getStart().getLine();
         ErrorHandling.printError(line, "Variable " + id2 + " not declared");
         return false;
      }
   }

   @Override public Boolean visitHoleQuestionAssignment(QlangParser.HoleQuestionAssignmentContext ctx) {
      Boolean res = true;
      String id = ctx.ID().getText();
      Type type = ctx.term().eType;

      res = visit(ctx.term());
      if (!res) return false;

      if (id.contains(".")) {
         ErrorHandling.registerError();
         ErrorHandling.printError(ctx, "The local variable " + id + " must not be a question-class or code-class.");
         res = false;
      }
      return res && visitChildren(ctx);
   }

   @Override public Boolean visitFraction(QlangParser.FractionContext ctx) {
      Boolean res = true;

      List<TerminalNode> integers = ctx.NUMBER();
      if (integers.size() != 2) {
         ctx.eType = new IntegerType();
      }
      else {
         ctx.eType = new FractionType();
         int denominador = Integer.parseInt(integers.get(1).getText());
         if (denominador == 0) {
            System.out.println("Error: Denominator cannot be zero.");
            res = false;
         } 
      }
      return res;
   }

   @Override public Boolean visitTermAddMinus(QlangParser.TermAddMinusContext ctx) {
      Boolean res = visit(ctx.term(0)) && visit(ctx.term(1)) && ctx.term(0).eType.isNumeric() && ctx.term(1).eType.isNumeric(); 
      if(res){
         ctx.eType= getType("int");
      }
      return res;
   }

   @Override public Boolean visitUnaryTerm(QlangParser.UnaryTermContext ctx) {
      if (ctx.op.getText().equals("not") && !"boolean".equals(ctx.term().eType.name())) {
            ErrorHandling.registerError();
            ErrorHandling.printError(ctx, "Trying to negate a boolean, but turns out it's a " + ctx.term().eType.name());
            return false;
         }
         Boolean res = visit(ctx.term()) && ctx.term().eType.isNumeric() ;
         if (res) {
            ctx.eType = ctx.term().eType;
         }
         return res;
   }


   @Override public Boolean visitTermMultDivMod(QlangParser.TermMultDivModContext ctx) {
      Boolean res = visit(ctx.term(0)) && visit(ctx.term(1)) && ctx.term(0).eType.isNumeric() && ctx.term(1).eType.isNumeric(); 
      if(res){
         ctx.eType= getType("int");
      }
      return res;
   }


   @Override public Boolean visitTextTerm(QlangParser.TextTermContext ctx) {
      Boolean res = true;
      ctx.eType = new TextType();
      return true;
      //return res;
   }

   @Override public Boolean visitReadTerm(QlangParser.ReadTermContext ctx) {
      Boolean res = true;
      ctx.eType = new TextType();
      return  res;
      //return res;
   }

   @Override public Boolean visitIDTerm(QlangParser.IDTermContext ctx) {
         Boolean res = true;
         if (!variables.containsKey(ctx.ID().getText()) && !code.contains(ctx.ID().getText()) && !questions.contains(ctx.ID().getText())){
            ErrorHandling.registerError();
            ErrorHandling.printError(ctx, "Variable " + ctx.ID().getText() + " has not been declared.1");
            return false;
         }
         if (res) {
            switch (ctx.ID().getText()) {
               case "result.name":
                  ctx.eType = new TextType();
                  return res;
               case "result.id":
                  ctx.eType = new IntegerType();
                  return res;
               case "return.grade":
                  ctx.eType = new FractionType();
                  return res;
            }
            ctx.eType = variables.get(ctx.ID().getText());
            if (ctx.eType == null) {
               if (code.contains(ctx.ID().getText())){
                  ctx.eType = new TextType();
               }
               else if (questions.contains(ctx.ID().getText())){
                  ctx.eType = new FractionType();
               }
               else{
                  ErrorHandling.registerError();
                  ErrorHandling.printError(ctx, "Variable " + ctx.ID().getText() + " has not been declared.");
                  return false;
               }
            }
         }
         return true;

      }

   @Override public Boolean visitTermBinaryLogical(QlangParser.TermBinaryLogicalContext ctx) {
       Boolean res = true;
       Boolean termsCorrect = visit(ctx.term(0)) && visit(ctx.term(1));
       if (termsCorrect) {
           Type leftType = ctx.term(0).eType;
           Type rightType = ctx.term(1).eType;
   
           if (!leftType.name().equals("boolean") || !rightType.name().equals("boolean")) {
               ErrorHandling.registerError();
               int line = ctx.getStart().getLine();
               ErrorHandling.printError(line, "Both sides of the logical expression must be of type boolean");
               res = false;
           } else {
               ctx.eType = new BooleanType();
           }
       }
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitStdoutterm(QlangParser.StdouttermContext ctx) {
      Boolean res = true;

      res = visit(ctx.term(0) ) && visit(ctx.term(1));
      if (!res) return false;

      if (!ctx.term(0).eType.name().equals("text")){
         ErrorHandling.registerError();
         ErrorHandling.printError(ctx, "First term must be of type text");
         return false;
      }

      if (!ctx.term(1).eType.name().equals("text")){
         ErrorHandling.registerError();
         ErrorHandling.printError(ctx, "Second term must be of type code");
         return false;
      }

      ctx.eType = new TextType();
      return res;
   }

   @Override public Boolean visitTermBinaryRelational(QlangParser.TermBinaryRelationalContext ctx) {
      Boolean res = true;
      Boolean termsCorrect = visit(ctx.term(0)) && visit(ctx.term(1));
      if (termsCorrect) {
          Type leftType = ctx.term(0).eType;
          Type rightType = ctx.term(1).eType;
  
          if ((leftType.isNumeric()) || rightType.isNumeric()) {
              ctx.eType = new BooleanType();
          } else {
              ErrorHandling.registerError();
              ErrorHandling.printError(ctx, "Both sides of the relational expression must be of type int");
              res = false;
              
          }
      }
      return res;
   }

   @Override public Boolean visitParenthesisterm(QlangParser.ParenthesistermContext ctx) {
      Boolean res = visit(ctx.term());
      if (res){
         ctx.eType= ctx.term().eType;
      }
      return res && visitChildren(ctx);
   }  

   @Override public Boolean visitPrintSentence(QlangParser.PrintSentenceContext ctx) {
      Boolean res = true;
      if (ctx.term() == null){
         ErrorHandling.registerError();
         ErrorHandling.printError(ctx, "Print sentence must have at least one string to print.");
         return false;
      }
      else {
         for (QlangParser.TermContext term : ctx.term()) {
            res = res && visit(term);
            if (!res) return res;
            Type termType = term.eType;
            if (!termType.name().equals("text")) {
               ErrorHandling.registerError();
               ErrorHandling.printError(ctx, "Print sentence must have at least one string to print.");
               return false;
            }
         }
      } 
      return res;
   }

   @Override public Boolean visitPrinttermSentence(QlangParser.PrinttermSentenceContext ctx) {
      
      Boolean res = true;
         return res;
   }

   @Override public Boolean visitUsesCodeSentence(QlangParser.UsesCodeSentenceContext ctx) {
      Boolean res = true;
         return res;
   }

   @Override public Boolean visitUsesCodePil(QlangParser.UsesCodePilContext ctx) {
      Boolean res = true;
      String id = ctx.ID().getText();

      if(!code.contains(id)){
         ErrorHandling.registerError();
         ErrorHandling.printError(ctx, id + " has not been declared.");
         return false;
      }
      return res;
      
   }

   @Override public Boolean visitChoiceSentence(QlangParser.ChoiceSentenceContext ctx) {
      Boolean res = true;
      if (ctx.term() != null){
         return visit(ctx.term());
      }
      return res;
   }

   @Override public Boolean visitExecutionTerm(QlangParser.ExecutionTermContext ctx) {
      Boolean res = visit(ctx.execution());
      ctx.eType = new FractionType();
      if (!res) return false;
      ctx.eType = ctx.execution().eType;
      return res;
   }

   @Override public Boolean visitExecutionSentence(QlangParser.ExecutionSentenceContext ctx) {
      return visit(ctx.execution());
      //return res;
   }

   @Override public Boolean visitAssignmentCommand(QlangParser.AssignmentCommandContext ctx) {
      return visit(ctx.assignment());
      //return res;
   }

   @Override public Boolean visitDeclarationCommand(QlangParser.DeclarationCommandContext ctx) {
      return visit(ctx.variableDeclaration());
   }

   @Override public Boolean visitIfLine(QlangParser.IfLineContext ctx) {
      return visit(ctx.ifLineSentence());
      //return res;
   }

   @Override public Boolean visitVariableDeclaration(QlangParser.VariableDeclarationContext ctx) {
      Boolean res = true;
      String id= ctx.ID().getText();
      Type type = getType(ctx.type.getText());
      variables.put(id, type);
      return true;
      //return res;
   }

   @Override public Boolean visitIfLineSentence(QlangParser.IfLineSentenceContext ctx) {
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitIfBlock(QlangParser.IfBlockContext ctx) {
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitElseifBlock(QlangParser.ElseifBlockContext ctx) {
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitElseBlock(QlangParser.ElseBlockContext ctx) {
      return visitChildren(ctx);
      //return res;
   }

   @Override public Boolean visitExecution(QlangParser.ExecutionContext ctx) {
      Boolean res = true;
      ctx.eType = new FractionType();
      String id = ctx.ID().getText();

      if (ctx.new_ != null && (!questions.contains(id) && !code.contains(id))){
         ErrorHandling.registerError();
         ErrorHandling.printError(ctx, id + " is not a valid question or code class.");
         return false;  
      }

      
      if (ctx.new_ != null){
         if (questions.contains(id)) {
            ctx.eType = new FractionType();
         }
         if (code.contains(id)) {
            ctx.eType = new TextType();
         }
      }
      else if (!variables.containsKey(id)) {
         ErrorHandling.registerError();
         ErrorHandling.printError(ctx, id + " has not been declared.");
         return false;
      }
      else {
         Type idsetType = variables.get(id);
         if (ctx.new_ != null) {
            ErrorHandling.registerError();
            ErrorHandling.printError(ctx, id + " is not a question-class or code-class.");
            return false;
         }
         if (idsetType.name().equals("question")){
            ctx.eType = new FractionType();
         } 
         if (idsetType.name().equals("code")){
            ctx.eType = new TextType();
         } 
         if (!"question".equals(idsetType.name()) && !"code".equals(idsetType.name())) {
            ErrorHandling.registerError();
            ErrorHandling.printError(ctx, id + " must be of type 'question' or 'code'.");
            return false;
         }
      }

      return res;
   }

   @Override public Boolean visitExport(QlangParser.ExportContext ctx) {
      Boolean res = true;
      String id = ctx.ID().getText();

      if(!variables.containsKey(id) && !id.equals("result")){
         ErrorHandling.registerError();
         ErrorHandling.printError(ctx, id + " has not been declared.");
         return false;
      }
      res = res && visit(ctx.exportedlocation());
      if (!res) return res;
      Type termType = ctx.exportedlocation().eType;

      if (!"text".equals(termType.name())) {
         ErrorHandling.registerError();
         ErrorHandling.printError(ctx, "Exported location must be of type text.");
         res = false;
      }
      return res;
   }

   @Override public Boolean visitExportedlocation(QlangParser.ExportedlocationContext ctx) {
      ctx.eType = new TextType();
      return true;
      //return res;
   }

   @Override public Boolean visitCodeholeComposition(QlangParser.CodeholeCompositionContext ctx) {
      return true;
      //return res;
   }

   @Override public Boolean visitCodehole(QlangParser.CodeholeContext ctx) {
      return true;
      //return res;
   }

   @Override
      public Boolean visitTypeTerm(QlangParser.TypeTermContext ctx) {
         Boolean res = true;
      
         String typeexpression = ctx.type.getText();
      
         switch (typeexpression) {
            case "integer":
                  ctx.eType = getType(typeexpression);
                  break;
            case "real":
                  ctx.eType = getType(typeexpression);
                  break;
            case "text":
                  ctx.eType = getType(typeexpression);
                  break;
            case "question":
                  ctx.eType = getType(typeexpression);
                  break;
            case "fraction":
                  ctx.eType = getType(typeexpression);
                  break;
            default:
                  ErrorHandling.registerError();
                  res = false;
                  break;
         }
      
         return res && visit(ctx.term());
      }


}
