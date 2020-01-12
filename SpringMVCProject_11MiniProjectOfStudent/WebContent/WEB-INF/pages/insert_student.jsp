<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<jsp:include page="header.html"/>
<div align="center" style="padding-top: 10px;padding-bottom: 10px; background: #c8acff; margin-top: 5px;margin-bottom: 5px;" >
<h2 align="center" style="color: red;"><i>****** Students Registration ******</i></h2>
<hr>
<h3 align="center" style="color:maroon;" ><i>Student Registration Form </i></h3>
<br>
<form:form method="post" commandName="stCommand">
	<table align="center">
		<tr>
			<td>Enter Student RollNumber :</td>
			<td><form:input  path="rollno" /></td>
			<td style="color: red;"><form:errors path="rollno"/></td>
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
			<td>Enter Student Marks :</td>
			<td><form:input path="marks"/></td>
			<td style="color: red;"><form:errors path="marks"/></td>
		</tr>
		<tr>
			<td>Enter Student Percentage :</td>
			<td><form:input path="per"/></td>
			<td style="color: red;"><form:errors path="per"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Register" /></td>

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