package proyecto.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
	
	public int insertUser(String query) throws SQLException {
		CallableStatement statement;
		try {
			 statement = handler.prepareCall(query);
			 // prepares the return value, specifying that it'll be an int
			 statement.registerOutParameter(1, Types.INTEGER);
			// prepares the first parameter, specifying that it will be an int and gives 0 as its value
			 statement.setInt(2, 0); 
		}
		catch (SQLException e) { 
			System.err.print("ERROR PREPARANDO LA SENTENCIA");
			return -1;
		}
		
		try {
			statement.execute();
		}
		catch (SQLException e) {
			System.err.print("ERROR EJECUTANDO EL PROCEDIMIENTO");
			return -1;
		}
		
		int response = 0;
		try {
			// retrieves the return value
			response = statement.getInt(1);
		} catch (SQLException e) {
			System.err.print("ERROR OBTENIENDO EL VALOR DE RETORNO");
			return -1;
		}
		
		statement.close();
		return response;
	}
	
	public void closeConnection() throws SQLException {
		handler.close();
	}
}
