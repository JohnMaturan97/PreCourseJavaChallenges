package codingExerciae;

import  java.util.Scanner;

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {
		
		//Create the scanner
		int number;
		Scanner scan = new Scanner(System.in);
		
		
		//Prompt the user
		System.out.print("Enter Any Number My Guy: ");
		//Take the users input
		number = scan.nextInt();
		//End the scan
		scan.close();
		
		//To determine if its Pos or Neg
		if(number > 0)
		{
			System.out.println(number + " Positive");
		}
		else if(number < 0)
		{
			System.out.println(number + " Negative");
		}
		else
		{
			System.out.println(number + " nei0ther Positive or Negative");
		}
		
		
		
	}		
	
}	