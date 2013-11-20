<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<h1>Sample Cookie and HttpSession Managament</h1>
Cookie info:<br>
<%
	Cookie [] cookies = request.getCookies();
	if(cookies == null){
		out.println("No cookie info here <br>");
		return;
	}
	
	for(int i=0; i < cookies.length; i++){
		out.println("<br> "+cookies[i].getName()+" = "+cookies[i].getValue());
		out.println("cookie expiration "+i+" = "+cookies[i].getMaxAge());
	}
%>
<br> Session info: <br>
<%	
	HttpSession s1 = request.getSession(false);
	if(s1 ==null) response.sendRedirect("login.jsp");
	
	out.println("Session id: "+session.getId());
	String vpass = (String) session.getAttribute("pass");
	out.println("<br> Password: "+vpass);
	out.println("<br>Session Max Inactive interval: "+session.getMaxInactiveInterval());
%>

</body>
</html>