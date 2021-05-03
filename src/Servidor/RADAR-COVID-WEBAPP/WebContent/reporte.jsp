<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TFG</title>
</head>
<body>

<h2>Acceso</h2>
<table border="1">
<tr>
<td>Nombre: ${tfg.name}</td>
<td>Email: ${tfg.email}</td>
<td>Titulo: ${tfg.title}</td>
<td>Email del tutor: ${tfg.advisor}</td>
<td>Estado del trabajo: ${tfg.status}</td>
<td>Nota: ${tfg.mark}</td>
<td>
<c:if test="${tfg.status == 3}">
  <form action="FormSubeMemoriaServlet" method="post" enctype="multipart/form-data">
        <input type="hidden" name="tfgemail" value="${tfg.email}" />
            <input type="file" name="file" />
        <input type="submit">Subir memoria
  </form>
</c:if>
<c:if test="${tfg.status > 3}">
  <form action="FormBajaMemoriaServlet" method="get">
        <input type="hidden" name="tfgemail" value="${tfg.email}" />
        <button type="submit">Descargar memoria</button>
  </form>
</c:if>
</td>
</table>

<%@ include file="FormLogout.jsp"%>


</body>
</html>