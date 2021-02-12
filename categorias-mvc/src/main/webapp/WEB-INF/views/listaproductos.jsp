<%@ page language='java' contentType='text/html'
         isErrorPage='false' isELIgnored='false' %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC JPA - Productos</title>
<link href="<c:url value="/resources/css/styles.css" />"
	rel="stylesheet">
</head>
<body>
>
		<h2>Todos los productos</h2>
		<hr />
		<a href="<c:url value='/'/>">Inicio</a>
	<table>
		<tr>
			<th>Id producto</th>
			<th>Nombre producto</th>
			<th>Detalles producto</th>
		</tr>
		
			<c:forEach var="producto" items="${productos}">

		<tr>
			<td>${producto.idProducto}</td>
			<td>${producto.nombre}</td>
			<td><a href="<c:url value='/productos/${producto.idProducto}'/>">Ver producto</a></td>

		</tr>

	</c:forEach>
	</table>
</body>
</html>