<%@ page import="java.util.ArrayList"%>
<%@ page import="com.jspex.beans.MemberVO"%>
<%@ page import="com.jspex.beans.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:useBean class="com.jspex.beans.MemberVO" id="vo"></jsp:useBean>
<jsp:useBean class="com.jspex.beans.MemberDAO" id="dao"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바빈즈 예제</title>
</head>
<body>
	<%--
	<jsp:setProperty property="name" name="vo" value=">555" />
	<jsp:setProperty property="brithday" name="vo" value="12-06" />
     --%>


	<%
		ArrayList<MemberVO> members = dao.select("홍길동");
	%>

	<table border=1>
		<%
			for (int i = 0; i < members.size(); i++) {
		%>
		<jsp:setProperty property="name" name="vo" value="<%=members.get(i).getName()%>"/>
		<jsp:setProperty property="birthday" name="vo" value="<%=members.get(i).getBirthday()%>"/>
		<tr>
	
			<td>
			<%--<%=members.get(i).getName()--%>
			<jsp:getProperty property="name" name="vo" />
			</td>
			<td>
			<%--<%=members.get(i).getBirthday()--%>
			<jsp:getProperty property="birthday" name="vo" />
			</td>
			
		</tr>
		<%
			}
		%>
	</table>

	<%--
	<jsp:getProperty property="name" name="vo" />
	<jsp:getProperty property="brithday" name="vo" />
	
	  --%>

</body>
</html>

