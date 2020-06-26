package v2;
abstract class Duck{
    String name;
    public Duck(String name){
        this.name = name;
    }
    protected void quack(){
        System.out.println(this.name+ " is quacking.");
    }
    protected void swim(){
        System.out.println(this.name+ " is swimming.");
    }
    protected void fly(){
        System.out.println(this.name+ " is flying.");
    }
    protected abstract void display();
}
