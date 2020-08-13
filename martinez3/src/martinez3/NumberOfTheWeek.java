/* Diego Martinez
 * 
 * SPC ID: 2343157
 */

//This program will prompt the user for a number day of the week and will display the day

package martinez3;

import java.util.*;

public class NumberOfTheWeek {
	public static void main(String[] args) {

		// Create scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user for the day number of the week
		System.out.print("Enter a number from 0 to 6 representing a day in the week: ");
		int day = input.nextInt();

		// Create a switch statement to implement a selection
		switch (day) {
		case 0:
			System.out.println("The day of the week is Sunday");
			break;
		case 1:
			System.out.println("The day of the week is Monday");
			break;
		case 2:
			System.out.println("The day of the week is Tuesday");
			break;
		case 3:
			System.out.println("The day of the week is Wednesday");
			break;
		case 4:
			System.out.println("The day of the week is Thursday");
			break;
		case 5:
			System.out.println("The day of the week is Friday");
			break;
		case 6:
			System.out.println("The day of the week is Saturday");
		default:
			System.out.println(
					day + " Does not fit into the numbered days of the week." + 
			" Please input a number from 0 to 6");
		}
	}
}
