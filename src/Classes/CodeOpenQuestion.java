package Classes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;


public class CodeOpenQuestion extends Question {
    private String question;
    private Code answer;
    private Code solution;
    private String inputFilePath;
    private CodeOpenQuestion clone;

    public CodeOpenQuestion(Result result, String id) {
        super(result, id);
        this.question = "";
        this.solution = new Code("");
        this.inputFilePath = "CodeOpenQuestionInputFile.txt";
    }

    public String addQuestion(String question) {
        this.question += question;
        return this.question;
    }

    public Code addSolution(Code solution) {
        this.solution = solution;
        return this.solution;
    }

    public Code getSolution(){
        return solution;
    }

    public String getAnswer() {
        return this.answer.getCode();
    }

    @Override
    public Fraction execute(Scanner scanner) {
        System.out.println(question);
        Code userAnswer = openEditorAndGetResponse(scanner);
        this.answer = userAnswer;   
        return new Fraction(0, 1);
    }

    private Code openEditorAndGetResponse(Scanner scanner) {
        System.out.print("Enter your answer (or type 'edit' to open an editor): ");
        String response = scanner.nextLine();
        Code code = new Code(response);
        if (response.equalsIgnoreCase("edit")) {
            return openEditor();
        }
        this.answer = code;
        this.getResult().updateGrade(null, this.getQuestion(), this.getSolution().toString(), this.getAnswer().toString());
        return code;
    }

    private Code openEditor() {
        File tempFile = null;
        try {
            tempFile = File.createTempFile("answer", ".txt");
            tempFile.deleteOnExit();

            ProcessBuilder pb = new ProcessBuilder("gedit", tempFile.getAbsolutePath());
            pb.start().waitFor();
            String userAnswer = new String(Files.readAllBytes(tempFile.toPath())).trim();
            this.answer = new Code(userAnswer);
            Code code = new Code(userAnswer);
            this.getResult().updateGrade(null, this.getQuestion(),  this.getSolution().toString(), this.getAnswer().toString());
            return code;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (tempFile != null && tempFile.exists()) {
                tempFile.delete();
            }
        }
    }

    @Override
    public String getID() {
        return super.getID();
    }

    @Override
    public String getQuestion() {
        return this.question;
    }

    @Override
    public QuestionBase cloneQuestion() {
        clone = new CodeOpenQuestion(super.getResult(), this.getID());
        clone.addQuestion(this.question);
        clone.addSolution(this.solution);
        return clone;
    }
}