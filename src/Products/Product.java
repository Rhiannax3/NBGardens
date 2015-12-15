
package Products;


public class Product {
		
	public static String productName;
	static String area;
	static int shelf;
	
	public Product (String productName, String area, int shelf) {
		this.productName = productName;
		this.area 		 = area;
		this.shelf 		 = shelf;
	}
	
	public static void main (String args[]) {
		
	}

	public String getArea() {
		return this.area;
	}

	public int getShelf() {
		return this.shelf;
	}
	
}
