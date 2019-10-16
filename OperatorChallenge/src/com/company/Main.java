package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
	    double myDouble = 20.00;
	    double mySecondDouble = 80.00;
	    double addDoubleAndSecond = (myDouble + mySecondDouble * 100.00);
	    double myRemainder = addDoubleAndSecond % 40.00;
	    System.out.println(myRemainder);
	    boolean isRemainderZero = (myRemainder == 0) ? true : false;
	    System.out.println(isRemainderZero);
	    if (!isRemainderZero) {
	    	System.out.println("Got some remainder");
	    }
    }
}
