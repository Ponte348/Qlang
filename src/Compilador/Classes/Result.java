package Classes;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Result {
    private String name;
    private int id;
    private ArrayList<String> questions;
    private ArrayList<String> answers;
    private ArrayList<String> correctAnswers;
    private ArrayList<Fraction> grades;
    private Fraction finalGrade;

    public Result() {
        this.name = "";
        this.id = -1;
        this.finalGrade = new Fraction(0, 1);
        this.questions = new ArrayList<>();
        this.answers = new ArrayList<>();
        this.grades = new ArrayList<>();
        this.correctAnswers = new ArrayList<>();
    }

    public void updateGrade(Fraction result, String question, String solution, String answer) {
        this.questions.add(question);
        this.answers.add(answer);
        this.grades.add(result);
        this.correctAnswers.add(solution);
        if (result != null && this.finalGrade != null) {
            this.finalGrade = Fraction.add(this.finalGrade, result);
        } else {
            this.finalGrade = null;
        }
    }

    public void resetGrade() {
        this.finalGrade = new Fraction(0, 1); // Reset to a valid fraction
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fraction getGrade() {
        return this.finalGrade;
    }

    public void askName(Scanner scanner, String prompt) {
        System.out.print(prompt);
        this.name = scanner.nextLine();
        scanner.close();
        this.setName(name);
    }

    public void askID(Scanner scanner, String prompt) {
        System.out.print(prompt);
        this.id = scanner.nextInt();
        scanner.close();
        this.setID(id);
    }

    public void export(BufferedWriter writer) {
        System.out.println();
        try {
            writer.write("Name: " + this.getName() + "\n");
            if (this.getId() == -1) {
                writer.write("ID: N/A" + "\n");
            } else {
                writer.write("ID: " + this.getId() + "\n");
            }
            writer.write("_____________________________________\n");
            for (int questionIDX = 1; questionIDX <= this.questions.size(); questionIDX++) {
                //System.out.println("Question " + questionIDX + ": " + this.questions.get(questionIDX - 1));
                writer.write("Question " + questionIDX + ": " + this.questions.get(questionIDX - 1) + "\n");
                writer.write("User Answer: " + this.answers.get(questionIDX - 1) + "\n");
                writer.write("Correct Answer: " + this.correctAnswers.get(questionIDX - 1) + "\n");
                if (this.grades.get(questionIDX - 1) != null) {
                    writer.write("Grade: " + this.grades.get(questionIDX - 1) + "\n");
                } else {
                    writer.write("Grade: Undefined\n");
                }
                writer.write("____________________________________________\n");
            }
            writer.write("Final Grade: " + ((this.finalGrade == null) ? "undefined" : this.finalGrade) + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The questionnaire has been completed. You can check the results in the results file");
    }
}