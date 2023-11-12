package product;

/**
 * 
 * @author Quan Nguyen
 *
 */
public class ArmorOfSlaying extends SalableProducts {
	// a constructor
	public ArmorOfSlaying(String name, String description, double price, int quantity) {
		super(name, description, price, quantity);
	}

	// an overloading constructor
	public ArmorOfSlaying(String name, double price) {

	}
}
