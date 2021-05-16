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
	<div class="title">
                    <div class="titulo"><h1>Radar COVID</h1></div>
                    <p class="spacer"></p>
                    <div class="titulillo"><h2>Registro</h2></div>
                    <p class="spacer"></p>

                </div>
                    <div class="insertar">
                        <fieldset>
                            <div class="fieldfondo">
                        <p></p>
                        
                        <form action="FormSignUpServlet">
                        
                        
                        
                        <p>Introduce tu DNI* <input type="text" id="DNI" name="DNI" placeholder="Introduzca su DNI" minlength="8" maxlength="8"></input></p>     
                                      
                        <p class="margen2">Crea tu contraseña* <input type="password" id="password" name="password" placeholder="Introduzca una contraseña"></input></p>
                        <p class="margen4">Correo electrónico <input type="email" id="email" name="email" placeholder="Introduzca su email"></input></p>
                        <p class="margen4">Ministerio<input type = "checkbox" name = "ministerio"  value="true"></input></p>
                        <h6 style="text-align:left">*El DNI tiene debe contener 8 números y una letra</h6>   
                        <h6 style="text-align:left">*La contraseña debe de tener longitud mínima de 8 y máxima de 16</h6> 
                        <p></p>
                        
                        
						
                        <button class="boton">REGISTRARME</button>
                        
                        <p></p>
                        </form>
                        
                        <form action="FormLogoutServlet">
                        <button class="boton">MENÚ INICIO</button>
						</form> 
                            </div>
                        </fieldset>
                    </div>
                </div>
	
</body>
</html>