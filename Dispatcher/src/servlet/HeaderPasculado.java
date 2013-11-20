/*
 * Name: Jake Robert M. Pasculado
 * Title: Dispatcher
 * 4 Servlets to handle user requests and to use 2 HTMLs
 * October 22, 2013
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HeaderPasculado")
public class HeaderPasculado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HeaderPasculado() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.println("<h2>Jake Robert M. Pasculado</h2>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
