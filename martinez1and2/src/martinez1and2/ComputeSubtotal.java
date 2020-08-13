//This program computes and displays the subtotal of a user input quantity and unit price

package martinez1and2;

//Import java.util package
import java.util.*;

public class ComputeSubtotal {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user for unit price
		System.out.print("Enter the unit price of the item: $");
		double unitPrice = input.nextDouble();
		
		//Prompt user for the quantity of items
		System.out.print("How many items will you be purchasing? ");
		double quantityOfItems = input.nextDouble();
		
	    //Close scanner
	    input.close();
	    
		//Compute the subtotal 
		double subtotal = unitPrice * quantityOfItems;
		
		//Display subtotal
		System.out.print("Your subtotal is: $" + subtotal);	
	}

}
