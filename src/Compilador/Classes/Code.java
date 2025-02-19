package Classes;
import InterpretadorPil.Pil.*;
import java.io.*;
import java.util.Scanner;

public class Code implements CodeInterface {
    private String code;
    private String id;

    public Code(String code_inline) {
        this.code = code_inline.strip();
    }

    public Code(String codeText, String codeID) {
        this.id = codeID;
        this.code = codeText.strip();
        initialize(this.code);
    }

    private void initialize(String code) {
        File file = new File(id + ".pil");
        try {
            if (file.createNewFile()) {
                //System.out.println("File created: " + file.getName());
            } else {
                //System.out.println("File already exists.");
            }
            // Use PrintWriter with a StringReader to maintain line breaks
            try (PrintWriter writer = new PrintWriter(new FileWriter(file));
                 BufferedReader reader = new BufferedReader(new StringReader(code))) {
                String[] lines = code.split("\\r?\\n");
                for (String line : lines) {
                writer.println(line);
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readPIL(File codeFile) {
        try (Scanner scanner = new Scanner(codeFile)) {
            StringBuilder codigo = new StringBuilder();
            while (scanner.hasNextLine()) {
                codigo.append(scanner.nextLine()).append("\n");
            }
            this.code = codigo.toString().strip();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getCode() {
        return code;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String execute() {
        File file = new File(id + ".pil");
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            writer.println(this.code);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        PrintStream oldOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        PrintStream capturing = new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                oldOut.write(b);
                oldOut.flush();
                baos.write(b);
            }
        });

        System.setOut(capturing);
        
        String[] input = new String[] { id + ".pil"};
        PilMain.main(input);

        System.setOut(oldOut);

        String capturedOutput = baos.toString();
        return capturedOutput;
    }


    public CodeInterface getInstance() {
        return new Code(this.code);
    } 

    public String execute(String input) {
        // Save the old System.out and System.in
        PrintStream oldOut = System.out;
        InputStream oldIn = System.in;

        // Concatenate the inputs into a single string with newline separators
        String predefinedInput = String.join("\n", input);

        // Convert the predefined input to an input stream
        ByteArrayInputStream newIn = new ByteArrayInputStream(predefinedInput.getBytes());

        // Create a stream to hold the output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream capturing = new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                oldOut.write(b);
                oldOut.flush();
                baos.write(b);
            }
        });

        // Tell Java to use your special streams
        System.setOut(capturing);
        System.setIn(newIn);

        // Write the code to a file
        File file = new File(id + ".pil");
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            writer.println(this.code);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // Run the program
        String[] programArgs = new String[] { id + ".pil" };
        PilMain.main(programArgs);

        // Restore System.out and System.in
        System.setOut(oldOut);
        System.setIn(oldIn);

        // Get the captured output

        // Não é preciso dar print outra vez
        String capturedOutput = baos.toString();
        //return capturedOutput;
        return "";
    }

    @Override
    public String toString() {
        return code;
    }

    public Code cloneQuestion() {
        return new Code(this.code);
    }
}
