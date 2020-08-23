<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'Footer.jsp' starting page</title>


	<style>
		.footer {
		  position: fixed;
		  left: 0;
		  bottom: 0;
		  width: 100%;
		  background-color: #ff503a;
		  color: white;
		  text-align: center;
		  font-size: 20px;
	}
	.names{
		color: #3cfff4;
	}
	</style>
	</head>

	<body>
		<center>
		
			<!--<img src="Images/footer.png" style="width: 1000px;">-->
			
		</center>
		<div class="footer">
		
			Created by <span class="names"> Bedarul , Rasheed , Mousa , Khaja</span>
		</div>

	</body>
</html>
