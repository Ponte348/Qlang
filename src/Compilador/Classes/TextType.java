package Classes;

public class TextType extends Type{
    public TextType() {
        super("text");
    }

    public boolean isNumeric() {
      return true;
    }

   @Override public boolean conformsTo(Type other) {
      return super.conformsTo(other) || other.name().equals("text");
   }
}
