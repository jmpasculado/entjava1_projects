package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookieform")
public class Cookieform extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Cookieform() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<html><body><h1>Cookie Login</h1>");
		out.println("<form>");
		
		Cookie [] call = request.getCookies();
		String vname="";
		if(call!=null){
			for (int i = 0; i < call.length; i++) {
				//out.println("Name: "+call[i].getName()+" Value: "+call[i].getValue()+"<br>");
				if(call[i].getName().equals("user1")){
					vname = call[i].getValue();	
					}
				}
			}else{
			out.println("No Cookie yet... <br>");
		}
		
		out.println("Username:<input type=text name=user " + " value = '" + vname + "' /><br>");
		out.println("Password:<input type=password name=pass /><br>");
		out.println("<input type=submit value=login />");
		out.println("");
		out.println("</form>");
		String vuser = request.getParameter("user");
		String vpass = request.getParameter("pass");
		
		if(vuser == null || vpass == null){
			
			out.println("Pls. fill-out the login form<br>");
			return;
		}
		boolean b = validate(vuser,vpass);
		if(b==true){
			
			Cookie c1 = new Cookie("user1",vuser);
			response.addCookie(c1);
			Cookie c2 = new Cookie("title","guest");
			response.addCookie(c2);
			
			out.println("Cookie has been sent to the browser...<br>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/CookieInfo1");
			rd.forward(request, response);
			
			return;
			
		}else{
			
			out.println("Login is incorrect. Pls. try again <br>");
		}
		out.println("</body></html>");
	}
	
	private boolean validate(String u, String p){
		if(u.equalsIgnoreCase("jake") && p.equalsIgnoreCase("123")){
			return true;
		} else {return false;}	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
