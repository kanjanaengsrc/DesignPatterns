package v3;
abstract class Beverage {
    public String description;

    public Beverage() {
        this("No description");
    }
    public Beverage(String desc) {
        description = desc;
    }
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
