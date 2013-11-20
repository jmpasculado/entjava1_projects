package form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServerList")
public class ServerList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServerList() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<html><body><h1>Nope it's not a Server List</h1>");
		out.print("<form>");
		out.print("Select item: <br>");
		out.print("<input type=checkbox name=cbx value=1 >1</input>");
		out.print("<input type=checkbox name=cbx value=2 >2</input>");
		out.print("<input type=checkbox name=cbx value=3 >3</input>");
		out.print("<input type=checkbox name=cbx value=4 >4</input>");
		out.print("<input type=checkbox name=cbx value=5 >5</input>");
		out.print("<br>");
		out.print("<input type=submit value='Process List' ><br>");
		out.print("</body></html>");
		String [] vitem = request.getParameterValues("cbx");
		
		if(vitem == null){
			out.print("<br>Select any items to process...");
			return;
		}
		
		for(int i = 0; i < vitem.length; i++){
			out.print(vitem[i]+"<br>");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);	
	}

}
