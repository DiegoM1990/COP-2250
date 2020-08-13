/* Diego Martinez 
 * 
 * SPC ID: 2343157
 */

//This program outputs circumference and area of a circle using two different methods
package martinez6;
import java.util.*;
public class CircleDimensions {
	public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);

	    //Prompt the user to enter dimensions of the circle
	    System.out.print("Enter the diameter of a circle: ");
	    double diameter = input.nextDouble();

	    //Invoke both methods
	    circumference(diameter);
	    area(diameter);
	  }

	  //Method used to compute circumference
	  public static void circumference(double d){

	    final double PI = 3.1459;
	    double result1 = (PI * d);
	    System.out.printf("The circumference of the circle is: %.4f", result1);
	  }
	  //Method used to compute area
	  public static void area(double d) {
	    final double PI = 3.1459;
	    double result2 = (Math.pow((d/2),2)) * PI;
	    System.out.printf("\nThe area of the circle is: %.4f", result2);
	  }

	}
