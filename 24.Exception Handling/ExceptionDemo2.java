public class ExceptionDemo2 {
	public static void main(String[] args)   {
		try {
			int[] arr= {98,95,100,94};
			sum(arr);
		}
		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Check array size");
		}
		catch(ArithmeticException ae){
			System.out.println("check the numbers");
		}
		catch(NegativeArraySizeException nas){
			System.out.println("Array size is negative");
		}
		catch(Exception e){
			System.out.println("soemthing went wrong");
		}
		
	}
	public static void sum(int[] arr)
			throws ArrayIndexOutOfBoundsException,
			ArithmeticException,
			NegativeArraySizeException, Exception {
		int total = 0;
		for (int i = 0; i < 5; i++) {
			total = total + arr[i];
		}
		System.out.println("Total " + total);
		int c=5/0;
		System.out.println("The value of c is "+ c );
		int arr1[]=new int[-1];
		arr1[0]=1;
	}

}
