<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students List</title>
</head>
<body>
<jsp:include page="header.html"/>
<div align="center" style="padding-top: 10px;padding-bottom: 10px; background: #c8acff; margin-top: 5px;margin-bottom: 5px;" >
<h2 align="center" style="color: red;"><i>****** Students Details ******</i></h2>
<hr>
<c:choose>
<c:when test="${studlist ne null}">
	<table align="center" style="background-color:#fbcf54">
	<tr style="color:maroon; background-color: yellow;" align="center"><th>RollNo</th><th>SName</th><th>SAddress</th><th>Marks</th><th>Percentage</th></tr>
	<c:forEach items="${studlist}" var="stList">
	<tr align="center">
		<td><a href="edit.htm?id=${stList.rollno}"><c:out value="${stList.rollno}"/></a></td>
		<td><c:out value="${stList.sname}"/></td>
		<td><c:out value="${stList.sadd}"/></td>
		<td><c:out value="${stList.marks}"/></td>
		<td><c:out value="${stList.per}"/></td>
	</tr>
	</c:forEach>
</table>
</c:when>
<c:otherwise>
	<c:out value="Student Data is Not available...Try again..!"></c:out>
</c:otherwise>
</c:choose>
<p align="center"><a href="insert.htm"><b>Insert Student Data</b></a></p>
<hr>
<a href="home.htm"><i>&lt;== Back to Home.!</i></a>
</div>

<jsp:include page="footer.html"/>
</body>
</html>