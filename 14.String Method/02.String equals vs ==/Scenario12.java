// Scenario #1:
class Scenario12{
    public static void main(String[] args){
        // String s1 = "Java"+"Java";
        // String s2 = "JavaJava";
        // // Here, s1 will be allotted memory, holding values “Javajava”.
        // if(s1==s2)
        // {
        // System.out.println("s1 s2 are ==");
        // }
        // else
        // {
        // System.out.println("s1 s2 are not ==");
        // }

        //With equals() method
         String s1 = "Java"+"Java";
        String s2 = "JavaJava";
        if(s1.equals(s2))
        {
        System.out.println("s1 s2 are equal");
        }
        else
        {
        System.out.println("s1 s2 are not equal");
        }
    }
}
