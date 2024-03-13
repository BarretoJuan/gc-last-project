package proyecto.db;

import java.sql.SQLException;
import proyecto.utils.Message;

public class Caller {
	private Connect connection;
	
	public Caller() {
		this.connection = new Connect();
	}
	
	public Message InsertClient(String name, String ci, String passwordHash, String username, String email) throws SQLException {
		int response = connection.insertUser("{ ? = CALL insert_user(?, ?, ?, ?, ?) }", name, ci, passwordHash, username, email);
		
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
		System.out.print("\n" + response);
		System.out.print("\nExito en la transaccion");
		return new Message(true, "El usuario ha sido registrado exitosamente");
	}
	
	public void endConnection() throws SQLException {
		connection.closeConnection();
	}
}
