package v1;
public class EspressoWithSteamedMilkandMocha extends Beverage{
    public EspressoWithSteamedMilkandMocha(){
        super();
    }
    public EspressoWithSteamedMilkandMocha(String desc){
        super(desc);
    }
    @Override
    protected double cost() {
        return 30.00;
    }
}
