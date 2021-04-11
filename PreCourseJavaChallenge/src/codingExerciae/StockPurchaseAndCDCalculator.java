package codingExerciae;

public class StockPurchaseAndCDCalculator {

	public static void main(String[] args) {
		
		//Declare the Variable 
		double totalSavings = 25000;
		
		//Price per one stock
		double pricePerShares = 989;
		
		//Calculate total stocks he can buy
		double totalShares = totalSavings / pricePerShares; 
		//Calculate the remaining balance to purchase CD account
		double moneyLeft = (25000 / 989);
		double randomNum = (moneyLeft * 989);
		double shareCD = (25000 - randomNum);
		//Print total shares purchase and CD investment 
		System.out.println("Buy " + totalShares + " shares of stock");
		System.out.println("Invest $" + shareCD + " in CD account");
		
		

	}

}
