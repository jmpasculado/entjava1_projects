package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieInfo1")
public class CookieInfo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CookieInfo1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>Cookie Info</h1>");
		Cookie [] call = request.getCookies();
		for (int i = 0; i < call.length; i++) {
			out.println("Name: "+call[i].getName()+" Value: "+call[i].getValue()+"<br>");
		}
		out.println("");
		out.println("");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
