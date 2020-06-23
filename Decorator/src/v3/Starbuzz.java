package v3;
public class Starbuzz {
    public static void main(String[] args) {
        Beverage bev_a = new Espresso("Espresso");
        System.out.print(bev_a.getDescription());
        System.out.printf(" cost = $%.2f%n",bev_a.cost());

        Beverage bev_b = new HouseBlend("Houseblend");
        bev_b = new Mocha(bev_b);
        bev_b = new Mocha(bev_b);
        bev_b = new Whip(bev_b);
        
        System.out.print(bev_b.getDescription());
        System.out.printf(" cost = $%.2f%n",bev_b.cost());
    }
}
