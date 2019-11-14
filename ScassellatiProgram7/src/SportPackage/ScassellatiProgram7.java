package SportPackage;

/* Project Name: Class Project 7
* Author: Richard Scassellati
* GitHub: RichardScassellati
* Description: Calculates a two dimensional array for the sport Calvinball
* Last Modified: 11/5/2019
* Version: 1.0
*/

import java.util.Scanner;
import java.util.Random;

public class ScassellatiProgram7 {
	
	public static void main(String[] args) {
		
		//initiate random and scanner
		Random zaWarudo = new Random();
		Scanner konoTheoDa = new Scanner(System.in);
		//set up a total for each team
		int totalA = 0, totalB = 0;
		String teamA = "";
		String teamB = "";
		//set up array
		int innings = 0;
		
		//start the program
		System.out.println("Welcome to Calvinball.\nYou make up the rules.");
		System.out.println("\nHow many innings are you running for this game?");
		innings = konoTheoDa.nextInt(); //input the number of innings
		
		//set up array
		int[][] whales = new int[innings][2];
		
		

		
		//begin the for loop for the scores
		for(int i = 0; i < whales[0].length; i += 1) {
			
			for (int o = 0; o < whales.length; o += 1){
			//collect Team 1 info
				if (o == 0) {
					System.out.println("How much did Team 1 score in Quarter " + (i + 1) + "?");
					whales[o][i] = konoTheoDa.nextInt();
					totalA += whales[o][i];
					teamA = teamA + whales[o][i] + "\t";
				
				}
			//collect Team 2 info
				if (o == 1) {
					System.out.println("How much did Team 2 score in Quarter " + (i + 1) + "?");
					whales[o][i] = konoTheoDa.nextInt();
					totalB += whales[o][i];
					teamB = teamB + whales[o][i] + "\t";
				}
			
			}
			
		}
		
		//show the final scores
		System.out.println(teamA + totalA);
		System.out.println(teamB + totalB);
		
		//detect which team won overall
		if (totalA > totalB) { //team 1 wins
			System.out.println("Team 1 wins!");
		}
		else if (totalB > totalA) { //team 2 wins
			System.out.println("Team 2 wins!");
		}
		else if (totalA == totalB) { //draw
			System.out.println("It's a draw!");
		}

		//close the scanner
		konoTheoDa.close();
	}

}
