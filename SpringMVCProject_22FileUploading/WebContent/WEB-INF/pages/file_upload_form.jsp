<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Upload</title>
</head>
<body>
<div align="center">
	<h1 align="center"> File Upload</h1>
	<form:form method="POST" action="save.htm" modelAttribute="uploadForm" enctype="multipart/form-data">
	<table>
		<tr>
			<td>Plz Select File form upload :</td>
			<td><input type="file" name="file"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Upload"></td>
		</tr>
	</table>
	</form:form>
	</div>
</body>
</html>