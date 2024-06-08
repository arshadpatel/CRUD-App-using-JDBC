package myPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Operations {
	
//	method is static because we have to call this methods using class name as Operations.create(param) if
//	not static then we have to create the object of Operations class and then call the method using object
	public static void create(Table t) throws SQLException{
		Connection conn = Database.createConnection();
		
		String query = Query.getInsert();
		
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setInt(1, t.id);
		stmt.setString(2, t.name);
		stmt.setString(3, t.email);
		
		stmt.executeUpdate();
		stmt.close();
		conn.close();
	}
	
	public static ArrayList<Table> read() throws SQLException {
		ArrayList<Table> res = new ArrayList<Table>();
		Connection conn = Database.createConnection();
		
		String query = Query.getSelect();
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			res.add(new Table(rs.getInt(1), rs.getString(2), rs.getString(3)));
		}
		rs.close();
		stmt.close();
		conn.close();
		return res;
	}
	
	public static void update(Table t) throws SQLException {
		Connection conn  = Database.createConnection();
		
		String query = Query.getUpdate();
		
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setString(1, t.name);
		stmt.setString(2, t.email);
		stmt.setInt(3, t.id);
		
		stmt.executeUpdate();
		stmt.close();
		conn.close();
	}
	
	public static void delete(int id) throws SQLException {
		Connection conn = Database.createConnection();
		
		String query = Query.getDelete();
		
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setInt(1, id);
		
		stmt.executeUpdate();
		stmt.close();
		conn.close();
	}
}
