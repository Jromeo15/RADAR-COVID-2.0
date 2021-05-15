<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<link href="<c:url value="App.css" />" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Bienvenido Usuario</title>
</head>
<body>

<div class="MenuPrincipal">
<div class="body">

 <div class="title">
    <div class="titulo"><h1>Radar COVID</h1></div>
    <p class="spacer"></p>
    <table border="1">
<tr>
<th>DNI </th>
<th>Clave</th>
<th>Fecha</th>
<th>Confirmado</th>

</tr>

<c:forEach items="${registrados}" var="tfgi">
<tr>
<td>${registrados.DNI}</td>
<td>${registrados.Clave}</td>
<td>${registrados.Fecha}</td>
<td>${registrados.Confirmado}</td>
    
</tr>
</c:forEach>
</table>
</div>


</div>
</div>

</body>
</html>