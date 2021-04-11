package codingExerciae;

import java.util.*;

class ChangeCalculator
{
  public static void main(String[] args)
  {
    //Define the variables 
    double quarters;
	double dimes;
	double nickles;
	// Declaration & Initialization
    double pennies;
    int totalBill;
    
    //Create new scanner
    Scanner in = new Scanner(System.in);
    
    //Prompt the user for grand total
    System.out.println("Enter The Total: ");
    totalBill = in.nextInt();
    
    //Prompt the user for the money she/he gave to the cashier
    System.out.println("Enter The money you gave: ");
    int moneyGave = in.nextInt();
    
    //Calculating the total mount - money given 
    double totalChange = (moneyGave - totalBill) ;
    
    // Calculations for the remaining change
    quarters = (totalChange / .25);
    totalChange = totalChange % .25;
    
    dimes = totalChange / .10;
    totalChange = totalChange % .10;
    
    nickles = totalBill / .05;
    totalChange = totalChange % .05;
    
    pennies = totalChange;
    
    // Print the corresponding change 
    System.out.println("Total Chnage: ");
    System.out.println( "Quarters: " + quarters  );
    System.out.println( "Dimes: " + dimes );
    System.out.println("Nickles: "  + nickles );
    System.out.println( "Pennies: " + pennies );
    
  }
}
