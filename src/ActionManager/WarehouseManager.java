package ActionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

import ConnectionManager.OracleConnector;

public class WarehouseManager {
	
	ResultSet resultSet;
	Statement statement;
	CachedRowSet cachedRowSet;

	public int selectOrderLineStatus (Connection connection) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("So you'd like to update the status of an order line, eh?");
		System.out.println("Please enter the product ID:");
		
		int productID = scanner.nextInt();
		int i = 1;
		
		try {
			
			String queryRead = "SELECT CustomerOrder_orderID FROM CustomerOrderLine WHERE Product_ProductID = " + productID;
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(queryRead);
			 
			while(resultSet.next()) {
				 
				 	int orderID = resultSet.getInt("CustomerOrder_orderID");
					System.out.println("(" + i + ")   " + orderID);
					i++;
			}
			
			resultSet.close();
			
			System.out.println("Please select the correct order ID:");
			int selectedOrderID = scanner.nextInt();
			System.out.println("Enter the new customer order line status:");
			String selectedStatus = scanner.next();
			String queryUpdate = "UPDATE CustomerOrderLine SET clineStatus = " + selectedStatus + " WHERE Product_ProductID = " + productID + " AND CustomerOrder_orderID = " + selectedOrderID; 
			System.out.println("Status updated!");
			
		} catch (SQLException exceptionSQL) {
			
			exceptionSQL.printStackTrace();
			System.out.println("SQL Exception!");
			
		}
		
		scanner.close();
		
	}
	
	public void updateOrderLineStatus (Connection connection) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("So you'd like to update the status of an order line, eh?");
		System.out.println("Please enter the product ID:");
		
		int productID = scanner.nextInt();
		int i = 1;
		
		try {
			
			String queryRead = "SELECT CustomerOrder_orderID FROM CustomerOrderLine WHERE Product_ProductID = " + productID;
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(queryRead);
			System.out.println("Please select the correct order ID:");
			 
			while(resultSet.next()) {
				 
				 	int orderID = resultSet.getInt("CustomerOrder_orderID");
					System.out.println("(" + i + ")   " + orderID);
					i++;
			}
			
			resultSet.close();
						
		} catch (SQLException exceptionSQL) {
			
			exceptionSQL.printStackTrace();
			System.out.println("SQL Exception!");
			
		}
		
		scanner.close();
		
	}
	
	public static void main (String args[]) {
		
	}
	
}
