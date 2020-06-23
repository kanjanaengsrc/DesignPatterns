package v3;
public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage bev) {
        this.beverage = bev;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    @Override
    public double cost() {
        return .3 + beverage.cost();
    }
}
