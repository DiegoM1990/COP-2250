/* Diego Martinez
 *
 * SPC ID: 2343157
 */

//This program prints out a table with square roots and cube roots
package martinez5;

public class RootTable {
	public static void main(String[] args) {

		// Print the titles of each column
		System.out.printf("%10s%10s%10s", "NUMBER", "SQ.ROOT", "CU.ROOT");
		System.out.printf("\n%10s%10s%10s", "------", "-------", "-------");
		
		// Create a for loop for the table contents
		for (double i = 5; i <= 100; i += 5) {
			double squareRoot = Math.sqrt(i);
			double cubeRoot = Math.cbrt(i);

			System.out.printf("\n%10.1f%10.3f%10.3f", i, squareRoot, cubeRoot);
		}
	}
}
