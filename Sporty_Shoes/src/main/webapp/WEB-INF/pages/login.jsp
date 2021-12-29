<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
 integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body>



<div class="container" >
	
	<div class="card">
	<div class="form-group mb-3 d-flex justify-content-center "><h3 >welcome to Sporty  Shoes </h3></div>
	<h2></h2>
	<font color="red">${errorMsg}</font>
	<div class="card-body d-flex justify-content-center">
	
				
		<form method="post" class=" ">
			<div class="form-group "><font color="red">${errorMessage}</font></div>
		<div class="form-inline  mb-3"><div class="form-group  "  >Name:</div><div class="form-group "><input type="text" class="form-control form-control-sm" id="name" name="uname"/></div></div>	
			<div class="form-inline row mb-3"><div class="form-group "  >Password:</div><div class="form-group "><input type="password" class="form-control form-control-sm" id="pass" name="pass"/></div></div>	
			<div class="form-group "><button class="btn btn-sm btn-primary mb-3">Login</button></div>
			
			
			</form>
			
			</div>
		
	</div>
</div>




<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>

</body>
</html>