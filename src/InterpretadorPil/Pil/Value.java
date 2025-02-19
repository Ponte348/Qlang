package InterpretadorPil.Pil;
public abstract class Value {
    
    public abstract Object getValue();
    public abstract String toString();

    public Value not() {
        throw new RuntimeException("Negation not supported");
    }

    public Value add(Value v) {
        throw new RuntimeException("Addition not supported");
    }

    public Value subtract(Value v) {
        throw new RuntimeException("Subtraction not supported");
    }

    public Value multiply(Value v) {
        throw new RuntimeException("Multiplication not supported");
    }

    public Value divide(Value v) {
        throw new RuntimeException("Division not supported");
    }

    public Value mod(Value v) {
        throw new RuntimeException("Mod not supported");
    }

    public Value and(Value v) {
        throw new RuntimeException("And not supported");
    }

    public Value or(Value v) {
        throw new RuntimeException("Or not supported");
    }

    public Value xor(Value v) {
        throw new RuntimeException("Not not supported");
    }

    public Value implies(Value v) {
        throw new RuntimeException("Implies not supported");
    }

    public Value andThen(Value v) {
        throw new RuntimeException("Unary plus not supported");
    }

    public Value orElse(Value v) {
        throw new RuntimeException("Unary minus not supported");
    }

    public Value unaryMinus() {
        throw new RuntimeException("Unary minus not supported");
    }

    public Value equal(Value v) {
        throw new RuntimeException("Equal not supported");
    }

    public Value notEqual(Value v) {
        throw new RuntimeException("Not equal not supported");
    }

    public Value lessThan(Value v) {
        throw new RuntimeException("Less than not supported");
    }

    public Value lessThanOrEqual(Value v) {
        throw new RuntimeException("Less than or equal not supported");
    }

    public Value greaterThan(Value v) {
        throw new RuntimeException("Greater than not supported");
    }

    public Value greaterThanOrEqual(Value v) {
        throw new RuntimeException("Greater than or equal not supported");
    }

    public Value convertTo(String type) {
        throw new RuntimeException("Conversion not supported");
    }

}
