package Classes;
import java.util.ArrayList;
import java.util.Random;

public class QuestionnaireCode {
    private ArrayList<CodeInterface> codes;

    public QuestionnaireCode() {
        this.codes = new ArrayList<>();
    }

    public CodeInterface getInstance() {
        Random random = new Random();
        int randomIndex = random.nextInt(codes.size());
        return codes.get(randomIndex).getInstance();
    }

    public void addCode(CodeInterface code) {
        this.codes.add(code);
    }

    public String execute(String args) {
        return this.getInstance().execute(args);
    }

    public CodeInterface findCode(String text) {
        ArrayList<CodeInterface> matchingCodes = this.codes;
        for (CodeInterface code : codes) {
            if (code.getId().startsWith(text)) {
                matchingCodes.add(code);
            }
        }
        Random random = new Random();
        int randomIndex = random.nextInt(matchingCodes.size());
        return matchingCodes.get(randomIndex);
    }
}
