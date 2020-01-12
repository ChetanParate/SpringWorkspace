<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>
</head>
<body>
<form  target="f2" action="controller" method="get">
	<b> Selects Job(s)</b>
	<select name="job" multiple>
		<option value="CLERK">Clerk</option>
		<option value="ENGG">Engg</option>
		<option value="Java">Java</option>
		<option value="Soft">Soft</option>
		<option value="TSO">Tso</option>
	</select>
	<input type="submit" value="search"/>
</form>

</body>
</html>