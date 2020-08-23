<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
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
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
    color: black;
}

button {
    background-color: #ff503a;
    color: white;
    padding:  20px;
    
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

button:hover {
    opacity: 0.8;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.myForm {
    padding: 16px;
    width: 880px;
    padding-bottom:50px;
    margin-bottom:30px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}
</style>
</head>
<body class="bg-primary">

<jsp:include page="Header.jsp"></jsp:include>
<jsp:include page="HomeMenu.jsp"></jsp:include>
<center>
	<center><h2><font face="Yu Mincho Demibold" style="color: #3cfff4;"><font size="8" >Login Here</font></font></h2></center>

	<form action="LoginServlet" style="width:900px;">
		<div class="imgcontainer">
			    <img src="Images/login6.png" alt="Avatar" class="avatar" width="175" height="259">
		</div>
		<center>
			<label>
				<font color="red" size="4"><% String status=request.getParameter("status"); if(status!=null){out.println(status);} %>
				</font>
			</label> 
		</center>     
		           
		<div class="container" style="text-align: left">
		
			<div class="myForm">
				<label for="uname" style="color:white"><b>Login Id</b></label>
				<input type="text" placeholder="Enter Login Id" name="uid" required>
				
				<label for="psw" style="color:white"><b>Password</b></label>
				<input type="password" placeholder="Enter Password" name="pass" required>
				       
				<label for="psw" style="color:white"><b>Honey Word</b></label>
				<input type="password" placeholder="Enter Your Honey Word" name="honeyword" required>
				           
				<button type="submit" >Login</button>
			</div>
		</div>
    </form>
</center>
<div style="margin-top: -3px;">
				<jsp:include page="Footer.jsp"></jsp:include>
</div>

<script type = "text/javascript" src = "bootstrap/js/bootstrap.js"></script>
<script type = "text/javascript" src = "bootstrap/js/jquery.js"></script>
</body>
</html>
