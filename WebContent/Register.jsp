
<%@page import="bo.giohangbo"%>
<%@page import="bean.giohangbean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Register</title>
<link href="styles.css" rel="stylesheet" />
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/js/all.min.js"
	crossorigin="anonymous"></script>
</head>
<body class="">
<br>  
<hr>
	<div class="container">
		<div class="card bg-light">
			<article class="card-body mx-auto" style="max-width: 400px;">
				<h4 class="card-title mt-3 text-center">Create Account</h4>
				<p class="text-center">Get started with your free account</p>
				<form method="post" action="RegisterController" onsubmit = "return validateForm()">
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-user"></i>
							</span>
						</div>
						<input name="hoten" class="form-control" placeholder="Full name"
							type="text">
					</div>
					<!-- form-group// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-envelope"></i>
							</span>
						</div>
						<input name="email" class="form-control" placeholder="Email address"
							type="email">
					</div>
					<!-- form-group// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-phone"></i>
							</span>
						</div>
						<select class="custom-select" style="max-width: 120px;">
							<option selected="">+84</option>
						</select> <input name="sodt" class="form-control" placeholder="Phone number"
							type="text">
					</div>
					<!-- form-group// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-building"></i>
							</span>
						</div>
						<input name="diachi" class="form-control" placeholder="Your Address"
							type="text">
					</div>
					<!-- form-group end.// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-user"></i>
							</span>
						</div>
						<input name="tendn" id="user" class="form-control" placeholder="UserName"
							type="text">
					</div>
					<!-- form-group// -->
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-lock"></i>
							</span>
						</div>
						<input  name="pass" class="form-control" id="pass" placeholder="Create password"
							type="password">
					</div>
					<!-- form-group// -->
					<div class="form-group">
						<button type="submit" class="btn btn-primary btn-block">
							Create Account</button>
					</div>
					<!-- form-group// -->
					<p class="text-center">
						Have an account? <a href="Login.jsp">Log In</a>
					</p>
				</form>
			</article>
		</div>
		<!-- card.// -->

	</div>
	<script type = "text/javascript">
         function validateForm()  {
             var u = document.getElementById("user").value;
             var p = document.getElementById("pass").value;
 
             if(u== "") {
                 alert("Please enter your Username");
                 return false;
             }
             if(p == "") {
                 alert("Please enter you Password");
                 return false;
             }
 
//              alert("DANG KY THANH CONG !")
 
             return true;
         }
      </script>
	<!--container end.//-->
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js"
		crossorigin="anonymous"></script>
	<script src="js/scripts.js"></script>
</body>
</html>
