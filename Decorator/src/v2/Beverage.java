package v2;
abstract class Beverage {
    protected String description;
    protected boolean milk;
    protected boolean soy;
    protected boolean mocha;
    protected boolean whip;

    public Beverage() {
        this("No description");
    }

    public Beverage(String desc) {
        this.description = desc;
        this.milk = false;
        this.soy = false;
        this.mocha = false;
        this.whip = false;
    }

    public String getDescription() {
        return String.format("The best %s ever", description);
    }

    public boolean hasMilk() {
        return this.milk;
    }

    public void setMilk(boolean cond) {
        this.milk = cond;
    }

    public boolean hasSoy() {
        return this.soy;
    }

    public void setSoy(boolean cond) {
        this.soy = cond;
    }

    public boolean hasMocha() {
        return this.mocha;
    }

    public void setMocha(boolean cond) {
        this.mocha = cond;
    }

    public boolean hasWhip() {
        return this.whip;
    }

    public void setWhip(boolean cond) {
        this.whip = cond;
    }

    public double cost() {
        double comdimentPrice = 0.0;
        comdimentPrice += (this.milk == true) ? .1: .0;
        comdimentPrice += (this.soy == true) ? .2: .0;
        comdimentPrice += (this.mocha == true) ? .3: .0;
        comdimentPrice += (this.whip == true) ? .5: .0;
        return comdimentPrice;
    }
}
