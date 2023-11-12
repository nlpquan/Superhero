package product;

/**
 * 
 * @author Quan Nguyen
 *
 */
public class Daggers extends SalableProducts {
	// a constructor
	public Daggers(String name, String description, double price, int quantity) {
		super(name, description, price, quantity);
	}

	// an overloading constructor
	public Daggers(String name, double price) {

	}
}
