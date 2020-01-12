<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
   <title>EmpListResult</title>
  </head>
<body>
  <h1 align="center">Search Result</h1>
  <c:if test="${not empty emplist}">
  	<div align="center">
  	<table>
  		<tr>
  			<th>Eno</th><th>EName</th><th>Salary</th><th>City</th>
  		</tr>
  		<c:forEach items="${emplist}" var="result">
  			<tr><td><c:out value="${result.eno}"/></td>
  			<td><c:out value="${result.ename}"/></td>
  			<td><c:out value="${result.salary}"/></td>
  			<td><c:out value="${result.city}"/></td></tr>
  		</c:forEach>
  	</table></div>
  </c:if>

</body>
</html>
