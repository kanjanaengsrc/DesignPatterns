package v3;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
}
