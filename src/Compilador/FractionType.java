public class FractionType extends Type{
    public FractionType() {
        super("fraction");
    }
    
    public boolean isNumeric() {
        return true;
    }
    
    @Override public boolean conformsTo(Type other) {
        return super.conformsTo(other) || other.name().equals("fraction");
    }
    
}