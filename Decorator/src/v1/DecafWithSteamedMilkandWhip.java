package v1;
public class DecafWithSteamedMilkandWhip extends Beverage{
    public DecafWithSteamedMilkandWhip(){
        super();
    }
    public DecafWithSteamedMilkandWhip(String desc){
        super(desc);
    }
    @Override
    protected double cost() {
        return 20.50;
    }
}
