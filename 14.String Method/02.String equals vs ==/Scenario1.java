// Scenario #1:
class Scenario1{
    public static void main(String[] args){
        // String s1 = new String("ABC");//Heap
        // String s2 = new String("ABC");//Heap
        // // String s2 = "ABC";//SCP
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
        String s2 = new String("ABC");
        // String s2 = "ABC";
        if(s1.equals(s2))
        {
        System.out.println("s1 s2 are equals");
        }
        else
        {
        System.out.println("s1 s2 are not equal");
        }
    }
}
