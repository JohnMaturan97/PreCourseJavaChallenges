package labAssignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {

		// Create a scanner for user input
		Scanner sc = new Scanner(System.in);

		// This will call the Methods
		max3();
		min3();
		median3();
		xor();

		// prompt the user
		System.out.println("Enter number: ");
		// store value for future calculation
		int num = sc.nextInt();

		// define string value
		String str = "";
		// conditional statement/ expression
		for (int i = 0; i < num; i++) {
			str = isPerfect(i);
			if (str != null)
				System.out.println(str);
		}

		// Prompt the user to enter a Prime number
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		if (isPrime(n))
			System.out.println(n + " is prime number");
		else
			System.out.println(n + " is not a prime number");

	}

	// method for max of 3 integers
	public static void max3() {
		int firstValue = 100;
		int secondValue = 200;
		int thirdValue = 300;

		// constant MAX_VALUE is used to hold values
		int myMaxFirstValue = Integer.MAX_VALUE;
		int myMaxSecondValue = Integer.MAX_VALUE;
		int myMaxThirdValue = Integer.MAX_VALUE;

		// Print all max values
		System.out.println("The First MAx Value : " + myMaxFirstValue);
		System.out.println("The Second MAx Value : " + myMaxSecondValue);
		System.out.println("The Third MAx Value : " + myMaxThirdValue);

		// spacer
		System.out.println("----------------------------------------------");
	}

	// method for min of 3 integers
	public static void min3() {

		int firstValue = 100;
		int secondValue = 200;
		int thirdValue = 300;

		// constant Min_VALUE is used to hold values
		int myMinFirstValue = Integer.MIN_VALUE;
		int myMinSecondValue = Integer.MIN_VALUE;
		int myMinThirdValue = Integer.MIN_VALUE;

		// print all min values
		System.out.println("The First Min Value : " + myMinFirstValue);
		System.out.println("The Second Min Value : " + myMinSecondValue);
		System.out.println("The Third Min Value : " + myMinThirdValue);

		// spacer
		System.out.println("----------------------------------------------");
	}

	// method to define the median
	public static void median3() {
		//

		// Declare & Define variables
		int firstValue = 100;
		int secondValue = 200;
		int thirdValue = 300;
		// state that the median num is secondValue;
		int medianNum = secondValue;
		// print the median number
		System.out.println("The Median Numner is: " + medianNum);

		// spacer
		System.out.println("----------------------------------------------");
	}

	public static void xor() {
		Boolean value1 = true;
		Boolean value2 = true;
		// method will give the result of equals of value1 and value2
		if (value1.equals(value2)) {
			System.out.println("The method returns true");
		} else if (value2.equals(value1)) {
			System.out.println("The method returns true");
		} else {
			System.out.println("The method returns false");
		}
		// spacer
		System.out.println("----------------------------------------------");
	}

	public int isFactor(int n, int k) {

		// Implemented the array / store 
		ArrayList<Integer> fact = new ArrayList<>();

		// find the factors
		for (int k1 = 1; k1 <= n / 2; k1++) {
			//check if u is a factor of n
			if (n % k1 == 0)
				fact.add(k1);
		
		}
		fact.add(n);
		return fact.size() >= k ? fact.get(k - 1) : -1;

	}

	// method to determine is number is perfect
	private static String isPerfect(int n) {

		// Declare string
		String res = "";
		int sum = 0;

		// create conditional statement /expression
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				res = res + " " + i;
				sum += i;
			}
		}
		if (sum == n) {
			res = n + " is perfect.\n\tFactors:" + res;
			return res;

		}
		return null;
	}

	// determine if number is prime
	public static boolean isPrime(int n) {
		for (int i = 2; i < n / 2; i++)

			// create conditional statement /expression
			if (n % i == 0)// means not a prime
				return false;
		// if no factor found
		return true;
	}

}
