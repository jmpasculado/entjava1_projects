<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    session="false"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<%
	Cookie [] c1 = request.getCookies();
	String vuser="";
	if(c1 != null)
		for(int i=0;i < c1.length;i++){
			if(c1[i].getName().equals("user")){
				vuser = c1[i].getValue();
			
		}		
	}

%>
<form action="Validate">
Username: <input type=text name=user value = '<%=vuser %>'/><br>
Password: <input type=password name=pass /><br>
<input type ="submit" /><br>

</form>

<%
	String vmsg = (String) request.getAttribute("msg");
	if(vmsg == null){
		out.println("<br>Please fill-out the form...<br>");
	}else{
		out.println(vmsg);
	}
%>
</body>
</html>