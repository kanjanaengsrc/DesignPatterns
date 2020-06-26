package v1;

public class MallardDuck extends Duck{
    public MallardDuck(String name) {
        super(name);
    }

	@Override
	protected void display() {
		System.out.println(this.name +" is displayed");
	}
}