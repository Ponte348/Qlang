import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import Classes.*;
public class QlangOutput {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Result result = new Result();
      Questionnaire questionnaire = new Questionnaire();
      System.out.println("Welcome to the Questionnaire");
      String name;
      int id;
      name = readPrompt(scanner, "Nome: ");
      id = Integer.parseInt(readPrompt(scanner, "ID: "));
      result.setName(name);
      result.setID(id);
      System.out.println("Nome: " + name + ", id: " + Integer.toString(id));
      Code PILExample1 = new Code(""+ 
      "   -- PIL code from here"+ 
      "   n := integer(read \"Number: \"); -- type conversion: type(expression)"+ 
      "   write \'Number \',n, \' is \';"+ 
      "   if n % 2 = 0 then -- = is the comparison operator (as in math)"+ 
      "      writeln \'even\'"+ 
      "   else"+ 
      "      writeln \'odd\'"+ 
      "   end;"+ 
      "   -- PIL code to here", "PILExample1");
      Code c;
      c = PILExample1.cloneQuestion();
      String res;
      res = c.execute();
      res = c.execute();
      System.out.println(c.execute());
      CodeHoleQuestion AlgorithmCode1 = new CodeHoleQuestion(result, "Algorithm.Code1");
      questionnaire.addQuestion(AlgorithmCode1);
      AlgorithmCode1.addQuestionText("Complete o seguinte código.");
      AlgorithmCode1.addCode(PILExample1);
      AlgorithmCode1.addSolution("n % 2 = 0", 10);
      AlgorithmCode1.addSolution("else", 5);
      AlgorithmCode1.execute(scanner);
      try (BufferedWriter writer = new BufferedWriter(new FileWriter("result-p2.txt"))) {
          result.export(writer);
      } catch (IOException e) {
          e.printStackTrace();
      }     

      scanner.close();
   }
   public static String readPrompt(Scanner scanner, String prompt) {
      System.out.print(prompt);
      return scanner.nextLine();
}
}
