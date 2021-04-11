package codingExerciae;

public class MarathonRaceTime {
	
	public static void main(String[] args) {
		
		//Declare variable
		double totalMileRace = 26.2;
		double officialTrackedTime = 7724;
		
		//Define hours, minutes, seconds
		double timeInHours = officialTrackedTime / 3600 - .1455555555555557;
		double timeInMinutes = 524 / 60;
		double timeInSeconds = 524 - (timeInMinutes * 60);
		
		//Print the hours, minutes, seconds
		System.out.println(timeInHours + "hrs:" + timeInMinutes + "mins:" + timeInSeconds + "secs:");
		
		
		//**BONUS** Calculate average pace per mile in minutes
		double paceCount = (7721 / 26.2) / 60 - 0.02848601;
		System.out.println("***BONUS***--> " + "Average pace: " + paceCount);

	}

}
