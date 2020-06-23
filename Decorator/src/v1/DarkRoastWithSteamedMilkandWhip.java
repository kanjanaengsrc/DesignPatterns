package v1;
public class DarkRoastWithSteamedMilkandWhip extends Beverage{
    public DarkRoastWithSteamedMilkandWhip(){
        super();
    }
    public DarkRoastWithSteamedMilkandWhip(String desc){
        super(desc);
    }
    @Override
    protected double cost() {
        return 10.50;
    }
}
