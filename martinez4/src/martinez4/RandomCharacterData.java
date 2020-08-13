/* Diego Martinez
 * 
 * SPC ID: 2343157
 */

//This program generates a random integer and displays the ASCII data
package martinez4;

public class RandomCharacterData {

	public static void main(String[] args) {

		// Generate a random integer from 48 to 122
		char number = (char)(48 + Math.random() * 75);

		// Display integer
		System.out.println("The integer is " + (int)number);

		// Display ASCII character
		System.out.println("The ASCII character for that is " + (char)number);

		// Compare character and display accordingly
		if (Character.isUpperCase(number))
			System.out.println("That is an upper case letter");
		else if (Character.isLowerCase(number))
			System.out.println("That is a lower case letter");
		else
			System.out.println("That is punctuation or a special character");
	}
}
