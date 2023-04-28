<%@page import="com.soft.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is user Display Page</h1>

<% User user = (User) request.getAttribute("userDetails"); %>

<span>UserId::<%=user.getId() %></span><br><br>

<span>UserName::<%=user.getName() %></span><br><br>

<span>UserEmail::<%=user.getEmail() %></span><br><br>

<span>UserAddress::<%=user.getAddress() %></span><br><br>

<span>UserPassword::<%=user.getPassword() %></span><br><br>

</body>
</html>