package v1;
public class Starbuzz {
    public static void main(String[] args) {

        DarkRoastWithSteamedMilkandMocha drsm = new DarkRoastWithSteamedMilkandMocha("DarkRoast + milk + mocha");
        System.out.print(drsm.getDescription());
        System.out.printf(" and cost = $%.2f%n",drsm.cost());
        DarkRoastWithSteamedMilkandWhip drsw = new DarkRoastWithSteamedMilkandWhip("DarkRoast + milk + whip");
        System.out.print(drsw.getDescription());
        System.out.printf(" and cost = $%.2f%n",drsw.cost());

        EspressoWithSteamedMilkandMocha es = new EspressoWithSteamedMilkandMocha("Espresso + milk + mocha");
        System.out.print(es.getDescription());
        System.out.printf(" and cost = $%.2f%n",es.cost());
        EspressoWithSteamedMilkandWhip esw = new EspressoWithSteamedMilkandWhip("Espresso + milk + whip");
        System.out.print(esw.getDescription());
        System.out.printf(" and cost = $%.2f%n",esw.cost());

        DecafWithSteamedMilkandMocha dsm = new DecafWithSteamedMilkandMocha("Decaf + milk + mocha");
        System.out.print(dsm.getDescription());
        System.out.printf(" and cost = $%.2f%n",dsm.cost());
        DecafWithSteamedMilkandWhip dsw = new DecafWithSteamedMilkandWhip("Decaf + milk + whip");
        System.out.print(dsw.getDescription());
        System.out.printf(" and cost = $%.2f%n",dsw.cost());

        /* I cannot write more code.
            But there's tons of code I have to write.
            Please,help me!!! 
        */
    }
}
