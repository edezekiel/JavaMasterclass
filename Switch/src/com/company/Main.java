package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
	    int switchValue = 8;

	    // Switch is good to use if you're testing the same variable
	    // Don't forget to put the break.

	    switch(switchValue) {
		    case 1:
		    	System.out.println("Value was 1");
		    	break;
		    case 2:
		    	System.out.println("Value was 2");
		    	break;
		    case 3: case 4: case 5: {
			    System.out.println("Was a 3, or a 4, or a 5");
			    break;
		    }
		    default:
		    	System.out.println("Was not 1, 2, 3, 4, or 5");
		    	break;
	    }

	    System.out.println("This executes after the switch statement");

	    char switchChar = 'A';

	    switch(switchChar) {
		    case 'A': case 'B': case 'C': case 'D': case 'E':
			    System.out.println("Char found");
			    break;
		    default:
			    System.out.println("Char not found");
			    break;
	    }

	    String month = "janUary";
	    // Using a method to normalize data
	    switch(month.toLowerCase()) {
		    case "january":
			    System.out.println("Jan");
			    break;
		    case "june":
			    System.out.println("Jun");
			    break;
		    default:
			    System.out.println("Not sure");
	    }
    }
}
