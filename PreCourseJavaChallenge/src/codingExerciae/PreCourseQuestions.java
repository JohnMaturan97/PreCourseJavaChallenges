package codingExerciae;

import java.util.Scanner;

public class PreCourseQuestions {

public static void main(String[] args) {
		
		//Create the scanner
		Scanner sc = new Scanner(System.in);
		
		//Prompt the user 
		System.out.print("Enter Your Grade My Guy: ");
		double score = sc.nextDouble();
		
		//Converting the inputed numeric grade to a letter grade 
		if(score >= 90)
		{
			System.out.println(score + " is an A");
		}
		else if(score >= 80)
		{
			System.out.println(score + " is a B");
		}
		else if(score >= 72)
		{
			System.out.println(score + " is a C");
		}
		else if(score >= 64)
		{
			System.out.println(score + " is a D");
		}
		else if(score >= 0)
		{
			System.out.println("F");
		} 
		else 
		{
			System.out.println(score + "INVALID NUMERIC GRADE");
		}
	}

}
