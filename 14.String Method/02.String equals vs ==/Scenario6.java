// Scenario #1:
class Scenario6{
    public static void main(String[] args){
        String s1 = new String("ABC");
        String s2 = s1;
        s1= new String("PQR");
        s2= new String("PQR");
        //again the stirng wll not be created in heap but s2 will point the memeory refernce of s1.

        /*Here, s1 will be created in Heap Memory.  It will hold
        * the value "PQR".  When we create s2 with same value, new
        * memory reference will be created again in Heap Memory.
        * Hence, when we compare s1 and s2 with == operator, the memory
        * references will be compared.
        */
        if(s1==s2)
        {
        System.out.println("s1 s2 are ==");
        }
        else
        {
        System.out.println("s1 s2 are not ==");
        }

        //With equals() method
        // String s1 = new String("ABC");
        // String s2 = s1;
        // s1= new String("PQR");
        // s2= new String("PQR");

        // if(s1.equals(s2))
        // {
        // System.out.println("s1 s2  equals");
        // }
        // else
        // {
        // System.out.println("s1 s2  not equals");
        // }
    }
}
