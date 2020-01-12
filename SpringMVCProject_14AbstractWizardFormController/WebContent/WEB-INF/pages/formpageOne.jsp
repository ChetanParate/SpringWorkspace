<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FormPageOne</title>
</head>
<body>
<div align="center">
<br>
<h1 align="center"><i>Form One Data</i></h1>
<table align="center">
<form:form method="POST" commandName="userForm">
	<tr>
		<td>UserName :</td>
		<td><form:input path="username"/></td>
	</tr>
	<tr>
		<td>Password :</td>
		<td><form:password path="password"/></td>
	</tr>
	<tr>
		<td><input type="submit" value="Next" name="_target1"/></td>
		<td><input type="submit" value="Cancel" name="_cancel"/></td>
	</tr>
	</form:form>
</table>
		
</div>

</body>
</html>