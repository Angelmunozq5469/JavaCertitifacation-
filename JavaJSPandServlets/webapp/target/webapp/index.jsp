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
    Nombre completo: <input type="text" name="name" required/><br><br/>
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
            <br><br/>
            <input type="submit" value="Guardar">
    
</form>

            
</html>

In Java, "Beans" refers to Java objects that are managed by a framework, typically a Java Bean framework such as Spring Framework. Java Beans are POJOs (Plain Old Java Objects) that follow certain conventions, such as having a default constructor, private fields with public getter and setter
 methods (accessors), and implementing Serializable interface, among others. These conventions allow Java Beans to be easily manipulated and integrated with other components in a Java application.