public abstract class AbstractCaller extends Parent {

    public AbstractCaller() {
        System.out.println("i am constructor in AbstractClass");
    }

    public static void main(String[] args) {
        // AbstractCaller pp = new AbstractCaller();// we cannot create object for abstract class or the class cannot be instantiated. 
        // pp.getLoan();
        // pp.repay();
    }

    // public void repay() {
    //     System.out.println("I pay behalf of my parent");
    // }

}

// should give same method signature as
// public abstract void repay();otherwise weaker access rivilage

/*
 * AbstractCaller is not abstract and does not override abstract method repay()
 * in Parent
 * public class AbstractCaller extends Parent
 */
