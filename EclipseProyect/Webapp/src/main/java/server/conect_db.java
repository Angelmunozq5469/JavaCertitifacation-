package server;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/conect_db")
public class conect_db extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Resource(name="jdbc/project")
    private DataSource dataSource;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Use the dataSource object to establish a connection with the database
        // 1. inicializar objetos de inicio
    	// 2. Create a SQL statements string
    	// 3. Execute SQL query
    	// 4. Process the result set
    }
}
