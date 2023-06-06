<html>
<body>
<h2>Index</h2>

</body>
Este es el Index <br/>
<br>
<br/>
<a href="<%=request.getContextPath() %>/ControLLer?page=Login">Login</a><br/>
<a href="<%=request.getContextPath() %>/ControLLer?page=signUp">Entrar</a><br/>
<a href="<%=request.getContextPath() %>/ControLLer?page=Index">Inicio</a><br/>
<br>
<br/>
<form action="submit.jsp" method="get">
    Nombre completo: <input type="text" name="name"/><br><br/>
    Genero: <input type="radio" genero="genero" value="Hombre"/>Hombre 
    <input type="radio" genero="genero" value="Mujer"/>Mujer<br><br/>
            
</html>
