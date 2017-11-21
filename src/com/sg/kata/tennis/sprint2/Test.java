package com.sg.kata.tennis.sprint2;

public class Test {

	public static void main(String[] args) {
		Player p1 = new Player();
		Player p2 = new Player();

		ultimateTest(p1, p2);

		System.out.println("P1 : " + p1.toString());
		System.out.println("P2 : " + p2.toString());
	}

	private static void ultimateTest(Player p1, Player p2) {
		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);

		p2.winPoint(p1);
		p2.winPoint(p1);
		p2.winPoint(p1);
		p2.winPoint(p1);

		p1.winPoint(p2);
		p2.winPoint(p1);
		p1.winPoint(p2);
		p1.winPoint(p2);
		p2.winPoint(p1);
		p2.winPoint(p1);
		p2.winPoint(p1);
		
		
		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);

		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);

		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);

		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);

		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);

		p2.winPoint(p1);
		p2.winPoint(p1);
		p2.winPoint(p1);
		p2.winPoint(p1);

		p2.winPoint(p1);
		p2.winPoint(p1);
		p2.winPoint(p1);
		p2.winPoint(p1);

		p2.winPoint(p1);
		p2.winPoint(p1);
		p2.winPoint(p1);
		p2.winPoint(p1);

		p2.winPoint(p1);
		p2.winPoint(p1);
		p2.winPoint(p1);
		p2.winPoint(p1);

		p2.winPoint(p1);
		p2.winPoint(p1);
		p2.winPoint(p1);
		p2.winPoint(p1);

		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);

		// // tieBreak
		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);
		//
		p2.winPoint(p1);
		p2.winPoint(p1);
		p2.winPoint(p1);
		p2.winPoint(p1);
		p2.winPoint(p1);
		p2.winPoint(p1);
		p2.winPoint(p1);
		// p2.winPoint(p1); //Match point : Remove comment and p2 will win the game with Tie break 6-8
	}

}
