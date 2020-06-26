package v3;

public class MallardDuck extends Duck{
    public MallardDuck(String name) {
        super(name);
    }

	@Override
	protected void display() {
		System.out.println(this.name +" is displayed");
	}
}