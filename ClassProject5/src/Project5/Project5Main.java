package Project5;

/* Project Name: Class Project 5
* Author: Richard Scassellati
* GitHub: RichardScassellati
* Description: The user rolls dice to see if they can throw lemons into a juicer
* Last Modified: 10/21/2019
* Version: 1.0
*/

import java.util.Scanner;
import java.util.Random;

public class Project5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize scanner and random number generator
		Scanner typeThing = new Scanner(System.in); //keyboard scanner
		Random lemonHero = new Random(); //random number generator
		
		//initialize variables
		int menuChoice = 0;
		int randomChoice = 0;
		
		System.out.println("Welcome to the Lemon Tossing Program.");
		//initialize the lemons class
		lemons lemonLaunch = new lemons();
		
		do {
			displayMenu(); //displays the menu
			menuChoice = typeThing.nextInt();
			
			//commence the decision making
			switch(menuChoice) {
			case 1:
				lemonLaunch.displayLemons(); //displays lemon amount
				break;
			case 2:
				lemonLaunch.addLemons(); //adds one lemon
				break;
			case 3:
				lemonLaunch.subtractLemons(); //subtracts one lemon
				break;
			case 4:
				randomChoice = lemonHero.nextInt(11) + 2;
				/*Because two six-sided dice are being rolled,
			      the + 2 makes it between 2 and 12 instead of 0 and 10.*/
				lemonLaunch.lemonToss(randomChoice); //commence dice roll and possible lemon toss
				break;
			case 5: //ends the program
				System.out.println("\nThank you, come again!\n:):):):):):):):):):):)");
				break;
			case 8: //Easter egg
				lemonLaunch.StanelyParableReference();
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
			
		} while(menuChoice != 5);
		
		//close the keyboard
		typeThing.close();
		
		
	}
	
	public static void displayMenu() { //displays the menu
		System.out.println("\n\nWhat would you like to do?\n\n");
		System.out.println("1.) Display lemon info\n2.) Add Lemons\n3.) Remove lemons\n4.) Toss lemons\n5.) Exit\n");
		System.out.println("Enter the number of your choice.\n\n");
		
	}
	
}


