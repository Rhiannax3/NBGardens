package Workers;

import Products.Item;

public class WarehouseEmployee {
	
	private String name;
	private int employeeID;
	private boolean forklift;
	private boolean porous;
	
	public WarehouseEmployee (String name, int employeeID, boolean forklift) {
		this.name 		= name;
		this.employeeID = employeeID;
		this.forklift	= forklift;
	}
	
	public void checkPurchaseItem (Item item) {
		System.out.println (this.name + " has checked the product name and warehouse location of the Purchase Order item.");
	}
	
	public void storePurchaseItem (Item item) {
		item.status = "Stored";
		item.setProduct ();
		System.out.println ("She has has now stored the item.");
	//		InventorySystem.class.......
	}

	public void checkOutOrder (Order order) {
		order.status = 
	}
	
	public void pickCustomerItem (Item item) {
		if (item.getForklift() == this.forklift)
		item.status = "Picked";
		System.out.println (this.name + " has found and picked up the " + item.itemName + ".");
	}
	
	public void packCustomerItem (Item item) {
		item.status = "Packed";
		System.out.println ("She has also packed the item.");
	}
	
	public void readyCustomerItem (Item item) {
		item.status = "Awaiting delivery";
		System.out.println ("The " + item.itemName + " is now awaiting delivery.");
	}
	
	public String getName () {
		return name;
	}
	
	public int getID () {
		return employeeID;
	}
	
	public boolean getForklift () {
		return forklift;
	}

	public boolean getPorous () {
		return porous;
	}
	
	public static void main (String args []) {
		Item customerGnome = new Item ("Sapphire Gnome", true, false);
		WarehouseEmployee claire = new WarehouseEmployee ("Claire", 1, false);
		
		claire.checkPurchaseItem (customerGnome);
		claire.storePurchaseItem (customerGnome);
		claire.pickCustomerItem  (customerGnome);
		claire.packCustomerItem  (customerGnome);
		claire.readyCustomerItem (customerGnome);
		
	}
	
}


// https://github.com/Rhiannax3/NBGardens.git