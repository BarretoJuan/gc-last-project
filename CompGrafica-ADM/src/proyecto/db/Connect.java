package proyecto.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;



public class Connect {
	Connection handler;
	String DB = "cargomara";
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
	
	public int executeCallableStatement(CallableStatement statement) {
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
		} 
		catch (SQLException e) {
			System.err.print("ERROR OBTENIENDO EL VALOR DE RETORNO");
			return -1;
		}
		
		try {
			statement.close();
		} 
		catch (SQLException e) {
			System.err.print("ERROR CERRANDO EL PROCEDIMIENTO");
		}
		return response;
	}

	public int loginUser(String query, String username, String passwordHash) throws SQLException {
		CallableStatement statement;
		try {
			 statement = handler.prepareCall(query);
			 // prepares the return value, specifying that it'll be an int
			 statement.registerOutParameter(1, Types.INTEGER);
			// prepares the first parameter, specifying that it will be an int and gives 0 as its value
			 statement.setString(2, passwordHash);
			 statement.setString(3, username);
		} 
		catch (SQLException e) { 
			System.err.print("ERROR PREPARANDO LA SENTENCIA");
			return -1;
		}
		
		int response = executeCallableStatement(statement);
		
		statement.close();
		return response;
	}
	
	public int insertUser(
		String query, String name, String ci, String passwordHash, String username, String email
	) 
	throws SQLException {
		CallableStatement statement;
		try {
			 statement = handler.prepareCall(query);
			 // prepares the return value, specifying that it'll be an int
			 statement.registerOutParameter(1, Types.INTEGER);
			// prepares the first parameter, specifying that it will be an int and gives 0 as its value
			 statement.setString(2, name);
			 statement.setString(3, ci);
			 statement.setString(4, passwordHash);
			 statement.setString(5, username);
			 statement.setString(6, email);
		} 
		catch (SQLException e) { 
			System.err.print("ERROR PREPARANDO LA SENTENCIA");
			return -1;
		}
		
		int response = executeCallableStatement(statement);
		
		statement.close();
		return response;
	}
	
	public int insertReport(
		String query, int type, String title, String body, String cellphone, int userId
	)
	throws SQLException {	
		CallableStatement statement;
		try {
			 statement = handler.prepareCall(query);
			 // prepares the return value, specifying that it'll be an int
			 statement.registerOutParameter(1, Types.INTEGER);
			// prepares the parameters
			 statement.setInt(2, type);
			 statement.setString(3, title);
			 statement.setString(4, body);
			 statement.setString(5, cellphone);
			 statement.setInt(6, userId);
		} 
		catch (SQLException e) { 
			System.err.print("ERROR PREPARANDO LA SENTENCIA");
			return -1;
		}
		
		int response = executeCallableStatement(statement);
		
		statement.close();
		return response;
	}
	
	public int insertAnswer(String query, String body, int adminId, int reportId) throws SQLException {
		CallableStatement statement;
		try {
			 statement = handler.prepareCall(query);
			 // prepares the return value, specifying that it'll be an int
			 statement.registerOutParameter(1, Types.INTEGER);
			// prepares the parameters
			 statement.setString(2, body);
			 statement.setInt(3, reportId);
			 statement.setInt(4, adminId);
		} 
		catch (SQLException e) { 
			System.err.print("ERROR PREPARANDO LA SENTENCIA");
			e.printStackTrace();
			return -1;
		}
		
		int response = executeCallableStatement(statement);
		statement.close();
		
		return response;
	}
	
	public int deleteReport(String query, int reportId) throws SQLException {
		CallableStatement statement;
		try {
			 statement = handler.prepareCall(query);
			 // prepares the return value, specifying that it'll be an int
			 statement.registerOutParameter(1, Types.INTEGER);
			// prepares the parameters
			 statement.setInt(2, reportId);
		} 
		catch (SQLException e) { 
			System.err.print("ERROR PREPARANDO LA SENTENCIA");
			return -1;
		}
		
		int response = executeCallableStatement(statement);
		statement.close();
		
		return response;
	}
	
	public int modifyUser(String query, String name, String passwordHash, String username, String email, int uid) throws SQLException {
		CallableStatement statement;
		try {
			 statement = handler.prepareCall(query);
			 // prepares the return value, specifying that it'll be an int
			 statement.registerOutParameter(1, Types.INTEGER);
			// prepares the first parameter, specifying that it will be an int and gives 0 as its value
			 statement.setString(2, name);
                         statement.setString(3, passwordHash);
			 statement.setString(4, username);
			 statement.setString(5, email);
                         statement.setInt(6, uid);
		} 
		catch (SQLException e) { 
			System.err.print("ERROR PREPARANDO LA SENTENCIA");
			e.printStackTrace();
			return -1;
		}
		
		int response = executeCallableStatement(statement);
		
		statement.close();
		return response;
	}
	
	public ResultSet getUserReports(int userId) {
		PreparedStatement statement;
		ResultSet result = null;
		try {
			statement = handler.prepareStatement("select * from reports where user_id = ?");
			statement.setInt(1, userId);
		}
		catch (SQLException e) {
			System.err.print("ERROR PREPARANDO LA SENTENCIA");
			e.printStackTrace();
			return result;
		}
		
		try {
			result = statement.executeQuery();
			return result;
		}
		catch (SQLException e) {
			System.err.print("ERROR EJECUTANDO LA SENTENCIA");
			return result;
		}
	}
	
	public ResultSet getAllReports() {
		PreparedStatement statement;
		ResultSet result = null;
		try {
			statement = handler.prepareStatement("select * from reports where status_rep = 0");
		}
		catch (SQLException e) {
			System.err.print("ERROR PREPARANDO LA SENTENCIA");
			e.printStackTrace();
			return result;
		}
		
		try {
			result = statement.executeQuery();
			return result;
		}
		catch (SQLException e) {
			System.err.print("ERROR EJECUTANDO LA SENTENCIA");
			return result;
		}
	}
	
	public ResultSet getUser(String username, boolean admin) {
		PreparedStatement statement;
		ResultSet result = null;
		try {
			if (admin) {
				statement = handler.prepareStatement("select id, name, ci, password_hash, username, email from admin where username = ?");
			}
			else {
				statement = handler.prepareStatement("select * from users where username = ?");
			}
			statement.setString(1, username);
		}
		catch (SQLException e) {
			System.err.print("ERROR PREPARANDO LA SENTENCIA");
			e.printStackTrace();
			return result;
		}
		
		try {
			result = statement.executeQuery();
			return result;
		}
		catch (SQLException e) {
			System.err.print("ERROR EJECUTANDO LA SENTENCIA");
			return result;
		}
	}
	
	public ResultSet getDetailedReport(int reportId) {
		PreparedStatement statement;
		ResultSet result = null;
		try {
			statement = handler.prepareStatement(
				"select "
				+ "r.id, r.type, r.contact_phone, r.title, r.timestamp, u.name, r.body_text, a.body_text, ad.name, a.timestamp "
				+ "from users u left outer join reports r on u.id = r.user_id left outer join answers a on r.id = a.report_id left outer join admin ad on ad.id = a.admin_id "
				+ "where r.id = ?"
			);
			statement.setInt(1, reportId);
		}
		catch (SQLException e) {
			System.err.print("ERROR PREPARANDO LA SENTENCIA");
			e.printStackTrace();
			return result;
		}
		
		try {
			result = statement.executeQuery();
			return result;
		}
		catch (SQLException e) {
			System.err.print("ERROR EJECUTANDO LA SENTENCIA");
			return result;
		}
	}
	
	public void closeConnection() throws SQLException {
		handler.close();
	}
}
