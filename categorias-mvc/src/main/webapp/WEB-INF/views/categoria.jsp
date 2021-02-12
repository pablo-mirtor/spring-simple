<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored='false'%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/styles.css" />"
	rel="stylesheet">
</head>
<body>
	<h1>Categoria ${categoria.idCategoria} </h1>
	<a href="<c:url value='/'/>">Inicio</a>
	<table>
		<tr>
			<th>Id producto</th>
			<th>Nombre producto</th>
			<th>Unidades</th>
			<th>Precio</th>
			<th>Detalles producto</th>
		</tr>
		
			<c:forEach var="producto" items="${categoria.productos}">

		<tr>
			<td>${producto.idProducto}</td>
			<td>${producto.nombre}</td>
			<td>${producto.unidades}</td>
			<td>${producto.precio}</td>
			<td><a href="<c:url value='/productos/${producto.idProducto}'/>">Ver producto</a></td>
			
		</tr>

	</c:forEach>
	</table>

</body>
</html>