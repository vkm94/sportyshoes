<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <jsp:include page="menu.jsp"/>
<main role="main" class="flex-shrink-8">
<div class="container">
<div class="jumbotron"><h5>Edit Products</h5>


<form action="../UpdateShoe/${product.id}" method="post" modelAttribute="shoe">
		Shoe Name: <input type="text" name="name" id="name" value=${product.name}   />
		<br>
		<br>
		Price: <input type="text"  name="price" id="price" value=${product.price}  />
		<br>
		<br> 
		Company name: <input type="text" name="copmanyname" id="copmanyname" value= ${product.copmanyname}  />
		<br>
		<br>
		Image : <input type="text" name="img" id="img" value=${product.img}   />
		<br>
			Modal: <input type="text" name="modal" id="modal" path="confirm_password"  value=${product.modal}  />
		<br>
		<br>
		<input type="submit" value="Update">
	</form>

</div></div>
</main>
</body>
</html>