package v3;
public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage bev) {
        this.beverage = bev;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
    @Override
    public double cost() {
        return .5 + beverage.cost();
    }
}
