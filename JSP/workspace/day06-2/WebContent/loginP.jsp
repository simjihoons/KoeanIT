<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 결과</title>
</head>
<body>
	<% if(request.getParameter("id").equals("hgd1234")){ 
		if(request.getParameter("pw").equals("1234")){%>
		<h3>로그인성공</h3>
		<%}else{ %>
			<h1>password error</h1>
		<%} %>
	<%}else{ %>
		<h1>id error</h1>
	<%} %>
</body>
</html>