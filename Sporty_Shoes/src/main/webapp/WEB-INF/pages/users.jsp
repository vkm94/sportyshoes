<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<div class="jumbotron"><h5>Users</h5>



</div></div>

</main>
<c:forEach items="${uses}" var="item">
    ${item}<br>
</c:forEach>
</body>
</html>