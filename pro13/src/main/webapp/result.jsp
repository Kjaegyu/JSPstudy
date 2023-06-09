<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%
    request.setCharacterEncoding("utf-8");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String userID = request.getParameter("userID");
	System.out.print("userID" + userID);
if(userID.length()==0) {
	/*
	RequestDispatcher dispatch = request.getRequestDispatcher("login.jsp");
	dispatch.forword(request,response);
	*/
%>
	<jsp:forward page="login.jsp" />
	<%
	}
	%>
	
		<h1> 환영합니다 <%= userID %> 님!!! </h1>
</body>
</html>