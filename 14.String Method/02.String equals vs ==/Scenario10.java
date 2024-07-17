// Scenario #1:
class Scenario10{
    public static void main(String[] args){
        String s1 = "ABC";
        String s2 = "ABCD";
        s1+="D";// new memory created
        if(s1==s2)
        {
        System.out.println("s1 s2 are ==");
        }
        else
        {
        System.out.println("s1 s2 are not ==");
        }

        //With equals() method
        // String s1 = "ABC";
        // String s2 = "ABCD";
        // s1+="D";
        // if(s1.equals(s2))
        // {
        // System.out.println("s1 s2 are equal");
        // }
        // else
        // {
        // System.out.println("s1 s2 are not equal");
        // }
    }
}
