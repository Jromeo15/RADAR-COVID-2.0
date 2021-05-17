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
    <div class="titulillo"><h2>Posibles contactos</h2></div>
    <p class="spacer"></p>
</div>
<p></p>
<table border="1" style="margin: 0 auto;">
<tr>
<th>DNI </th>
<th>Clave</th>
<th>Fecha</th>
<th>Confirmado</th>
<th>Denegar</th>
<th>Comentarios</th>
<th>Confirmar</th>
</tr>

<c:forEach items="${registros}" var="registroi">
<tr>

<td>${registroi.DNI}</td>
<td>${registroi.clave}</td>
<td>${registroi.fecha}</td>
<td>${registroi.confirmado}</td>


<td>
<form action="FormDenegarServlet">
		<input type="hidden" name="registroclave" value="${registroi.clave}" />
		<button type="submit">Denegar</button>
</form>
<td>
<form action="FormCambiaPagina6Servlet">
		<input type="hidden" name="comentarios" value="${registroi.comentarios}" />
		<button type="submit">Ver comentarios</button>
</form>
</td>
<c:if test="${registroi.confirmado == false}">
<td>
<form action="FormConfirmacionServlet">
		<input type="hidden" name="registroclave" value="${registroi.clave}" />
		<button type="submit" >Confirmar</button>
</form>
</td>
</c:if> 
</tr>
</c:forEach>
</table>

<p></p>
<form action="FormCambiaPagina5Servlet">
		<button type="submit" class="boton">ATRÁS</button>
</form>


</div>
</div>

</body>
</html>