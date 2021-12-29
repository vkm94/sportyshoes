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

<div class="container">

<div class="row ">
<c:forEach items="${shoe}" var="item">
<div class="col ">

<div class="card">

<img style="width:80px;" src="${item.img}"/>
<h5>${item.name}</h5>

<p>${item.modal}</p>
<p> ${item.copmanyname}</p>
<h5>${item.price} /-</h5>
<a class="btn btn-primary"  href="addOrder/${item.id}">Buy Now</a>
</div>

</div>
</c:forEach>
</div>
</div>

</tbody>
</body>
</html>