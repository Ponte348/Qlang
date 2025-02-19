package Classes;
import java.io.StringReader;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class CodeHoleQuestion extends Question {
    private Code code;
    private ArrayList<String> solution;
    private ArrayList<String> answer;
    private ArrayList<Integer> grades;
    private ArrayList<Integer> lines;
    private ArrayList<String> question;
    private int denominator;
    private int numerator;
    private Fraction score;
    private Code codeHidden;
    private int holes;

    public CodeHoleQuestion(Result result, String id){
        super(result, id);
        this.question = new ArrayList<String>();
        this.solution = new ArrayList<String>();
        this.lines = new ArrayList<Integer>();
        this.code = null;
        this.answer = new ArrayList<String>();
        this.grades = new ArrayList<Integer>();
        this.numerator = 0;
        this.denominator = 0;
        this.holes= 0;
    }

    public CodeHoleQuestion(Result result, ArrayList<String> question, Code code, ArrayList<String> solution, ArrayList<Integer> grades, ArrayList<Integer> lines, String id) {
        super(result, id);
        this.question = question;
        this.solution = solution;
        this.lines = lines;
        this.code = code; //isto aqui vai ter de ser passado do tipo code e a descoberta dos espaços vai ser feita separando em subs
        this.answer = new ArrayList<String>();
        this.grades = grades;
        this.numerator = 0;
        this.denominator = 0;
        setDenominator();
        this.score = new Fraction(this.numerator, this.denominator); // Initialize with a valid fraction
    }

    public void addCode(Code code){
        this.code = code;
        this.codeHidden = code;
    }

    public void addQuestionText(String question) {
        this.question.add(question);
    }

    public void addSolution(String answer, Integer grade, Integer line) {
        this.solution.add(answer);
        this.lines.add(line);
        this.grades.add(grade);
        removeCodeHidden(answer);
    }
    public void addSolution(String answer, Integer grade) {
        this.solution.add(answer);
        this.lines.add(0);
        this.grades.add(grade);
        removeCodeHidden(answer);
    }

    public void addLines(Integer line) {
        this.lines.add(line);
    }

    public void addGrade(Integer grade) {
        this.grades.add(grade);
    }

    private void setDenominator() {
        for (int i = 0; i < grades.size(); i++) {
            this.denominator += grades.get(i);
        }
    }

    private Code removeCodeHidden(String hide) {
        String codeText = this.codeHidden.getCode();
        List<String> modifiedLines = new ArrayList<>();
        this.holes++;

        for (String line : codeText.split("\n")) {
            if (line.contains(hide)) {
                line = line.replace(hide, "-> " + this.holes + " <-");
            }
            modifiedLines.add(line);
        }
    
        String modifiedCode = String.join("\n", modifiedLines);
        this.codeHidden.setCode(modifiedCode);
        return this.codeHidden;
    }

    @Override
    public Fraction execute(Scanner scanner) {
        System.out.println(question);

        System.out.println(codeHidden.getCode());

        for (int i = 0; i < solution.size(); i++) {
            System.out.print("[" + grades.get(i) + "], [" + (i+1) + "], ");
            String line;
            if (scanner.hasNextLine()) {
                line = scanner.nextLine();
                // save line in answers
                answer.add(line);

                if (line.equals(solution.get(i))) {
                    this.numerator += grades.get(i);
                } else {
                    this.numerator += 0;
                }
            }
        }
        
        for (int i = 0; i < grades.size(); i++) {
            this.denominator += grades.get(i);
        }

        this.score = new Fraction(this.numerator, this.denominator);
        this.getResult().updateGrade(this.score, this.getQuestion(), this.getSolution(), this.getAnswer());

        return new Fraction(this.numerator, this.denominator);
    }

    public Fraction run(Scanner scanner) {

        return new Fraction(0,1);
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
        return new CodeHoleQuestion(this.getResult(), this.question, this.code, this.solution, this.grades, this.lines, super.getID());
    }
}