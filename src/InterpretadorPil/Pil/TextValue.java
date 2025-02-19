package InterpretadorPil.Pil;

import java.util.regex.Pattern;

public class TextValue extends Value{
    
    private String val;
    private final String int_pattern = "^[+-]?\\d+$";
    private final String real_pattern = "^[+-]?\\d+(\\.\\d+)?$";
    
    public TextValue(String value) {
        this.val = value;
    }
    
    public String getValue() {
        return val;
    }
    
    public String toString() {
        return val;
    }

    @Override
    public Value add(Value v) {
        return new TextValue(val + ((TextValue) v).getValue());
    }
    
    @Override
    public Value equal(Value v) {
        return new BooleanValue(val.equals(((TextValue) v).getValue()));
    }
    
    @Override
    public Value notEqual(Value v) {
        return new BooleanValue(!val.equals(((TextValue) v).getValue()));
    }

    @Override
    public Value convertTo(String type){
        if (type.equals("text")){
            return this;
        }

        else if (type.equals("integer")) {
            if (Pattern.matches(int_pattern, val))
                return new IntegerValue(Integer.parseInt(val));
            else
                return null;
        }
        
        else if (type.equals("real")) {
            if (Pattern.matches(real_pattern, val))
                return new DoubleValue(Double.parseDouble(val));
            else
                return null;
        }
        
        else {
            throw new RuntimeException("Conversion to " + type + " is not supported");
        }
    }
}
