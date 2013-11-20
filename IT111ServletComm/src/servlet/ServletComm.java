package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletComm
 */
@WebServlet("/ServletComm")
public class ServletComm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletComm() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>Sample Servlet-Browser Communication" + "</h1>");
		out.println("<form>");
		out.println("Enter name: " + "<input type=text name=n1><br>");
		out.print("<input type=submit value=Process>");
		out.println("</form>");
		String vn1=request.getParameter("n1");
		if(vn1 == null){
			out.print("<br>Pls.type your name...<br>");
			return;
		}
		
		vn1 = "The " + vn1;
		request.setAttribute("newn1", vn1);
		RequestDispatcher rd = request.getRequestDispatcher("/ServletComm2");
		rd.forward(request, response);
//		response.sendError(response.SC_OK);
//		response.sendError(response.SC_FORBIDDEN, "Pls. Login First to access the site.");
//		out.println("Redirecting you to APC site...");
//		response.sendRedirect("http://apc.edu.ph");
		out.println("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
