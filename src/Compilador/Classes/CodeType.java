package Classes;

public class CodeType extends Type
{
   public CodeType() {
      super("code");
   }
   
   public boolean isNumeric() {
      return false;
   }
   
   @Override public boolean conformsTo(Type other) {
      return super.conformsTo(other) || other.name().equals("code");
   }
    
}
