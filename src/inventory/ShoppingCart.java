package inventory;

/**
 * 
 * @author Quan Nguyen
 *
 */
public class ShoppingCart {

	// constructor of Shopping Cart
	public ShoppingCart() {

	}

	// method to display the items available for shopping
	public <E> void displayItems(E[] inputArray) {
		// Iterate over the array and print each element
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
	}
}
