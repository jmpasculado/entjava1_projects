package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletDate")
public class ServletDate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletDate() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date d = new Date();
		PrintWriter out = response.getWriter();
		out.println("<br>Date today is " + d.toString());
		String n1 = request.getParameter("n1");
		out.println("<br>From ServletDate: n1 = "+n1);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
