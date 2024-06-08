package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	
	public static Connection createConnection() {
		Connection conn = null;
		try {
			String url = "jdbc:mysql://localhost:3306/testing";
			String userName = "root";
			String password = "admin";
			
			//connection establish
			conn = DriverManager.getConnection(url, userName, password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}

}
