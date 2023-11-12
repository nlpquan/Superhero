package product;

/**
 * 
 * @author Quan Nguyen
 *
 */
public class Gunblades extends SalableProducts {
	// a constructor
	public Gunblades(String name, String description, double price, int quantity) {
		super(name, description, price, quantity);
	}

	// an overloading constructor
	public Gunblades(String name, double price) {

	}
}
