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
	
	<a href="<c:url value='/'/>">Inicio</a>
	<h1>Detalles del producto: ${producto.nombre} </h1>
		<ul>
			<li>Id del producto: ${producto.idProducto}</li>
			<li>Nombre del producto: ${producto.nombre}</li>
			<li>Unidades disponibles: ${producto.unidades}</li>
			<li>Precio: ${producto.precio}</li>
			<li>Categoría producto: ${producto.categoria.nombre} <a href="<c:url value='/categoria/${producto.categoria.idCategoria}'/>">Ver categoria</a></li>
		</ul>
</body>
</html>