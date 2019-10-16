package com.company;

public class Main {

    public static void main(String[] args) {

		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;

		System.out.println("Integer Minimum Value = " + myMinIntValue);
	    System.out.println("Integer Maximum Value = " + myMaxIntValue);

	    byte myMinByteValue = Byte.MIN_VALUE;
	    byte myMaxByteValue = Byte.MAX_VALUE;
	    System.out.println("Byte max = " + myMaxByteValue);
	    System.out.println("Byte min = " + myMinByteValue);

	    short myMinShortValue = Short.MIN_VALUE;
	    short myMaxShortValue = Short.MAX_VALUE;
	    System.out.println("Short max = " + myMaxShortValue);
	    System.out.println("Short min = " + myMinShortValue);

	    long myLongValue = 100L;

	    long myMinLongValue = Long.MIN_VALUE;
	    long myMaxLongValue = Long.MAX_VALUE;
	    System.out.println("Long max = " + myMaxLongValue);
	    System.out.println("Long min = " + myMinLongValue);

	    long bigLongLiteralValue = 2_147_647_234L;
	    System.out.println(bigLongLiteralValue);

	    int myTotal = (myMinIntValue / 2);
	    byte myNewByteValue = (byte) (myMinIntValue / 2);
	    short myNewShortValue = (short) (myMinShortValue / 2);

	    byte edByte = 10;
	    short edShort = 20;
	    int edInt = 50;
	    long edLong = 50000L + (10L * (edByte + edShort + edInt));
	    System.out.println(edLong);
    }
}
