import java.sql.*;

public class DemoClass1 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/test"; 
        String username = "root"; 
        String password = ""; 

        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "SELECT * FROM user"; 
        Statement statement = connection.createStatement();
                 ResultSet rs = statement.executeQuery(query) ;
                while (rs.next()) {
                    int id = rs.getInt("SNO");
                    String name = rs.getString("email");
                    String pass = rs.getString("password");
                    System.out.println("Sno: " + id + ", Name: " + name +", Password: "+pass);
                   
                }
            }  
}
