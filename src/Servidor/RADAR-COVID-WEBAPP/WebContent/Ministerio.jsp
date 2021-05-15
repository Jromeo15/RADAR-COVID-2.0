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
    <div class="titulillo"><h2>Menú pricipal</h2></div>
    <p class="spacer"></p>
</div>
<img alt="" src="images/Ministerio.png" alt="Logo" class="ministerio"></img>
<div class="insertar">
    <p class="spacer"></p>
<form action="FormCambiaPagina3Servlet">
		<button type="submit" class="boton">CONFIRMAR UN REPORTE</button>
</form>
<p class="spacer"></p>
<form action="FormCambiaPagina4Servlet">
		<button type="submit" class="boton">INICIO</button>
</form>
<p class="spacer"></p>

</div>
</div>
</div>

</body>
</html>