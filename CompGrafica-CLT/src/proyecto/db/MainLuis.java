package proyecto.db;

import java.sql.SQLException;

public class MainLuis {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connect connection = new Connect();
		connection.insertUser("{ ? = CALL testSP(?) }");
	}
	

}
