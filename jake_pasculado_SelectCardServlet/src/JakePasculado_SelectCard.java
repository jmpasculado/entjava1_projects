import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SelectCard")
public class JakePasculado_SelectCard extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public JakePasculado_SelectCard() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.print("<br>");
		out.println("<html><body style='color: red; font-family: sans-serif, background-color: gray; text-align: center;'><h1>Card Selections:</h1>");
		out.println("<form name=cards>");
		out.print("<h3>Suit:</h3>");
		out.println("<select name='selsuit1'>");
		out.println("<option name=suit1 value='Hearts'>Hearts</option>");
		out.println("<option name=suit1 value='Diamond'>Diamond</option>");
		out.println("<option name=suit1 value='Spades'>Spades</option>");
		out.println("<option name=suit1 value='Clubs'>Clubs</option>");
		out.print("</select>");
		
		out.print("<h3>Value:</h3>");
		out.println("<select name='selval1'>");
		out.println("<option name=num1 value=1>1</option>");
		out.println("<option name=num1 value=2>2</option>");
		out.println("<option name=num1 value=3>3</option>");
		out.println("<option name=num1 value=4>4</option>");
		out.println("<option name=num1 value=5>5</option>");
		out.println("<option name=num1 value=6>6</option>");
		out.println("<option name=num1 value=7>7</option>");
		out.println("<option name=num1 value=8>8</option>");
		out.println("<option name=num1 value=9>9</option>");
		out.println("<option name=num1 value=10>10</option>");
		out.println("<option name=num1 value=11>Jack</option>");
		out.println("<option name=num1 value=12>Queen</option>");
		out.println("<option name=num1 value=13>King</option>");
		out.print("</select>");
		out.print("<br>");
		
		out.print("<h3>Suit:</h3>");
		out.println("<select name='selsuit2'>");
		out.println("<option name=suit2 value='Hearts'>Hearts</option>");
		out.println("<option name=suit2 value='Diamond'>Diamond</option>");
		out.println("<option name=suit2 value='Spades'>Spades</option>");
		out.println("<option name=suit2 value='Clubs'>Clubs</option>");
		out.print("</select>");
		
		out.print("<h3>Value:</h3>");
		out.println("<select name='selval2'>");
		out.println("<option name=num2 value=1>1</option>");
		out.println("<option name=num2 value=2>2</option>");
		out.println("<option name=num2 value=3>3</option>");
		out.println("<option name=num2 value=4>4</option>");
		out.println("<option name=num2 value=5>5</option>");
		out.println("<option name=num2 value=6>6</option>");
		out.println("<option name=num2 value=7>7</option>");
		out.println("<option name=num2 value=8>8</option>");
		out.println("<option name=num2 value=9>9</option>");
		out.println("<option name=num2 value=10>10</option>");
		out.println("<option name=num2 value=11>Jack</option>");
		out.println("<option name=num2 value=12>Queen</option>");
		out.println("<option name=num2 value=13>King</option>");
		out.print("</select>");
		out.println("<br>");
		out.println("<br>");
		out.println("<input type=submit value='SHOW MAGIC'>"+"<br>");
		out.println("</body></html>");
		
		String [] selection1suit = request.getParameterValues("selsuit1");
		String [] selection2suit = request.getParameterValues("selsuit2");
		String [] selection2val = request.getParameterValues("selval2");
		String [] selection1val = request.getParameterValues("selval1");
		
		if (selection1suit == null || selection1val == null || selection2suit == null || selection2val == null ) {return;}
		
		out.println("<br>Selected Cards<br>");
		
		String val1 = null;
		for (int a = 0; a < selection1val.length; a++) {
			
			out.println("<h3>" + selection1val[a] + "</h3>" + "<br>");
			val1 = selection1val[a];
			if ("Hearts".equals(selection1suit[a])) {
				if ("1".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/hearts/1heart.png>" + "<br>");}
				if ("2".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/hearts/2heart.png>" + "<br>");}
				if ("3".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/hearts/3heart.png>" + "<br>");}
				if ("4".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/hearts/4heart.png>" + "<br>");}
				if ("5".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/hearts/5heart.png>" + "<br>");}
				if ("6".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/hearts/6heart.png>" + "<br>");}
				if ("7".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/hearts/7heart.png>" + "<br>");}
				if ("8".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/hearts/8heart.png>" + "<br>");}
				if ("9".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/hearts/9heart.png>" + "<br>");}
				if ("10".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/hearts/10heart.png>" + "<br>");}
				if ("11".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/hearts/jheart.png>" + "<br>");}
				if ("12".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/hearts/qheart.png>" + "<br>");}
				if ("13".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/hearts/kheart.png>" + "<br>");}
			}
			
			if ("Diamond".equals(selection1suit[a])) {
				if ("1".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/diamonds/1diamond.png>" + "<br>");}
				if ("2".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/diamonds/2diamond.png>" + "<br>");}
				if ("3".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/diamonds/3diamond.png>" + "<br>");}
				if ("4".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/diamonds/4diamond.png>" + "<br>");}
				if ("5".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/diamonds/5diamond.png>" + "<br>");}
				if ("6".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/diamonds/6diamond.png>" + "<br>");}
				if ("7".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/diamonds/7diamond.png>" + "<br>");}
				if ("8".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/diamonds/8diamond.png>" + "<br>");}
				if ("9".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/diamonds/9diamond.png>" + "<br>");}
				if ("10".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/diamonds/10diamond.png>" + "<br>");}
				if ("11".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/diamonds/jdiamond.png>" + "<br>");}
				if ("12".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/diamonds/qdiamond.png>" + "<br>");}
				if ("13".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/diamonds/kdiamond.png>" + "<br>");}
			}
			
			if ("Spades".equals(selection1suit[a])) {
				if ("1".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/spades/1spade.png>" + "<br>");}
				if ("2".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/spades/2spade.png>" + "<br>");}
				if ("3".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/spades/3spade.png>" + "<br>");}
				if ("4".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/spades/4spade.png>" + "<br>");}
				if ("5".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/spades/5spade.png>" + "<br>");}
				if ("6".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/spades/6spade.png>" + "<br>");}
				if ("7".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/spades/7spade.png>" + "<br>");}
				if ("8".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/spades/8spade.png>" + "<br>");}
				if ("9".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/spades/9spade.png>" + "<br>");}
				if ("10".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/spades/10spade.png>" + "<br>");}
				if ("11".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/spades/jspade.png>" + "<br>");}
				if ("12".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/spades/qspade.png>" + "<br>");}
				if ("13".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/spades/kspade.png>" + "<br>");}
			}
			
			if ("Clubs".equals(selection1suit[a])) {
				if ("1".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/clubs/1club.png>" + "<br>");}
				if ("2".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/clubs/2club.png>" + "<br>");}
				if ("3".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/clubs/3club.png>" + "<br>");}
				if ("4".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/clubs/4club.png>" + "<br>");}
				if ("5".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/clubs/5club.png>" + "<br>");}
				if ("6".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/clubs/6club.png>" + "<br>");}
				if ("7".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/clubs/7club.png>" + "<br>");}
				if ("8".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/clubs/8club.png>" + "<br>");}
				if ("9".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/clubs/9club.png>" + "<br>");}
				if ("10".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/clubs/10club.png>" + "<br>");}
				if ("11".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/clubs/jclub.png>" + "<br>");}
				if ("12".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/clubs/qclub.png>" + "<br>");}
				if ("13".equals(selection1val[a])) {out.println("<img id=cardClu src=./images/clubs/kclub.png>" + "<br>");}
			}
			
		}
		
		String val2 = null;
		for (int b = 0; b < selection2val.length; b++) {
			
			out.println("<h3>" + selection2val[b] + "</h3>" + "<br>");
			val2 = selection2val[b];
			if ("Hearts".equals(selection2suit[b])) {
				if ("1".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/hearts/1heart.png>" + "<br>");}
				if ("2".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/hearts/2heart.png>" + "<br>");}
				if ("3".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/hearts/3heart.png>" + "<br>");}
				if ("4".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/hearts/4heart.png>" + "<br>");}
				if ("5".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/hearts/5heart.png>" + "<br>");}
				if ("6".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/hearts/6heart.png>" + "<br>");}
				if ("7".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/hearts/7heart.png>" + "<br>");}
				if ("8".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/hearts/8heart.png>" + "<br>");}
				if ("9".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/hearts/9heart.png>" + "<br>");}
				if ("10".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/hearts/10heart.png>" + "<br>");}
				if ("11".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/hearts/jheart.png>" + "<br>");}
				if ("12".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/hearts/qheart.png>" + "<br>");}
				if ("13".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/hearts/kheart.png>" + "<br>");}
			}
			
			if ("Diamond".equals(selection2suit[b])) {
				if ("1".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/diamonds/1diamond.png>" + "<br>");}
				if ("2".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/diamonds/2diamond.png>" + "<br>");}
				if ("3".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/diamonds/3diamond.png>" + "<br>");}
				if ("4".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/diamonds/4diamond.png>" + "<br>");}
				if ("5".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/diamonds/5diamond.png>" + "<br>");}
				if ("6".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/diamonds/6diamond.png>" + "<br>");}
				if ("7".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/diamonds/7diamond.png>" + "<br>");}
				if ("8".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/diamonds/8diamond.png>" + "<br>");}
				if ("9".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/diamonds/9diamond.png>" + "<br>");}
				if ("10".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/diamonds/10diamond.png>" + "<br>");}
				if ("11".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/diamonds/jdiamond.png>" + "<br>");}
				if ("12".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/diamonds/qdiamond.png>" + "<br>");}
				if ("13".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/diamonds/kdiamond.png>" + "<br>");}
			}
			
			if ("Spades".equals(selection2suit[b])) {
				if ("1".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/spades/1spade.png>" + "<br>");}
				if ("2".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/spades/2spade.png>" + "<br>");}
				if ("3".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/spades/3spade.png>" + "<br>");}
				if ("4".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/spades/4s.png>" + "<br>");}
				if ("5".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/spades/5spade.png>" + "<br>");}
				if ("6".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/spades/6spade.png>" + "<br>");}
				if ("7".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/spades/7spade.png>" + "<br>");}
				if ("8".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/spades/8spade.png>" + "<br>");}
				if ("9".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/spades/9spade.png>" + "<br>");}
				if ("10".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/spades/10spade.png>" + "<br>");}
				if ("11".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/spades/jspade.png>" + "<br>");}
				if ("12".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/spades/qspade.png>" + "<br>");}
				if ("13".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/spades/kspade.png>" + "<br>");}
			}
			
			if ("Clubs".equals(selection2suit[b])) {
				if ("1".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/clubs/1club.png>" + "<br>");}
				if ("2".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/clubs/2club.png>" + "<br>");}
				if ("3".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/clubs/3club.png>" + "<br>");}
				if ("4".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/clubs/4club.png>" + "<br>");}
				if ("5".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/clubs/5club.png>" + "<br>");}
				if ("6".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/clubs/6club.png>" + "<br>");}
				if ("7".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/clubs/7club.png>" + "<br>");}
				if ("8".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/clubs/8club.png>" + "<br>");}
				if ("9".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/clubs/9club.png>" + "<br>");}
				if ("10".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/clubs/10club.png>" + "<br>");}
				if ("11".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/clubs/jclub.png>" + "<br>");}
				if ("12".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/clubs/qclub.png>" + "<br>");}
				if ("13".equals(selection2val[b])) {out.println("<img id=cardClu src=./images/clubs/kclub.png>" + "<br>");}
			}
		}
		
		int y = Integer.parseInt(val2);
		int x = Integer.parseInt(val1);
		int z = x * y;
		
		out.println("The product of the cards are " + z);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
