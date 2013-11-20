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

@WebServlet("/MainPasculado")
public class MainPasculado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MainPasculado() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		  PrintWriter out = response.getWriter();
		  RequestDispatcher hrd = request.getRequestDispatcher("/HeaderPasculado");
		  hrd.include(request, response);
		  out.println("<html><body>");
		  out.println("**********************");
		  String v_user = (String) request.getAttribute("user1");
		  String v_pass = (String) request.getAttribute("pass1");

		  out.println("<br>Username: " + v_user);
		  out.println("<br>Password: " + v_pass);
		  out.println("<br>**********************");
		  out.println("<form>");
		  out.println("<input type=submit name=google_btn value=Google>");
		  out.println("<input type=submit name=facebook_btn value=Facebook>");
		  out.println("<input type=submit name=amazon_btn value=Amazon>");
		  out.println("</form>");
		  
		  if(request.getParameter("google_btn") != null){
		   response.sendRedirect("http://www.google.com");
		   }
		  else if(request.getParameter("facebook_btn") != null){
		    response.sendRedirect("http://www.facebook.com");
		   }
		  else if(request.getParameter("amazon_btn") != null){
		    response.sendRedirect("http://www.amazon.com");
		   }
		  out.println("</body></html>");
		  
		  RequestDispatcher frd = request.getRequestDispatcher("/FooterPasculado");
		  frd.include(request, response);
		  
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);

	}

}
