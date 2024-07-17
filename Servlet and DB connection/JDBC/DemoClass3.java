import java.sql.*;
public class DemoClass3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/test";
		String uname="root";
		String pass="";
		String email="arunsharma";
		String password="DUBKAKUR";
		//sup
		String query="INSERT INTO `user` (`email`, `password`) VALUES (?,?);";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
//		Statement st=con.createStatement();//instead of using Statement we use prepared statement
//whenever we want to work we predefined query we use prepared statement
		PreparedStatement ps=con.prepareStatement(query);//we know the query but we don't know the values, we use  -->???
		ps.setString(1,email);
		ps.setString(2,password);
		int count=ps.executeUpdate();//DDL,DML,DQL,TCL
		//use execute update Method to insert the row, it will have a parameter and return an Integer                   value of affected Row instead of object of result set
		System.out.println(count +" rows affected");
		ps.close();
		con.close();

	}

}