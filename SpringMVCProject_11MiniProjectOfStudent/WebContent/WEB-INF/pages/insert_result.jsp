<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.html"/>
<div align="center" style="padding-top: 10px;padding-bottom: 10px; background: #c8acff; margin-top: 5px;margin-bottom: 5px;" >
<h2 align="center" style="color: red;"><i>****** Student Registration Result ******</i></h2>
<hr>
<br>
<br>
<h4 align="center" style="color: green;">${resultMsg}</h4>
<br>
<br>
<hr>
<a href="home.htm"><i>&lt;== Back to Home.!</i></a>
</div>

<jsp:include page="footer.html"/>
</body>
</html>