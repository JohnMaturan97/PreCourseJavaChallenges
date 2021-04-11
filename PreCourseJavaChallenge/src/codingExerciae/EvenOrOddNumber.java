package codingExerciae;

import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		
		//Create the scanner
		Scanner in = new Scanner(System.in);
		
		//Prompt the user
		System.out.print("Enter any number My Guy: ");
		int number = in.nextInt();
		
		//To determine it its odd or even 
		if(number % 2 == 0) {
			System.out.println("Even");
		}
		else if(number % 2 != 0)
		{
			System.out.println("Odd");
		}
		else
		{
			System.out.println("Neither Odd or Even");
		}
	}

}

