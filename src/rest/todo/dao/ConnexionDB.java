package rest.todo.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class ConnexionDB {
	static final String DB_URL = "jdbc:mysql://localhost/projetarchi";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "SELECT id, first, last, age FROM Registration";
  public static Connection getDBConnection() {
     Connection conn;
     try {
         conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
         return(conn);
     } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
         return(null);
     }
    }
  

    public static void main(String[] args) {
       // Open a connection
       try {
          Statement stmt = getDBConnection().createStatement();

          ResultSet rs = stmt.executeQuery(QUERY);
          // Extract data from result set
          while (rs.next()) {
             // Retrieve by column name
             System.out.print("ID: " + rs.getString("ID"));
          }
       } catch (SQLException e) {
           e.getMessage();
          e.printStackTrace();
       } 
    }
}
