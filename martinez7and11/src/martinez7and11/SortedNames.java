/*Diego Martinez
 * 
 * SPC ID: 2343157
*/
//This program will take user input names and sort them alphabetically, displaying the abilities of Arrays, ArrayLists and their classes 
package martinez7and11;

import java.util.*;

public class SortedNames {

	public static void main(String[] args) {
		// Create a scanner and prompt the user for 6 different names
		Scanner input = new Scanner(System.in);
		System.out.println("Enter six first names ");
		String name = input.nextLine();

		// Store the names in an Array
		String[] nameArray = name.split(" ");

		// Print out the names with a space between them using a for loop
		for (int i = 0; i < nameArray.length; i++)
			System.out.print(nameArray[i] + " ");
		stringArray(nameArray);
	}

	// Create a void method
	public static void stringArray(String nameArray[]) {

		// Sort the array alphabetically
		System.out.println("\nSorted array of names");
		Arrays.sort(nameArray);

		// Print out sorted list using a for loop
		for (int i = 0; i < nameArray.length; i++)
			System.out.print(nameArray[i] + " ");
		System.out.println();

		// Populate a new ArrayList using a for loop
		ArrayList<String> nameList = new ArrayList<String>();
		for (int i = 0; i < nameArray.length; i++) {
			nameList.add(nameArray[i]);
		}

		// Add and remove elements using the Array class
		nameList.remove(nameList.size() - 1);
		nameList.add(0, "Tommy");

		System.out.println("Final list of names");

		// Print out the final ArrayList using a foreach loop
		for (String finalList : nameList)
			System.out.print(finalList + " ");

	}
}