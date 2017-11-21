package com.sg.kata.tennis.sprint1;

public class Player {

	private String currentPoint;
	private int gameCounter;
	private boolean winMatch = false;

	public Player() {
		currentPoint = "0";
		gameCounter = 0;
	}

	public void winPoint(Player p2) {
		if (winMatch == false) {
			switch (currentPoint) {
			case "0":
				currentPoint = "15";
				break;

			case "15":
				currentPoint = "30";
				break;

			case "30":
				currentPoint = "40";
				break;

			case "40":
				if (p2.currentPoint == "40") {
					currentPoint = "ADV";
					break;
				} else if (p2.currentPoint == "ADV") {
					currentPoint = "DEUCE";
					p2.currentPoint = "DEUCE";
					break;
				} else {
					currentPoint = "0";
					p2.currentPoint = "0";
					gameCounter++;
					break;
				}

			case "ADV":
				currentPoint = "0";
				p2.currentPoint = "0";
				gameCounter++;
				break;

			case "DEUCE":
				if (p2.currentPoint == "DEUCE") {
					currentPoint = "ADV";
					break;
				} else if (p2.currentPoint == "ADV") {
					p2.currentPoint = "DEUCE";
					break;
				}

			default:
				break;
			}

		}
	}

	public String getCurrentPoint() {
		return currentPoint;
	}

	public int getGameCounter() {
		return gameCounter;
	}

	public boolean isWinMatch() {
		return winMatch;
	}

	@Override
	public String toString() {
		return "Player [currentPoint=" + currentPoint + ", gameCounter=" + gameCounter + "]";
	}

}
