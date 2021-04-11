package codingExerciae;

import java.util.Scanner;

public class WeekDayConverter {

	public static void main(String[] args) {
		
		//Create the scanner
		Scanner in = new Scanner(System.in);
				
		//Prompt the user
		System.out.print("Enter Any Number From 1 - 7: ");
		int day = in.nextInt();
		
		//Print the inputed num into the designated day
		System.out.println(retrieveTheDayName(day));
	}
		
	//To test the listed variable on each case/value 
	public static String retrieveTheDayName(int day) {
		String  theDayName = "";
		switch (day) {
		case 1: theDayName = "Sunday"; break;
		case 2: theDayName = "Monday"; break;
		case 3: theDayName = "Tuesday"; break;
		case 4: theDayName = "Wendnesday"; break;
		case 5: theDayName = "Thursday"; break;
		case 6: theDayName = "Friday"; break;
		case 7: theDayName = "Saturday"; break;
		default:theDayName = "INVALID INPUT";
		}
				
		return theDayName;		

	}

}
