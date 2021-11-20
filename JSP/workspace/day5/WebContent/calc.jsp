<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산기 - JSP 페이지</title>
</head>
<body>
	<h1>JSP로 만든 페이지</h1>

	<form action="Oper" method="post">
		<p>수식을 입력하세요</p>

		<!-- 사용자가 입력하는 부분 ( 1+1 ) -->
		<input type="text" name="input">
		<button>확인</button>
	</form>
</body>
</html>