<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Resume</title>

<%
//RequestDispatcher hdr = request.getRequestDispatcher("Resume_main");
//hdr.include(request, response);
String line1 = (String)request.getAttribute("bgrp");
String line2 = (String)request.getAttribute("tcrp");

if(line1 != null || line2 != null){
out.println(line1); 
out.println(line2); 

}
%>
<script type="text/javascript">
var vcanvas, vimg01, vimg02, vcon;
var imgx = 0, imgy = 0;
function loadImage(){
	vcanvas = document.getElementById("canvas1");
	vcon = vcanvas.getContext("2d");
	vimg01 = document.getElementById("img01");
	vimg02 = document.getElementById("img02");
	
	
	vcon.drawImage(vimg02,0,0,100,100,0,0,100,100);
	setInterval("animate()",1000);
}
var counter=0; 
function animate(){
	counter++; 
	if (counter >3) counter=0;
	imgx = counter*100;
	vcon.drawImage(vimg02,imgx,imgy,100,100,0,0,100,100);
}
</script>
</head>
</style>
<body onload="loadImage()">
<form>

<table width="1456" border="10" align="center" style="font-family:sans-serif">
  <tr>
    <td height="79"><div align="center"><canvas style="border-width: 10px;border-style: ridge;" id="canvas1" width = "100" height = "100">The browser does not support this canvas tag</canvas>
<img id = "img01" alt="bg" src="images/1.png" width="100" height="100" style="display: none;">
<img id = "img02" alt="4framepic" src="images/2.png" style="display: none;"></div></td>
  </tr>
  <tr>
    <td width="1450">
    
<div>
    <h2 align="center">Jake Robert M. Pasculado</h2>
  </div>
<div>
  <h2 align="center">B83 L5 Ines Manapul S.t. BFRV Las Piñas City | 09212345678 | jmpasculado@apc.edu.ph</h2>
</div>
<h2 align="center">
    <div>SUMMARY OF QUALIFICATION</div></h2>

<h2>
<div>
      <div align="justify">
        <p>Dedicated Network Systems Administrator with comprehensive data and telecommunications 			experience.
          Expertise in data network security analysis and wireless security. Technically savvy. Adept at solving 
          networking, electronics, and computer technology problems.
          Effective at training technicians and laypersons.      </p>
      </div>
</div>
    <div align="center">CERTIFICATIONS<br></div>
<div style="margin: 0px 0px 0px 250px;">MICROSOFT: 

  <ul>
  	<li>Microsoft Certified Professional 2013</li>
    <li>Microsoft Technology Associate: Networking Fundamentals 2013</li>
  </ul>

</div> 
  
  
    <div align="center">SUBJECT/TECHNICAL SKILLS:</div>
	<div style="margin: 0px 0px 0px 250px;" >
	<ol>
      <li>Data Networking</li>
      <li>Data Communication</li>
      <li>Windows Server Administration Fundamentals</li>
      <li>System Analysis and Design 1</li>
      <li>Introduction to Programming Languages</li>
      <li>Introduction to System Development</li>
      <li>CSIT IT CONCEPTS 2011</li>
      <li>Programming Concepts</li>
      <li>Enterprise Java 1</li>
      <li>Advance Unix</li>
      <li>Core Technology</li>
      <li>Information Security</li>
      <li>Computer Security</li>
      <li>Principles of Programming</li>
      <li>Operating System 1</li>
      <li>Operating System 2</li>
      <li>Graphical User Interface Programming</li>
      <li>Computer Organization</li>
      <li>Operating Systems 1</li>
      <li>Database Management 1 </li>
      <li>Database Management 2</li>
      <li>Data Structures</li>
      <li>Applied Project 2 </li>
      <li>Web Programming</li>
      <li>Web Services</li>
    </ol>
    </div>
 <div align="center"> Project Web project created</div>
 <div align="center"> 
<li><a href="https://github.com/jmpasculado/whatlovecando">Whatlovecando</a></li>
<li><a href="https://github.com/jmpasculado/entjava1_projects">Enterprise Java 1 Projects</a></li>
 </div>
<p></p>
 <div align="center">
   Page Preferences
 </div>
 <div align="center"><input type="submit" name="Submit" value="Preference"></div>
</h2>   
    </td>
  </tr>
</table>

</form>

<%

String Submit = (String)request.getParameter("Submit");

if(Submit != null){
	response.sendRedirect("Preferences.jsp");
	//RequestDispatcher rd = request.getRequestDispatcher("Preferences.jsp");
	//rd.forward(request, response);
}
%>

</body>
</html>