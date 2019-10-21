package com.company;

public class Main {

	public static void main(String[] args) {
		System.out.println(getDurationString(123, 35));
		System.out.println(getDurationString(135));
	}

	public static String getDurationString(int minutes, int seconds) {
		if (minutes >= 0 && seconds >= 0 && seconds <= 60) {
			int hours = minutes / 60;
			minutes = minutes % 60;
			return (hours + "h " + minutes + "m " + seconds + "s");
		}
		return "Invalid Value";
	}

	private static String getDurationString(int seconds) {
		if (seconds >= 0) {
			int convertedToMinutes = seconds / 60;
			seconds = seconds % 60;
			return getDurationString(convertedToMinutes, seconds);
		}
		return "Invalid value";
	}
}
