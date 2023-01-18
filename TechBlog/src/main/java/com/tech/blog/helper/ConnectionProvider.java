package com.tech.blog.helper;
import java.sql.*;

public class ConnectionProvider {

	private static Connection con;
	public static Connection getConnection() {
		try {
			
			if(con == null) {
				//driver class load
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//create a connection
				String user = "root";
				String password = "minal";
				String url = "jdbc:mysql://localhost:3306/techblog";
				
				con = DriverManager.getConnection(url,user,password);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}

}
