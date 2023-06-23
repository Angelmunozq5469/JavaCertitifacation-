<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<!--
Funciones del programa
toLowerCase()
toUpperCase()
indexOf()
replace()
substring()
substringBefore()
substringAfter
-->
<br/>${fn:toUpperCase("angel")}
<br/>${fn:toLowerCase("angel")}
<br/>${fn:indexOf("angel","a")}
<br/>${fn:replace("angel","angel","super")}
<br/>${fn:substring("angel", 0, 3)}
<br/>${fn:substringBefore("angel", "g")}
<br/>${fn:substringAfter("angel", "n")}
</body>
</html>

<!--los tags se que se inicializan por fn son tags de funciones por ejemplo:-->
