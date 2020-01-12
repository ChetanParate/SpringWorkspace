<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Form</title>
</head>
<body>
	<div align="center">
	<br>
		<h1 align="center" style="color: green;"><i>MultiActionController</i></h1>
		<h2 align="center" style="color: red;">(Multiple Button On Single Form)</h2>
		<form:form action="perform.htm">
			<table align="center">
			<tr>
				<td>No:</td>
				<td><input type="text" name="no"/></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email"/></td>
			</tr>
			<tr>
				<td></td>
				<td colspan="2"><input type="submit" name="opt" value="add"/> &nbsp; <input type="submit" name="opt" value="update"/></td>
				
			</tr>
			<tr>
				
				<td></td>
				<td colspan="2"><input type="submit" name="opt" value="delete"/> &nbsp; <input type="submit" name="opt" value="view"/></td>
			</tr>
			</table>
		</form:form>
	</div>
	<hr><br>
	<div align="center" style="color:navy;">
		<c:if test="${not empty cammand}" ><br>
			<c:out value="${cammand}"/>
		</c:if>
		<br>
		<c:if test="${not empty result}" ><br>
			<c:out value="${result}"/>
		</c:if>
	</div>
</body>
</html>