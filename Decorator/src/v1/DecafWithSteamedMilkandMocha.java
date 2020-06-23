package v1;
public class DecafWithSteamedMilkandMocha extends Beverage{
    public DecafWithSteamedMilkandMocha(){
        super();
    }
    public DecafWithSteamedMilkandMocha(String desc){
        super(desc);
    }
    @Override
    protected double cost() {
        return 20.00;
    }
}

