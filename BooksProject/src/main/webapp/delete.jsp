<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String st = (String)request.getAttribute("msg");
out.println(st);
%>
<%@include file="Book.html" %>
</body>
</html>