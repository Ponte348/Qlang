

import Classes.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// q: question
// g: fraction
//hole Question.q1 is
//q := new Question.q1
//g := execute q
//open OpenQuestion is
//q := new OpenQuestion
//execute q
//code-open Question.Code1 is
//q := new Question.Code1
//export result to "result.txt"
//g := execute q

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Result result = new Result();
        
        // Ask for name and ID
        String name;
        int id;
        System.out.print("Nome: ");
        name = scanner.nextLine().trim();
        System.out.print("ID: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        result.setName(name);
        result.setID(id);

        QuestionBase q; // q: question
        Fraction g; // g: fraction
        
        Questionnaire questionnaire = new Questionnaire();
        HoleQuestion Questionq1 = new HoleQuestion(result, "Question.q1");
        questionnaire.addQuestion(Questionq1);
        Questionq1.addQuestionText("A atribuição de valor em PIL usa o operador ");
        Questionq1.addSolution(":=");
        Questionq1.addQuestionText(".\n");
        
        q = Questionq1.cloneQuestion();
        g = q.execute(scanner);


        // 2) OpenQuestion
        OpenQuestion openQuestion = new OpenQuestion(result, "OpenQuestion"); 
        questionnaire.addQuestion(openQuestion);
        openQuestion.addQuestion("Defina a estrutura de dados lista ligada.\n");
        openQuestion.addSolution("Uma lista ligada é uma estrutura de dados que consiste em nós, onde cada nó contém um valor e um ponteiro para o próximo nó da lista.\n");
        
        //q = OpenQuestion.cloneQuestion();
        openQuestion.execute(scanner);

        System.out.println();
        CodeOpenQuestion QuestionCode1 = new CodeOpenQuestion(result, "Question.Code1");
        QuestionCode1.addSolution(new Code(
            "[\n" +
            "  -- PIL code from here\n" +
            "  n := integer(read \"Number: \");\n" +
            "   write \"Number \",n, \" is \";\n" +
            "   if n % 2 = 0 then" + "\n" +
            "      writeln \"even\"\n" +
            "   else\n" +
            "       writeln \"odd\"\n" +
            "   end;\n"+
            "   -- PIL code to here\n" +
            "]"
        ));
        QuestionCode1.addQuestion("Implemente um programa que, pedindo um número inteiro do utilizador com o texto 'Number: ', escreva na consola se este é par (even) ou ímpar (odd).\n");
        questionnaire.addQuestion(QuestionCode1);
        
        q = QuestionCode1.cloneQuestion();
        
        g = q.execute(scanner);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"))) {
            result.export(writer);
        } catch (IOException e) {
            e.printStackTrace();
        }      
    }
}