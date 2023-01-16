<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<%
String title = request.getParameter("title");
String count = request.getParameter("count");
int countInt = count == null?0:Integer.parseInt(count);
%>
<head>
<meta charset="BIG5">
<title><%=title %></title>
</head>
<body>
	<ol>
		<%
			char c = 'A';
			for (int i = 1;i <= countInt;i++){		
		%>
		
		<li><%=c++%></li>	
		<%} %>
	
	</ol>
</body>
</html>