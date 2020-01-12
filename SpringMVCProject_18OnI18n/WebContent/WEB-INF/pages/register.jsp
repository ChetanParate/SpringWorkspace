<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
<title>Register Form</title>
</head>
<body>
<div align="center" style="background-color: infobackground;">
<h2 align="center" style="color: red;"><i>Registration Page</i></h2>
<center> Language :<a href="?language=en">English</a> | <a href="?language=hi_IN">Hindi</a></center>
<br>
<table>
	<tr>
		<td><spring:message code="my.user" text="default text"/></td>
		<td><input type="text" name="userName"/></td>
	</tr>
	<tr>
		<td><spring:message code="my.password" text="default text"/></td>
		<td><input type="text" name="password"/></td>
	</tr>
	<tr>
		<td><input type="button" name="login" value="<spring:message code="my.login" text="default text"/>"></td>
		<td><input type="reset" name="login" value="<spring:message code="my.clear" text="default text"/>"></td>
	</tr>
</table>
<br>
<div align="center">
<center>Selected Locale :<b>${pageContext.response.locale}</b></center>
</div>
</div>

</body>
</html>