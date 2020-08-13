/*Diego Martinez
 * 
 * SPC ID: 2343157
 */

//This program emulates a cashier terminal
package martinez5;

import java.util.*;

public class CashierTerminal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Establish variables being used in loop
		double total = 0;
		double subtotal = 0;

		// Create loop for cashier
		while (true) {

			// Prompt the user for an item price
			System.out.print("Enter item price or zero to quit: ");
			double price = input.nextDouble();

			// If the user inputs zero terminate the loop
			if (price == 0) {
				break;
			}

			// Prompt user for the item quantity and compute a subtotal
			System.out.print("Enter quantity for this item: ");
			double quantity = input.nextDouble();
			subtotal = quantity * price;

			// Print out subtotal quantity and add it to the total
			System.out.printf("Total this item is $%4.2f", subtotal);
			System.out.println();

			total += subtotal;
		}
		// Print out the total of the transaction"
		System.out.printf("Total is $%4.2f", total);
	}
}
