import java.sql.*;
public class DemoClass2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/test";
		String uname="root";
		String pass="";
		String email="ashok";
		String password="raja";
		String query="INSERT INTO `user` ( `email`, `password`) VALUES ( '"+email+"', '"+password+"');";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		int count=st.executeUpdate(query);//DDL,DML,DQL,TCL
		//use execute update Method to insert the row, it will have a parameter and return an Integer                   value of affected Row instead of object of result set
		System.out.println(count +" rows affected");
		st.close();
		con.close();

	}

}
