package ScassellatiProgram1;

public class ScasProg1 {

	/* Project Name: Scassellati Program 1
	* Author: Richard Scassellati
	* GitHub: RichardScassellati
	* Description: displays the number of lemons
	* Last Modified: 09/11/2019
	* Version: 1.0
	*/

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare variables
		double priceLemons = 1.25;
		int numberOfLemons = 5;
		String name = "Dougal Flopguy";

		//Initiate program
		System.out.println("Hello, " + name + "!"); // Prints the customer's name
		System.out.print("\nThe price of one lemon is $" + priceLemons + ".\nYou have purchased " + numberOfLemons + " lemons.\n"); //prints the cost of 1 lemon and how many lemons were bought
		System.out.println("The total cost is $" + priceLemons * numberOfLemons + "."); //prints the total cost
		
	}

}
