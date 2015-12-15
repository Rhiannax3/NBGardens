package InventoryManagement;

import Products.Item;
import Orders.Order;
import Workers.EmployeeManagement;
import java.util.*;

public class WarehouseWingman {
	
	int i;
		
	public WarehouseWingman () {
			
	}
	
	public void assignEmployees (Item item) {
		EmployeeManagement manager = new EmployeeManagement ();
		manager.createEmployeeList ();
		
		for (int i = 0; i < 2; i++) {
			if (item.getForklift() == manager.employeeList.get(i).getForklift()) {
				item.setAssignedEmployee (manager.employeeList.get(i));
			}
		}
	}
	
	public static void main (String args[]) {
		Item turquoiseGnome 	= new Item ("Turquoise Gnome", false, true);
		Item sapphireGnome 		= new Item ("Sapphire Gnome", true, true);
		Item rubyGnome 			= new Item ("Ruby Gnome", true, false);
		Item extraGnome			= new Item ("Extra Turquoise Gnome", true, false);
		WarehouseWingman wing 	= new WarehouseWingman ();
		
		wing.assignEmployees (turquoiseGnome);
		wing.assignEmployees (sapphireGnome);
		wing.assignEmployees (rubyGnome);
		wing.assignEmployees (extraGnome);
		
		System.out.println ("The " + turquoiseGnome.getItemName() + " has been assigned to " + turquoiseGnome.getAssignedEmployee().getName() + ".");
		System.out.println ("The " + sapphireGnome.getItemName() + " has been assigned to " + sapphireGnome.getAssignedEmployee().getName() + ".");
		System.out.println ("The " + rubyGnome.getItemName() + " has been assigned to " + rubyGnome.getAssignedEmployee().getName() + ".");
		System.out.println ("The " + extraGnome.getItemName() + " has been assigned to " + extraGnome.getAssignedEmployee().getName() + ".");
	}
}
