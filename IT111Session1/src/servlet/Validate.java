package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Validate() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String vu = request.getParameter("user");
		String vp = request.getParameter("pass");
		
		if (vu == null || vp == null){
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			
			request.setAttribute("msg", "What are you doing. Please fill something.");
			rd.forward(request, response);
			
			return;
			
		}else{
			
			if(vu.equalsIgnoreCase("guest") && vp.equalsIgnoreCase("123")){
				Cookie cookie =new Cookie("cuser",vu);
				
				response.addCookie(cookie);
				HttpSession session = request.getSession();
				session.setAttribute("pass", vp);
				
				RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
				rd.forward(request, response);
				
				return;
				
			}else{
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				
				request.setAttribute("msg", "OH NO! you had a Invalid login. Pls. try again...");
				rd.forward(request, response);
				
				return;
			
			}

		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
