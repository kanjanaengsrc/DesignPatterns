package v3;
public class HouseBlend extends Beverage{
    public HouseBlend(){
        this("Default house blend");
    }
    public HouseBlend(String desc){
        super(desc);
    }
    @Override
    public double cost() {
        return 10.00;
    }
}