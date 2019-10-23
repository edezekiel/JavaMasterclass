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

		printDayOfTheWeek(4);
	    printDayOfTheWeek(9);
	    isLeapYear(-1600);
	    isLeapYear(1600);
	    isLeapYear(2017);
	    isLeapYear(2000);
		getDaysInMonth(2, 1600);

    }

	public static void printDayOfTheWeek(int day) {
		switch(day) {
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid Day");
				break;
		}
	}


	public static boolean isLeapYear(int year) {
		if (year < 1 || year > 9999) {
			System.out.println(year + " is not a Leap Year");
			return false;
		}

		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + " is a Leap Year");
			return true;
		}
		System.out.println(year + " is not a Leap Year");
		return false;
	}

	public static int getDaysInMonth(int month, int year) {
		if (year < 1 || year > 9999 || month < 1 || month > 12) {
			System.out.println("Invalid month or year.");
			return -1;
		} else if (isLeapYear(year) && month == 2) {
			System.out.println(month + " 29");
			return 29;
		} else {
			switch(month) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					System.out.println(month + " 31");
					return 31;
				case 2:
					System.out.println(month + " 28");
					return 28;
				case 4: case 6: case 9: case 11:
					System.out.println(month + " 30");
					return 30;
				default:
					return -1;
			}
		}
	}
}
