package com.company;

public class Main {

    public static void main(String[] args) {
		String myString = "This is a string";
		System.out.println("myString is equal to " + myString);
		myString = myString + (", and this is more. " + myString);
	    System.out.println("Updated myString is equal to " + myString);

	    String numberString = "250.55";
	    numberString = numberString +"49.95";
	    System.out.println((numberString));
		String lastString = "10";
		int myInt = 50;
		// Java converts int value to string and appends it to the string.
		lastString = lastString + myInt;
		System.out.println("lastString is equal to " + lastString);

		double doubleNumber = 120.47d;
		lastString = lastString + doubleNumber;
		System.out.println(lastString);
    }
}
