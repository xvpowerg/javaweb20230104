<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<%
String appValue = (String)application.getAttribute("appValue");

%>
	<p>appValue:<%=appValue %></p>
</body>
</html>