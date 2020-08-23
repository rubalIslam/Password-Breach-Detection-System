<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css">
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	 background-image: url("Images/bg.jpg");
	}

* {
    box-sizing: border-box;
    /*overflow-x: hidden;*/
}

/* Add padding to containers */
.myForm {
	padding-top:0px;
	margin-top:0px;
    padding: 16px;
    
    width: 858px;
}


/* Full-width input fields */
input[type=text], input[type=password] {
    width: 100%;
    padding: 15px;
    margin: 5px 0 22px 0;
    display: inline-block;
    border: none;
    background: white;
    color:black;
}

input[type=text]:focus, input[type=password]:focus {
    background-color: white;
    outline: none;
    color:black;
}
input[type=radio]{
height:30px;
width:44px;

}

/* Overwrite default styles of hr */
hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
    background-color: #4CAF50;
    color: white;
    padding: 16px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
    opacity: 0.9;
}

.registerbtn:hover {
    opacity: 1;
}

/* Add a blue text color to links */
a {
    color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
    margin-top:0;
    padding-top:0;
    margin-bottom:30px;
    text-align: center;
}
.signText{
	background: none;
	color: white;
	font-size: 20px;
	
}
p{
	font-size: 18px;
}

</style>
</head>
<body class="bg-primary">
<jsp:include page="Header.jsp"></jsp:include>
<jsp:include page="HomeMenu.jsp"></jsp:include>
<center>
<form action="RegistrationServlet"style="width:900px;">
<center><h2><font face="Yu Mincho Demibold" style="color: #3cfff4;"><font size="8" >Register Here</font></font></h2></center>
  <div class="container" style="text-align: left">
	  <div class="myForm">
	  	<center><label><font color="red" size="4"><% String status=request.getParameter("status"); if(status!=null){out.println(status);} %></font></label> </center>
    
	    <hr>
	
	    <label for="email" style="color:white"><b>LOGINID</b></label>
	    <input type="text" placeholder="Create LoginId" name="uid" required>
	
	    <label for="psw" style="color:white"><b>PASSWORD</b></label>
	    <input type="password" placeholder="Create Password" name="pass" pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$" required>
	
	    <label for="psw-repeat" style="color:white"><b>ROLE</b></label>
	    <input type="text" placeholder="Repeat Password" name="role" value="User"  readonly="readonly">
	    <label for="email" style="color:white"><b>USERNAME</b></label>
	    <input type="text" placeholder="Enter User Name" name="uname" required>
	 	<label for="psw" style="color:white"><b>GENDER</b></label>
		<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Male
								<input type="radio" size="54"  name="g" id="g" value="M" checked="checked" />
								&nbsp; FeMale					
								
			<input type="radio" name="g" id="g" value="F" /><br><br>&nbsp;
			<label for="psw" style="color:white"><b>MAIL</b></label>
	      <input type="text" placeholder="Enter MailId" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required>
	
	    <label for="psw-repeat" style="color:white"><b>MOBILE</b></label>
	    <input type="text" placeholder="Enter Valid Mobile Number" name="mob" pattern="[7896][0-9]{9}" required>
	    
	
	    <label for="psw-repeat" style="color:white"><b>ADDRESS</b></label>
	    <input type="text" placeholder="Enter Address" name="uaddress" required>
	    
	    <center><label for="psw-repeat" style="color:orange"><b>FOR HONEY KEY WORDS</b></label></center>
	  
	   <label for="psw-repeat" style="color:white"><b>WHAT IS YOUR PET NAME?</b></label>
	    <input type="text" placeholder="Enter your Pet Name" name="petname"  required>
	    
	     <label for="psw-repeat" style="color:white"><b>HOW OLD ARE YOU?</b></label>
	    <input type="text" placeholder="Enter Your Age" name="age" maxlength="3"  pattern="^0[1-9]|[1-9]\d$" required>
	    
	     <label for="psw-repeat" style="color:white"><b>WHAT KIND OF FRUIT DO YOU LIKE?</b></label>
	    <input type="text" placeholder="Enter Fruit Name" name="fruit"  required>
	    
	    <label for="psw-repeat" style="color:white"><b>WHAT IS YOUR YEAR OF BIRTH?</b></label>
	    <input type="text" placeholder="Enter Year " name="yob" maxlength="4"  pattern="\d{4}" required>
	    
	    
	    <hr>
	    
	
	    <button type="submit" class="registerbtn">Register</button>
		  </div>
    
  </div>
  
  <div class="myForm signin">
    <p class"signText">Already have an account? <a href="Login.jsp">Sign in</a>.</p>
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
