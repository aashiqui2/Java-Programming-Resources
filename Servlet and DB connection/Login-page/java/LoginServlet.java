import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String url = "jdbc:mysql://localhost:3306/login";
        String user = "root";
        String DBpassword = "";
        
        String Email = request.getParameter("email");
        String Password = request.getParameter("pass");
        String query = "INSERT INTO login (name, password) VALUES (?, ?)";

        try {
            // Load and register the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, DBpassword);        
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, Email);
            statement.setString(2, Password);
            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                response.sendRedirect("Welcome.html"); 
            } 
//           
            statement.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.sendRedirect("registration.html?error=1"); // Redirect back to registration page with an error message
        }
    }
}
