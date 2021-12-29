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

<div clss="container">
<table class="table table-responsive table-stripped">
<thead>
<th>Id</th>
<th>name</th>
<th>Company name</th>
<th>Shoe Image	</th>
<th>modal</th>
<th>price</th>
<th>Action</th>
<th></th>
</thead>
<tbody>

<c:forEach items="${shoe}" var="item">
<tr>

<td> ${item.id}</td>
<td> ${item.name}</td>
<td> ${item.modal}</td>
<td> ${item.copmanyname}</td>
<td> ${item.price}</td>
<td> <img style="width:60px;" src="${item.img}"/></td>
<td><a class="btn btn-primary"  href="ViewShoe/${item.id}">Edit</a> <a class="btn btn-danger"  href="deleteShoe/${item.id}">DELETE</a></td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>