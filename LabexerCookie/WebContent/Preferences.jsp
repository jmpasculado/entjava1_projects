<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Preference</title>
<style>
body{background-color:#999}
</style>
</head>
<body>
<form>

<%

String bg = request.getParameter("bgcolor");
String tc = request.getParameter("textcolor");
String ft = request.getParameter("fonttype");
String fs = request.getParameter("fontsize");

String submit = (String) request.getParameter("submit");

if (submit !=null){
	request.setAttribute("bgcolor", bg);
	request.setAttribute("textcolor1", tc);
	request.setAttribute("fonttype1", ft);
	request.setAttribute("fontsize1", fs);

	RequestDispatcher rd = request.getRequestDispatcher("Resume_main");
	rd.forward(request, response);
}
/*
Cookie[] requestCookies = request.getCookies();

if(requestCookies != null){
out.write("<h3>Request Cookies:</h3>");
	for(Cookie c1 : requestCookies){

	out.write(c1.getValue()+"<br>");

	}
}
*/
%>

<%
 String chosen1; //SessionID
 String chosen2=null, chosen3=null, chosen4=null, chosen5=null; // Variables of Cokies BG,colors,etc..
 String slctBGBlk="", slctBGWht="", slctBGBlu="", slctBGGrn="", slctBGRed="";
 String slctBlk="", slctWht="", slctBlu="", slctGrn="", slctRed="";
 String fnt1="", fnt2="", fnt3="", fnt4="", fnt5="";
 String fs1="", fs2="", fs3="", fs4="", fs5="";
 
 Cookie[] requestCookies = request.getCookies();
 if(requestCookies != null){
  //chosen1 = requestCookies[0].getValue();
  for(Cookie cookie : requestCookies){
      if("bgc".equals(cookie.getName())){
       chosen2 = cookie.getValue();
       if (chosen2.equals("Black")) {
        slctBGBlk = "selected";
       }
       if (chosen2.equals("White")) {
        slctBGWht = "selected";
       }
       if (chosen2.equals("Blue")) {
        slctBGBlu = "selected";
       }
       if (chosen2.equals("Green")) {
        slctBGGrn = "selected";
       }
       if (chosen2.equals("Red")) {
        slctBGRed = "selected";
       }
      }
      if("tcc".equals(cookie.getName())){
       chosen3 = cookie.getValue();
       if (chosen3.equals("Black")) {
        slctBlk = "checked = checked";
       }
       if (chosen3.equals("White")) {
        slctWht = "checked = checked";
       }
       if (chosen3.equals("Blue")) {
        slctBlu = "checked = checked";
       }
       if (chosen3.equals("Green")) {
        slctGrn = "checked = checked";
       }
       if (chosen3.equals("Red")) {
        slctRed = "checked = checked";
       }
      }
      if("ftc".equals(cookie.getName())){
       chosen4 = cookie.getValue();
       if (chosen4.equals("Arial")) {
        fnt1 = "selected";
       }
       if (chosen4.equals("sans-serif")) {
        fnt2 = "selected";
       }
       if (chosen4.equals("Century Gothic")) {
        fnt3 = "selected";
       }
       if (chosen4.equals("Papyrus")) {
        fnt4 = "selected";
       }
       if (chosen4.equals("cursive")) {
        fnt5 = "selected";
       }
      }
      if("fsc".equals(cookie.getName())){
       chosen5 = cookie.getValue();
       if (chosen5.equals("8pt")) {
        fs1 = "selected";
       }
       if (chosen5.equals("12pt")) {
        fs2 = "selected";
       }
       if (chosen5.equals("24pt")) {
        fs3 = "selected";
       }
       if (chosen5.equals("48pt")) {
        fs4 = "selected";
       }
       if (chosen5.equals("72pt")) {
        fs5 = "selected";
       }
      }
  }
  
//TO VIEW COOKIE STATES PLEASE UNCOMMENT THE BLOCK COMMENT
//Display Cookie Values
/*
  out.write(chosen2 + "<br>");
  out.write(chosen3 + "<br>");
  out.write(chosen4 + "<br>");
  out.write(chosen5 + "<br>");
*/  
  
%>

<table width="642" height="146" border="10" align="center" style="font-family:sans-serif">
  <tr>
    <th width="448" height="25" scope="col"><div><h1>Preferences
    </h1>
    </div></th>
  </tr>
  <tr>
<h2>
  <td bgcolor="#CCCCCC"><div align="center">Page Background Color</div>

<div align="center">
<select name="bgcolor" >
  <option name="bgcolor" value="White" <%out.write(slctBGWht);%> >White</option>
  <option  name="bgcolor" value="Black" <%out.write(slctBGBlk);%> >Black</option>
  <option name="bgcolor" value="Blue" <%out.write(slctBGBlu);%> >Blue</option>
  <option name="bgcolor" value="Green" <%out.write(slctBGGrn);%> >Green</option>
  <option name="bgcolor" value="Red" <%out.write(slctBGRed);%> >Red</option>
</select>
</div>
<br>

<div align="center">Text Color</div>
<div style="margin: 0px 0px 0px 250px;">
<input type="radio" name="textcolor" value="Black" <%out.write(slctBlk);%> >Black<br>
<input type="radio" name="textcolor" value="White" <%out.write(slctWht);%> >White<br>
<input type="radio" name="textcolor" value="Blue" <%out.write(slctBlu);%> >Blue<br>
<input type="radio" name="textcolor" value="Green" <%out.write(slctGrn);%> >Green<br>
<input type="radio" name="textcolor" value="Red" <%out.write(slctRed);%> >Red<br>
</div>
<br>
<div align="center">Font Type</div>
<div align="center">
<select name="fonttype" >
  <option name="fonttype" value="sans-serif" <%out.write(fnt2);%> >Sans-serif</option>
  <option name="fonttype" value="Arial" <%out.write(fnt1);%> >Arial</option>
  <option name="fonttype" value="Century Gothic" <%out.write(fnt3);%> >Century Gothic</option>
  <option name="fonttype" value="Papyrus" <%out.write(fnt4);%> >Papyrus</option>
  <option name="fonttype" value="cursive" <%out.write(fnt5);%> >cursive</option>
</select>
</div>
<br>
<div align="center">Font Sizes</div>
<div align="center">
<select name="fontsize">
  <option name="fontsize" value="24pt" <%out.write(fs3);%> >Normal Medium</option>
  <option name="fontsize" value="8pt" <%out.write(fs1);%> >X-Small</option>
  <option name="fontsize" value="12pt" <%out.write(fs2);%> >Small</option>
  <option name="fontsize" value="48pt" <%out.write(fs4);%> >Large</option>
  <option name="fontsize" value="72pt" <%out.write(fs5);%> >X-Large</option>
</select>
</div>
</h2>
  </tr>
</table>

<%
	} else {
%>

<table width="642" height="146" border="10" align="center" style="font-family:sans-serif">
  <tr>
    <th width="448" height="25" scope="col"><div><h1>Preferences
    </h1>
    </div></th>
  </tr>
  <tr>
<h2>
  <td bgcolor="#CCCCCC"><div align="center">Page Background Color</div>

<div align="center">
<select name="bgcolor" >
  <option  name="bgcolor" value="Black"  >Black</option>
  <option name="bgcolor" value="White" selected>White</option>
  <option name="bgcolor" value="Blue"  >Blue</option>
  <option name="bgcolor" value="Green"  >Green</option>
  <option name="bgcolor" value="Red"  >Red</option>
</select>
</div>
<br>

<div align="center">Text Color</div>
<div style="margin: 0px 0px 0px 250px;">
<input type="radio" name="textcolor" value="Black" checked=checked >Black<br>
<input type="radio" name="textcolor" value="White" >White<br>
<input type="radio" name="textcolor" value="Blue"  >Blue<br>
<input type="radio" name="textcolor" value="Green"  >Green<br>
<input type="radio" name="textcolor" value="Red"  >Red<br>
</div>
<br>
<div align="center">Font Type</div>
<div align="center">
<select name="fonttype" >
  <option name="fonttype" value="Arial"  >Arial</option>
  <option name="fonttype" value="sans-serif" selected >Sans-serif</option>
  <option name="fonttype" value="Century Gothic"  >Century Gothic</option>
  <option name="fonttype" value="Papyrus"  >Papyrus</option>
  <option name="fonttype" value="cursive"  >cursive</option>
</select>
</div>
<br>
<div align="center">Font Sizes</div>
<div align="center">
<select name="fontsize">
  <option name="fontsize" value="8pt"  >X-Small</option>
  <option name="fontsize" value="12pt"  >Small</option>
  <option name="fontsize" value="24pt" selected >Normal Medium</option>
  <option name="fontsize" value="48pt"  >Large</option>
  <option name="fontsize" value="72pt"  >X-Large</option>
</select>
</div>
</h2>
  </tr>
</table>
<%
	}
%>

<br>
<br>
<div align="center"><input type="submit" name="submit" value="submit"></div>

</form>

</body>
</html>