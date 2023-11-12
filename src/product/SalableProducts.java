package product;

/**
 * 
 * @author Quan Nguyen
 *
 */
public class SalableProducts {
	// declaration
	private String name;
	private String description;
	private double price;
	private int quantity;

	// initialization and constructor
	public SalableProducts() {
		name = "";
		description = "";
		price = 0.0;
		quantity = 0;
	}

	// an overloading constructor
	public SalableProducts(String name, String description, double price, int quantity) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

	// a method to return the name
	public String getName() {
		return name;
	}

	// a method to return the description
	public String getDescription() {
		return description;
	}

	// a method to return the price
	public double getPrice() {
		return price;
	}

	// a method to return the quantity
	public int getQuantity() {
		return quantity;
	}

	// a method to reduce and update the quantity each time the user buy something
	public void reduceQuantity() {
		this.quantity -= 1;
	}

	// a toString method to call all of the instances available at that state
	public String toString() {
		return name + " | Description: " + description + " | Price: $" + price + " | Quantity: " + quantity;
	}
}
