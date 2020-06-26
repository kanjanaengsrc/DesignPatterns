package v3;
public class DecoyDuck extends Duck {
	public DecoyDuck(String name) {
        super(name);
    }
	@Override
	protected void display() {
		System.out.println(this.name +" is displayed");
	}
}
