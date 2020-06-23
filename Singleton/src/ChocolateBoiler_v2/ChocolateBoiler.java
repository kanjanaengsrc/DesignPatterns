package ChocolateBoiler_v2;
import java.util.concurrent.*;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler cb;
    private ChocolateBoiler(){
        this.empty = true;
        this.boiled = false;
    }
    /*
    Add synchronized keyword to force every thread to wait each other.
    */
    public static synchronized ChocolateBoiler getChocolateBoiler(){
        if(cb == null){
            cb = new ChocolateBoiler();
            System.out.println("Boiler is created");
        }
        return cb;
    }
    public synchronized boolean fill() throws InterruptedException {
        if(this.empty){
            System.out.println("Wait for 5 seconds to fill several ingredients");
            for (int i = 1; i <= 5 ; i++) {
                System.out.print(i);
                TimeUnit.SECONDS.sleep(1);
            }
            System.out.println();
            this.empty = false;
            this.boiled = false;
            return true;
        }else{
            System.out.println("----Cannot fill more chocolate!----");;
            return false;
        }
    }
    public synchronized void boil(){
        if(!this.empty && !this.boiled){
            System.out.println("Boil chocolate");
            this.boiled = true;
        }else {
            System.out.println("Cannot boil chocolate");
        }
    }
    public synchronized void drain(){
        if(!this.empty && this.boiled){
            System.out.println("Drain chocolate out");
            this.empty = true;
            this.boiled = false;
        }else{
            System.out.println("Cannot drain chocolate! Fill and Boil it first");
        }
    }
    public synchronized String getStatus(){
        String msg = "boiler is ";
        msg += (this.empty)? "empty ":" full";
        msg += (this.boiled)? " and boiled": " and it's not boiled yet";
        return String.format("Status of %s", msg);
    }
}
