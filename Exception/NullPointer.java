package Exception;

public class NullPointer {
	public static void main(String[] args) {
		String s=null;
		try {
			System.out.println(s.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Program Ends");
		}

	}

}
