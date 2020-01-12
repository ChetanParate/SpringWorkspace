<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Students</title>
</head>
<body>
<jsp:include page="header.html"/>
<div align="center" style="padding-top: 10px;padding-bottom: 10px; background: #c8acff; margin-top: 5px;margin-bottom: 5px;" >
<h2 align="center" style="color: red;"><i>****** Update Students Details ******</i></h2>
<hr>
<h3 align="center" style="color:maroon;" ><i>Student Update Form </i></h3>
<hr align="center" width="200px">
<br>
<form:form method="post" commandName="stCommand">
	<table align="center">
		<tr>
			<td>Student RollNumber :</td>
			<td><form:input  path="rollno" readonly="true" /></td>
			<td style="color: red;"><form:errors path="rollno"/></td>
		</tr>
		<tr>
			<td>Student Name :</td>
			<td><form:input path="sname"/></td>
			<td style="color: red;"><form:errors path="sname"/></td>
		</tr>
		<tr>
			<td>Student Address :</td>
			<td><form:input path="sadd"/></td>
			<td style="color: red;"><form:errors path="sadd"/></td>
		</tr>
		<tr>
			<td>Student Marks :</td>
			<td><form:input path="marks"/></td>
			<td style="color: red;"><form:errors path="marks"/></td>
		</tr>
		<tr>
			<td>Student Percentage :</td>
			<td><form:input path="per"/></td>
			<td style="color: red;"><form:errors path="per"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Update" /></td>
<!-- 			<td><input type="submit" value="Delete" /></td> -->
		</tr>
	</table>
</form:form>
<br>
<hr>
<a href="stlist.htm"><i>&lt;== Back to Home.!</i></a>
</div>
<jsp:include page="footer.html"/>
</body>
</html>