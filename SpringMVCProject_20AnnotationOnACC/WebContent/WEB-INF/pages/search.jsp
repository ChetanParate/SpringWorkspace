<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Page</title>
</head>
<body>

<div align="center">
	<h1 align="center" style="color: green;"><i>Search Data</i></h1>
	<br>
	<form action="performsearch.htm">
	<table>
		<tr>
			<td>No :</td>
			<td><input type="text" name="no"/></td>
		</tr>
		<tr>
			<td>Name :</td>
			<td><input type="text" name="name"/></td>
		</tr>
		<tr>
			<td>Salary :</td>
			<td><input type="text" name="salary"/></td>
		</tr>
		<tr>
			<td>Designation :</td>
			<td><input type="text" name="desg"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" name="search"/></td>
		</tr>
	</table>
	</form>
</div>

</body>
</html>