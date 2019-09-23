package Program2;
import java.util.Scanner;

/* Project Name: Program2
* Author: Richard Scassellati
* GitHub: RichardScassellati
* Description: The user enters 3 numbers and chooses from a menu to see what happens to the numbers.
* Last Modified: 09/23/2019
* Version: 1.0
*/


public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare scanner
		Scanner typeThing = new Scanner(System.in);
		
		//Declare variables
		double enterNum1; //first number
		double enterNum2; //second number
		double enterNum3; //third number
		int menuChoice; //menu choice
		
		//switch statement variables
		double result1; //result from first menu choice
		double result2; //result from second menu choice
		double result3; //result from third menu choice
		double result4; //result from fourth menu choice
		//there's no result5 because it just prints the entered numbers
		int wrongChoice = 1000; //required for when the user enters a number not in the menu
		
		//begin program
		System.out.print("Hello there.\nPlease enter a number: ");
		enterNum1 = typeThing.nextDouble(); //first number is inputed
		System.out.print("Now enter another number: ");
		enterNum2 = typeThing.nextDouble(); //second number is inputed
		System.out.print("Now enter one more number: ");
		enterNum3 = typeThing.nextDouble(); //third number is inputed
		System.out.println("You have entered 3 numbers.\nCongratulations."); //all three numbers have been entered
		System.out.println("Now to do something with them.");
		System.out.println("Pick one of these numbers to see what will happen to the numbers you entered.");
		System.out.println("\t1. Add them up.\n\t2.Subtract them up.\n\t3. Multiply them up.\n\t4. Divide them up.\n\t5. Just print the numbers."); //the user's choices
		menuChoice = typeThing.nextInt(); //menu choice selected
		
		//initiate switch statement
		switch(menuChoice) {
		case 1: //adds the entered numbers
			result1 = enterNum1 + enterNum2 + enterNum3;
			System.out.println("Your added numbers:");
			System.out.println(enterNum1 + " + " + enterNum2 + " + " + enterNum3 + " = " + result1 + ".");
			break;
		case 2: //subtracts the entered numbers
			result2 = enterNum1 - enterNum2 - enterNum3;
			System.out.println("Your added numbers:");
			System.out.println(enterNum1 + " - " + enterNum2 + " - " + enterNum3 + " = " + result2 + ".");
			break;
		case 3: //multiplies the entered numbers
			result3 = enterNum1 * enterNum2 * enterNum3;
			System.out.println("Your added numbers:");
			System.out.println(enterNum1 + " * " + enterNum2 + " * " + enterNum3 + " = " + result3 + ".");
			break;
		case 4: //divides the entered numbers
			if (enterNum2 != 0 && enterNum3 != 0) //makes sure the user didn't divide by zero
			{
			result4 = enterNum1 / enterNum2 / enterNum3;
			System.out.println("Your added numbers:");
			System.out.println(enterNum1 + " / " + enterNum2 + " / " + enterNum3 + " = " + result4 + ".");
			}
			else //if the user does divide by zero 
			{
				System.out.println("We check what you entered, and it appears you are trying to divide by zero.");
				System.out.println("We're sorry, but you cannot divide by zero.");
				System.out.println("Don't blame it on us. That's just how math works.");
				System.out.println("If you want to use a zero in division, enter it as the first number, not the second or third number.");
			}
			break;
		case 5: //prints the entered numbers
			System.out.println("The numbers you entered were " + enterNum1 + ", " + enterNum2 + ", and " + enterNum3 + ".");
			System.out.println("There you go in case you forgot what you entered a couple of seconds ago.");
			break;
		default: //when an invalid choice is entered
			
			if (enterNum1 == 8 && enterNum2 == 8 && enterNum3 == 8 && menuChoice == 8) //Easter egg if the user inputs only 8
			{
				System.out.println("E I G H T");
				wrongChoice = 8888;
				while (wrongChoice > 0) {
					System.out.print("8\n"); //loops to print the number 8
					wrongChoice -= 1; //prevents the loop from going infinitely
				}
				System.out.println("E I G H T");
			
			}
			else { //usual output
				System.out.println("That wasn't a valid choice.\nNow your numbers will be sitting here all alone in this program.");
				System.out.print("MWAH ");
				while (wrongChoice > 0) {
					System.out.print("HAH ");
					wrongChoice -= 1; //prevents the loop from going infinitely
				}
				System.out.println("\n\nOkay, I\'ll stop.");
			}
			
		}
		typeThing.close(); //turns off the scanner
		
	}

}
