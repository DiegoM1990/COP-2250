/*Diego Martinez 
 * 
 * SPC ID: 2343157
 */

//This program takes three arguments from the command line that represent dimensions of a crate and calculates surface area and volume
package martinez7and11;

public class CrateDimensions {

	public static void main(String[] args) {
		
		//Prompt the user for three numbers
		System.out.println("Please enter three integers that represent the length, width and height of a crate ");
		
		//Calculate volume by converting the digital strings passed on from the command line to the parameters on the main method into integers
		int volume = Integer.parseInt(args[0]) * Integer.parseInt(args[1]) * Integer.parseInt(args[2]);
		
		//Display volume
		System.out.println("The volume of the crate is: " + volume);
		
		//Repeat process and calculate surface area
		int surfaceArea = 2 * ((Integer.parseInt(args[0]) * Integer.parseInt(args[1])) + (Integer.parseInt(args[0]) * Integer.parseInt(args[2])) + (Integer.parseInt(args[1]) * Integer.parseInt(args[2])));
		
		//Display surface area
		System.out.println("The surface area of the crate is: " + surfaceArea);
		
	}

}
