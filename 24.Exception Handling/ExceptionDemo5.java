//? finally vs return

public class ExceptionDemo5 {
    public static void main(String[] args) {
        int a=50,b=0;
        divide(a,b);
    }
    public static float divide(int a,int b){
        try{
            return a/b;
        }
        finally{
            System.out.println("Finally block will be dominates return");
        }
    }
    
}
