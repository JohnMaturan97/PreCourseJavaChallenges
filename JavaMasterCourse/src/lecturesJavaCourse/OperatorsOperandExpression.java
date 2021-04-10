package lecturesJavaCourse;

public class OperatorsOperandExpression {

	 public static void main(String [] args) {

	        int result = 3;
	        System.out.println("1 + 2 = " + result);

	        int previousResult = result;
	        System.out.println("Previous Results = " + previousResult);

	        result = result - 1; // 3 -1 = 2
	        System.out.println("3 - 1 = " + result);
	        System.out.println("Previous Results = " + previousResult);

	        result= result * 10; // 2 * 10 = 20
	        System.out.println(" result * 10 = " + result);

	        result = result / 5; // 10 / 5 = 4
	        System.out.println( "result / 5 = " + result);

	        result = result % 3 ; // remainder of ( 4 % 3) = 1
	        System.out.println(" remainder of result = " + result);

	        result++; // 1 + 1 = 2;
	        System.out.println( " 1 + 1 = " + result);

	        result--; //1 + 1 = 2
	        System.out.println(" 1 - 1 = " + result);

	        result += 2; // 1 + 2 = 3
	        System.out.println(" 1 + 2 = " + result);

	        result *= 10; //3 * 20
	        System.out.println(" 3 * 10 = " + result);

	        result /= 3; //30 / 3 = 10
	        System.out.println(" 30 / 3 = " + result);

	        result -= 2; // 10 - 2
	        System.out.println(" 10 - 2 = " + result);


	    }
}
