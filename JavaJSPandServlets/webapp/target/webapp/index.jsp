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
    Lenguages: <input type="checkbox" lenguage="lenguage" value="Frances"/>Frances
    <input type="checkbox" lenguage="lenguage" value="Ingles"/>Ingles
    <input type="checkbox" lenguage="lenguage" value="Aleman"/>Aleman<br><br/>
    Ciudades: <select name="Ciudades">
            <option value="Pereira">Colombia</option>
            <option value="New York">New York</option>
            <option value="Medellin">Medellin</option>
            </select><br/>
            <input type="submit" value="Submit">
    
</form>

            
</html>
