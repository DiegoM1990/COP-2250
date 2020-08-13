/*Diego Martinez
 * 
 * SPC ID:2343157
 * 
 */
package martinez9;

public class HolidayFinanceTracker {

	public static void main(String[] args) {
	
	//Create an array and populate it using Gift instances
	Gift[] gifts = new Gift[6];
	gifts[0] = new Gift("Penny", "Dolls", 89.99, 2);
	gifts[1] = new Gift("Kenny", "Toys", 29.99, 4);
	gifts[2] = new Gift("Benny", "Games", 29.99, 6);
	gifts[3] = new Gift("Jenny", "Makeup", 69.99, 3);
	gifts[4] = new Gift("Denny", "Boots", 129.99, 1);
	gifts[5] = new Gift("Lenny", "Tablet", 199.99, 1);
    
    double totalSpent = 0.00;
    double totalSpentOnPerson = 0.00;
    double maxSpent = 0.00;
    String person = "";
	
    //Create a foreach loop that prints out the values of the attributes in each element 
	for(Gift g: gifts) {
		System.out.print(g.toString());
		
		//use the void method giftsVal to compute the total spent on each person
		g.giftsVal();
        totalSpentOnPerson = g.getQty() * g.getPrice();
        
        //Accumulate the total amount spent
      	totalSpent += totalSpentOnPerson;
      
      	//Check to see if what is spent on the current person is more than the last highest we had found
       if (totalSpentOnPerson > maxSpent) {
         maxSpent = totalSpentOnPerson;
         person = g.getRecipient();
       }
	}
	
	//Display total of money spent and the recipient of the most expensive Gift
   	System.out.println("On " + Gift.recipients + " people I spent " + "$" + String.format("%.2f", totalSpent));
   	System.out.println("I spent most on " + person + ", $" + String.format("%.2f", maxSpent));
	}
}
	
	