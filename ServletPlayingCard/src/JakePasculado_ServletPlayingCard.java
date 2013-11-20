

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletPlayingCard")
public class JakePasculado_ServletPlayingCard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public JakePasculado_ServletPlayingCard() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		
		
		out.print("<html><body><h1>Playing Card List</h1>");
		out.print("<form>");
		out.print("Select Card value: <br>");
		
		out.print("<select name='select1a'>");
		out.print("<option value='1' id=op>1</option>");
		out.print("<option value='2' id=op>2</option>");
		out.print("<option value='3' id=op>3</option>");
		out.print("<option value='4' id=op>4</option>");
		out.print("<option value='5' id=op>5</option>");
		out.print("<option value='6' id=op>6</option>");
		out.print("<option value='7' id=op>7</option>");
		out.print("<option value='8' id=op>8</option>");
		out.print("<option value='9' id=op>9</option>");
		out.print("<option value='10' id=op>10</option>");
		out.print("<option value='11' id=op>11</option>");
		out.print("<option value='12' id=op>12</option>");
		out.print("<option value='13' id=op>13</option>");
		out.print("</select> ");
		out.print("Select Card Suit: <br>");
		
		out.print("<select name='select1b'>");
		out.print("<option value='1' id=op>Spades</option>");
		out.print("<option value='2' id=op>Hearts</option>");
		out.print("<option value='3' id=op>Diamonds</option>");
		out.print("<option value='4' id=op>Clubs</option>");
		out.print("</select> ");
		out.print("<br>");
		
		out.print("<select name='select2a'>");
		out.print("<option value='1' id=op>1</option>");
		out.print("<option value='2' id=op>2</option>");
		out.print("<option value='3' id=op>3</option>");
		out.print("<option value='4' id=op>4</option>");
		out.print("<option value='5' id=op>5</option>");
		out.print("<option value='6' id=op>6</option>");
		out.print("<option value='7' id=op>7</option>");
		out.print("<option value='8' id=op>8</option>");
		out.print("<option value='9' id=op>9</option>");
		out.print("<option value='10' id=op>10</option>");
		out.print("<option value='11' id=op>11</option>");
		out.print("<option value='12' id=op>12</option>");
		out.print("<option value='13' id=op>13</option>");
		out.print("</select> ");
		out.print("Select Card Suit: <br>");
		
		out.print("<select name='select2b'>");
		out.print("<option value='1' id=op>Spades</option>");
		out.print("<option value='2' id=op>Hearts</option>");
		out.print("<option value='3' id=op>Diamonds</option>");
		out.print("<option value='4' id=op>Clubs</option>");
		out.print("</select> ");
		out.print("<br>");
		out.print("<input type=submit value='Process List' ><br>");
		out.print("</body></html>");
		
		String [] vitem1a = request.getParameterValues("select1a");
		String [] vitem1b = request.getParameterValues("select1b");
		String [] vitem2a = request.getParameterValues("select1a");
		String [] vitem2b = request.getParameterValues("select1b");
		
		if(vitem1a == null){
			out.print("<br>Select any items to process...");
			return;
		}
		
		for(int i = 0; i < vitem1a.length; i++){
			out.print(vitem1a[i]+"<br>");
		}
		
		if(vitem1b == null){
			out.print("<br>Select any items to process...");
			return;
		}
		
		for(int i = 0; i < vitem1b.length; i++){
			out.print(vitem1b[i]+"<br>");
		}

		for(int i = 0; i < vitem2a.length; i++){
			out.print(vitem1a[i]+"<br>");
		}
		
		if(vitem2b == null){
			out.print("<br>Select any items to process...");
			return;
		}

		for(int i = 0; i < vitem2b.length; i++){
			out.print(vitem2b[i]+"<br>");
		}
	}
	/*
		out.print("<html>");
		out.print("<head>");
		out.print("<title>ServletPlayingCard</title>");

		out.print("</head>");
		out.print("<body onload='loadImage()'>");

		out.print("<body>");
		out.print("<form>");
		out.print("Select item: <br>");
		out.print("<select>");
		out.print("<option value='1'>1</option>");
		out.print("<option value='2'>2</option>");
		out.print("<option value='3'>3</option>");
		out.print("<option value='4'>4</option>");
		out.print("<option value='5'>5</option>");
		out.print("<option value='6'>6</option>");
		out.print("<option value='7'>7</option>");
		out.print("<option value='8'>8</option>");
		out.print("<option value='9'>9</option>");
		out.print("<option value='10'>10</option>");
		out.print("<option value='11'>11</option>");
		out.print("<option value='12'>12</option>");
		out.print("<option value='13'>13</option>");
		out.print("</select> ");
		out.print("<input type=submit value='Process List' ><br>");
		//out.print("<img id = 'img02' alt='bg' src='image/card1.png' width='1024' height='1024'>");

		out.print("</body>");
		out.print("</html>");
	
		String [] vitem = request.getParameterValues("value");
		
		if(vitem == null){
			out.print("<br>Select any items to process...");
			return;
		}
		
		for(int i = 0; i < vitem.length; i++){
			out.print(vitem[i]+"<br>");
		}
	}
*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
