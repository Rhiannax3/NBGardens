
package Other;

import java.util.Random;
import Products.Item;

public class RandomNumber {

	Random random = new Random ();
	
	public int generateID (Item item) {
		int itemID = random.nextInt (899);
		itemID = itemID + 100;
		return itemID;
	}
	
}
