package v2;
public class Decaf extends Beverage{
    public Decaf(){
        super();
    }
    public Decaf(String desc){
        super(desc);
    }
    @Override
    public double cost() {
        return super.cost() + 20.00;
    }
}

