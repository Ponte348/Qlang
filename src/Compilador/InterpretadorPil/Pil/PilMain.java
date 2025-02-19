package InterpretadorPil.Pil;

import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class PilMain {
   public static void main(String[] args) {
      try {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromFileName(args[0]);
         PilLexer lexer = new PilLexer(input);
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         PilParser parser = new PilParser(tokens);
         ParseTree tree = parser.program();
         
         SemanticAnalyser analisador = new SemanticAnalyser();
         analisador.visit(tree);
         Interpreter visitor0 = new Interpreter(analisador.getTypes());
         if (parser.getNumberOfSyntaxErrors() == 0) {
            visitor0.visit(tree);
         }
      }
      catch(IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}
