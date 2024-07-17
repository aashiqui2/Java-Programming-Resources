import java.io.*;
import javax.servlet.http.*;

public class SquareServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws  IOException 
	{
		//use only for requestDispatcher
//		int k=(int)req.getAttribute("sum");
		
		//for  sendRedirect
//		int k=Integer.parseInt(req.getParameter("sum"));//Cannot parse null string
		
	//for session
		HttpSession session=req.getSession();
		
		//to remove attribute use 
//		session.removeAttribute("sum");
		int k= (int)session.getAttribute("sum");
		
		
		k=k*k;
		PrintWriter out=res.getWriter();
		out.println("Hello i am square"+ k);
		System.out.println("sq is called");
	}

}
