package InterpretadorPil.Pil;


public class IntegerValue extends Value{
    private int val;

    public IntegerValue(int value) {
        this.val = value;
    }

    public Integer getValue() {
        return val;
    }

    public String toString() {
        return Integer.toString(val);
    }

    @Override
    public Value add(Value v) {
        return new IntegerValue(val + ((IntegerValue) v).getValue());
    }

    @Override
    public Value subtract(Value v) {
        return new IntegerValue(val - ((IntegerValue) v).getValue());
    }

    @Override
    public Value multiply(Value v) {
        return new IntegerValue(val * ((IntegerValue) v).getValue());
    }

    @Override
    public Value divide(Value v) {
        return new IntegerValue(val / ((IntegerValue) v).getValue());
    }

    @Override
    public Value mod(Value v) {
        return new IntegerValue(val % ((IntegerValue) v).getValue());
    }

    @Override
    public Value equal(Value v) {
        return new BooleanValue(val == ((IntegerValue) v).getValue());
    }

    @Override
    public Value notEqual(Value v) {
        return new BooleanValue(val != ((IntegerValue) v).getValue());
    }

    @Override
    public Value unaryMinus() {
        return new IntegerValue(-val);
    }

    @Override
    public Value lessThan(Value v) {
        return new BooleanValue(val < ((IntegerValue) v).getValue());
    }

    @Override
    public Value lessThanOrEqual(Value v) {
        return new BooleanValue(val <= ((IntegerValue) v).getValue());
    }

    @Override
    public Value greaterThan(Value v) {
        return new BooleanValue(val > ((IntegerValue) v).getValue());
    }

    @Override
    public Value greaterThanOrEqual(Value v) {
        return new BooleanValue(val >= ((IntegerValue) v).getValue());
    }

    @Override
    public Value convertTo(String type) {
        if (type.equals("integer"))
            return this;
        
        else if (type.equals("real")) 
            return new DoubleValue(val);
        
        else if (type.equals("text")) 
            return new TextValue(Integer.toString(val));
        
        else
            throw new RuntimeException("Invalid conversion");
    }
}