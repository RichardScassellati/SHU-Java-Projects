package MonsterMen;
import java.util.Scanner;

public class Account {

	//methods take place here
	public double dep = 0;
	public double wit = 0;
	public double totalAccount = 100.00;
	
	public Account() {
		//just sets up this class for use
	}
	
	public void depositMoney() {
		Scanner thingthis = new Scanner(System.in); //scanner needed for input
		System.out.println("\n\nHow much do you want to deposit?");
		dep = thingthis.nextDouble();
		totalAccount = totalAccount + dep;
		//thingthis.close(); //closes scanner after use
	}
	
	public void withdrawalMoney() {
		Scanner thisthing = new Scanner(System.in); //scanner needed for input
		System.out.println("\n\nHow much do you want to withdrawal?");
		wit = thisthing.nextDouble();
		if (totalAccount - wit < 0){
		System.out.println("Sorry, but you have not enough money for your withdrawal.\nYou can't withdrawal without the right ammount of money."); }
		else {totalAccount = totalAccount - wit;}
		//thisthing.close(); //closes scanner after use
	}
	
	public void printMoney() {
		System.out.println("\nYou have $" + totalAccount + " in your account.");
	}

}
