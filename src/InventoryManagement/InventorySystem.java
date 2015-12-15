package InventoryManagement;

import Products.Item;
import Orders.Order;
import Other.RandomNumber;
import java.util.ArrayList;
import java.util.*;

public class InventorySystem {

	public static void main (String args[]) {
		
		Order purchaseOrder = new Order ();
		purchaseOrder.OrderArray();
		
		
//		for (int i = 0; i < purchaseOrderArray.size(); i++) {
//			System.out.println(purchaseOrderArray.get(i));
//		}
		
		Item turquoiseGnome = new Item ("Turquoise Gnome", true, true);
		Item rubyGnome		= new Item ("Ruby Gnome", false, true);
		Item emeraldGnome	= new Item ("Emerald Gnome", false, false);
		
		turquoiseGnome.setItemID(1);
		rubyGnome.setItemID(2);
		emeraldGnome.setItemID(3);

//		for (String) {
//			Map <String, Integer> array = new HashMap <String, Integer> ();
//			Integer frequency = array.get(i);
//			array.put (i, (frequency == null) ? 1 : frequency + 1);
//		}
	
	}
}
