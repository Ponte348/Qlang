package InterpretadorPil.Pil;

public class DoubleValue extends Value{
    private double val;

    public DoubleValue(double value) {
        this.val = value;
    }

    public Double getValue() {
        return val;
    }

    public String toString() {
        return Double.toString(val);
    }

    @Override
    public Value add(Value v) {
        return new DoubleValue(val + ((DoubleValue) v).getValue());
    }

    @Override
    public Value subtract(Value v) {
        return new DoubleValue(val - ((DoubleValue) v).getValue());
    }

    @Override
    public Value multiply(Value v) {
        return new DoubleValue(val * ((DoubleValue) v).getValue());
    }

    @Override
    public Value divide(Value v) {
        return new DoubleValue(val / ((DoubleValue) v).getValue());
    }

    @Override
    public Value mod(Value v) {
        return new DoubleValue(val % ((DoubleValue) v).getValue());
    }

    @Override
    public Value equal(Value v) {
        return new BooleanValue(val == ((DoubleValue) v).getValue());
    }

    @Override
    public Value notEqual(Value v) {
        return new BooleanValue(val != ((DoubleValue) v).getValue());
    }

    @Override
    public Value unaryMinus() {
        return new DoubleValue(-val);
    }

    @Override
    public Value lessThan(Value v) {
        return new BooleanValue(val < ((DoubleValue) v).getValue());
    }

    @Override
    public Value lessThanOrEqual(Value v) {
        return new BooleanValue(val <= ((DoubleValue) v).getValue());
    }

    @Override
    public Value greaterThan(Value v) {
        return new BooleanValue(val > ((DoubleValue) v).getValue());
    }

    @Override
    public Value greaterThanOrEqual(Value v) {
        return new BooleanValue(val >= ((DoubleValue) v).getValue());
    }

    @Override
    public Value convertTo(String type) {
        if (type.equals("double")) 
            return this;

        else if (type.equals("integer")) 
            return new IntegerValue((int) val);

        else if (type.equals("text")) 
            return new TextValue(Double.toString(val));

        else 
            throw new RuntimeException("Conversion to " + type + " not supported");
    }

}