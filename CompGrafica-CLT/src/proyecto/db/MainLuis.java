package proyecto.db;

import java.sql.SQLException;

public class MainLuis {
	
	public static void main(String[] args) throws SQLException {
		// AMO JAVA
		Caller caller = new Caller();
		caller.insertReport(0, "titulo 2", "", "04246246432", 1);
		caller.endConnection();
	}
	

}
