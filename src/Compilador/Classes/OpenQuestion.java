package Classes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class OpenQuestion extends Question {
    private String question;
    private String answer;
    private OpenQuestion clone;
    private String solution;

    public OpenQuestion(Result result, String id) {
        super(result, id);
        this.question = "";
        this.answer = "";
        this.clone = null;
    }

    public String addQuestionText(String question) {
        this.question += question;
        return this.question;
    }

    public String addAnswer(String answer) {
        this.answer += answer;
        return this.answer;
    }

    public String addSolution(String solution) {
        this.solution += solution;
        return this.solution;
    }

    public OpenQuestion(Result result, String question, String id) {
        super(result, id);
        this.question = question;
        this.answer = "";
        this.clone = null;
    }

    @Override
    public Fraction execute(Scanner scanner) {
        System.out.println(question);
        String userAnswer = openEditorAndGetResponse(scanner);
        this.answer = userAnswer;
        return new Fraction(0, 1);
    }

    private String openEditorAndGetResponse(Scanner scanner) {
        System.out.print("Enter your answer (or type 'edit' to open an editor): ");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("edit")) {
            return openEditor();
        }
        this.answer = response;
        this.getResult().updateGrade(null, this.getQuestion(), "undefined", this.getAnswer());
        System.out.println("\n------------- END OF QUESTION -------------\n");
        return response;
    }

    private String openEditor() {
        File tempFile = null;
        try {
            tempFile = File.createTempFile("answer", ".txt");
            tempFile.deleteOnExit();

            ProcessBuilder pb = new ProcessBuilder("gedit", tempFile.getAbsolutePath());
            pb.start().waitFor();
            this.answer = new String(Files.readAllBytes(tempFile.toPath())).trim();
            this.getResult().updateGrade(null, this.getQuestion(), "undefined", this.getAnswer());

            return new String(Files.readAllBytes(tempFile.toPath())).trim();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return "";
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
    public String getAnswer() {
        return this.answer;
    }

    @Override
    public QuestionBase cloneQuestion() {
        this.clone = new OpenQuestion(super.getResult(), this.getID());
        this.clone.addQuestionText(question);
        return clone;
    }
}