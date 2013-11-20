package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletComm2")
public class ServletComm2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletComm2() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1><Servlet Comm2</h1>");
		out.println("<h2>Request Information</h2>");
		out.println("**********************");
		String vn1 = request.getParameter("n1");
		String vn1vn1 = (String) request.getAttribute("newn1");
		if (vn1 == null || vn1vn1 == null){
			response.sendError(response.SC_BAD_REQUEST, "Error request info");
			return;
		}
		out.println("<br>Original name: " + vn1);
		out.println("<br>New name: " + vn1vn1);
		out.println("<br>**********************");
		RequestDispatcher rd = request.getRequestDispatcher("/ServletDate");
		rd.include(request, response);
		out.println("</body></html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
