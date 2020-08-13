/*Diego Martinez
 * 
 *
 */
package martinez10;
import java.util.*;
public class CartTest {

	public static void main(String[] args) {
		//Create a scanner
		Scanner input = new Scanner(System.in);
		
		//Create an empty cart object
		Cart emptyCart = new Cart();
		
		//Add 4 items to the cart
		emptyCart.add("Echo dot", 29.99, 3);
		emptyCart.add("Wemo plug", 39.99, 2);
		emptyCart.add("Ear buds", 49.99, 2);
		emptyCart.add("Google home", 79.0, 1);
		
		//Display the cart
		emptyCart.showCart();
		
		//Prompt user whether they want to remove an item from their cart
		System.out.print("Do you wish to remove an item before checkout (y/n)? ");
		char choice = input.next().charAt(0);
		
		//Create a while loop 
		while(choice == 'y') {
			
			//Prompt user for the item number to delete
			System.out.println("Enter item # to delete");
			int itemNumber = input.nextInt();
			
			//Remove items using method calls
			emptyCart.removeItem(itemNumber);
			emptyCart.showCart();
			
			//Prompt user again
			System.out.print("Do you wish to remove an item before checkout (y/n)? ");
			System.out.println();
			choice = input.next().charAt(0);
			}
		//Display final total
		emptyCart.showCart();
		
		

	}

}
