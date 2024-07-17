package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			int n=sc.nextInt();
			System.out.println(n);
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Program Ends");
		}

	}

}
