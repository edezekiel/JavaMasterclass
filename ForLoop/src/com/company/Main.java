package com.company;

public class Main {

    public static void main(String[] args) {

    	for (double i=2; i < 9; i++) {
		    System.out.println("10,000 at " + i + "% interest = " +
				                       String.format("%.2f", calculateInterest(10000.00, i)));
	    }
    }

    public static double calculateInterest(double amount, double interesteRate) {
    	return (amount * (interesteRate/100));
    }
}
