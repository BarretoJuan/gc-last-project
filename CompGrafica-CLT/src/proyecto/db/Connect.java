package proyecto.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

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
	
	public boolean insertUser(String query) throws SQLException {
		CallableStatement statement;
		try {
			 statement = handler.prepareCall(query);
			 statement.setInt(2, 0);
			 statement.registerOutParameter(1, Types.INTEGER);
			 
		}
		catch (SQLException e) { 
			System.err.print("ERROR PREPARANDO LA SENTENCIA");
			return false;
		}
		
		
		try {
			statement.execute();
		}
		catch (SQLException e) {
			System.err.print("ERROR EJECUTANDO EL PROCEDIMIENTO");
			return false;
		}
		
		int response = 0;
		try {
			response = statement.getInt(1);
		} catch (SQLException e) {
			System.err.print("ERROR OBTENIENDO EL VALOR DE RETORNO");
			return false;
		}
		
		if (response != 0) {
			System.err.print("el resultado no es cero");
			return false;
		}
		
		statement.close();
		return true;
		}
	
	public void closeConnection() throws SQLException {
		handler.close();
	}
}
