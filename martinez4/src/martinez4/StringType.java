/* Diego Martinez
 * 
 * SPC ID: 2343157
 */

//This program shows the abilities of the string type 
package martinez4;

import java.util.*;

public class StringType {
	public static void main(String[] args) {

		// Create Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user for three words
		System.out.print("Enter a three worded phrase to be analyzed: ");

		// Store input in strings
		String s1 = input.nextLine();

		// Display the number of characters in the phrase
		System.out.println("The length of " + s1 + " is " + s1.length() + " characters");

		// Obtain the character of spaces
		int space1 = s1.indexOf(' ');
		int space2 = s1.lastIndexOf(' ');

		// Obtain the middle word substring
		String middleWord = s1.substring(space1 + 1, space2);

		// Display number of characters in the second word
		System.out.println("The word " + middleWord + " contains " + middleWord.length() + " number of characters");

		// Display the last word in all upper case
		String lastWord = s1.substring(space2 + 1);

		System.out.println("The last word of " + s1 + " capitalized is " + lastWord.toUpperCase());
	}
}
