/*Diego Martinez
 * 
 * 
 */

package martinez10;

public class HexAppend {

	public static void main(String[] args) {
		
		//Create a StringBuilder object
		StringBuilder num1 = new StringBuilder("5B");
		
		//Append spaces, binary and a base 10 number
		num1.append(" ");
		num1.append("10111");
		num1.append(" ");
		num1.append("76");
		
		//Print the data member of the StringBuilder object
		System.out.println("Here is your String Builder object: " + num1);
      	System.out.println();
      	
      	//Here the split method splits the string into multiple strings using a divider
		String[] num1Array = num1.toString().split(" ");
      
		//Using the Integer.parseInt convert the numbers into base 10 by using the element of the array and the base of the number as parameters 
      	System.out.println(num1Array[0] + " hex = " + Integer.parseInt(num1Array[0], 16) + " in base-10");
      	System.out.println();
      	System.out.println(num1Array[1] + " binary = " + Integer.parseInt(num1Array[1], 2) + " in base-10");
      	System.out.println();
      	
      	//Here the number is converted into a base ten using parseInt then it is passed to the toString method in the first parameter
      	//and pass the base 16 in the second parameter
      	System.out.println(num1Array[2] + " base-10 = " + Integer.toString(Integer.parseInt(num1Array[2], 10), 16) + " in hex");

    }

}
