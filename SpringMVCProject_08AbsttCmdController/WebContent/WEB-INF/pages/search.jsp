<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Form</title>
</head>
<body>
<div align="center">
	<h2 align="center">Employee Search</h2>
	<form action="searchemp.htm">
		<table>
			<tr>
				<td>Employee Id :</td>
				<td><input type="text" name="eno"></td>
			</tr>
			<tr>
				<td>Employee Name :</td>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<td>Enter Department  :</td>
				<td><input type="text" name="dept"></td>
			</tr>
			<tr>
				<td>Enter City  :</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="Serach"></td>
			</tr>
		</table> 
	</form>

</div>

</body>
</html>
