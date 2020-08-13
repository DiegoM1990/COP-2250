/* Diego Martinez 
 * 
 * SPC ID: 2343157
 */

//This program converts a binary number to decimal 
package martinez5;

import java.util.*;

public class BinaryToDecimal {
	public static void main(String[] args) {

		// Create scanner
		Scanner input = new Scanner(System.in);

		// Prompt user for a binary number
		System.out.print("Enter an 8-bit binary number : ");
		String binary = input.next();

		// Establish variables
		char digit;
		long powerOfTwo = 1;
		long sum = 0;

		// Convert from binary to decimal
		for (int i = 0; i < binary.length(); i++) {
			digit = binary.charAt(binary.length() - (i + 1));
			if (digit == '1')
				sum = sum + powerOfTwo;
			powerOfTwo *= 2;
		}

		// Print out the decimal value
		System.out.println("The decimal value is: " + sum);
	}
}
