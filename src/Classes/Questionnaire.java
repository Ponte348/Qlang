package Classes;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Questionnaire implements QuestionBase {
    private ArrayList<QuestionBase> questions;

    public Questionnaire() {
        this.questions = new ArrayList<>();
    }

    @Override
    public QuestionBase cloneQuestion() {
        Random random = new Random();
        int randomIndex = random.nextInt(questions.size());
        return questions.get(randomIndex).cloneQuestion();
    }

    public void addQuestion(QuestionBase question) {
        this.questions.add(question);
    }


    @Override
    public Fraction execute(Scanner scanner) {
        return this.cloneQuestion().execute(scanner);
    }

    public QuestionBase findQuestion(String text) {
        ArrayList<QuestionBase> matchingQuestions = this.questions;
        for (QuestionBase question : questions) {
            if (question.getID().startsWith(text)) {
                matchingQuestions.add(question);
            }
        }
        Random random = new Random();
        int randomIndex = random.nextInt(matchingQuestions.size());
        return matchingQuestions.get(randomIndex);
    }

    @Override
    public String getID() {
        throw new UnsupportedOperationException("Unimplemented method 'getID'");
    }
}