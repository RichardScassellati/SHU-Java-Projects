package SwapMeet;

/* Project Name: Programming Final
* Author: Richard Scassellati
* GitHub: RichardScassellati
* Description: The user rolls dice to see if they can throw lemons and melons into a juicer
* 			 (it's just a remake of Project 5 but with new features)
* Last Modified: 12/8/2019
* Version: 1.0
*/

import java.util.Scanner;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

public class MainLemonMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
		BackgroundLemons newLemon = new BackgroundLemons(); //gains access to background processes
		Scanner wowWow = new Scanner(System.in); //import scanner
		Random masaDesign = new Random();
		
		//initialize integers
		int menuChoice = 0;
		int randChoice = 0;
		
		do {
			menuShow(); //display the menu
			menuChoice = wowWow.nextInt();
			switch(menuChoice) { //goes through the menu choices
			case 1:
				newLemon.addLemons(); //adds one lemon
				break;
			case 2:
				newLemon.loseLemons(); //subtracts one lemon
				break;
			case 3:
				newLemon.addMelons(); //adds one melon
				break;
			case 4:
				newLemon.loseMelons(); //subtracts one melon
				break;
			case 5: //display the lemon and melon amount
				newLemon.displayItems();
				break;
			case 6: //toss the lemons and melons
				randChoice = masaDesign.nextInt(25) + 2;//makes the random number generator between 2 and 24
				newLemon.tossItems(randChoice);
				break;
			case 7: //closes the program and prints a message
				System.out.println("Thank you, and have a great day!");
				System.out.println("After all, it's a great day to be a golden lion!");
				break;
			case 8: //the option for the number 8
				newLemon.EIGHT();
				break;
			default:
				System.out.println("I'm sorry, but that's not a valid choice.\nPlease try again.");
			}
			
		} while (menuChoice != 7);
		
		//close the keyboard when everything's finished
		wowWow.close();
		} catch (EOFException error) { //if the end of the file for the '8' choice is reached
			System.out.println("Oh dear. An error is here.\nThe file we\'re trying to generate has reached its limits.\nOh no.");
			System.out.println("Error message: " + error.getMessage()); //prints the rest of the error message
		}
		catch (FileNotFoundException error) { //if the file for the '8' isn't found
			System.out.println("Oh dear. An error is here.\nThe file we\'re trying to generate is non-existent.\nOh dear.");
			System.out.println("Error message: " + error.getMessage()); //prints the rest of the error message
		}

	}
	
	public static void menuShow() { //displays the menu
		System.out.println("\n\nWhat you you like to do?\n\n");
		System.out.println("1.) Add lemons\n2.) Remove lemons\n3.) Add melons\n4.) Remove melons\n5.) Check lemons and melons\n6.) Throw lemons and melons\n7.) Exit\n8.) E I G H T");
		System.out.println("\nEnter a number to make your choice.\n");
	}

}
