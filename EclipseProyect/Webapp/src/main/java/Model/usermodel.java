package Model;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.cj.xdevapi.PreparableStatement;

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
    		


//Aca puedo agg otra funcion en cuanto al manejo de esta data que haga algo similar con otro query

	public boolean adduser(DataSource dataSource, user newuser) {
		Connection connect = null;
        PreparableStatement stmtready = null;
        try {
        	connect = dataSource.getConnection();
        	String username = newuser.getUsername();
        	String email = newuser.getEmail();
        	String query = "insert into User (username,email) values(?,?)"; //en caso tal de que se quiera hacer un update
        	//del usuario es similar pero el query cambia
        	stmtready = (PreparableStatement) connect.prepareStatement(query);
        	return (boolean) stmtready.execute();
        	
        	
        }catch (SQLException e) {
      		e.printStackTrace();
      		return false;
        }

		}
	
	}

