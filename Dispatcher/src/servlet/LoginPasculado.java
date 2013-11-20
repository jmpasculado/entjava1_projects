/*
 * Name: Jake Robert M. Pasculado
 * Title: Dispatcher
 * 4 Servlets to handle user requests and to use 2 HTMLs
 * October 22, 2013
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginPasculado")
public class LoginPasculado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginPasculado() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		RequestDispatcher hrd = request.getRequestDispatcher("/HeaderPasculado");
		hrd.include(request, response);
		out.println("<html><body>");
		out.println("<form>");
		out.println("Enter Username: " + "<input type=text name=n1><br>");
		out.println("Enter Password: " + "<input type=password name=n2><br>");
		out.println("<input type=submit value=Submit><br><br>");
		RequestDispatcher frd = request.getRequestDispatcher("/FooterPasculado");
		frd.include(request, response);		
		
		out.println("</form>");
		String vn1=request.getParameter("n1");
		String vn2=request.getParameter("n2");
		
		String amazon = (String) request.getAttribute("amazon_btn");
		String facebook = (String) request.getAttribute("google_btn");
		String google = (String) request.getAttribute("facebook_btn");
		  
		  if (request.getParameter("amazon_btn") != null) {
		    response.sendRedirect("http://www.amazon.com/");
		  }
		  else if (request.getParameter("facebook_btn") != null) {
		    response.sendRedirect("https://www.facebook.com/");
		  }
		  else if (request.getParameter("google_btn") != null) {
		    response.sendRedirect("https://www.google.com.ph/");
		  }
		  
		if("pasculado".equalsIgnoreCase(vn1) && "pasculado".equalsIgnoreCase(vn2)){
			request.setAttribute("user1", vn1);
			request.setAttribute("pass1", vn2);
			RequestDispatcher rd = request.getRequestDispatcher("/MainPasculado");
			rd.forward(request, response);
		}
		
		else if (vn1 == null || vn2 == null){
			return;			
		} 
		
		else {
			return;	
		}
		
		out.println("</body></html>");

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
