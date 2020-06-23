package v1;
abstract class Beverage {
   protected String description;
   protected Beverage(){
       this("No description");
   }
   public Beverage(String desc){
       this.description = desc;
   }
   protected String getDescription(){
       return String.format("The best %s ever", description);
   }
   abstract protected double cost();
}
