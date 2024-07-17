package Exception;

public class NumberFormat {
	public static void main(String[] args) {
		String s="Hello";
		try {
			int n=Integer.parseInt(s);
			System.out.println(n);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Program Ends");
		}
	}

}
