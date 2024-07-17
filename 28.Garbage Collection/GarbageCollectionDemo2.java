public class GarbageCollectionDemo2 {
    GarbageCollectionDemo2 gcd;/// field,global variable//instance variable

    public static void main(String[] args) {
            GarbageCollectionDemo2 GCD1=new GarbageCollectionDemo2();
            GarbageCollectionDemo2 GCD2=new GarbageCollectionDemo2();
            GarbageCollectionDemo2 GCD3=new GarbageCollectionDemo2();
            // to access global variable 
            // GCD1.gcd;
            // GCD2.gcd;
            // GCD3.gcd;

            //? ISLAND OF ISOLATION-making all object reference nullify
            GCD1=null;
            GCD1=GCD2.gcd;
            GCD2=null;
            GCD2=GCD3.gcd;
            GCD3=null;
            System.out.println(GCD1.gcd);//error

            System.out.println(GCD1);
            System.out.println(GCD2);
            System.out.println(GCD3);
            GCD1.display();    
        }

    public void display() {
        GarbageCollectionDemo2 GCD4 = new GarbageCollectionDemo2();
        gcd = GCD4;

    }

}
