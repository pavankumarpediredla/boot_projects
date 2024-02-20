<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EmployeeLogin</title>
<link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css"
	rel="stylesheet">
<style>
.login-form {
	width: 400px;
	position: absolute;
	border-radius:4%;
	background-color: black;
	margin-right: -20%;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%)
}
</style>
</head>
<body style="background-image: url('/images/fight1.jpeg');">

	<div style="background-color: skyblue;"></div>
	<div class="login-form">
		<div class="container-fluid">
			<form method="post">
				<input type="text" class="form-control mt-3"
					placeholder="enter username" name="userid"> <input
					type="password" class="form-control mt-3"
					placeholder="enter your password" name="password">
				<button class="btn btn-block btn-dark mt-3">Submit</button>
				<h6 style="color: red;">${errorMsg}</h6>
				<br> (or) <br> <a href="createUser" text="yellow"
					link="blue" alink="#FFFF00" vlink="#FF00FF">New User?Create an
					account</a>
			</form>
			
		</div><button style="background-color:blue;" onclick="click();" >click on the function</button>
	</div>
</body>
<script>
function click(){
	alert(' ==== pkkk  ====');

	var a="";
	var b="230.00";
	var c=Double.valueOf(a)+Double.valueOf(b);
	alert(' ==== c===='+c);
	}
</script>
</html>