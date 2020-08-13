/* Diego Martinez
 * 
 * SPC ID: 2343157
 */

//This program will convert a user input temperature in Fahrenheit to Celsius 

package martinez1and2;

//Import java.util
import java.util.*;

public class FahrenheitToCelsiusConversion {
	public static void main(String[] args) {
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user for degrees in Fahrenheit
		System.out.print("Enter degrees in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
	    //Close scanner
	    input.close();
	    
		//Compute unit conversion
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		
		//Display the results
		System.out.print(fahrenheit + " Degrees in Fahrenheit is " + celsius + " degrees in Celsius");
	}

}
