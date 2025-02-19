import Classes.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/*
name: text;
id: integer;
name := read "Nome: "; # ask user for a text (with a prompt)
id := integer(read "ID: ");
result.name := name;
result.id := id;
println "Nome: " name ", id: " text(id);
code PIL.Example1 is
c: code
c := new PIL.Example1
res: text
res := execute c
res := "10" | execute c
 java oMeuPrograma < 10 <-------
 java oMeuPrograma 10 
res := "10" | execute c
 java oMeuPrograma < 10 <-------
 java oMeuPrograma 10 
execute c
code-hole Algorithm.Code1 is
*/

public class p2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Result result = new Result();
        Questionnaire questionnaire = new Questionnaire();
        
        String name;    // name: text;
        int id;         // id: integer;
        

        System.out.print("Nome: ");         // result.name := read "Nome: ";
        name = scanner.nextLine().trim();   // ""
        result.setName(name);               // ""

        System.out.print("ID: ");           // id := integer(read "ID: ");
        id = Integer.parseInt(scanner.nextLine().trim()); // ""
        result.setID(id);                   // ""

        System.out.println();

        System.out.println("Nome: " + name + ", ID: " + Integer.toString(id) + "\n");     // println "Nome: " name ", id: " text(id);

        // code PIL.Example1 is <código> end;
        Code PILExample1 = new Code(
        "\n" +
        "  -- PIL code from here\n" +
        "  n := integer(read \"Number: \");\n" +
        "   write \"Number \",n, \" is \";\n" +
        "   if n % 2 = 0 then" + "\n" +
        "      writeln \"even\"\n" +
        "   else\n" +
        "       writeln \"odd\"\n" +
        "   end;\n"+
        "   -- PIL code to here\n" +
        "", "PIL.Example1");


        //Code c = PILExample1; // c: code; c := new PIL.Example1;
        Code c;
        c = PILExample1.cloneQuestion();
        
        String res; // res: text;
        res = c.execute(); // res := execute c;
        res = c.execute("10"); // res := "10" | execute c;
        System.out.println(c.execute()); // println res;


        CodeHoleQuestion AlgorithmCode1 = new CodeHoleQuestion(result, "Algorithm.Code1");
        AlgorithmCode1.addQuestionText("Complete o seguinte código:");
        AlgorithmCode1.addCode(PILExample1);
        AlgorithmCode1.addSolution("n % 2 = 0\n",10);
        AlgorithmCode1.addSolution("else",5);
        questionnaire.addQuestion(AlgorithmCode1);
        AlgorithmCode1.execute(scanner);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("result-p2.txt"))) {
            result.export(writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}

        

    