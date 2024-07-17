// Scenario #1:
class Scenario5{
    public static void main(String[] args){
        // String s1 = new String("ABC");
        // String s2 = s1;
        // s1="PQR";
        // s2="PQR";
        /*Here, s1 will be created in String Constant Pool.  It will hold the value “PQR".  When we create s2 with same value, no new memory reference will be created in String Constant Pool.  Instead, the same s1 will be referred, as it is already present.
        */

        // if(s1==s2)
        // {
        // System.out.println("s1 s2 are ==");
        // }
        // else
        // {
        // System.out.println("s1 s2 are not ==");
        // }

        //With equals() method
        String s1 = new String("ABC");
        String s2 = s1;
        s1="PQR";
        s2="PQR";
        /*Here, s1 will be created in String Constant Pool.  It will hold  the value “PQR".  When we create s2 with same value, no new memory reference will be created in String Constant Pool. Instead, the same s1 will be referred, as it is already present.*/

        if(s1.equals(s2))
        {
        System.out.println("s1 s2  equals");
        }
        else
        {
        System.out.println("s1 s2  not equals");
        }
    }
}
