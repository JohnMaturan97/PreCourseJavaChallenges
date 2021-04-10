package lecturesJavaCourse;

public class ByteShortLong {

	public static void main(String[] args) {

	    // Declare the variable
        int myValue = 10000;

        //Define the min value
        int myMinIntValue = Integer.MIN_VALUE;
        //Define the max value
        int myMaxIntValue = Integer.MAX_VALUE;

        //print min value
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        //print max value
        System.out.println("Integer maximumValue = " + myMaxIntValue);
        //print busted value
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));

        //test value
        int myMaxIntTest = 2147483647;


        int myMinByteValue = Byte.MIN_VALUE;
        int myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte maximumValue = " + myMaxByteValue);

        int myMinShortValue = Short.MIN_VALUE;
        int myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short maximumValue = " + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long maximumValue = " + myMaxLongValue);

        long bigLongLiteralValue = 2147483647L;
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
    }
}
