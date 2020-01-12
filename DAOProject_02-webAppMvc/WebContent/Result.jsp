<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
<c:when test="${not empty result }">
<table>
	<tr>
		<th> N </th><th>Name</th><th>Job</th><th>Salary</th>
	</tr>
	<c:forEach var="Map" items="${result}">
		<tr>
			<td><c:out value="${Map.EMPNO}"/></td>
			<td><c:out value="${Map.ENAME}"/></td>
			<td><c:out value="${Map.JOB}"/></td>
			<td><c:out value="${Map.SALARY}"></c:out> </td>
		</tr>
	</c:forEach>
</table>
</c:when>
<c:otherwise>
	<h2>Record Not Found...</h2>
</c:otherwise>
</c:choose>