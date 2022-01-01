package com.rohan;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter obj=response.getWriter();
		
		obj.println("<html>");
			obj.println("<head>");
			
				obj.println("<title>www.java.com</title>");
				
			obj.println("</head>");
			obj.println("<body>");
			
				obj.println("<span>Enter Your Name</span>");
				obj.println("<input type=\"text\">");
				
				obj.println("<span>Enter the password</span>");
				obj.println("<input type=\"password\">");				
				obj.println("<button>submit</button>");
//				obj.println("<span>End Here</span>");
				

				
			obj.println("</body>");
		obj.println("</html");
	}

}
