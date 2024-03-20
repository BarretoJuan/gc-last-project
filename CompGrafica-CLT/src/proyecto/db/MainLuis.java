package proyecto.db;

import java.sql.SQLException;

public class MainLuis {
	
	public static void main(String[] args) throws SQLException {
		// AMO JAVA
		Caller caller = new Caller();
		caller.loginUser("Mel", "19190608", false);
		caller.endConnection();
	}
	

}
