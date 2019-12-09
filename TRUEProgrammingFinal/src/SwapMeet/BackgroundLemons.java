package SwapMeet;

//background processes
import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class BackgroundLemons {
	
	//main integers
	public int lemonAmount;
	public int melonAmount;
	
	//random message components
	Random newMessage = new Random();
	public int messInt;
	
	public BackgroundLemons () { //plays when the class is called for
		lemonAmount = 5;
		melonAmount = 5;
		System.out.println("You have " + lemonAmount + " lemons and " + melonAmount + " melons.");
		
	}
	
	public void displayItems() { //displays the amount of lemons and melons the user has
		System.out.println("You have " + lemonAmount + " lemons and " + melonAmount + " melons.");
		//sends nothing, returns nothing
	}
	
	public void addLemons() { //adds one lemon
		if (lemonAmount == 12) { //checks if the maximum - 12 - is reached or not
			System.out.println("Woah there, buddy!\nYou can only carry 12 lemons!");
		}
		else {
			lemonAmount++; //adds 1 lemon
			System.out.println("You currently have " + lemonAmount + " lemons and " + melonAmount + " melons."); //display lemon and melon amount
		}
	}
	
	public void addMelons() { //adds one melon
		if (melonAmount == 12) { //checks if the maximum - 12 - is reached or not
			System.out.println("Woah there, buddy!\nYou can only carry 12 melons!");
		}
		else {
			melonAmount++; //adds 1 melon
			System.out.println("You currently have " + lemonAmount + " lemons and " + melonAmount + " melons."); //display lemon and melon amount
		}
	}
	
	public void loseLemons() { //removes one lemon
		if (lemonAmount == 0) { //checks if the minimum - 0 - is reached or not
			System.out.println("Woah there, buddy!\nYou're all out of lemons!");
		}
		else {
			lemonAmount--; //removes 1 lemon
			System.out.println("You currently have " + lemonAmount + " lemons and " + melonAmount + " melons."); //display lemon and melon amount
		}
	}
	
	public void loseMelons() { //removes one melon
		if (melonAmount == 0) { //checks if the minimum - 0 - is reached or not
			System.out.println("Woah there, buddy!\nYou're all out of melons!");
		}
		else {
			melonAmount--; //removes 1 melon
			System.out.println("You currently have " + lemonAmount + " lemons and " + melonAmount + " melons."); //display lemon and melon amount
		}
	}
	
	public void tossItems(int kingDice) { //toss the lemons and melons after a dice roll
		System.out.println("\n\nIt's time to roll the dice.\nThe dice roll a " + kingDice + ".");
		int totalItems = lemonAmount + melonAmount; 
		if (totalItems >= kingDice) {
			//successful toss
			System.out.println("The lemons and melons are thrown into a juicer.");
			messInt = newMessage.nextInt(4);
			switch(messInt) { //random message generator
			case 0:
				System.out.println("You are now the next Gordon Ramsey.");
				break;
			case 1:
				System.out.println("You now have the Krabby Patty secret formula.");
				break;
			case 2:
				System.out.println("You have the power within.");
				break;
			case 3:
				System.out.println("Enjoy the brand new flavor of TASCola that you have created.");
				break;
			}
			System.out.println("\n\nAlthough, you're gonna need more lemons and melons if you want to throw more.");
			System.out.println("Here, have 5 lemons and 5 melons.");
			//user goes back to 5 lemons and melons
			lemonAmount = 5;
			melonAmount = 5;
		}
		else {
			//failed toss
			System.out.println("Sorry, but that's not enough to toss your lemons and melons.\nTry again, friend!");
		}
		
		
	}
	
	public void EIGHT() throws IOException { //when an 8 is entered
		try {
		lemonAmount = 8; //eight lemons now
		melonAmount = 8; //eight melons now
		File eightArray = new File("/Users/1923scasrich/Desktop/E I G H T.txt"); //generate 8 file
		int[][] eightThing = {{8, 8, 8, 8, 8, 8, 8, 8},{8, 8, 8, 8, 8, 8, 8, 8},{8, 8, 8, 8, 8, 8, 8, 8}}; //it's a double array of eights
		FileWriter eightWriter = new FileWriter("/Users/1923scasrich/Desktop/E I G H T.txt", true); //file writer for file
		Scanner eightScanner = new Scanner(eightArray); //scanner for file
		PrintWriter eightNews = new PrintWriter(eightWriter); //printer for file
		//create a total for the eights
				int totalEights = eightThing[1][1] + eightThing[2][0];
				totalEights = 0;
			
				//loop through each row of eights
				for(int row = 0; row < eightThing.length; row += 1) {
					
					
					totalEights = 0;
					
					//loop through each column of eights
					
					for(int column = 0; column < eightThing[0].length; column += 1) {
						eightNews.print(eightThing[row][column] + "\t"); //show the number in the row and column, add a tab
						totalEights = totalEights  + eightThing[row][column]; //calculate the total throughout
					}
					eightNews.println(totalEights); //print the total of the eights, move on to the next row
				}
		
		eightScanner.close();
		eightNews.close();
		System.out.println("Check your desktop. Go ahead. You won't be disappointed."); //message from the program
		System.out.println("You currently have " + lemonAmount + " lemons and " + melonAmount + " melons."); //display lemon and melon amount

		} catch (EOFException error) { //if the end of the file is reached
			System.out.println("Oh dear. An error is here.\nThe file we\'re trying to generate has reached its limits.\nOh no.");
			System.out.println("Error message: " + error.getMessage()); //prints the rest of the error message
		}
		catch (FileNotFoundException error) { //if the file isn't found
			System.out.println("Oh dear. An error is here.\nThe file we\'re trying to generate is non-existent.\nOh dear.");
			System.out.println("Error message: " + error.getMessage()); //prints the rest of the error message
		}
	}
}