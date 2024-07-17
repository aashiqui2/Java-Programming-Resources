public class GarbageCollectionDemo3 {
    GarbageCollectionDemo3 gcd;
    public static void main(String[] args) {
        GarbageCollectionDemo3 GCD1=new GarbageCollectionDemo3();
        GarbageCollectionDemo3 GCD2=new GarbageCollectionDemo3();
        GarbageCollectionDemo3 GCD3=new GarbageCollectionDemo3();
        GCD1=null;
        // ? to call Garbage Collector
        System.gc();//static method

        //no one can create object for Runtime Class because the Constructor it is private
        // Runtime rt=new Runtime(); 

         // ? to call Garbage Collector
        Runtime rt=Runtime.getRuntime(); //Singleton Classes
        rt.gc();
        System.out.println(rt.freeMemory()); //return long datatype
        System.out.println(rt.totalMemory());


    }
    public void display(){
        GarbageCollectionDemo3 GCD4=new GarbageCollectionDemo3();
        System.out.println(GCD4);
        gcd=GCD4;
    }
    public void finalize(){
        System.out.println("call this method before making the object as Garbage");
    }
}
