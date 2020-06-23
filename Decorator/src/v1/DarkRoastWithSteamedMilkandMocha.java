package v1;
public class DarkRoastWithSteamedMilkandMocha extends Beverage{
    public DarkRoastWithSteamedMilkandMocha(){
        super();
    }
    public DarkRoastWithSteamedMilkandMocha(String desc){
        super(desc);
    }
    @Override
    protected double cost() {
        return 10.00;
    }
}
