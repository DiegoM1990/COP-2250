/*Diego Martinez
 * 
 * SPC ID: 2343157
 */

//This program will prompt the user for their height in meters and centimeters or inches, to see if they are tall enough to ride a roller coaster  

package martinez6;
import java.util.*;
public class RequiredHeight {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Greet the user and prompt for their height in their choice of units 
		System.out.println("Hello! In order to ride the rollercoaster you must be at least 64 inches, or 1 meter and 65 centimeters tall");
		System.out.print("Would you like to enter your height in inches or meters? ");
		String height = input.next();
		
		//Create an if-else statement and proceed accordingly with the user choice
		if(height.equals("inches")) {
			System.out.print("Enter your height in inches: ");
			int inches = input.nextInt();
			
			tallEnough(inches);
			}	
		else if(height.equals("meters"))
			System.out.print("Enter your height first in meters then centimeters: ");
		int meters = input.nextInt();
		int centimeters = input.nextInt();
		
		tallEnough(meters, centimeters);
		
		}
	//If the user inputs inches invoke the method with a single parameter
	public static void tallEnough(int inches) {
		if (inches >= 64) 
			System.out.println("You are tall enough to ride the roller coaster!");
		else 
			System.out.println("Sorry, you are not tall enough to ride the roller coaster");
		}
	//If the user inputs meters, invoke the method with two parameters
	public static void tallEnough(int meters, int centimeters) {
		if( meters * 100 + centimeters >= 163)
			System.out.println("You are tall enough to ride the roller coaster!");
		else
			System.out.println("Sorry, you are not tall enough to ride the roller coaster");
	}
}
