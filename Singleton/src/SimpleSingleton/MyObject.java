package SimpleSingleton;
public class MyObject{
    public static MyObject obj;
    private int number = 0;
    private MyObject(){
        
    }
    public static MyObject getSingleObject(){
        if(obj == null){
            obj = new MyObject();
        }
        return obj;
    }
    public void addNumberWith(int num){
        this.number += num;
    }
    public int getNumber(){
        return this.number;
    }
}