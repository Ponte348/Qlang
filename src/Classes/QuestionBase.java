package Classes;
import java.util.Scanner;

public interface QuestionBase {
    public Fraction execute(Scanner sc);
    public QuestionBase cloneQuestion();
    public String getID();
}