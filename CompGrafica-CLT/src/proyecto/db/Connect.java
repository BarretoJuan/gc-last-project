package proyecto.db;

import proyecto.utils.Message;
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
	
	public Message insertUser(String query) throws SQLException {
		CallableStatement statement;
		try {
			 statement = handler.prepareCall(query);
			 // prepara el valor de retorno, expecificando que sera de tipo entero
			 statement.registerOutParameter(1, Types.INTEGER);
			// prepara el primer parametro, especificando que sera de tipo entero y dandole el valor 0
			 statement.setInt(2, 0);
			 
			 
		}
		catch (SQLException e) { 
			System.err.print("ERROR PREPARANDO LA SENTENCIA");
			return new Message(false, "ERROR INTERNO");
		}
		
		
		try {
			statement.execute();
		}
		catch (SQLException e) {
			System.err.print("ERROR EJECUTANDO EL PROCEDIMIENTO");
			return new Message(false, "ERROR INTERNO");
		}
		
		int response = 0;
		try {
			// retira el valor de retorno, al solo haber uno se accede a la primera posicion
			response = statement.getInt(1);
		} catch (SQLException e) {
			System.err.print("ERROR OBTENIENDO EL VALOR DE RETORNO");
			return new Message(false, "ERROR INTERNO");
		}
		
		if (response == 1) {
			return new Message(false, "Otro usuario tiene esa misma cedula");
		}
		else if (response == 2) {
			return new Message(false, "Otro usuario tiene ese mismo correo");
		}
		else if (response == 3) {
			return new Message(false, "Ese nombre de usuario ya esta en uso");
		}
		
		statement.close();
		return new Message(true, "El usuario ha sido registrado exitosamente");
	}
	
	public void closeConnection() throws SQLException {
		handler.close();
	}
}
