import myPack.Book;
import myPack.Cart;
import myPack.Inventory;

public class Entry {
    
    public static void main(String args[])
    {
        // A a = null;
        // //System.out.println(a.getClass());

        // A a1 = new A();
        // A a2 = new A();

        // a1 = a2;

        // System.out.println(a1.getClass());
        // System.out.println(a2.getClass());

        // TestCollector collector1 = new TestCollector();
        // collector1 = null;
        // System.gc();

        // A a = new A();
        // SoftReference<A> softA = new SoftReference<>(a);
        // a = null;
        // System.out.println(softA.getClass());

        //TestSingleton.getTestCollector().doSomething();


        Inventory.addToInventory(new Book("Cong", 12000, 5, 99));
        Cart.addToCart(99, 3);
    }
}

class A{

}

class TestCollector {
    protected void finalize()
    {
        System.out.println("Doi tuong da bi don");
    }
}

class TestSingleton{
    private static TestSingleton testSingleton = new TestSingleton();

    private TestSingleton(){

    }

    public static TestSingleton getTestCollector(){
        return testSingleton;
    }

    public void doSomething(){
        System.out.println("Hello");
    }

}