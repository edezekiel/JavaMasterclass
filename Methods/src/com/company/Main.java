package com.company;

public class Main {

	public static void main(String[] args) {
		int highscore = calculateScore(true, 800, 5, 100);
		calculateScore(true, 10000, 8, 200);

		System.out.println("This is your highscore " + highscore);

		int playerPosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Bob", playerPosition);

		playerPosition = calculateHighScorePosition(900);
		displayHighScorePosition("Tom", playerPosition);

		playerPosition = calculateHighScorePosition(400);
		displayHighScorePosition("Carl", playerPosition);

		playerPosition = calculateHighScorePosition(50);
		displayHighScorePosition("Amy", playerPosition);
	}

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		} else {
			return -1;
		}
	}

	public static void displayHighScorePosition(String playerName, int playerPosition) {
		System.out.println(playerName + " is in position " + playerPosition);
	}

	public static int calculateHighScorePosition(int playerScore) {
		if (playerScore >= 1000) {
			return 1;
		} else if (playerScore >= 500) {
			return 2;
		} else if (playerScore >= 100) {
			return 3;
		} else {
			return 4;
		}
	}
}
