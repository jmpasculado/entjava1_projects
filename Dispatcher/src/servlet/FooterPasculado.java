/*
 * Name: Jake Robert M. Pasculado
 * Title: Dispatcher
 * 4 Servlets to handle user requests and to use 2 HTMLs
 * October 22, 2013
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FooterPasculado")
public class FooterPasculado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FooterPasculado() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Calendar cl = Calendar.getInstance();
		int m = cl.get(Calendar.MONTH);
		int d = cl.get(Calendar.DATE);
		int y = cl.get(Calendar.YEAR);
		out.println("<html><body>");
		out.println("<form>");
		out.println(m+1+"/"+d+"/"+y);
		out.println("</form>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
