package v3;
public class Decaf extends Beverage{
    public Decaf(){
        this("Default decaf");
    }
    public Decaf(String desc){
        super(desc);
    }
    @Override
    public double cost() {
        return 20.00;
    }
}