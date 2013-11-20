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
<button onclick="alert('You clicked! WHY?!?!')">CLICK THIS</button>
<br>Date today is <%= new Date()%> <!--  Expression JSP -->

<%
	String x = "jake";
	out.println("<br> x = "+x);
	for(int i=0; i<5;i++){
		out.println("<br>"+i+".)"); //display the value of i using for-loop
	}
%>
<!-- display the value of x -->
<br>x = <%=x %>
<%
	java.util.Vector <String> v = new java.util.Vector<String>();
	v.add("APC"); v.add("UST"); v.add("DLSU"); v.add("AMA");
	for(String s: v){
		out.println("<br>"+s);
	}
				
%>
</body>
</html>