package codingExerciae;

import java.util.Scanner;
public class SavingsCalculator {

	public static void main(String[] args) {
	
		//Create the scanner
		Scanner sc = new Scanner(System.in);
		
		//Prompt the user to input a value
		System.out.print("Enter The current Value: ");
		//Stores the info for calculation
		int value = sc.nextInt();
		
		//Prompt the user to input the interest rate
		System.out.print("Enter the Interest Rate:" );
		//Stores the info for calculations
		double interest = sc.nextDouble();
		
		//Prompt the user to input the years
		System.out.print("Enter The Ammount of Years: ");
		//Stores the info for calculations
		int years = sc.nextInt();
		
		//Calculating the overall total using the formula FV = PV * [1 + (rate x time)]; 
		double totalEarned = value * Math.pow(( 1 + interest / 100) , years);
		System.out.println("The Total Value is: " + totalEarned);
		
		
	}
}
