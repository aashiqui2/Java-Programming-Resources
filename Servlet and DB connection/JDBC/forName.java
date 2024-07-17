//to load and register we use Class.forName()
public class forName{

	public static void main(String[] args) throws Exception {
		
		pqr obj=new pqr();
//		Class.forName("pqr");////when we load the class it will execute the static block
//		Class.forName("pqr").newInstance();	// //it is depreciated since 9
//		Class.forName("pqr").getDeclaredConstructor().newInstance();
		
		//to Load
//		Class.forName("com.mysql.jdbc.cj.Driver");
		//to register the driver		
//		DriverManager.registerDriver(new com.mysql.jdbc.cj.Driver);
				
}
}
class pqr
{
	static {
		System.out.println("I am static");
	}
	//instance
	{
		System.out.println("I am Instance");
	}
}
