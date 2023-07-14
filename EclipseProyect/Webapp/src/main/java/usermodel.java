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
            // Create a SQL statements string
            String query = "SELECT * FROM User";
            stmt = connect.createStatement();
            
            // Execute SQL query
            rs = stmt.executeQuery(query);
            
            // Process the result set
            while (rs.next()) {
                listuser.add(new user(rs.getInt("user_ID"), rs.getString("username"), rs.getString("email")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            try {
                if (rs != null) {
                    rs.close();
                }
                
                if (stmt != null) {
                    stmt.close();
                }
                
                if (connect != null) {
                    connect.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return listuser;
    }
}
