<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ResultForm</title>
</head>
<body>
<div align="center">
<br>
<h1 align="center" style="color: red;"><i> All form Details </i></h1>
	<table align="center" border="1">
	<tr><th colspan="2"> Form One Data</th></tr>
	<tr>
		<td>UserName :</td>
		<td>${registerBean.username}</td>
	</tr>
	<tr>
		<td>Password :</td>
		<td>${registerBean.password}</td>
	</tr>
	<tr><th colspan="2"> Form Two Data</th></tr>
	<tr>
		<td>EmailId :</td>
		<td>${registerBean.emailid}</td>
	</tr>
	<tr>
		<td>Phone :</td>
		<td>${registerBean.phone}</td>
	</tr>
	<tr><th colspan="2"> Form Three Data</th></tr>
	<tr>
		<td>City :</td>
		<td>${registerBean.city}</td>
	</tr>
	<tr>
		<td>PinCode :</td>
		<td>${registerBean.pincode}</td>
	</tr>
	
	</table>
</div>
<br>
<div align="center"><a href="welcome.htm"> Back to Home</a></div>

</body>
</html>