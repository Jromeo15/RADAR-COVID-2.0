<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<link href="<c:url value="App.css" />" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Registro</title>
</head>
<body>

	<div class="registro">
                    <div class="insertar">
                        <fieldset>
                            <div class="fieldfondo">
                        <p></p>
                        <form action="FormSignUpServlet">
                        <p>Introduce tu DNI <input type="text" id="DNI" name="DNI" placeholder="Introduzca su DNI"></input></p>
                        <p class="margen2">Crea tu contraseña <input type="password" id="password" name="password" placeholder="Introduzca una contraseña"></input></p>
                        <p class="margen4">Correo electrónico <input type="email" id="email" name="email" placeholder="Introduzca su email"></input></p>
                        <p class="margen4">Ministerio<input type = "checkbox" name = "ministerio"  value="true"></input></p>
                        <p></p>
						
                        <button class="boton">REGISTRARME</button>
                        <button class="boton">Menú Inicio</button>
						</form>

                            </div>
                        </fieldset>
                    </div>
                </div>
	
</body>
</html>