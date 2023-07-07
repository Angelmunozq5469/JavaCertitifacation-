package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.mysql.cj.xdevapi.Statement;

@WebServlet("/conect_db")
public class conect_db extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Resource(name="jdbc/project")
    private DataSource dataSource;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Use the dataSource object to establish a connection with the database
        // 1. inicializar objetos de inicio
    	PrintWriter out = response.getWriter();
    	Connection connect = null;
    	Statement stmt = null;
    	ResultSet rs = null;
    	try {
    	  connect = dataSource.getConnection();
    	// 2. Create a SQL statements string
    	  String query = "Select * from users";
    	  stmt = (Statement) connect.createStatement();
    	  
      	// 3. Execute SQL query
    	  rs = ((java.sql.Statement) stmt).executeQuery(query);
      	// 4. Process the result set
    	  while(rs.next()) {
    		  out.print("<br/>" + rs.getString("email"));    		  
    	  }
    		
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	
    	
    }
}
