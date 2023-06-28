<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<c:set var="elements" value="${fn:split('www.angel.org','.')}"/>
<c:forEach var="element" items="${elements}">
	Element: ${element}<br/>
</c:forEach>>
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

<!-- Tambien tenemos tags para manipular archivos xml con estos segun la libreria que elijamos que estan
en la pagina oficial de JSP podemos agg, parse de data como la necesitemos hace bucles para recorrer el documento
y la informacion necesaria y darle condicionales a esa informacion con la finalidad de generar tablas  -->

###HORARIOS SEGUN EL IDIOMA

<!-- EN LA PAGINA WEB SE PUEDE DAR CIERTOS IDENTIFICADORES PARA CADA PAIS ESTO NOS FAVORECE PARA CAMBIAR EL IDIOMA
CLARO ESTA QUE SE DEBE DE HACER DESDE UNA CLASE DANDO PROPIEDADES CON LOS LABELS POR EJEMPLON LABER.NOMBRE = NOMBRE
EN INGLES LABER.NOMBRE = NAME Y ASI ASIGNAMOS PROPIEDADES -->

#####Crear mi propio tag
<!-- Podemos crear nuestro propio tag para llamar funciones desde una clase que estemos indicando para desarrollar
 -->
 
 <!-- A servlet is a Java-based component that runs on a web server and processes incoming requests and generates responses. It is part of the Java Servlet API, which provides a framework for building web applications in Java.

Servlets are commonly used to handle dynamic web content, such as generating HTML pages, processing form data, interacting with databases, and more. They are the foundation of Java-based web applications and play a crucial 
role in the Java EE (Enterprise Edition) platform.

Servlets follow a lifecycle defined by the Servlet API, which includes methods such 
as init(), service(), and destroy(). The init() method is called when the servlet is 
initialized, the service() method handles the request and generates the response, and the 
destroy() method is called when the servlet is about to be removed from service.

Servlets can receive different types of HTTP requests, such as GET, POST, PUT, DELETE, etc., 
and can access request parameters, headers, and other information. They can also use the Servlet API to 
interact with the web server, such as forwarding requests to other servlets or sending HTTP responses.

Servlets provide a powerful and flexible way to develop web applications in Java, allowing developers to create dynamic and interactive
 web pages. They are widely used in various Java-based web frameworks and technologies, such as JavaServer Pages 
 (JSP), JavaServer Faces (JSF), Spring MVC, and more. -->
 ######Creacion de DataBase
 <!-- 
 La creacion de la DB fue en MySQL Workbench la cual se creo una db llamada java_db con una tabla user con un campo "userid" el cual tiene un auto incremento
 y es Primary Key -->>
 
 Table: new_table

Columns:
user_id
int AI PK
Username
varchar(45)
Email
varchar(45)
 
 
 
 
 
 
 
 
 
 