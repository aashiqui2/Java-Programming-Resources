import java.util.Scanner;
public class ExceptionDemo6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int a=sc.nextInt();
        sc.close();
        try{
            int b=10/a;
            System.out.println("B value is "+ b);
            try{
                if(a==1){
                    a=a/(a-1);
                }
                if(a==2){
                    int[] c={1,2,3};
                    c[5]=456;
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bounds Exception Occurs");
            }
        }
        catch(ArithmeticException e){
            System.out.println("This Exception is Due to divide by zero");
        }
    }
}
