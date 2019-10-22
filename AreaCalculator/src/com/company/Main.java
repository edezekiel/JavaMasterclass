package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

	public static double area (double radius) {
		if (radius < 0) {
			return -1.0;
		}
		return radius * radius;
	}

	public static double area (double x, double y) {
		if (x < 0 || y < 0) {
			return -1.0;
		}
		return x * y;
	}

	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid Value");
		} else {
			long years = minutes / 525600;
			long remainingMinutes = minutes % 525600;
			long days = remainingMinutes / 1440;
			System.out.println(minutes + " min = " + years + " y and " + days + " d");
		}
	}

	public static void printEqual(int firstNum, int secondNum, int thirdNum) {
		if (firstNum < 0 || secondNum < 0 || thirdNum < 0) {
			System.out.println("Invalid Value");
		} else if (firstNum == secondNum && firstNum == thirdNum && secondNum == thirdNum) {
			System.out.println("All numbers are equal");
		} else if (firstNum != secondNum && firstNum != thirdNum && secondNum != thirdNum) {
			System.out.println("All numbers are different");
		} else {
			System.out.println("Neither all are equal or different");
		}
	}

	public static boolean isCatPlaying(boolean summer, int temperature) {
		if (!summer) {
			return (temperature > 24 && temperature < 36) ? true : false;
		}
		return (temperature > 24 && temperature < 46) ? true : false;
    }
}
