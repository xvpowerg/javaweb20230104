<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ page import="tw.com.beans.Item" %>    
<%@ page import="tw.com.beans.User" %>    
<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
		<%
		User user1 = (User)session.getAttribute("User1");
		Item item1 = (Item )request.getAttribute("Item1");
		Map<String,User> usertMap = (Map<String,User>)session.getAttribute("userMap");
		 List<User>userList = (List<User>)session.getAttribute("userList"); 
		%>
		
		<p><%=item1.getName()%>:<%=item1.getPrice()%></p>
		<p><%=user1.getName()%>:<%=user1.getAge()%></p>
		
		<p><%=usertMap.get("user1").getName() %></p>
		<p><%=usertMap.get("user2 Ken").getName() %></p>
		
		<%for (User u : userList) {%>
			<p>name:<%=u.getName() %></p>
			<p>age:<%=u.getAge() %></p>
		<%} %>
</body>
</html>