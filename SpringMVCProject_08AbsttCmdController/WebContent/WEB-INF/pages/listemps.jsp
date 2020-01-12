<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Result</title>
</head>
<body>
	<div align="center">
		<br><br>
		<h2 align="center" style="color: red;"><i>Search Result</i></h2>
		<c:if test="${not empty searchresult}">
		<table border="1" style="background-color: yellow; ">
		<tr style="background-color: green;">
			<th>EmployeeNumber</th>
			<th>EmployeeName</th>
			<th>EmplyeeSalary</th>
			<th>DeptNumber</th>
			<th>City</th>
		</tr>
		<c:forEach items="${searchresult}" var="result">
		<tr>
			<td><c:out value="${result.employeeNumber}"/></td>
			<td><c:out value="${result.employeeName}"/></td>
			<td><c:out value="${result.employeeSalary}"/></td>
			<td><c:out value="${result.deptNumber}"/></td>
			<td><c:out value="${result.city}"/></td>
		</tr>
		</c:forEach>
		</table>
		</c:if>
		<p align="center"><a href="search.htm">back to Home</a> </p>
	</div>
</body>
</html>