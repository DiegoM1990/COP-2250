/*Diego Martinez
 * 
 * SPC ID: 2343157
 */

//This program simulates 
package martinez6;

import java.util.*;

public class GroceryBill {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double total = 0.0;
		
		//Prompt the user with the amount of items being purchased
		System.out.print("How many different items are being purchased? ");
		double items = input.nextInt();

		//Create a loop prompting the user for the price, quantity and whether the item is taxable or not
		for (double i = 1; i <= items; i++) {

			System.out.print("Enter the price of item " + i + " ");
			double price = input.nextDouble();

			System.out.print("Enter the quantity of this item ");
			double quantity = input.nextDouble();

			System.out.print("Is the item taxable true/false? ");
			boolean taxable = input.nextBoolean();

			//Invoke method and add the values to the total
			total += items(quantity, taxable, price);

		}
		//Print out total for all the items
		System.out.printf("\nPlease pay $ %.2f", total);
	}
	//Create a method using the quantity of items, the price and whether the item is taxable in the parameters
	public static double items(double quantityTemp, boolean tax, double price) {
		
		double subtotal = price * quantityTemp;
		double taxes = 0.0;
		
		//Check if the item is taxable with an if statement and compute accordingly
		if (tax) {
			taxes = (subtotal * 0.07);
		}
		System.out.printf("Subtotal is %.2f", subtotal);
		System.out.printf("\nSales tax $ %.2f", taxes);
		System.out.printf("\nTotal $ %.2f \n", subtotal + taxes);

		return subtotal + taxes;
	}
}