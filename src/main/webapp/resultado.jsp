<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultados Calculadora</title>
</head>
<body>

	<h1><%= request.getAttribute("resultado") %></h1>
	<a href="Index.jsp">Volver a Calculadora</a>

</body>
</html>