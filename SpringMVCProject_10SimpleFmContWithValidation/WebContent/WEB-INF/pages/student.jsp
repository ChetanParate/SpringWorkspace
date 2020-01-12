<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
<div align="center" style=" background-color:activeborder; ">
<h1 align="center" style="color:maroon;" ><i>Student Registration Form </i></h1>
<form:form method="post" commandName="stCommand">
	<table align="center">
		<tr>
			<td>Enter Student No :</td>
			<td><form:input path="sno"/></td>
			<td style="color: red;"><form:errors path="sno"/></td>
		</tr>
		<tr>
			<td>Enter Student Name :</td>
			<td><form:input path="sname"/></td>
			<td style="color: red;"><form:errors path="sname"/></td>
		</tr>
		<tr>
			<td>Enter Student Address :</td>
			<td><form:input path="sadd"/></td>
			<td style="color: red;"><form:errors path="sadd"/></td>
		</tr>
		<tr>
			<td>Enter School Name :</td>
			<td><form:input path="school"/></td>
			<td style="color: red;"><form:errors path="school"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Register" /></td>
		</tr>
	</table>
</form:form>
<br><br>
</div>
</body>
</html>