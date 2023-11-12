package frontEnd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import inventory.InventoryManager;
import inventory.ShoppingCart;
import product.ArmorOfFending;
import product.ArmorOfSlaying;
import product.Daggers;
import product.Gunblades;
import product.Health;
import product.SalableProducts;

/*
 * Quan Nguyen
 * CST-239
 * This is my own work
 */
/**
 * 
 * @author Quan Nguyen
 */
public class StoreFront {
	public static void main(String[] args) {
		// Declaration
		Date date = new Date();
		String[] items = { "Armor of Fending | ", "Armor of Slaying | ", "Daggers | ", "Gunblades | ", "Health" };
		Scanner scan = new Scanner(System.in);
		int reply, removeNumber;
		String answer1 = "", answer2 = "", removeReply = "";
		char option;

		// Instantiate objects
		SalableProducts armorOfFending = new ArmorOfFending("Armor of Fending", "An armor specialty for tanks", 10, 20);
		SalableProducts armorOfSlaying = new ArmorOfSlaying("Armor of Slaying", "An armor specialty for assassinates",
				10, 20);
		SalableProducts dagger = new Daggers("Daggers", "A weapon for Ninjas", 15, 10);
		SalableProducts gunblade = new Gunblades("Gunblades", "A weapon for Gunbreakers", 15, 10);
		SalableProducts health = new Health("Health", "A potion to recover life", 5, 30);
		InventoryManager inventory = new InventoryManager();
		ShoppingCart shoppingCart = new ShoppingCart();
		List<String> cart = new ArrayList<String>(55);

		// add stocks to the Inventory Manager
		inventory.addStock();

		// Welcome message
		System.out.println("Welcome to the Quanny shop!");
		System.out.println("Here you can buy weapons, armors, and health to support your champion.");
		System.out.println("Today is " + date);
		System.out.println("Hence, we only have these options, please take a look: ");
		shoppingCart.displayItems(items);
		System.out.println();

		// do-while loop
		do {
			System.out.println("\nHow can I help you?");
			System.out.println("1. Buy item(s).");
			System.out.println("2. View available item(s).");
			System.out.println("3. Return item(s).");
			System.out.println("4. Exit the system");
			reply = scan.nextInt();

			if (reply < 1 || reply > 4) {
				System.out.println("Sorry, this is not a valid option, please try again.");
				answer1 = "yes";
			}

			else if (reply == 1) {
				do {
					// List of things for user to choose from
					System.out.println("\nHere are the lists of items available in the shop");
					System.out.println("a. " + armorOfFending);
					System.out.println("b. " + armorOfSlaying);
					System.out.println("c. " + dagger);
					System.out.println("d. " + gunblade);
					System.out.println("e. " + health + "\n");
					System.out.println("What caught your interest? (Please enter character from a -> e to choose");

					option = scan.next().charAt(0);

					// list of options for user to choose from
					if (option == 'a') {
						inventory.removeArmorOfFending(armorOfFending);
						cart.add(armorOfFending.getName() + " $" + armorOfFending.getPrice());
						armorOfFending.reduceQuantity();
						answer1 = "no";

					} else if (option == 'b') {
						inventory.removeArmorOfSlaying(armorOfSlaying);
						cart.add(armorOfSlaying.getName() + " $" + armorOfSlaying.getPrice());
						armorOfSlaying.reduceQuantity();
						answer1 = "no";
					} else if (option == 'c') {
						inventory.removeDaggers(dagger);
						cart.add(dagger.getName() + " $" + dagger.getPrice());
						dagger.reduceQuantity();
						answer1 = "no";
					} else if (option == 'd') {
						inventory.removeGunblades(gunblade);
						cart.add(gunblade.getName() + " $" + gunblade.getPrice());
						gunblade.reduceQuantity();
						answer1 = "no";
					} else if (option == 'e') {
						inventory.removeHealth(health);
						cart.add(health.getName() + " $" + health.getPrice());
						health.reduceQuantity();
						answer1 = "no";
					} else {
						System.out.println("Sorry this is not a valid option, please try again");
						answer2 = "yes";
					}

					// Let the user know if they want to keep buying by choosing yes or no
					System.out.println("Do you want to keep buying? (yes or no)");
					answer2 = scan.nextLine();
					answer2 = scan.nextLine();

					if (answer2.equalsIgnoreCase("no")) {
						answer1 = "yes";
					}

					// will loop again if the answer is yes, otherwise it is no
				} while (answer2.equalsIgnoreCase("yes"));

			}

			else if (reply == 2) {
				// check if the cart is empty
				if (cart.isEmpty()) {
					System.out.println("\nSuch empty~ Please add something in here!");
					answer1 = "yes";
				} else {
					// sort the cart ascending order
					Collections.sort(cart);
					System.out.println("\nHere is the list of items you have bought so far: \n" + cart);
					answer1 = "yes";
				}
			}

			else if (reply == 3) {
				// check if the cart is empty
				if (cart.isEmpty()) {
					System.out.println("\nYour inventory is already empty. Please add something!");
					answer1 = "yes";
				} else {
					answer1 = "no";
					do {
						System.out.println(
								"\nWhat items do you want to remove? (Press 0 -> 54 while 0 is the first item)");
						removeNumber = scan.nextInt();
						// remove the item and ask the user if they want to continue
						cart.remove(removeNumber);
						System.out
								.println("Item removed successfully! Do you want to return another item? (yes or no)");
						removeReply = scan.next();
						if (removeReply.equalsIgnoreCase("no"))
							answer1 = "yes";
					} while (removeReply.equalsIgnoreCase("yes"));
				}
			}

			else if (reply == 4) {
				// goodbye message
				answer1 = "no";
				System.out.println("\nThank you for shopping with us! Goodbye");
				scan.close();
			}

		} while (answer1.equalsIgnoreCase("yes"));

	}

}
