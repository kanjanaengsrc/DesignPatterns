package v1;
public class EspressoWithSteamedMilkandWhip extends Beverage{
    public EspressoWithSteamedMilkandWhip(){
        super();
    }
    public EspressoWithSteamedMilkandWhip(String desc){
        super(desc);
    }
    @Override
    protected double cost() {
        return 30.50;
    } 
}
