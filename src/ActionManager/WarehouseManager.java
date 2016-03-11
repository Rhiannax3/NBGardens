package ActionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

import com.sun.rowset.CachedRowSetImpl;

import ConnectionManager.OracleConnector;

public class WarehouseManager {
	
	ResultSet resultSet;
	Statement statement;
	CachedRowSet cachedRowSet;

	public void updateOrderLineStatus (Connection connection) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("So you'd like to update the status of an order line, eh?");
		System.out.println("Please enter the product ID:");
		
		int productID = scanner.nextInt();
		
		try {
		
			String queryRead = "SELECT CustomerOrder_orderID FROM CustomerOrderLine WHERE Product_ProductID = " + productID;
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(queryRead);
			 
			 while(resultSet.next()) {
				 int orderID = resultSet.getInt("CustomerOrder_orderID");
					System.out.println("Order ID: " + orderID);
			 }
			
			resultSet.close();
			
		} catch (SQLException exceptionSQL) {
			
			exceptionSQL.printStackTrace();
			System.out.println("SQL Exception!");
			
		}
		
		scanner.close();
		
	}
	
	public static void main (String args[]) {
		OracleConnector oracleConnector = new OracleConnector ();
		Connection connection = oracleConnector.openConnection ("SYSTEM", "password");
		WarehouseManager warehouse = new WarehouseManager ();
		warehouse.updateOrderLineStatus(connection);
		oracleConnector.closeConnection(connection);
	}
	
}
