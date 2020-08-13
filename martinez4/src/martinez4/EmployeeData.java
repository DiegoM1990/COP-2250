/* Diego Martinez
 * 
 * SPC ID: 2343157
 */

//This program displays the formatted information of an employee
package martinez4;

public class EmployeeData {
	public static void main(String[] args) {

		// Assign variables to given information
		String name = "Keisha";
		int age = 23;
		double payRate = 32.50;

		// Print out her name and age
		System.out.printf("%s is %d years old \n", name, age);

		// Print out what office she's in
		System.out.print("She is in office C");

		// Print out her weekly pay
		System.out.printf("\nIn a 40-hour week, her pay is $%,.2f ", payRate * 40);

	}

}
