
package Products;

import Workers.WarehouseEmployee;

public class Item {
	
	public int itemID;
	public String itemName;
	boolean porous;
	private boolean forklift;
	public String status = "Received";
	String area;
	int shelf;
	private String productName;
	public WarehouseEmployee assignedEmployee;

	public Item (String itemName, boolean porous, boolean forklift) {
		
		this.itemName 		= itemName;
		this.porous 		= porous;
		this.forklift		= forklift;
		this.status 		= "Received";
		
		this.setItemID(itemID);
		this.setProduct();
		this.setAssignedEmployee(assignedEmployee);
		
	}
	
	public static void main (String args[]) {
		Item item = new Item ("Test", true, false);
		item.setProduct ();
		System.out.println (item.itemName + " is the product, " + item.productName +
				", which is stored in " + item.area + item.shelf + " of the warehouse");
	}

	public String getArea() {
		return area;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	
	public String getItemName() {
		return itemName;
	}

	public void setProduct () {
		if (this.itemName == "Best Gnome") {
			this.productName = "Best Gnome";
			this.area = "A";
			this.shelf = 1;
		} else {
			this.productName = "Gemstone Gnome";
			this.area = "B";
			this.shelf = 2;
		}
	}
	
	public void setAssignedEmployee (WarehouseEmployee warehouseEmployee) {
		this.assignedEmployee = warehouseEmployee;
	}
	
	public WarehouseEmployee getAssignedEmployee () {
		return assignedEmployee;
	}
	
	public int getShelf() {
		return shelf;
	}

	public boolean getForklift() {
		return forklift;
	}
	
	public boolean getPorous () {
		return porous;
	}

}
