package v3;
abstract class Duck{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    String name;
    public Duck(String name){
        this.name = name;
    }
    protected void setQuackBehavior(QuackBehavior qb){
        this.quackBehavior = qb;
    }
    protected void performQuack(){
        quackBehavior.quack();
    }
    protected void setFlyBehavior(FlyBehavior fb){
        this.flyBehavior = fb;
    }
    protected void performfly(){
        flyBehavior.fly();
    }
    protected void swim(){
        System.out.println(this.name+ " is swimming.");
    }
    protected abstract void display();
}
