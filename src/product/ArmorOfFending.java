package product;

/**
 * 
 * @author Quan Nguyen
 *
 */
public class ArmorOfFending extends SalableProducts {
	// a constructor
	public ArmorOfFending(String name, String description, double price, int quantity) {
		super(name, description, price, quantity);
	}

	// an overloading construct
	public ArmorOfFending(String name, double price) {

	}
}
