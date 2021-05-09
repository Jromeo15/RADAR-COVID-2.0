<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
</head>
<body>

	<form action="FormRegistroServlet">
		<input type="text" name="DNI" placeholder="DNI">
		<input type="password" id="password" name="password" placeholder="Password">
        <input type="email" id="email" name="email" placeholder="Email">
        <button type="submit">Registrarse</button>
	</form>
	
</body>
</html>