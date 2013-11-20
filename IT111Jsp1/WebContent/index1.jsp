<!-- Jake Robert M. Pasculado
11/7/2013
 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "java.util.Date, java.io.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Sample 1</title>
<style type="text/css">
h1 {background-color: yellow;}
</style>
</head>
<body>
<h1>JSP Sample 1</h1>

<%

	String school= "Asia Pacific College";
	String yourname ="Jake";

	
	String[] names = { school, yourname,};
	names[0] = names[0].toUpperCase();
	names[1] = names[1].toUpperCase();
	
	out.println("<br>");
	out.println("UpperCase!<br>");
	out.println(names[0]+"<br>");
	out.println(names[1]+"<br>");
	
	int f = names[0].length();
	int g = names[1].length();
	int ch = f+g;
	
	out.println("<br>");	
	out.println("The Total Number of Characters: "+ch+"<br>");
	
	String rvrsname = new StringBuffer(names[0]).reverse().toString(); 
	String rvrsname1 = new StringBuffer(names[1]).reverse().toString(); 
	
	out.println("<br>");
	out.println("Reverse!<br>");
	out.println(rvrsname+"<br>");
	out.println(rvrsname1+"<br>");
	
	//String[] vow = {"A","E","I","O","U"};
	

				
%>
</body>
</html>