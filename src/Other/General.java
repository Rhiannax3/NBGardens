package Other;

import InventoryManagement.InventorySystem;
import Orders.Order;
import Products.Product;
import Products.Item;
import Workers.WarehouseEmployee;

public class General {
	
	public static void main (String args[]) {
	
		Item turquoiseGnome = new Item ("Turquoise Gnome", true, false);
		Item rubyGnome		= new Item ("Ruby Gnome", false, true);
		Item emeraldGnome	= new Item ("Emerald Gnome", false, true);
		
		System.out.println (turquoiseGnome.itemName + "s are located in area " + turquoiseGnome.getArea() + ", shelf " + turquoiseGnome.getShelf());
	}
	
}
