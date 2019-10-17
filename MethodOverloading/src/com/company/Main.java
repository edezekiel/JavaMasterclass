package com.company;

public class Main {

	public static void main(String[] args) {
		int newScore = calculateScore("Tim", 500);
		System.out.println("New score is " + newScore);
		calculateScore(300);

		calcFeetAndInchesToCentimeters(15);
	}

	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score +
				                   " points");
		return score * 1000;
	}

	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points");
		return score * 1000;
	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if (feet >= 0 && inches >= 0 && inches <= 12) {
			double centimeters = (2.54 * ((feet * 12) + inches));
			System.out.println(feet + " feet + " + inches + " inches" + " = " + centimeters + " centimeters.");
			return centimeters;
		} else {
			return -1;
		}
	}

	public static double calcFeetAndInchesToCentimeters(double inches) {
		if (inches >= 0) {
			// calculate how many feet are in the inches
			System.out.println("Starting with this many inches: " + inches);
			double feet = (int) (inches / 12);
			double remainingInches = inches % 12;
			// call the other overloaded method
			return calcFeetAndInchesToCentimeters(feet, remainingInches);
		}
		return -1;
	}
}
