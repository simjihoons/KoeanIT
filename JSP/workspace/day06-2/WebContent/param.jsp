<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>param action tag</title>
</head>
<body>
	<h3>param action tag</h3>
	
	<jsp:forward page="paramP.jsp">
		<jsp:param value="admin" name="id" />
		<jsp:param value="관리자" name="name" />
	</jsp:forward>
</body>
</html>