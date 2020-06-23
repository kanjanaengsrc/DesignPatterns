package ChocolateBoiler;

public class TestChocolateMultithread {

    public static void main(final String[] args) {

        ChocolateBoilerThread t1 = new ChocolateBoilerThread("T1");
        ChocolateBoilerThread t2 = new ChocolateBoilerThread("T2");
        t1.start();
        t2.start();
    }
}

class ChocolateBoilerThread extends Thread {
    Thread t;
    private String tname;

    public ChocolateBoilerThread() {
        this("Unknown");
    }

    public ChocolateBoilerThread(final String name) {
        this.tname = name;
        if (t == null) {
            this.t = new Thread(this, this.tname);
        }
    }
    @Override
    public void run() {
        System.out.println(this.tname+" is running");
        ChocolateBoiler cb;
        cb = ChocolateBoiler.getChocolateBoiler();
        try{
            do {
                if(cb.fill()){
                    cb.boil();
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