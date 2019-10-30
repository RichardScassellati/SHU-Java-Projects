package MonsterMen;

/* Project Name: Class Project 6
* Author: Richard Scassellati
* GitHub: RichardScassellati
* Description: A checking account program where the user can deposit or withdrawal money
* Last Modified: 10/29/2019
* Version: 1.0
*/

import java.util.Scanner;

public class ScassellatiProgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//import scanner
		Scanner rushMe = new Scanner(System.in);
		//initialize variables
		int menuChoice = 0;
		
		System.out.println("Enter your first name:");
		String nameA = rushMe.next();//user enters their first name
		System.out.println("Enter your last name: ");
		String nameB = rushMe.next();
		System.out.println("\nWelcome, "  + nameA + " " + nameB  + ".");
		Account begin = new Account();
		begin.printMoney(); //shows how much money is in account
		
		do {
			menu(); //menu shows up
			menuChoice = rushMe.nextInt();
			//menu choices
			switch(menuChoice) {
			case 1: //shows the balance
				begin.printMoney();
				break;
			case 2: //deposits money to account
				begin.depositMoney();
				begin.printMoney();
				break;
			case 3: //deposits money to account
				begin.withdrawalMoney();
				begin.printMoney();
				break;
			case 4: //exits the program
				System.out.println("Thank you, come again!");
				break;
			case 8: //I had to put in another 8 easter egg, but this one just prints an error message
				System.out.println("Sorry pal, but 8 isn't one of the choices.\nWhat, were you expecting something secret?\nWell, sorry, but not today. Maybe next time.");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}while(menuChoice != 4);
		//close scanner when done
		rushMe.close();
		
	}

	public static void menu() { //menu method
		System.out.print("\n\nPlease select a number for what you want to do:\n");
		System.out.println("1. Check your balance\n2. Deposit to Account\n3. Withdrawal from Account\n4. Exit");
		
	}
	
	

}

