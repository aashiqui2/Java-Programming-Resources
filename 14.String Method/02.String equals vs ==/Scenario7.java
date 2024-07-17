// Scenario #1:
class Scenario7{
    public static void main(String[] args){
        String s1 = new String("ABC");
        String s2 = s1;
        s1= new String("PQR");
        s2= new String("PQR");
        String s3 = new String(s1); //new string will be created in the memory
        if(s1==s3)
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
        // String s3 = new String(s1);
        // if(s1.equals(s3))
        // {
        // System.out.println("s1 s2 are equal");
        // }
        // else
        // {
        // System.out.println("s1 s2 are not equal");
        // }
    }
}
