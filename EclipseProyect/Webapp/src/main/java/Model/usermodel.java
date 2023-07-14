package Model;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class usermodel {
	public List <user>listuser() {
		PrintWriter out = response.getWriter();
    	Connection connect = null;
    	Statement stmt = null;
    	ResultSet rs = null;
    	try {
    	  connect = dataSource.getConnection();
    	// 2. Create a SQL statements string
    	  String query = "Select * from User";
    	  stmt = (Statement) connect.createStatement();
    	  
      	// 3. Execute SQL query
    	  rs = ((java.sql.Statement) stmt).executeQuery(query);
      	// 4. Process the result set
    	  while(rs.next()) {
    		  out.print(rs.getString("email"));    		  
    	  }
    		
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
	}
}
