//This program computes user input dimensions of a rectangle to find the perimeter and the area
package martinez1and2;

//Import java.util
import java.util.*;

public class ComputeAreaPerimeter {

	public static void main(String[] args) {
		//Create Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user for the length of the rectangle
		System.out.print("Enter a number for the length of the rectangle: ");
		double length = input.nextDouble();
		
		//Prompt user for the width of the rectangle
		System.out.print("Enter a number for the width of the rectangle: ");
		double width = input.nextDouble();
		
		//Close the Scanner
		input.close();
		
		//Compute Area
		double area = length * width;
		
		//Compute Perimeter
		double perimeter = (2 * length) + (2 * width);
		
		//Display Results
		System.out.print("The rectangle has an area of " + area + " and a perimeter of " + perimeter);
	}

}
