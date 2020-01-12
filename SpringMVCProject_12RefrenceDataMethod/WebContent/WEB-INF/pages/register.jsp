<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Form</title>
</head>
<body>
<div align="center">
<form:form method="POST" commandName="regCommand">
	<table align="center">
		<tr>
			<td>NO :</td>
			<td><form:input path="sno"/></td>
			<td><form:errors path="sno"/></td>
		</tr>
		<tr>
			<td>Name :</td>
			<td><form:input path="name"/></td>
			<td><form:errors path="name"/></td>
		</tr>
		<tr>
			<td>Courses :</td>
			<td>
				<form:select path="course">
					<form:options items="${courseList}"/>
				</form:select>
			</td>
			<td><form:errors path="course"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="register"></td>
		</tr>
	</table>
</form:form>
</div>
</body>
</html>