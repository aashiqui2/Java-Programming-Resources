public class ExceptionDemo4 {
    public static void main(String[] args) {
        int a=50,b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Please check the numbers");
        }
        finally{
            System.out.println("Hi i am finally block1");
        }
        try{
            int arr[]=new int[3];
            for(int i=0;i<=3;i++){
                System.out.println(arr[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("check array length");
        }
        catch(Exception e){
            System.out.println("check the array ");
        }
        finally{
            System.out.println("Hi i am finally block2");
        }

    }
}
