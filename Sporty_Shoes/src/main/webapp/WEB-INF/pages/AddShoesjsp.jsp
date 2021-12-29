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
 <form action="addShoes" method="post" modelAttribute="shoe">
		Product Name: <input type="text" name="name" id="name" placeholder="Product Name"   />
		<br>
		<br>
		Price: <input type="text"  name="price" id="price" placeholder="Price"  />
		<br>
		<br> 
		Company name: <input type="text" name="copmanyname" id="copmanyname" placeholder="Company Name"   />
		<br>
		<br>
		Image : <input type="text" name="img" id="img" placeholder="Image Url"     />
		<br>
			Modal: <input type="text" name="modal" id="modal" placeholder="Model"    />
		<br>
		<br>
		<input type="submit" value="Add">
	</form>
 
 
</body>
</html>