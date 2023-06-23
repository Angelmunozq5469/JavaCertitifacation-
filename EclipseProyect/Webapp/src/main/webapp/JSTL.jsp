<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix = "c" uri= "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL DEMO</title>
</head>
<body>
<jsp:useBean id = "User" class="server.user" scope="page"></jsp:useBean>
${User.lastname}
${User.getLastname()}
<c:out value="${User.getFirstname()}"></c:out>
<c:set var="ojo" value="Ojito"></c:set>
<c:out value="${ojo}"></c:out>

</body>
</html>

//en este caso para JSTL TAG SE y JSP with Servlet se pueden hacer ciclos loop y Condicionales para esto 
//tenemos que saber que es un lenguage muy interpretativo por ejemplo para hacer las condiciones las hago "When"
"otherwise", "choose" and "if" por otro lado me gustaria esta los loop que funcionan por "variable", "inicio" y "terminacion"

