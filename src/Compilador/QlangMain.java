import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.File;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;

public class QlangMain {
   public static void main(String[] args) {
      try {
         // Define the output directory and file
         String outputFilePath = "./QlangOutput.java";

         // Create the output directory if it does not exist
         // Create the output file
         File outputFile = new File(outputFilePath);


         CharStream input = CharStreams.fromFileName(args[0]);
         // Create a lexer that feeds off of input CharStream:
         QlangLexer lexer = new QlangLexer(input);
         // Create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // Create a parser that feeds off the tokens buffer:
         QlangParser parser = new QlangParser(tokens);
         // Replace error listener:
         // parser.removeErrorListeners(); // remove ConsoleErrorListener
         // parser.addErrorListener(new ErrorHandlingListener());
         // Begin parsing at statList rule:
         ParseTree tree = parser.statList();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // Print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            SemanticAnalysis visitor0 = new SemanticAnalysis();
            Execute visitor1 = new Execute();
            ST result = null;
            Boolean result0 = visitor0.visit(tree);
            if (result0 == true) {
               result = visitor1.visit(tree);
               result.add("name", "Output");
               String output = result.render();
               System.out.println(output);
               
               // Write the output to a Java file
               try (PrintWriter out = new PrintWriter(new FileWriter(outputFilePath))) {
                  out.println(output);
               }
               
               // Compile the generated Java file
               Process compileProcess = Runtime.getRuntime().exec("javac " + outputFilePath);
               compileProcess.waitFor();
               
               // Check if compilation was successful
               if (compileProcess.exitValue() == 0) {
                  Process runProcess = Runtime.getRuntime().exec("java -cp "  + "QlangOutput");
                  runProcess.waitFor();
                  QlangOutput.main(args);
                  
                  // Print the output of the executed Java program
                  try (BufferedReader reader = new BufferedReader(new InputStreamReader(runProcess.getInputStream()))) {
                     String line;
                     while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                     }
                  }
               } else {
                  // Print any compilation errors
                  try (BufferedReader reader = new BufferedReader(new InputStreamReader(compileProcess.getErrorStream()))) {
                     String line;
                     while ((line = reader.readLine()) != null) {
                        System.err.println(line);
                     }
                  }
               }
            }
            else{
               System.out.println("Semantic analysis failed.");
            }
         }
      } catch (IOException | RecognitionException | InterruptedException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}
