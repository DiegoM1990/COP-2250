/* Diego Martinez
 * 
 * SPC ID: 2343157
 */

//This program prompts the age of the user then displays the ticket price according to their age
package martinez3;

import java.util.*;

public class TicketCost {
	public static void main(String[] args) {

		// Create a scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user for their age
		System.out.print("Welcome to WallyWorld! to determine your entrance fee, enter your age: ");
		int age = input.nextInt();
		input.close();

		// Implement selection control using if else statements
		if (age < 4)
			System.out.println("You must be at least 4 years old to buy a ticket");
		else if (age >= 4 && age <= 11)
			System.out.println("Your cost is $65.00 per ticket");
		else if (age >= 12 && age <= 19)
			System.out.println("Your cost is $100.00 per ticket ");
		else
			System.out.println("Your cost is $125.00 per ticket");
	}
}
