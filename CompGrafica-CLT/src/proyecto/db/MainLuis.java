package proyecto.db;

import java.sql.SQLException;

public class MainLuis {
	
	public static void main(String[] args) throws SQLException {
		// AMO JAVA
		Caller caller = new Caller();
		caller.insertClient("Luis Garrillo", "10448405", "hola", "lgg", "email@gmail.com");
		caller.endConnection();
	}
	

}
