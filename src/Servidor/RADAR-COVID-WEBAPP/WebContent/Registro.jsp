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
                        
                        
                        
                        <p>Introduce tu DNI* <input type="text" id="DNI" name="DNI" placeholder="Introduzca su DNI" maxlength="9"></input></p>     
                                      
                        <p class="margen2">Crea tu contrase�a* <input type="password" id="password" name="password" placeholder="Introduzca una contrase�a"></input></p>
                        <p class="margen3">Correo electr�nico <input type="email" id="email" name="email" placeholder="Introduzca su email"></input></p>
                        <p class="margen4">Ministerio<input type = "checkbox" name = "ministerio"  value="true"></input></p>
                        <h5 style="text-align:left">*El DNI tiene debe contener 8 n�meros y una letra</h5>   
                        <h5 style="text-align:left">*La contrase�a debe de tener longitud m�nima de 8 y m�xima de 16</h5> 
                        <p></p>
                        <h5 style="text-align:left">Para leer los t�rminos y condiciones de servicio pinche <a href="TyC.jsp">aqu�</a>.</h5>
                        <p></p>
						
                        <button class="boton">REGISTRARME</button>
                        
                        <p></p>
                        </form>
                        
                        <form action="FormLogoutServlet">
                        <button class="boton">MEN� INICIO</button>
						</form> 
                            </div>
                        </fieldset>
                    </div>
                </div>
	
</body>
</html>