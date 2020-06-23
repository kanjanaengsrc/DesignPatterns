package v2;
public class Espresso extends Beverage{
    public Espresso(){
        super();
    }
    public Espresso(String desc){
        super(desc);
    }
    @Override
    public double cost() {
        return super.cost() + 30.00;
    }
}

