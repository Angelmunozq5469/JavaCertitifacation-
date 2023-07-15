package Model;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import entity.user;

public class usermodel {
	
    public List<user> listuser(DataSource dataSource) {
    	
        List<user> listuser = new ArrayList<>();
       
        Connection connect = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
      	  connect = dataSource.getConnection();
      	// 2. Create a SQL statements string
      	  String query = "Select * from User";
      	  stmt = connect.createStatement();
      	  
        	// 3. Execute SQL query
      	  rs = stmt.executeQuery(query);
        	// 4. Process the result set
      	  while(rs.next()) {
      		String email = rs.getString("email");
      		System.out.println(email);
      		listuser.add(new user(rs.getInt("user_ID"), rs.getString("username"), rs.getString("email")));		  
      	  }
      		
      	} catch (SQLException e) {
      		e.printStackTrace();
      	}
		return listuser;
      	
      	
      }
    		

  }

