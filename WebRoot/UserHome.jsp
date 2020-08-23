<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'AdminHome.jsp' starting page</title>
    
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
		margin:0;
		padding:0;
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
		
	</style>

  </head>
  
  <body>
  
			<jsp:include page="Header.jsp"></jsp:include>
			<jsp:include page="UserMenu.jsp"></jsp:include></div>
			<h2>Wellcome to your Home Page</h2>
		
  
  </body>
</html>
