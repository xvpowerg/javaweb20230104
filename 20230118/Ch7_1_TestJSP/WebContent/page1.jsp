<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
 <%@page import="tw.com.beans.Item" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<ol>
		<%
		ArrayList<Item>	list =
		(ArrayList)session.getAttribute("itemList");
		for(Item it : list){
		%>
		<li><%=it.getId()%>:<%=it.getName()%></li>		
		
		<%} %>
</ol>		

<h2><%=request.getAttribute("reqAttr")%></h2>
</body>
</html>