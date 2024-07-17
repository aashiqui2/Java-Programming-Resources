public class ExceptionDemo7 {
    public static void main(String[] args) {
        try{
            ThrowsDemo.divide(5,0);
        }
        catch(ArithmeticException e){
            System.out.println("Please check your inputs");
        }
    }
}
class ThrowsDemo
{
    public static void divide(int a,int b) throws ArithmeticException
    {
        int c=a/b;
        System.out.println("c value is "+ c);
    }
}
