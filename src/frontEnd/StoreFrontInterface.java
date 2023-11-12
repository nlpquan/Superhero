package frontEnd;

/**
 * 
 * @author Quan Nguyen
 *
 */
public interface StoreFrontInterface {
	public String getName();

	public String getDescription();

	public double getPrice();

	public int getQuantity();

	public void reduceQuantity();

	public String toString();
}
