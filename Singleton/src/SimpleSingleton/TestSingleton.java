package SimpleSingleton;

public class TestSingleton {
    public static void main(String[] args) {
        MyObject a = MyObject.getSingleObject();
        MyObject b = MyObject.getSingleObject();
        a.addNumberWith(10);
        System.out.println("Number from object b = "
            +b.getNumber());

        //MyObject c = new MyObject();
    }
}

