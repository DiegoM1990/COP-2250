/*Diego Martinez
 * 
 * SPC ID: 2343157
 */

//This program checks whether a user input integer is a multiple of 23 within a range of (0,500)
package martinez3;

import java.util.*;

public class MultiplesOf23 {
	public static void main(String[] args) {
		//Create a scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt user for number up to 500
		System.out.print("Enter an integer that is an even multiple of 23 but does not exceed 500: ");
		int number = input.nextInt();
		
		
		//Implement selection control using boolean compound 
		if(number % 23 == 0  &&  number % 2 == 0  && number <= 500) 
			System.out.println("The integer " + number + " is an even multiple of 23");
		else 
			System.out.println("The integer " + number + " is not an even multiple of 23");
		
		
	
	}
}
