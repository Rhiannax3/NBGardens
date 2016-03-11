package ConnectionManager;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

public class OracleConnector {

	protected String username = "SYSTEM";
	protected String password = "password";
	
	public void jdbcTest() {

		System.out.println("-------- Oracle JDBC Connection Testing ------");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
		}
		System.out.println("Oracle JDBC Driver Registered!");
	}

	public Connection openConnection(String username, String password) {
		Connection connection = null;
		
		String url 		= "jdbc:oracle:thin:@localhost:1521/xe";
		
		try {
			connection = DriverManager.getConnection(url, username, password);
			
		} catch (SQLException exceptionSQL) {
			System.out.println("Failure!");
			exceptionSQL.printStackTrace();
			
		}

		if (connection != null) {
			System.out.println("Success! Connected!");
			
		} else {
			System.out.println("Failure!");
			
		}
		
		return connection;
		
	}
	
	
/*	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String username = "SYSTEM";
		String password = "password";
		Connection connection = null;
		
		try {
			OracleDataSource dataSource = new OracleDataSource();
			
	}
	
*/	
	

	public void closeConnection(Connection connection) {
	//	Connection connection = null;
		try {
			connection.close();
			System.out.println("Connection closed!");
			
		} catch (SQLException exceptionSQL) {
			exceptionSQL.printStackTrace();
			
		}
		
	}
	
	public static void main (String args[]) {
		OracleConnector oracleConnection = new OracleConnector ();
		Connection connection = oracleConnection.openConnection ("SYSTEM", "password");
		oracleConnection.closeConnection(connection);
	}
	
}
