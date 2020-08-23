<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Aboutus.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css">
	<style>
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
	.textService{
		color: #3cfff4;
	}
	</style>

  </head>
  
  <body class="bg-primary">
  <center>

			<jsp:include page="Header.jsp"></jsp:include>
			<jsp:include page="HomeMenu.jsp"></jsp:include></div>
			
			<center>
   <p> </p>
   <br/>
  <br/>
  <br/>
  <h2 class="textService">Services we provide</h2>
  <br/>
  <br/>
   <div class="container">
	   	<div class="row">
	   		<div class="col-md-3 text-justify">
	   			<h3 class="text-light"> What services we provide? </h3>
				Lorem Ipsum is simply dummy text of the printing and typesetting industry. 
				Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
				when an unknown printer took a galley of type and scrambled it to make a type specimen book.
				 It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. 
				 It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
			
	   		</div>
	   		<div class="col-md-3 text-justify">
	   			<h3 class="text-light"> Why do we use it? </h3>
	   			
				It is a long established fact that a reader will be distracted by the readable content of a page when 
				looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution 
				of letters, as opposed to using 'Content here, content here', making it look like readable English. Many
				 desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search
				  for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years,
				   sometimes by accident, sometimes on purpose (injected humour and the like).
			
	   		</div>
	   		<div class="col-md-3 text-justify">
	   			<h3 class="text-light"> Where does it come from? </h3>
	   			Where does it come from?
				Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical 
				Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney
				 College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and
				  going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes
				   from sections 1.10.32 and 1.10.33 of "de Finibus Bonorum et Malorum" (The Extremes of Good and Evil) by Cicero, 
				
				
			
	   		</div>
	   		<div class="col-md-3 text-justify">
	   			<h3 class="text-light"> Where can I get some? </h3>
	   			
				There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration
				 in some form, by injected humour, or randomised words which don't look even slightly believable. If you are
				  going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the
				   middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary,
				    making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined
				     with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. 
	  
	   		</div>
	   	
	   	</div>
   	</div>
  		
  	<div style="margin-top: -3px;">
				<jsp:include page="Footer.jsp"></jsp:include>
		</div>
    <!-- js goes here -->
   
   <script type = "text/javascript" src = "bootstrap/js/bootstrap.js"></script>
   <script type = "text/javascript" src = "bootstrap/js/jquery.js"></script>
   
  </body>
</html>
