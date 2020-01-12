<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
</head>
<body>
	<div align="center">
		<h1 align="center">***** Login Form *****</h1>
		<form:form commandName="userCommand" method="POST">
		<table align="center">
		<tr>
			<td>User Name :</td>
			<td><form:input path="user"/></td>
			<td><form:errors path="user"/></td>
		</tr>
		<tr>
			<td>Password :</td>
			<td><form:input path="password"/></td>
			<td><form:errors path="password"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Login"/></td>
			<td></td>
		</tr>
		</table>
		</form:form>
		<br>
		<center><span>Result : ${result}</span></center>
	</div>
</body>
</html>