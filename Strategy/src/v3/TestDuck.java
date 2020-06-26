package v3;
import java.util.ArrayList;
public class TestDuck {
    private static void showAllDucks(ArrayList<Duck> pack) {
        for (Duck duck : pack) {
            duck.performQuack();
            duck.swim();
            duck.performfly();
            duck.display();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayList<String> duckType = new ArrayList<String>();
        ArrayList<Duck> pack = new ArrayList<Duck>();
        Duck tmp;
        duckType.add("MallardDuck");
        duckType.add("RedheadDuck");
        duckType.add("RubberDuck");
        duckType.add("DecoyDuck");
        for (String classname : duckType) {
            switch (classname) {
                case "MallardDuck":
                    tmp = new MallardDuck(classname);
                    tmp.setQuackBehavior(new Quack());
                    tmp.setFlyBehavior(new FlyWithWings());
                    pack.add(tmp);
                    break;
                case "RedheadDuck":
                    tmp = new RedheadDuck(classname);
                    tmp.setQuackBehavior(new Quack());
                    tmp.setFlyBehavior(new FlyWithWings());
                    pack.add(tmp);
                    break;
                case "RubberDuck":
                    tmp = new RubberDuck(classname);
                    tmp.setQuackBehavior(new Squeak());
                    tmp.setFlyBehavior(new FlyNoWay());
                    pack.add(tmp);
                    break;
                case "DecoyDuck":
                    tmp = new DecoyDuck(classname);
                    tmp.setQuackBehavior(new MuteQuack());
                    tmp.setFlyBehavior(new FlyNoWay());
                    pack.add(tmp);
                    break;
                default:
                    System.out.println("There is no " + classname);
                    break;
            }
        }
        TestDuck.showAllDucks(pack);
    }
}