public class RecursionDemo {
    public static void printNumb(int n) {
        // !print 5-1
        // if(n==0)
        // {
        //     return;
        // }
        // System.out.println(n);
        // printNumb(n-1);
        // !print 1-5
        // if(n>0)
        // {
        //     printNumb(n-1);
        //     System.out.println(n);
        // }
    }
    // public static void printSum(int i,int n,int sum){
    //     if(i==n)
    //     {
    //         sum+=i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum+=i;
    //     printSum(i+1,n,sum);
    // }

    public static int findFact(int n) {
        // int fact = 1;
        // for (int i = 1; i <= n; i++) {
        //     fact *= i; 
        // }
        // return fact;

        if (n == 0) {
            return 1; 
        } else {
            return n * findFact(n - 1); 
        }
    }

    public static void fibonoci(int a,int b,int n)
    {
        if(n==0)
        {
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        fibonoci(b, c, n-1);
    }
    //x^n=x*x^(n-1)
    public static int calcPower(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        // int xPownm1=calcPower(x, n-1);
        // int xPown=x*xPownm1;
        // return xPown;

        //if n i even 
        if(n%2==0)
        {
           return calcPower(x, n/2)*calcPower(x, n/2);
        }
        else{//n is odd
           return calcPower(x, n/2)*calcPower(x, n/2)* x;
        }

    }

    public static void main(String[] args) {
        // for (int i = 5; i > 0; i--) {
        //     System.out.println(i);
        // }

        // for (int i = 0; i <5; i++) {
        //     System.out.println(i);
        // }

        // printNumb(5);

        // printSum(1,5,0);
        // System.out.println(findFact(5));

        // int n=5;
        // System.out.print(0+" "+1+" ");
        // fibonoci(0,1,n-2);

        // System.out.println(calcPower(2,4));

    }
}
