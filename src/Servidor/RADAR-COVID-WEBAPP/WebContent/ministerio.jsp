<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenido Ministerio</title>
</head>
<body>

<table border="1">
<tr>
<th>T�tulo</th>
<th>Estudiante</th>
<th>Email del estudiante</th>
<th>Estado</th>
<th>Memoria</th>
<th>Nota</th>
<th>Acciones</th>


</tr>

<c:forEach items="${tfgs}" var="tfgi">
<tr>
<td>${tfgi.title}</td>
<td>${tfgi.name}</td>
<td>${tfgi.email}</td>
<td>${tfgi.status}</td>
<td><c:if test="${tfgi.status > 3}">
                <form action="FormBajaMemoriaServlet">
                <input type="hidden" name="tfgemail" value="${tfgi.email}" />
                <input type="submit">Memoria TFG</input>
                </form>
        </c:if>
</td>
<td>${tfgi.mark}</td>
<c:if test="${tfgi.status == 1}">
        <td>
        <form action="FormProfesorServlet">
        <input type="hidden" id="tfgemail" name="tfgemail" value="${tfgi.email}" />
        <input type="submit">Aceptar Tutela</input>
        </form>
        </td>
</c:if>
<c:if test="${tfgi.status == 4}">
        <td>
        <form action="FormProfesorServlet">
        <input type="hidden" id="tfgemail" name="tfgemail" value="${tfgi.email}" />
        <input type="submit">Proponer defensa</input>
        </form>
        </td>
</c:if>
<c:if test="${tfgi.status == 6}">
        <td>
        <form action="FormProfesorServlet">
        <input type="hidden" id="tfgemail" name="tfgemail" value="${tfgi.email}" />
        <input type="text" id="mark" name="mark" value="${tfgi.mark}"  placeholder="Nota de la defensa" />
        <input type="submit">Poner nota</input>
        </form>
        </td>
</c:if>
<c:if test="${tfgi.status != 1 and tfgi.status != 4 and tfgi.status != 6}">
        <td></td>
</c:if>
</tr>
</c:forEach>
</table>



<%@ include file="FormLogout.jsp"%>

</body>
</html>