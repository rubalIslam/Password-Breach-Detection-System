<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Contactus.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style>
		body{
		font-family: Arial, Helvetica, sans-serif; 
		background-image: url("Images/blue.jpg");
		background-color: #cccccc;
		  height: 500px;
		  width: 100%;
		  background-position: center;
		  background-repeat: no-repeat;
		  background-size: cover;
		  position: relative;
	}
	td{
		color:white;
	
	}
	</style>
  </head>
  
  <body>
  <center>

			<jsp:include page="Header.jsp"></jsp:include>
			<jsp:include page="HomeMenu.jsp"></jsp:include></div>
			
			   
			<br/>
			<br/>
			<br/>
			<br/>
			<center>
			<br/>
			<br/>
			<br/>
			<br/>
			<br/>
			<br/>
			<h2><font color="#3cfff4"><b>Contact Details</b></font></h2>
			
    <table border="0" width="" height="162" align>
	
	
				<tr>
					<td align='left'> 
					 NAME
					</td>
					<td align='left'>&nbsp;&nbsp;&nbsp;&nbsp; 
							<font color="white">Bedarul Islam Laskar</font>
					<br></td></tr>
				
					<tr>
					<td align='left'>
					 MOBILE 
					</td>
					<td align="left">&nbsp;&nbsp;&nbsp;&nbsp; 
							<font color="white">9954706895</font>
					<br></td></tr>
					<tr>
					<td align='left'> 
						MAIL ID
					</td>
						<td align="left">&nbsp;&nbsp;&nbsp;&nbsp; 
						<font color="white">bedarullaskar@gmail.com</font>
					<br></td>
					</tr>
					<tr>
					<td align='left'>
						PROJECT 
					</td>
						<td align="left">&nbsp;&nbsp;&nbsp;&nbsp; <font color="white">Generation of Secure and Reliable Honeywords,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Preventing False Detection </font>
					<br></td>
					</tr>
				</table>
				</center>
			
				</center>
				<div style="margin-top: -3px;">
				<jsp:include page="Footer.jsp"></jsp:include>
		</div>
  </body>
</html>
