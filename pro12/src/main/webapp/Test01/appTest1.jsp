<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	session.setAttribute("name","이순신");
    application.setAttribute("address","서울시 강남구");
    %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>session 내장 객체 스코프 테스트1</title>
</head>
<body>
	<h1>이름과 주소를 저장합니다.</h1>
    <a href="appTest2.jsp">두 번째 웹 페이지로 이동</a>
</body>
</html>