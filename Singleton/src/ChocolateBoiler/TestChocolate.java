package ChocolateBoiler;

public class TestChocolate {
    public static void main(String[] args) {
        ChocolateBoiler cb;
        ChocolateBoiler cb2;
        cb = ChocolateBoiler.getChocolateBoiler();
        cb2 = ChocolateBoiler.getChocolateBoiler();
        try{
            do {
                if(cb.fill()){
                    cb2.boil();
                    cb.drain();
                    break;
                }
            } while (true);
        }catch(InterruptedException e){
            System.err.println(e);
        }
        System.out.println(cb.getStatus());
    }
}
