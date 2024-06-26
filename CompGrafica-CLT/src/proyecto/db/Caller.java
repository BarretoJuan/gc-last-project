package proyecto.db;

import java.sql.SQLException;
import java.sql.ResultSet;
import proyecto.utils.Message;

import proyecto.entities.*;
import java.util.ArrayList;

public class Caller {
	private Connect connection;
	
	public Caller() {
		this.connection = new Connect();
	}
	
	public Message loginUser(String username, String passwordHash, boolean admin) throws SQLException {
		int response = 0;
		
		if (admin) {
			response = connection.loginUser("{ ? = CALL login_admin(?, ?) }", username, passwordHash);
		}
		else {
			response = connection.loginUser("{ ? = CALL login_user(?, ?) }", username, passwordHash);
		}
		
		
		System.out.print("\n" + response);
		if (response == -1) {
			return new Message(false, "ERROR INTERNO");
		}
		else if (response == 1 || response == 2) {
			return new Message(false, "El nombre de usuario o la contraseña son incorrectos");
		}
		
		System.out.print("\nExito en la transaccion");
		return new Message(true, "Inicio de sesión satisfactorio");
	}
	
	public Message insertClient(String name, String ci, String passwordHash, String username, String email) throws SQLException {
		int response = connection.insertUser("{ ? = CALL insert_user(?, ?, ?, ?, ?) }", name, ci, passwordHash, username, email);
		
		System.out.print("\n" + response);
		if (response == -1) {
			return new Message(false, "ERROR INTERNO");
		}
		else if (response == 1) {
			return new Message(false, "Otro usuario tiene esa misma cédula");
		}
		else if (response == 2) {
			return new Message(false, "Otro usuario tiene ese mismo correo");
		}
		else if (response == 3) {
			return new Message(false, "Ese nombre de usuario ya está en uso");
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
			return new Message(false, "El cuerpo del reporte no debe estar vacío");
		}
		
		System.out.print("\nExito en la transaccion");
		return new Message(true, "El reporte ha sido enviado satisfactoriamente");
	}
	
	public Message insertAnswer(String body, int adminId, int reportId) throws SQLException {
		int response = connection.insertAnswer("{ ? = CALL insert_answer(?, ?, ?) }", body, adminId, reportId);
		
		System.out.print("\n" + response);
		if (response == -1) {
			return new Message(false, "ERROR INTERNO");
		}
		else if (response == 1) {
			return new Message(false, "El cuerpo de la respuesta no debe estar vacío");
		}
		
		System.out.print("\nExito en la transaccion");
		return new Message(true, "El reporte ha sido respondido satisfactoriamente");
	}
	
	public Message deleteReport(int reportId) throws SQLException {
		int response = connection.deleteReport("{ ? = CALL delete_report(?) }", reportId);
		
		System.out.print("\n" + response);
		if (response == -1) {
			return new Message(false, "ERROR INTERNO");
		}
		else if (response == 1) {
			return new Message(false, "No se puede borrar un reporte que ya ha sido respondido");
		}
		
		System.out.print("\nExito en la transaccion");
		return new Message(true, "El reporte ha sido borrado satisfactoriamente");
	}
	
	public Message modifyUser(String name, String passwordHash, String username, String email, int uid, boolean admin) throws SQLException {
		int response = 0;
		
		if (admin) {
			response = connection.modifyUser("{ ? = CALL modify_admin(?, ?, ?, ?, ?) }", name, passwordHash, username, email, uid);
		}
		else {
			response = connection.modifyUser("{ ? = CALL modify_user(?, ?, ?, ?, ?) }", name, passwordHash, username, email, uid);
		}
		
		System.out.print("\n" + response);
		if (response == -1) {
			return new Message(false, "ERROR INTERNO");
		}
		else if (response == 1) {
			return new Message(false, "Otro usuario tiene ese mismo correo");
		}
		else if (response == 2) {
			return new Message(false, "Ese nombre de usuario ya esta en uso");
		}
		
		System.out.print("\nExito en la transaccion");
		return new Message(true, "El usuario ha sido modificado satisfactoriamente");
	}
	
	public ArrayList<Report> getUserReports(int userId) {
		ArrayList<Report> reports = new ArrayList<Report>();
		ResultSet result = null;
		result = connection.getUserReports(userId);
		
		try {
			while (result.next()) {
				reports.add(new Report(
					result.getInt(1), 
					result.getString(2), 
					result.getInt(3), 
					result.getString(4), 
					result.getString(5),
					result.getString(6),
					result.getInt(7),
					result.getInt(8)
				));
			}
		}
		catch (SQLException e) {
			System.err.print("ERROR RECUPERANDO LA INFORMACION");
			e.printStackTrace();
		}
		
		return reports;
	}
	
	
	public ArrayList<Report> getUserReports() {
		ArrayList<Report> reports = new ArrayList<Report>();
		ResultSet result = null;
		result = connection.getAllReports();
		
		try {
			while (result.next()) {
				reports.add(new Report(
					result.getInt(1), 
					result.getString(2), 
					result.getInt(3), 
					result.getString(4), 
					result.getString(5),
					result.getString(6),
					result.getInt(7),
					result.getInt(8)
				));
			}
		}
		catch (SQLException e) {
			System.err.print("ERROR RECUPERANDO LA INFORMACION");
			e.printStackTrace();
		}
		System.out.print(reports);
		
		return reports;
	}
	
	public User getUser(String username, boolean admin) throws SQLException {
		User user = null;
		ResultSet result = connection.getUser(username, admin);
		
		try {
			while (result.next()) {
				user = new User(
						result.getInt(1), 
						result.getString(2), 
						result.getString(3), 
						result.getString(4), 
						result.getString(5),
						result.getString(6)
				);
			}
		}
		catch(SQLException e) {
			System.err.print("ERROR RECUPERANDO LA INFORMACION");
			e.printStackTrace();
		}
		
		System.out.print(user.getUsername());
		return user;
	}
	
	public DetailedReport getDetailedReport(int reportId) {
		DetailedReport detailedReport = null;
		ResultSet result = null;
		result = connection.getDetailedReport(reportId);
		
		try {
			while (result.next()) {
				detailedReport = new DetailedReport(
						result.getInt(1), 
						result.getInt(2), 
						result.getString(3), 
						result.getString(4), 
						result.getString(5),
						result.getString(6),
						result.getString(7), 
						result.getString(8),
						result.getString(9),
						result.getString(10)
				);
			}
		}
		catch(SQLException e) {
			System.err.print("ERROR RECUPERANDO LA INFORMACION");
			e.printStackTrace();
		}
		System.out.print(detailedReport.getReportAuthor());
		return detailedReport;
	}
	
	public void endConnection() throws SQLException {
		connection.closeConnection();
	}
}
