package v2;
public class Starbuzz {
    public static void main(String[] args) {
        Beverage es = new Espresso("Espresso + milk + mocha");
        es.setMilk(true);
        es.setMocha(true);
        System.out.print(es.getDescription());
        System.out.printf(" and cost = $%.2f%n",es.cost());

        Beverage esw = new Espresso("Espresso + milk + whip");
        esw.setMilk(true);
        esw.setWhip(true);
        System.out.print(esw.getDescription());
        System.out.printf(" and cost = $%.2f%n",esw.cost());

        Decaf decaf = new Decaf("Decaf + milk + mocha + whip");
        decaf.setMilk(true);
        decaf.setMocha(true);
        decaf.setWhip(true);
        System.out.print(decaf.getDescription());
        System.out.printf(" and cost = $%.2f%n",decaf.cost());
    }
}
