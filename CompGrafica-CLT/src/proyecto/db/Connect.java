package proyecto.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class Connect {
	Connection handler;
	String DB = "testing";
	String URL = "jdbc:mysql://localhost/" + DB;
	String USER = "root";
	String PASSWORD = "";
	
	public Connect() {
		try {
			   Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch(ClassNotFoundException ex) {
			   System.err.println("Error: unable to load driver class!");
			   System.exit(1);
			}
		try {
			this.handler = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.print("Connections stablished");
		}
		catch (Exception e) {
			System.err.println("Error: unable to connect to db!");
			   System.exit(1);
		}
	}
	public void testQuery() throws SQLException {
		PreparedStatement statement;
		statement = handler.prepareStatement("Select * from testTable");
	}
	
	public void closeConnection() throws SQLException {
		handler.close();
	}
}
