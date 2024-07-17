public class GarbageCollectionDemo1 {
    GarbageCollectionDemo gcd;/// field,global variable

    public static void main(String[] args) {
        GarbageCollectionDemo1 GCD1 = new GarbageCollectionDemo1();
        GarbageCollectionDemo1 GCD2 = new GarbageCollectionDemo1();
        GarbageCollectionDemo1 GCD3 = new GarbageCollectionDemo1();

        //? REASSIGNING REFERENCE VARIABLE
        GCD2=GCD1;
        System.out.println(GCD1);
        System.out.println(GCD2);
        System.out.println(GCD3);
        GCD1.display();
    }

    public void display() {
        //? OBJECT DECLARED INSIDE METHOD DEFINITION
        GarbageCollectionDemo GCD4 = new GarbageCollectionDemo();
        System.out.println(GCD4);
    }

}
