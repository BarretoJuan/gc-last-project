package proyecto.db;

import java.sql.SQLException;
import proyecto.utils.Message;

public class Caller {
	private Connect connection;
	
	public Caller() {
		this.connection = new Connect();
	}
	
	public Message loginUser(String username, String passwordHash) throws SQLException {
		int response = connection.loginUser("{ ? = CALL login_user(?, ?) }", username, passwordHash);
		
		System.out.print("\n" + response);
		if (response == -1) {
			return new Message(false, "ERROR INTERNO");
		}
		else if (response == 1) {
			return new Message(false, "El nombre de usuario ingresado no corresponde a ninguna cuenta");
		}
		else if (response == 2) {
			return new Message(false, "Contraseña incorrecta");
		}
		
		System.out.print("\nExito en la transaccion");
		return new Message(true, "Inicio de sesion satisfactorio");
	}
	
	public Message insertClient(String name, String ci, String passwordHash, String username, String email) throws SQLException {
		int response = connection.insertUser("{ ? = CALL insert_user(?, ?, ?, ?, ?) }", name, ci, passwordHash, username, email);
		
		System.out.print("\n" + response);
		if (response == -1) {
			return new Message(false, "ERROR INTERNO");
		}
		else if (response == 1) {
			return new Message(false, "Otro usuario tiene esa misma cedula");
		}
		else if (response == 2) {
			return new Message(false, "Otro usuario tiene ese mismo correo");
		}
		else if (response == 3) {
			return new Message(false, "Ese nombre de usuario ya esta en uso");
		}
		
		System.out.print("\nExito en la transaccion");
		return new Message(true, "El usuario ha sido registrado satisfactoriamente");
	}
	
	public Message insertReport(int type, String title, String body, String cellphone, int userId) throws SQLException {
		int response = connection.insertReport("{ ? = CALL insert_report(?, ?, ?, ?, ?) }", type, title, body, cellphone, userId);
		
		System.out.print("\n" + response);
		if (response == -1) {
			return new Message(false, "ERROR INTERNO");
		}
		else if (response == 1) {
			return new Message(false, "El cuerpo del reporte no debe estar vacio");
		}
		
		System.out.print("\nExito en la transaccion");
		return new Message(true, "El reporte ha sido enviado satisfactoriamente");
	}
	
	public Message insertAnswer(String body, int adminId, int userId) throws SQLException {
		int response = connection.insertAnswer("{ ? = CALL insert_answer(?, ?, ?)", body, adminId, userId);
		
		System.out.print("\n" + response);
		if (response == -1) {
			return new Message(false, "ERROR INTERNO");
		}
		else if (response == 1) {
			return new Message(false, "El cuerpo de la respouesta no debe estar vacio");
		}
		
		System.out.print("\nExito en la transaccion");
		return new Message(true, "El reporte ha sido respondido satisfactoriamente");
	}
	
	public Message deleteReport(int reportId) throws SQLException {
		int response = connection.deleteReport("{ ? = CALL delete_report(?)", reportId);
		
		System.out.print("\n" + response);
		if (response == -1) {
			return new Message(false, "ERROR INTERNO");
		}
		else if (response == 1) {
			return new Message(false, "No se puede borrar un reporte que ya ha sido respondido");
		}
		
		System.out.print("\nExito en la transaccion");
		return new Message(true, "El reporte ha sido respondido satisfactoriamente");
	}
	
	public void endConnection() throws SQLException {
		connection.closeConnection();
	}
}
