package inventory;

import java.util.ArrayList;
import java.util.List;

import product.ArmorOfFending;
import product.ArmorOfSlaying;
import product.Daggers;
import product.Gunblades;
import product.Health;
import product.SalableProducts;

/**
 * 
 * @author Quan Nguyen
 *
 */
public class InventoryManager {
	// create 5 different ArrayList for each of 5 different Salable Products
	List<SalableProducts> armorOfFending = new ArrayList<SalableProducts>(10);
	List<SalableProducts> armorOfSlaying = new ArrayList<SalableProducts>(10);
	List<SalableProducts> daggers = new ArrayList<SalableProducts>(15);
	List<SalableProducts> gunblades = new ArrayList<SalableProducts>(15);
	List<SalableProducts> health = new ArrayList<SalableProducts>(5);

	// Constructor of Inventory Manager
	public InventoryManager() {

	}

	// this method will add the inventory to full stock
	public void addStock() {
		for (int i = 0; i < 10; i++) {
			// instantiate the objects
			SalableProducts product1 = new ArmorOfFending("Armor of Fending", 10);
			SalableProducts product2 = new ArmorOfSlaying("Armor of Slaying", 10);
			SalableProducts product3 = new Daggers("Daggers", 15);
			SalableProducts product4 = new Gunblades("Gunblades", 15);
			SalableProducts product5 = new Health("Health", 5);
			// using add methods
			armorOfFending.add(product1);
			armorOfSlaying.add(product2);
			daggers.add(product3);
			gunblades.add(product4);
			health.add(product5);
		}

	}

	// method to remove the armor of fending
	public void removeArmorOfFending(SalableProducts object) {
		armorOfFending.remove(0);
	}

	// method to remove the armor of slaying
	public void removeArmorOfSlaying(SalableProducts object) {
		armorOfSlaying.remove(0);
	}

	// method to remove daggers
	public void removeDaggers(SalableProducts object) {
		daggers.remove(0);
	}

	// method to remove gunblades
	public void removeGunblades(SalableProducts object) {
		gunblades.remove(0);
	}

	// method to remove health
	public void removeHealth(SalableProducts object) {
		health.remove(0);
	}
}
