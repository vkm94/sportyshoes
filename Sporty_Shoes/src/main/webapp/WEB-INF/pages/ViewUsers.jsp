<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User data</title>
</head>
<body>

 <jsp:include page="menu.jsp"/>

<div clss="container">
<table class="table table-responsive table-stripped">
<thead>
<th>User name</th>
<th>Email</th>
<th>City</th>
<th>User Type</th>
</thead>
<tbody>
<c:forEach items="${users}" var="item">
<tr>

<td> ${item.name}</td>
<td> ${item.email}</td>
<td> ${item.city}</td>
<td> ${item.type}</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>



<h5>User list</h5>
</body>
</html>