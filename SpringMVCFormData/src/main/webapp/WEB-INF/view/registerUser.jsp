<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User Register</h1>

<form action="saveUser" method="post">
	<label>UserId</label>
	<input type="text" name="id"><br><br>
	
	<label>UserName</label>
	<input type="text" name="name"><br><br>
	
	<label>UserEmail</label>
	<input type="text" name="email"><br><br>
	
	<label>UserAddress</label>
	<input type="text" name="address"><br><br>
	
	<label>UserPassword</label>
	<input type="text" name="password"><br><br>

<input type="submit" value="SubmitFormData">
</form>

</body>
</html>