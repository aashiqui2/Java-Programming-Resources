public class ClassNotFound {
	public static void main(String[] args) {
		try {
			Class.forName("abc");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class does not exist check the name of the class");
		}
		finally {
			System.out.println("Program Ends");
		}

	}

}
