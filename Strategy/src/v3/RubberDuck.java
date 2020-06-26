package v3;
public class RubberDuck extends Duck{
    public RubberDuck(String name) {
        super(name);
    }
 	// @Override
	// protected void quack() {
	// 	System.out.println(this.name+ " SQUZE SQUZE.");
	// }
	@Override
	protected void display() {
		System.out.println(this.name +" is displayed");
	}
}
