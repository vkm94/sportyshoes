<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
 integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body>
<div class="container">
welcome to Register
<div class="card  ">

<div class="card-body d-flex justify-content-center">
<form method="post" action="register"  modelAttribute="user">

Name:<input class="form-control form-control-sm" type="text" id="name" name="name"/>
<br/>
password<input class="form-control form-control-sm" type="password" id="password" name="password"/>
<br/>
Email:<input class="form-control form-control-sm" type="email" id="email" name="email"/>
<br/>
City<input class="form-control form-control-sm" type="text" id="city" name="city"/>
<br/>
<input type="submit">
</form>

</div>
</div></div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>

</body>
</html>