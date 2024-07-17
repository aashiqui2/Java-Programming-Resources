//to fetch one column data DB
import java.sql.*;
//JDBC 
//1)import the package-(import java.sql.*;)
//2)Load and register the Driver-->throws Exception
//to load use "com.mysql.cj.jdbc.Driver"
//to register use Class.forName("com.mysql.jdbc.Driver");
//3)Establish the connection--> make connection
//4)Create the statement-->(
//statement,prepared statement,callable statement)
//5)Execute the query
//6)Process result
//7)close
public class DemoClass {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/test";
		String uname="root";
		String pass="";
		//select email from user where SNO=2
		String query="select * from user";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		//In DriverManager class we have getConnection method which is static
		Statement st=con.createStatement();
		//statement is a interface so need to use createStatement method
		//this statement will give you the whole table with columName as label
		//so use ResultSet to store the chuck of data
		ResultSet rs=st.executeQuery(query);
		rs.next();//if you remove it and run we get error
		//because the pointer is point before the firstrow 
		String email =rs.getString("email");
		System.out.println(email);
		st.close();
		con.close();
	}s
}