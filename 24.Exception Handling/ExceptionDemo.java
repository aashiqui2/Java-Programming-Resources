import java.util.*;
public class ExceptionDemo {
	public static void main(String[] args) {
		divide();
	}
	private static int subtract(int no1, int no2) {
		return no1 - no2;
	}
	private static void divide() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers ");
		try {
			// Exception possible area
			int no1 = sc.nextInt();
			int no2 = sc.nextInt();
			sc.close();
			System.out.println(no1 / no2);
			int arrSize = subtract(no1, no2);
			int[] arr = new int[arrSize];
			System.out.println("Array length is " + arr.length);
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArithmeticException ae) {
			// exception handling area
			System.out.println("check second No");
			divide();
		} catch (NegativeArraySizeException  | ArrayIndexOutOfBoundsException ar) {
			System.out.println("check array length");
		}
		// we need to put this catch at last for handling all types of exception
		catch (Exception e) {
			System.out.println("something went wrong please check the input");
		} finally {
			// will be executed always whether there is a exception or not
			// code cleaning area
			// db disconnection
			System.out.println("check me");
		}
	}

}
