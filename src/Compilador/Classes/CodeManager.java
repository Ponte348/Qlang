package Classes;
import java.util.ArrayList;
import java.util.Random;

public class CodeManager implements CodeInterface {
    private ArrayList<CodeInterface> hierarchicalCode;
    private String category;

    public CodeManager(String category) {
        this.hierarchicalCode = new ArrayList<>();
        this.category = category;
    }

    public CodeInterface getInstance() {
        Random random = new Random();
        int randomIndex = random.nextInt(hierarchicalCode.size());
        return hierarchicalCode.get(randomIndex).getInstance();
    }

    public void addCode(CodeInterface code) {
        this.hierarchicalCode.add(code);
    }

    public String getId() {
        return this.category;
    }

    public String execute(String args) {
        return this.getInstance().execute(args);
    }
}
