package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
	    boolean isAlien = false;
	    if (isAlien == false) {
	    	System.out.println("It is not an alien!");
	    } else {
	    	System.out.println("It is an alien.");
	    }

	    int topScore = 80;
	    if (topScore >= 100) {
	    	System.out.println("highscore");
	    }

	    int secondTopScore = 81;
	    if ((topScore > secondTopScore) || (topScore < 100)) {
	    	System.out.println("greater than second top score OR less than 100");
	    }

		boolean isCar = false;
	    if (isCar) {
	    	System.out.println("This is not supposed to happen");
	    }

	    isCar = true;
	    boolean wasCar = isCar ? true : false;
	    if (wasCar) {
		    System.out.println(wasCar);
	    }
    }
}
