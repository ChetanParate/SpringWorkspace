<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<br>
<h1 align="center"><i>Form Three Data</i></h1>
<table align="center">
<form:form method="POST" commandName="userForm">
	<tr>
		<td>City :</td>
		<td><form:input path="city"/></td>
	</tr>
	<tr>
		<td>PinCode :</td>
		<td><form:input path="pincode"/></td>
	</tr>
	<tr>
		<td><input type="submit" value="Previous" name="_target1"/></td>
		<td><input type="submit" value="Finish" name="_finish"/></td>
		<td><input type="submit" value="Cancel" name="_cancel"/></td>
	</tr>
	</form:form>
</table>
		
</div>

</body>
</html>