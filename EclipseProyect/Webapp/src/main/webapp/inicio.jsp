<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	 <form action ="<%=request.getContextPath() %>/inicioController" method="get">
	 <input type="hidden" name="action" value="destroy">
	 <input type="submit" value="logout">
	 
	 </form>
	 
	 
<h1>Eres Premium</h1>
</body>
</html>