<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EmpResult</title>
</head>
<body>
<center><h1>SearchResult</h1></center>
<c:if test="${not empty emplist}"/>
<table>
	<tr>
		<th>Eno</th>
		<th>EName</th>
		<th>Salary</th>
		<th>City</th>
	</tr>
	<c:forEach items="${emplist}"  var ="result"/>
	<tr>
		<td><c:out value="${result.eno}"/></td>
		<td><c:out value="${result.ename}"/></td>
		<td><c:out value="${result.salary}"/></td>
		<td><c:out value="${result.city}"/></td>
		
	</tr>
</table>

</body>
</html>