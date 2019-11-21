package alastor;

/* Project Name: Class Project 8
* Author: Richard Scassellati
* GitHub: RichardScassellati
* Description: Loops through grades
* Last Modified: 11/21/2019
* Version: 1.0
*/
import java.io.*;
import java.util.Scanner;

public class ScasProg8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
		
		//open file for use
		File checkGrades = new File("/Users/1923scasrich/Desktop/grades.txt");
		//initiate scanner
		Scanner keyboardIn = new Scanner(checkGrades);
		
		//open/close output file
		FileWriter happyHotel = new FileWriter("/Users/1923scasrich/Desktop/Total Grades.txt", true);
		PrintWriter keyboardOut = new PrintWriter(happyHotel);
		
		//create local variables
		int grades = 0, gradesTotal = 0, gradesAverage = 0;
		
		//loop through the input file
		while(keyboardIn.hasNext()) {
			grades = keyboardIn.nextInt();
			gradesTotal += grades;
			gradesAverage = gradesTotal / 15; //there are 15 grades total, so I put the 15 there
		}
		
		//print the grade total and average
		keyboardOut.println("Grade Statistics");
		keyboardOut.println("================");
		keyboardOut.println("Total Grades: " + gradesTotal);
		keyboardOut.println("Number of Grades: 15"); //the number of grades is 15, so I put 15 there
		keyboardOut.println("Average: " + gradesAverage + "%");
		//checking for letter grade
		if (gradesAverage >= 90 && gradesAverage <= 100) {
			keyboardOut.println("Grade: A");
		}
		else if (gradesAverage >= 80 && gradesAverage <= 89) {
			keyboardOut.println("Grade: B");
		}
		else if (gradesAverage >= 70 && gradesAverage <= 79) {
			keyboardOut.println("Grade: C");
		}
		else if (gradesAverage >= 60 && gradesAverage <= 69) {
			keyboardOut.println("Grade: D");
			}
		else {
			keyboardOut.println("Grade: F");
		}
		
		
		keyboardIn.close();
		keyboardOut.close();
		}
		catch (EOFException error) { //if the end of the file is reached
			System.out.println("Sorry, but I seem to have reached the end of that file.");
			System.out.println("Error message: " + error.getMessage()); //prints the rest of the error message
		}
		catch (FileNotFoundException error) { //if the file isn't found
			System.out.println("Sorry, but I can't find that file.");
			System.out.println("Error message: " + error.getMessage()); //prints the rest of the error message
		}
		
		
	}

}
