package Exception;

public class StringIndex {
	public static void main(String[] args) {
		String s="Hello";
		try {
			System.out.println(s.charAt(8));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Program Ends");
		}

	}

}
