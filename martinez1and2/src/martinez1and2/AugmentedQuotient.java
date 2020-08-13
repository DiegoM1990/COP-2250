/*Diego Martinez
 * 
 * SPC ID: 2343157
 */

//This program will prompt the user for two numbers, calculate the quotient and decrease it by 2.5

package martinez1and2;

//Import java.util
import java.util.*;

public class AugmentedQuotient {
	public static void main(String[] args) {
		// Create Scanner object 
		Scanner input = new Scanner(System.in);
		
		//Prompt user for two float type numbers
		System.out.print("Enter two float type numbers: ");
		float number1 = input.nextFloat();
		float number2 = input.nextFloat();
		
		//Compute quotient of first number divided by second number
		float quotient = number1 / number2;
		
		//Display quotient 
		System.out.println(number1 + " divided by " + number2 + " equals " + quotient);	
		
		//Display quotient minus 2.5
		System.out.print("Subtracting 2.5 from the quotient yields: " + (quotient -= 2.5));
	}

}
