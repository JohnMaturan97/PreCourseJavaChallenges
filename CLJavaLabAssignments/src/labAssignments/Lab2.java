package labAssignments;

//import scanner class for user input
import java.util.Scanner;

public class Lab2 {

	public static void main(String args[]) {

		// Task #1
		// nextDoubleAreaCalculator();

		// Task #2
		// nextDoubleAreaOfTriangle();

		// Task #3
		// nextDoubleOddEven();

		// task #4
		// nextFloatDecimalNumber();

	}

	public static double nextDoubleAreaCalculator() {

		// declare & define the circumference and the area
		double circumference, area;
		// declare & define the radius
		int radius;
		// object of the Scanner class

		// create new scanner
		Scanner sc = new Scanner(System.in);

		// print message and prompt the user for radius input
		System.out.print("Enter a Radius of a Circle:  ");

		// stores users input for calculations
		radius = sc.nextInt();

		// Area * Radius formula
		area = Math.PI * (radius * radius); // To calculate area of circle
		// Print back to the console
		System.out.println("The Area is: " + area);

		// Area * Circum formula
		circumference = Math.PI * 2 * radius; // To calculate circumference of circle
		// Print back to the console
		System.out.println("The Circumference is: " + circumference);

		return 0;
	}

	public static double nextDoubleAreaOfTriangle() {

		// create new scanner
		Scanner sc = new Scanner(System.in);

		// prompt the user for the width
		System.out.println("Enter the Width: ");
		// store user input
		double base = sc.nextDouble();

		// Prompt the user for Height
		System.out.println("Enter the Height: ");
		// store user input
		double height = sc.nextDouble();

		// The formula of area of a triangle = (width * height) / 2
		double area = (base * height) / 2;
		// Print message back to the console
		System.out.println("The Area of triangle is: " + area);
		// Close scanner
		sc.close();
		return 0;
	}

	public static double nextDoubleOddEven() {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number you want to check:");
		n = s.nextInt();
		if (n % 2 == 0) {
			System.out.println("The given number " + n + " is Even ");
		} else {
			System.out.println("The given number " + n + " is Odd ");

		}
		return n;
	}

	public static float nextFloatDecimalNumber() {

		// create new scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		float num = input.nextFloat();

		int a = (int) num;
		float b = a;
		System.out.println(b);
		return 0;

	}

}
