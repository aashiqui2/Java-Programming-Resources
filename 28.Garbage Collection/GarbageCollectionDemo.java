public class GarbageCollectionDemo {
    GarbageCollectionDemo gcd;///field,glovbla variable
    public static void main(String[] args) {
        GarbageCollectionDemo GCD1=new GarbageCollectionDemo();
        GarbageCollectionDemo GCD2=new GarbageCollectionDemo();
        GarbageCollectionDemo GCD3=new GarbageCollectionDemo();
        GCD1=null;
        System.out.println(GCD1);
        System.out.println(GCD2);
        System.out.println(GCD3);
        GCD1.display();
    }
    public void display(){
       GarbageCollectionDemo GCD4=new GarbageCollectionDemo();
       System.out.println(GCD4);
    }
}
