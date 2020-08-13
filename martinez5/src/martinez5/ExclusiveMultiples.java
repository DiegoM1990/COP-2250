/* Diego Martinez
 * 
 * SPC ID: 2343157
 */

//This program detects multiples of 13 or 17 using a while loop
package martinez5;

public class ExclusiveMultiples {

	public static void main(String[] args) {

		// Establish starting integer for multiples
		int number = 200, count = 1, total = 0;

		// Limit while loop to 16 iterations
		while (count <= 16) {

			// Increase the starting number by 1
			number++;

			// Make a boolean selection using the XOR logical operator
			if (number % 13 == 0 ^ number % 17 == 0) {

				// Print out the selected numbers
				System.out.printf("%7d", number);

				// Create a new row every 4 multiples
				if (count % 4 == 0)
					System.out.println();

				// Add one to the loop count
				count++;

				total += number;
			}
		}
		// Print out total
		System.out.println("\nThe total of all multiples is = " + total);
	}
}
