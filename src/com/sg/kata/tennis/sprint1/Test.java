package com.sg.kata.tennis.sprint1;

public class Test {

	public static void main(String[] args) {
		Player p1 = new Player();
		Player p2 = new Player();

		ultimateTest(p1, p2);

		System.out.println("P1 : " + p1.toString());
		System.out.println("P2 : " + p2.toString());
	}

	private static void ultimateTest(Player p1, Player p2) {
		p1.winPoint(p2);// 15-0
		p1.winPoint(p2);// 30-0
		p1.winPoint(p2);// 40-0

		p2.winPoint(p1);// 40-15
		p2.winPoint(p1);// 40-30
		p2.winPoint(p1);// 40-40
		p2.winPoint(p1);// 40-ADV

		p1.winPoint(p2);// DEUCE-DEUCE
		p2.winPoint(p1);// DEUCE-ADV
		p2.winPoint(p1);// Game point player 2 win this game

		// ------------------------------------
		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);

		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);
	}

}
