package Project5;

import java.util.Random;

public class lemons {
	
	//this is where the magic happens
	
	//declare variables
	public int lemonAmount;
	public int message;
	Random messagePossible = new Random(); //for the random message
	
	public lemons() { //starts off with 5 lemons
		lemonAmount = 5;
		System.out.println("You have " + lemonAmount + " lemons.");
	}


	public void displayLemons() { //displays how many lemons the user has
		System.out.println("You currently have " + lemonAmount + " lemons.");
		//sends nothing, returns nothing
	}
	
	public void addLemons() { //adds one lemon
		if (lemonAmount != 12) {
			lemonAmount += 1;
			System.out.println("You currently have " + lemonAmount + " lemons.");
		}
		else { //error message
			System.out.println("\n\nHold on a second, buddy! You can only carry 12 lemons!");
		}
	}
	
	public void subtractLemons() { //subtracts one lemon
		if (lemonAmount != 0) {
			lemonAmount -= 1;
			System.out.println("You currently have " + lemonAmount + " lemons.");
		}
		else { //error message
			System.out.println("\n\nHold on a second, buddy! You have no lemons to throw!");
		}
	}
	
	public void lemonToss(int dice) {
		System.out.println("It's time to roll the dice.\nThe dice roll a " + dice + ".");
		
		//determine if lemons are thrown or not
		if (lemonAmount > dice) { //thrown lemons
			System.out.println("\nThe lemons have been succesfully thrown into the juicer.");
			message = messagePossible.nextInt(4); //random number between 0 and 3
			switch(message) { //a randomly generated message appears
			case 0:
				System.out.println("You can now make lemonade.");
				break;
			case 1:
				System.out.println("You can now make lemon chicken.");
				break;
			case 2:
				System.out.println("You can now make lemon cookies. Out of the juice. Good luck.");
				break;
			case 3:
				System.out.println("You can now join the lemons from Cars 2. The best dream ever, I know.");
				break;
			}
			//the aftermath
			System.out.println("\n\nHowever, it looks like you'll need more lemons.\nHere, have 5 more.");
			lemonAmount = 5; //the user has 5 lemons again
		}
		else { //not thrown lemons
			System.out.println("\nI'm sorry, but you can't throw your lemons.\nTry again, friend!");
			//notice the user still keeps the amount of lemons they had, so they have another chance of throwing the lemons successfully
		}
		
	}
	
	public void StanelyParableReference() { //Easter egg if the user enters an 8
		System.out.println("\n\nE I G H T\n 8 8 8 8");
		lemonAmount = 8; //automatically sets the lemons to 8
		System.out.println("You currently have " + lemonAmount + " lemons.");
		System.out.println(" 8 8 8 8\nE I G H T");
	}
	

}
