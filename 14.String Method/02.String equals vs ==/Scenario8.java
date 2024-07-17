// Scenario #1:
class Scenario8{
    public static void main(String[] args){
        // String s1 = new String("ABC");
        // String s2 = "ABC";
        // s1=null;//memory nullify
        //s1 is not pointing anything
        // if(s2==s1)
        // {
        // System.out.println("s1 s2 are ==");
        // }
        // else
        // {
        // System.out.println("s1 s2 are not ==");
        // }

        //With equals() method
        String s1 = new String("ABC");
        String s2 = "ABC";
        s1=null;
        // if(s1.equals(s2)) we get th error "String.equals(Object)" because "<local1>" is null
        // Null pointer exception 
        // at Scenario8.main(Scenario8.java:21)
        if(s2.equals(s1))
        {
        System.out.println("s1 s2 are equal");
        }
        else
        {
        System.out.println("s1 s2 are not equal");
        }
    }
}
