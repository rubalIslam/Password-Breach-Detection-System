<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<!--link rel="stylesheet" type="text/css" href="styles.css"-->
	<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css">
	<style type="text/css">
		body {
	font-family: Arial, Helvetica, sans-serif;
	 background-image: url("Images/bg.jpg");
	  height: 700px;
	  width: 100%;
	  background-position: center;
	  background-repeat: no-repeat;
	  background-size: cover;
	  position: relative;
	}
	</style>
	
  </head>
  
  <body class="bg-primary">
  <center>
  
  <jsp:include page="Header.jsp" ></jsp:include>
  <jsp:include page="HomeMenu.jsp"></jsp:include>
   
  </center>
  <br/>
  <br/>
  <br/>
  
  <center>
  	<div class ="container">
  	<h1>Hello and wellcome to our Project</h1>
  </div>
  
  </center>
  <div style="margin-top: -3px;">
				<jsp:include page="Footer.jsp"></jsp:include>
		</div>
  <!-- put some js here -->
  <script type = "text/javascript" src = "bootstrap/js/bootstrap.js"></script>
  <script type = "text/javascript" src = "bootstrap/js/jquery.js"></script>
  
  </body>
</html>
