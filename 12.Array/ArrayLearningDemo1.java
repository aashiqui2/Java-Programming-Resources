import java.util.Scanner;

public class ArrayLearningDemo1 {
    public static void main(String[] args) {
        int ar[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int i=0;
        while(i<5){
            ar[i]=sc.nextInt();
            i++;
        }
        i=0;
        while(i<5){
            System.out.print(ar[i]+" ");
            i++;
        }
    }
    
}
