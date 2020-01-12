<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page import="java.io.File"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>download File</title>
</head>
<body>
<div align="center">
<br>
<table border="1">
	<tr> <th> FileName</th><th>Download</th></tr>
	<%
		String path = "F:/Chetan";
		String files;
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		
		for(int i =0; i<listOfFiles.length;i++){
			if(listOfFiles[i].isFile()){
				files = listOfFiles[i].getName();
				%>
				<tr>
					<td><%=files%></td>
					<td><a href="download.htm?file_name=<%=files%>">Download</a></td>
				</tr>
			<%}
		}
		
	%>
</table>
</div>

</body>
</html>