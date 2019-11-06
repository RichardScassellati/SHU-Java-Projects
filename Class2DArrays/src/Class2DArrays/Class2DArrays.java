package Class2DArrays;

public class Class2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] numbers = {{1,2,3,4} , {5,6,7,8} , {9,10,11,12}};
		/*This will create an array that looks like:
		 *  1   2   3   4  row 0
		 *  5   6   7   8  row 1
		 *  9   10  11  12 row 2
		 */
		
		//change the number 7 to 13
		numbers[1][2] = 13; //row 1, column 2
		
		//change the number 2 to 14
		numbers[0][1] = 14; //row 0, column 1

		//print the value in row 0, column 3
		System.out.println("The value in (0,3) is: "  + numbers[0][3]);
	
		//create a total
		int total = numbers[1][1] + numbers[2][0];
		total = 0;
	
		//loop through each row
		for(int row = 0; row < numbers.length; row += 1) {
			
			
			total = 0;
			
			//loop through each column
			
			for(int column = 0; column < numbers[0].length; column += 1) {
				System.out.print(numbers[row][column] + "\t"); //show the number in the row and column, add a tab
				total = total  + numbers[row][column]; //calculate the total throughout
			}
			System.out.println(total); //show the total, move on to the next row
		}
	}

}
