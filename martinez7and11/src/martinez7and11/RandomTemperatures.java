/*Diego Martinez
 * 
 * SPC ID: 2343157
 */

//This program produces 14 random temperatures between 10 and 50 and calculates their mean
package martinez7and11;

import java.util.*;

public class RandomTemperatures {

	public static void main(String[] args) {

		//Create array with a size of 14 integers
		int[] randomTemps = new int[14];

		//Populate the array with random integers between 10 and 50 inclusive
		for (int i = 0; i < randomTemps.length; i++) {
			randomTemps[i] = (int) (10 + Math.random() * 41);
		}
		//Invoke the created method
		ArrayList<Integer> freezing = belowFreezing(randomTemps);

		for (int i = 0; i < freezing.size(); i++) {
			System.out.print(freezing.get(i) + " ");
		}
	}
	//Create a method that returns an ArrayList
	public static ArrayList<Integer> belowFreezing(int[] randomTemps) {
		
		System.out.println("Temperatures in last 2 weeks... ");
		ArrayList<Integer> coldTemps = new ArrayList<>();
		
		//Populate the ArrayList with the temperatures below freezing using a for loop 
		for (int i = 0; i < randomTemps.length; i++) {
			System.out.print(randomTemps[i] + " ");
			if (randomTemps[i] < 32) {
				coldTemps.add(randomTemps[i]);
			}
		}
		//Print out the amount of temperatures below freezing and their values
		System.out.println("\nThese " + coldTemps.size() + " were below freezing...");

		return coldTemps;
	}
}