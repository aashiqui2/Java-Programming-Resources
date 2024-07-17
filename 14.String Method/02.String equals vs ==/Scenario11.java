// Scenario #1:
class Scenario11{
    public static void main(String[] args){
        // String s1 = "Java";
        // String s2 = s1+s1;
        // String s3="JavaJava";
        // if(s2==s3)
        // {
        // System.out.println("s1 s2 are ==");
        // }
        // else
        // {
        // System.out.println("s1 s2 are not ==");
        // }

        //With equals() method
         String s1 = "Java";
        String s2 = s1+s1;
        String s3="JavaJava";
        if(s2.equals(s3))
        {
        System.out.println("s1 s2 are equal");
        }
        else
        {
        System.out.println("s1 s2 are not equal");
        }
    }
}
