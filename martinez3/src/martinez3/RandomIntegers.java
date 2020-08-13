/* Diego Martinez
 *
 * Student ID: 2343157
 */

//This program will generate two random integers within a given range and display their difference
package martinez3;

public class RandomIntegers {
	public static void main(String[] args) {
		// Generate two random integers
		int number1 = (int) (20 + (Math.random() * 31));
		int number2 = (int) (20 + (Math.random() * 31));

		// Make sure that number1 > number2
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		// Display both numbers
		System.out.println("The two random integers generated are: " + number1 + " and " + number2);

		// Subtract both numbers
		int difference = number1 - number2;

		// Print out the difference
		System.out.println("The difference between " + number1 + " and " + number2 + " is " + difference);
	}
}
