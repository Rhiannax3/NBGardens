package Orders;

import java.util.ArrayList;

import Products.Item;
import Other.RandomNumber;

public class Order {
	
	public Order () {
		
	}
	
	public ArrayList<Integer> OrderArray () {

	ArrayList <Integer> purchaseOrderArray;
	purchaseOrderArray = new ArrayList <Integer> ();
	RandomNumber randomNumber = new RandomNumber ();
	
	Item sapphireGnome 	= new Item ("Sapphire Gnome", true, true);
	Item rubyGnome 		= new Item ("Ruby Gnome", true, false);
	Item turquoiseGnome = new Item ("Turquoise Gnome", false, true);
	Item extraGnome		= new Item ("Extra Turquoise Gnome", true, false);
	
	sapphireGnome.itemID	= randomNumber.generateID(sapphireGnome);
	rubyGnome.itemID 		= randomNumber.generateID(rubyGnome);
	turquoiseGnome.itemID 	= randomNumber.generateID(turquoiseGnome);
	extraGnome.itemID		= randomNumber.generateID(extraGnome);
	
	purchaseOrderArray.add (sapphireGnome.itemID);
	purchaseOrderArray.add (rubyGnome.itemID);
	purchaseOrderArray.add (turquoiseGnome.itemID);
	purchaseOrderArray.add (extraGnome.itemID);
	
	for (int i = 0; i < purchaseOrderArray.size(); i++) {
		System.out.println(purchaseOrderArray.get(i).getName());
	}
	
	return purchaseOrderArray;
	
	}
	
}
