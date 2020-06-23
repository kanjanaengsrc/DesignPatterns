package v3;
public class Espresso extends Beverage{
    public Espresso(){
        this("Default espresso");
    }
    public Espresso(String desc){
        super(desc);
    }
    @Override
    public double cost() {
        return 30.00;
    } 
}