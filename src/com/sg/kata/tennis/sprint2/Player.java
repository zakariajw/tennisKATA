package com.sg.kata.tennis.sprint2;

public class Player {

	private String currentPoint;
	private int gameCounter;
	private boolean winMatch = false;
	private int tieBreakScore = 0;
	private boolean isTieBreak = false;

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
					winGame(p2);
					break;
				}

			case "ADV":
				currentPoint = "0";
				p2.currentPoint = "0";
				winGame(p2);
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

			if (gameCounter == 6 && p2.gameCounter == 6) {
				tieBreak(p2);
				isTieBreak = true;
				p2.isTieBreak = true;
			}
		}
	}

	public void winGame(Player p2) {
		if (winMatch == false) {
			gameCounter++;
		}
		if (gameCounter >= 6 && (p2.gameCounter <= gameCounter - 2)) { // difference
																		// of
																		// 2
																		// games
			winMatch = true;
		}
	}

	public void tieBreak(Player p2) {
		
		if (winMatch == false) {
			if (isTieBreak == true) {
				tieBreakScore++;

				if ((p2.tieBreakScore <= tieBreakScore - 2) && tieBreakScore >= 7) {
					tieBreakScore = 0;
					p2.tieBreakScore = 0;
					winMatch = true;
					gameCounter++;
				}

			}
			currentPoint = "0";
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

	public int getTieBreakScore() {
		return tieBreakScore;
	}

	public boolean isTieBreak() {
		return isTieBreak;
	}

	@Override
	public String toString() {
		return "Player [currentPoint=" + currentPoint + ", gameCounter=" + gameCounter + ", winMatch=" + winMatch
				+ ", tieBreakScore=" + tieBreakScore + "]";
	}

}
