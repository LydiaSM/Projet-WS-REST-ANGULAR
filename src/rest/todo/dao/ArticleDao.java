package rest.todo.dao;

import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import com.mysql.jdbc.Connection;


import rest.todo.model.Article;

public class ArticleDao {
	
	ConnexionDB  c = new ConnexionDB();
	
	
	//Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/projetarchi","root","");
	 
	
	
	 public ArrayList<Article> getListArticle() throws SQLException{
		 ArrayList<Article> list = new  ArrayList<Article>();
		 Statement statement = (Statement) c.getDBConnection();
         ResultSet rs = statement.executeQuery("SELECT * FROM ARTICLE ");
         
		statement.close();
		 
		 //comment créer sql avec jdbc
		 return list; 
	 }
	 
}
