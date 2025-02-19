package InterpretadorPil.Pil;
public class BooleanValue extends Value{
    private boolean val;

    public BooleanValue(Boolean value) {
        this.val = value;
    }

    public String toString() {
        return Boolean.toString(val);
    }

    public Boolean getValue() {
        return val;
    }
    
    @Override
    public Value not() {
        return new BooleanValue(!val);
    }

    @Override
    public Value and(Value v) {
        return new BooleanValue(val & ((BooleanValue) v).getValue());
    }

    @Override
    public Value or(Value v) {
        return new BooleanValue(val | ((BooleanValue) v).getValue());
    }

    @Override
    public Value xor(Value v) {
        return new BooleanValue(val ^ ((BooleanValue) v).getValue());
    }

    @Override
    public Value implies(Value v) {
        return new BooleanValue(!val || ((BooleanValue) v).getValue());
    }

    @Override
    public Value equal(Value v) {
        return new BooleanValue(val == ((BooleanValue) v).getValue());
    }

    @Override
    public Value notEqual(Value v) {
        return new BooleanValue(val != ((BooleanValue) v).getValue());
    }

    @Override
    public Value andThen(Value v) {
        return new BooleanValue(val && ((BooleanValue) v).getValue());
    }

    @Override
    public Value orElse(Value v) {
        return new BooleanValue(val || ((BooleanValue) v).getValue());
    }
}