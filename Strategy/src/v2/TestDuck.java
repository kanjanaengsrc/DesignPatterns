package v2;

import java.util.ArrayList;

public class TestDuck {
    private static void showAllDucks(ArrayList<Duck> pack) {
        for (Duck duck : pack) {
            duck.quack();
            duck.swim();
            duck.fly();
            duck.display();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayList<String> duckType = new ArrayList<String>();
        ArrayList<Duck> pack = new ArrayList<Duck>();
        duckType.add("MallardDuck");
        duckType.add("RedheadDuck");
        duckType.add("RubberDuck");
        for (String classname : duckType) {
            switch (classname) {
                case "MallardDuck":
                    pack.add(new MallardDuck(classname));
                    break;
                case "RedheadDuck":
                    pack.add(new RedheadDuck(classname));
                    break;
                case "RubberDuck":
                    pack.add(new RubberDuck(classname));
                    break;
                default:
                    System.out.println("There is no " + classname);
                    break;
            }
        }
        TestDuck.showAllDucks(pack);
    }
}