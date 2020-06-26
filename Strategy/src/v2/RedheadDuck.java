package v2;

public class RedheadDuck extends Duck{

    public RedheadDuck(String name) {
        super(name);
    }

    @Override
    protected void display() {
        System.out.println(this.name +" is displayed");
    }
    
}