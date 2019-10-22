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
}
