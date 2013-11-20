package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Resume_main")
public class Resume_main extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Resume_main() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
  		PrintWriter out = response.getWriter();
		out.println("<h1>SERVLET PAGE</h1>");
		
		String bg = (String) request.getAttribute("bgcolor");
		String tc = (String) request.getAttribute("textcolor1");
		String ft = (String) request.getAttribute("fonttype1");
		String fs = (String) request.getAttribute("fontsize1");

		String background = "<style>body{background-color: "+ bg +"}</style>";
		request.setAttribute("bgrp",background);
		
		String textcolor = "<style>h2{color: "+ tc +"; font-family: "+ ft +"; font-size: "+ fs +";"+"}</style>";
		request.setAttribute("tcrp",textcolor);
		
	    Cookie bgcookie=new Cookie("bgc",bg);
	    Cookie tccookie=new Cookie("tcc",tc);
	    Cookie ftcookie=new Cookie("ftc",ft);
	    Cookie fscoookie=new Cookie("fsc",fs);
	    
	    bgcookie.setMaxAge(3*60);
	    tccookie.setMaxAge(3*60);
	    ftcookie.setMaxAge(3*60);
	    fscoookie.setMaxAge(3*60);

	    response.addCookie(bgcookie);
	    response.addCookie(tccookie);
	    response.addCookie(ftcookie);
	    response.addCookie(fscoookie);
	    
	    /*
	    Cookie[] c=request.getCookies();
        for(Cookie k:c)
        {
        	out.println(k.getValue());
        }
        */
        
        //To enable Servlet only display please comment the two lines bellow.
		RequestDispatcher frd = request.getRequestDispatcher("Resume_page.jsp");
		frd.forward(request, response);
        
        
        /*
         * THIS SECTION OF CODE IS FOR DISPLAY AND/OR DEBUGGING PURPOSES ONLY!
         */
    	Cookie[] requestCookies = request.getCookies();
    	
    	if(requestCookies != null){
    	out.write("<h3>Request Cookies:</h3>");
    		for(Cookie c1 : requestCookies){
   
    		out.write("Name="+c1.getName()+", Value="+c1.getValue()+", Comment="+c1.getComment()
    				+", Domain="+c1.getDomain()+", MaxAge="+c1.getMaxAge()+", Path="+c1.getPath()
    				+", Version="+c1.getVersion());
    		
    		out.write("<br>");

    		/*
    		//delete cookie
    			if(c.getName().equals("Test")){
    				c.setMaxAge(0);
    				response.addCookie(c);
    			}
    			
    		*/
    		}
    	}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
