package codingExerciae;

public class ClassroomRatios {
	
	public static void main(String[] args) {
	
		//Declare the variable
		double totalBoys = 11;
		double totalGirls = 16;
		double totalTeachers = 2;
	
		//Add all the people
		double classroomGirlsBoys = totalBoys + totalGirls;
	
		//Define percentage of girls
		double studentGirls = totalGirls / classroomGirlsBoys;
		
		//convert studentGirls into proper form
		double totalGirlsIntheClass = studentGirls * 100;
		
		//Define the ratio student - teachers
		double theStudentTeacherRatio = classroomGirlsBoys / totalTeachers; 
	
		//Print total girls in the class
		System.out.println(totalGirlsIntheClass + "% of the class are girls");
		
		//Print student - teacher ratio 
		System.out.println("The Student - Teacher ratio is " + theStudentTeacherRatio);
		
		
	}

}

