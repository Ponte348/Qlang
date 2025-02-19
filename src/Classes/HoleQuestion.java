package Classes;
import java.util.ArrayList;
import java.util.Scanner;


public class HoleQuestion extends Question {
    private ArrayList<String> question;
    private ArrayList<String> solution;
    private ArrayList<String> answer;
    private Fraction score;

    public HoleQuestion(Result result, String id) {
        super(result, id);
        this.question = new ArrayList<>();
        this.solution = new ArrayList<>();
        this.answer = new ArrayList<>();
    }

    private Fraction rightAnswer() {
        this.score.setNumerator(this.score.getNumerator() + 1);
        String answerCompilation = "";
        for (int i = 0; i < answer.size(); i++) {
            answerCompilation += answer.get(i);
            if (i < answer.size() - 1) {
                answerCompilation += ", ";
            }
        }
        String solutionCompilation = "";
        for (int i = 0; i < solution.size(); i++) {
            solutionCompilation += solution.get(i);
            if (i < solution.size() - 1) {
                solutionCompilation += ", ";
            }
        }

        this.getResult().updateGrade(this.score, this.getQuestion(), solutionCompilation, answerCompilation);
        return this.score;
    }

    private Fraction wrongAnswer() {
        String answerCompilation = "";
        for (int i = 0; i < answer.size(); i++) {
            answerCompilation += answer.get(i);
            if (i < answer.size() - 1) {
                answerCompilation += ", ";
            }
        }
        String solutionCompilation = "";
        for (int i = 0; i < solution.size(); i++) {
            solutionCompilation += solution.get(i);
            if (i < solution.size() - 1) {
                solutionCompilation += ", ";
            }
        }
        this.getResult().updateGrade(this.score, this.getQuestion(), solutionCompilation, answerCompilation);
        return this.score;
    }

    public void addQuestionText(String q){
        this.question.add(q);
    }

    public void addSolution(String sol){
        this.solution.add(sol);
    }

    @Override
    public Fraction execute(Scanner scanner) {
        return this.run(scanner);
    }

    public Fraction run(Scanner scanner) {
        
        this.score = new Fraction(0, this.solution.size());
        StringBuilder questionText = new StringBuilder();
        for (int i = 0; i < question.size(); i++) {
            questionText.append(question.get(i));
            if (i < question.size() - 1) {
                questionText.append("->" + (i + 1) + "<- ");
            }
        }
        System.out.println(questionText.toString());

        for (int i = 0; i < solution.size(); i++) {
            System.out.print("Resposta " + (i + 1) + " - ");
            this.answer.add(scanner.nextLine().trim());
        }

        boolean isCorrect = true;
        for (int i = 0; i < solution.size(); i++) {
            if (!solution.get(i).equals(answer.get(i))) {
                isCorrect = false;
                break;
            }
        }

        System.out.println("\n------------- END OF QUESTION -------------\n");

        if (isCorrect) {
            return rightAnswer();
        } else {
            return wrongAnswer();
        }
    }

    @Override
    public String getID() {
        return super.getID();
    }

    @Override
    public String getQuestion() {
        return String.join("", question);
    }

    public String getSolution() {
        return String.join("", solution);
    }

    public String getAnswer() {
        return String.join("", answer);
    }

    @Override
    public QuestionBase cloneQuestion() {
        HoleQuestion clone;
        clone = new HoleQuestion(super.getResult(), this.getID());
        for(String q : this.question)
            clone.addQuestionText(q);

        for(String sol : this.solution)
            clone.addSolution(sol);

        return clone;
    }
}