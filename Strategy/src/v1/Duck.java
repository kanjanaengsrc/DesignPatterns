package v1;
abstract class Duck{
    String name;
    public Duck(String name){
        this.name = name;
    }
    protected void quack(){
        System.out.println(this.name+ " is quack");
    }
    protected void swim(){
        System.out.println(this.name+ " is swimming.");
    }
    protected abstract void display();

}

