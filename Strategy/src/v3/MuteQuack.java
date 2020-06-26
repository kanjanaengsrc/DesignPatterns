package v3;
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println(" no sound at all");
    }
}