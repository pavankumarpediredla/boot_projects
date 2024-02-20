<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create an Account</title>
<link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css"
	rel="stylesheet">


<style>
input[type=text], input[type=password] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

button {
	background-color: #04AA6D;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

button:hover {
	opacity: 1;
}

/* Extra styles for the cancel button */
.cancelbtn {
	padding: 14px 20px;
	background-color: #f44336;
}
.mySlides {
  display: none;
}

/* Add a pointer when hovering over the thumbnail images */
.cursor {
  cursor: pointer;
}

/* Next & previous buttons */
.prev,
.next {
  cursor: pointer;
  position: absolute;
  top: 40%;
  width: auto;
  padding: 16px;
  margin-top: -50px;
  color: white;
  font-weight: bold;
  font-size: 20px;
  border-radius: 0 3px 3px 0;
  user-select: none;
  -webkit-user-select: none;
}

/* Position the "next button" to the right */
.next {
  right: 0;
  border-radius: 3px 0 0 3px;
}

</style>
</head>
<body>

	<div>
		<div>
			<h1>welcome to Employee corner</h1>
		</div>
		<div class="container-group" style="background-color: darkviolet;">
			<div class="row">
				<div class="col-sm-6" style="background-color: skyblue">
					//image
					<div class="mySlides">
						<div class="numbertext">1 / 6</div>
						<img
							src="E:/ECLIPSE/EmployeeCorner/src/main/webapp/WEB-INF/jsp/images/f2.jpeg"
							style="width: 100%">
					</div>

					<div class="mySlides">
						<div class="numbertext">2 / 6</div>
						<img
							src="E:/ECLIPSE/EmployeeCorner/src/main/webapp/WEB-INF/jsp/images/f2.jpeg"
							style="width: 100%">
					</div>
					<!-- Next and previous buttons -->
					<a class="prev" onclick="plusSlides(-1)">&#10094;</a> <a
						class="next" onclick="plusSlides(1)">&#10095;</a>
				</div>
				<div class="col-sm-6">
					<form method="post" action="" style="border: 1px solid #ccc">
						<div class="container">
							<h1>Sign Up</h1>
							<p>Please fill in this form to create an account.</p>
							<hr>
							<label for="firstName"><b>firstName</b></label> <input
								type="text" placeholder="Enter first Name" name="firstName"
								required> <label for="lastName"><b>lastName</b></label>
							<input type="text" placeholder="Enter your last Name"
								name="lastName" required> <label for="email"><b>Email</b></label>
							<input type="text" placeholder="Enter Email" name="email"
								required> <label for="psw"><b>Password</b></label> <input
								type="password" placeholder="Enter Password" name="psw" required>
							<label for="psw-repeat"><b>Repeat Password</b></label> <input
								type="password" placeholder="Repeat Password" name="psw-repeat"
								required> <label> <input type="checkbox"
								checked="checked" name="remember" style="margin-bottom: 15px">
								Remember me
							</label>

							<p>
								By creating an account you agree to our <a href="#"
									style="color: dodgerblue">Terms & Privacy</a>.
							</p>

							<div class="clearfix">
								<button type="button" class="cancelbtn">Cancel</button>
								<button type="submit" class="signupbtn">Sign Up</button>
							</div>

							<h6>${errorMsg}</h6>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>