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

