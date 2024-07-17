class Demo1
{
    public static void main(String args1[])
    {
          System.out.print("\n\tI am Class Demo1");
    }
}
public class Demo2
{
    public static void main(String args1[])
    {
            //System.out.print("\n\tI am Class Demo2.");
            Demo3 d1=new Demo3();// creating an object for class Demo3
            new Demo3();  
            new Demo3();      
    }
}
class Demo3
{
     static
     {
       System.out.print("I am static block\n");
     }
     Demo3()
     {
      System.out.println("Hello i am constructor");
     }
     public static void main(String args[])
     {
     }
}
