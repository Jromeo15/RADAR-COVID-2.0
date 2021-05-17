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
    <div class="titulillo"><h2>Comentarios</h2></div>
    <p class="spacer"></p>
</div>
<div class="registro">
     <div class="insertar">
     <p class="spacer"></p>
     <p>Comentarios enviados por el usuario:</p>
     <fieldset>
     <p>${comentarios}</p>
     </fieldset>
     </div>
     </div>
	 <p></p>
<form action="FormConfirmarReporteServlet">
		<button type="submit" class="boton">VOLVER</button>
</form>


</div>
</div>

</body>
</html>