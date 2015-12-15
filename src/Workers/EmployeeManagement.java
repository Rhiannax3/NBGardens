package Workers;

import Products.Item;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
	
	public List<WarehouseEmployee> employeeList;

	public EmployeeManagement () {
		
	}
	
	public void createEmployeeList () {
		WarehouseEmployee claire 	= new WarehouseEmployee ("Claire", 1, false);
		WarehouseEmployee adam	 	= new WarehouseEmployee ("Adam", 2, true);
//		WarehouseEmployee sophie	= new WarehouseEmployee ("Sophie", 3, false);
		
		List <WarehouseEmployee> employeeList = new ArrayList <WarehouseEmployee> ();
		employeeList.add (claire);
		employeeList.add (adam);
//		employeeList.add (sophie);
		this.setEmployeeList(employeeList);
		
	}
	
	public void carryOutTasks (WarehouseEmployee warehouseEmployee, Item item) {
		warehouseEmployee.checkPurchaseItem (item);
		warehouseEmployee.storePurchaseItem (item);
		warehouseEmployee.pickCustomerItem  (item);
		warehouseEmployee.packCustomerItem  (item);
		warehouseEmployee.readyCustomerItem (item);
	}

	public static void main (String args[]) {
		EmployeeManagement manager 	= new EmployeeManagement ();
		WarehouseEmployee claire 	= new WarehouseEmployee ("Claire", 1, false);
		
		Item testItem				= new Item ("Ruby Gnome", true, false);
		manager.carryOutTasks(claire, testItem);
	}

	public List<WarehouseEmployee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<WarehouseEmployee> employeeList) {
		this.employeeList = employeeList;
	}
	
}
