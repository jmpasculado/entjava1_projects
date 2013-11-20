package form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Evaluate
 */
@WebServlet("/Evaluate")
public class Evaluate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Evaluate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>Login Form</h1>");
		//out.println("doGet() is invoked...");
		out.println("<form method=post > ");
		out.println("Username: <input type=text name= tname /><br>");
		out.println("Password: <input type=password name= pass /><br>");
		out.println("<input type=submit value='Process Login'>");
		out.println("</form>");
		String vtname = request.getParameter("tname");
		String vpass = request.getParameter("pass");
		if(vtname == null && vpass == null){
			out.print("Type your username and password.");
			return;
			
		}
		out.println("<br>Your name is "+vtname.trim());
		out.println("<br>Your name is "+vpass.trim());
		out.println("<br><a href=ServerList>Server List</a>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);
		// TODO Auto-generated method stub
		//	PrintWriter out = response.getWriter();
		//out.println("doPost() is invoked...");

	}

}
