package InterpretadorPil.Pil;

public class DoubleType extends Type{
    public DoubleType() {
        super("real");
    }

    public boolean isNumeric() {
        return true;
    }
}
