/*Diego Martinez
 * 
 * SPC ID:2343157
 */

//This program uses two methods to produce an array in form of a table using two methods
package martinez7and11;

public class RandomArray {
	public static void main(String[] args) {

		System.out.println("Here is the random array...");

		// Create an array with an array size of 24
		int[] randomNumbers = new int[24];

		// Compute random integers from 40 to 60 into the array
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = (int) (40 + Math.random() * 21);
		}

		// Invoke the arrayMean method
		double mean = arrayMean(randomNumbers);
		System.out.println("The mean of the array is " + mean);

	}

	// Create arrayMean method that will calculate the mean
	public static double arrayMean(int[] randomNumbers) {
		int total = 0;

		// Create loop that adds the values of the array
		for (int i = 0; i < randomNumbers.length; i++) {
			total += randomNumbers[i];
			System.out.printf("%6d", randomNumbers[i]);

			// if statement creates 6 columns
			if ((i + 1) % 6 == 0) {
				System.out.println();
			}
		}
		// Return the value of the mean
		return (total / randomNumbers.length);

	}
}