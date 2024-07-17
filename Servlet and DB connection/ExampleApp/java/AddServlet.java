//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.ServletException;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//use doGET and service()
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int sum = num1 + num2;
//      System.out.println("result is "+ sum); 
      
        HttpSession session=request.getSession();
        session.setAttribute("sum", sum);
//Squaring 
//        sum=sum*sum;
//        request.setAttribute("sum",sum);
//        key and value
        
//RequestDispatcher 
//        RequestDispatcher rd=request.getRequestDispatcher("sq");
//        rd.forward(request, response);
        
// redirect
        response.sendRedirect("sq?sum="+sum); //url rewritting
        //this will give an error
        //to get the parameter use ?in the url and pass the value
//to print on the browser page use 
//      response.setContentType("text/html");
//        PrintWriter out=response.getWriter();
//        out.println("result is "+ sum);       
//shortcut
//      response.getWriter().println("<h1>Sum of " +num1+ " and " +num2+ " is: " +sum+ "</h1>");
    }
}
