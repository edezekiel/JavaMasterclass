package com.company;

public class Main {

    public static void main(String[] args) {

    	float myMinFloatValue = Float.MIN_VALUE;
    	float myMaxFloatValue = Float.MAX_VALUE;
    	System.out.println("Float min value = " + myMinFloatValue);
    	System.out.println("Float max value = " + myMaxFloatValue);

	    double myMinDoubleValue = Double.MIN_VALUE;
	    double myMaxDoubleValue = Double.MAX_VALUE;
	    System.out.println("Double min value = " + myMinDoubleValue);
	    System.out.println("Double max value = " + myMaxDoubleValue);

	    int myIntValue = 5 / 3;
	    float myFloatValue = 5f / 3f;
	    double myDoubleValue = 5d / 3d;
	    System.out.println(myIntValue);
	    System.out.println(myFloatValue);
	    System.out.println(myDoubleValue);

	    double pounds;
	    double conversionRate = 0.45359237;
	    pounds = 2;
	    double result = pounds * conversionRate;

	    System.out.println(result);
    }
}
