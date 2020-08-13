/*Diego Martijnez
 * 
 * SPC ID: 2343157
 */

//This program turns a 
package martinez6;
import java.util.*;
public class ImproperToMix {
	public static void main(String[] args) {

		// Create scanner and prompt user for integers of an improper fraction
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two integers of an improper fraction: ");
		int n = input.nextInt();
		int d = input.nextInt();
		
		//Invoke the method and display  
		System.out.print("The improper fraction " + n + "/" + d + " as a mixed number is ");
		mixed(n,d);
	}
	//Create method converting the improper fraction to a mixed number
	public static void mixed(int number1, int number2) {	
      	
		if(number1 > number2) {
			int wholeNumber = (number1 / number2);
			number1 = (number1 % number2);
			System.out.println(wholeNumber + " and " + number1 + "/" + number2);
		}
		
		//If the user does not input integers of an improper fraction display a proper output
		else {
			System.out.println("0 and " + number1 + "/" + number2 + ", which is not an improper fraction");
		}
	}
}