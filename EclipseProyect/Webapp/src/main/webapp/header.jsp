<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="include/header.jsp"><c:param name="title" value="Demo Page"/></c:import>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <%
	 	String username = null, sessionID = null;
	 	if(request.getSession().getAttribute("username") == null){
	 		response.sendRedirect("login.jsp");
	 		
	 	}else{
	 		username = request.getSession().getAttribute("username").toString();
	 		sessionID = request.getSession().getId();
	 	}
	 %>
	 Username:
	 <%=username%><br /> Current session:
	 <%=sessionID%><br /> memberArea:
	 <form action ="<%=request.getContextPath() %>/inicioController" method="get">
	 <input type="hidden" name="action" value="destroy">
	 <input type="submit" value="logout">
	 
	 </form>
	 
	 
<h1>Eres Premium</h1>
</body>
</html>
<c:import url="include/footer.jsp"></c:import>