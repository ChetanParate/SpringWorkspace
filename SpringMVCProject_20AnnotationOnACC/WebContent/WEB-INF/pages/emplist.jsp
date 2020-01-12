<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result Search</title>
</head>
<body>
<div align="center">
	<h1 align="center" style="color: red;"><i >*** Search Result ***</i></h1>
	<br>
	<c:if test="${empresult ne null }">
	<table>
		<tr>
			<th>Number</th>
			<th>Name</th>
			<th>Designation</th>
			<th>Salary</th>
		</tr>
		<c:forEach items="${empresult}" var="result">
		<tr>
			<td><c:out value="${result.no}"/></td>
			<td><c:out value="${result.name}"/></td>
			<td><c:out value="${result.desg}"/></td>
			<td><c:out value="${result.salary}"/></td>
		</tr>
		</c:forEach>
	</table>
</c:if>
<br>
<center> <a href="search.htm"> Back to home </a> </center>
	
</div>
</body>
</html>