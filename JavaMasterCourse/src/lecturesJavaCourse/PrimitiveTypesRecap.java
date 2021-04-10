package lecturesJavaCourse;

public class PrimitiveTypesRecap {

	public static void main(String[] args) {

        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        //Common Primitive Types: int, double, boolean

        String myString = "John";
        System.out.println("myString is equal to " + myString);

        myString = myString + ", and Maturan";
        System.out.println("myString is equal to " + myString);

        String numberSring = "250.55";
        numberSring = numberSring + "49.95";
        System.out.println(numberSring);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString: " + lastString);
    }
}
