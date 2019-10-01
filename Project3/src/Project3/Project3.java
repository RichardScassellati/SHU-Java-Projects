package Project3;

/* Project Name: Program3
* Author: Richard Scassellati
* GitHub: RichardScassellati
* Description: The user enters their name and a number between 0 and 100.
* Last Modified: 09/30/2019
* Version: 1.0
*/

import java.util.Scanner;

public class Project3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initiate scanner
		Scanner numberEnter = new Scanner(System.in);
		
		System.out.print("Please enter your name: "); //user is asked to enter their name
		String name = numberEnter.next(); //variable for user's name
		System.out.println("Hello, " + name + ".");
		System.out.print("Now type in a number between 0 and 100. ");
		int newNumber = numberEnter.nextInt(); //variable for the number inputed
		
		//check user's number if it's between 0 and 100 or not.
		while (newNumber < 0 || newNumber > 100) {
			System.out.print("I said a number in between 0 and 100.\nAlso, it needs to be an integer. ");
			newNumber = numberEnter.nextInt(); //user enters number again
		}
		
		//when the user enters a number between 0 and 100
		System.out.println("Thank you for your number.\nNow enjoy this list:");
		
		//begin for loop
		for (int forLoop = newNumber;forLoop >= 0; forLoop -= 1) {
			if (forLoop > 0) { //while the loop goes on
				System.out.println("Number " + forLoop + ". Burger King Foot Lettuce.");
			}
			else { //when the loop ends
				System.out.println("Okay, that's enough foot lettuce for now.");
			}
			
		}
		
		//closing message
		System.out.println("See ya, space cowboy " + name + ".");
		//close scanner
		numberEnter.close();
		
	}

}
