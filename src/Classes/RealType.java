package Classes;

public class RealType extends Type {
   public RealType() {
      super("real");
   }

   public boolean isNumeric() {
      return true;
   }

   @Override public boolean conformsTo(Type other) {
      return super.conformsTo(other) || other.name().equals("real");
   }

}


