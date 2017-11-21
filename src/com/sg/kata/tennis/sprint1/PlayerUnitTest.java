package com.sg.kata.tennis.sprint1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerUnitTest {

	private Player p1 = new Player();
	private Player p2 = new Player();
	
	@Test
	public void should_return_DEUCE_for_the_two_players() {
		p1.winPoint(p2);// 15-0
		p1.winPoint(p2);// 30-0
		p1.winPoint(p2);// 40-0

		p2.winPoint(p1);// 40-15
		p2.winPoint(p1);// 40-30
		p2.winPoint(p1);// 40-40
		p2.winPoint(p1);// 40-ADV

		p1.winPoint(p2);// DEUCE-DEUCE
		
		assertEquals(p2.getCurrentPoint(), "DEUCE");
		assertEquals(p1.getCurrentPoint(), "DEUCE");
	}
	
	@Test
	public void should_return_1_for_p2_and_0_for_p1() {
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
		
		assertEquals(p2.getGameCounter(), 1);
		assertEquals(p1.getGameCounter(), 0);
	}
	
	@Test
	public void should_return_1_for_p2_and_2_for_p1() {
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

		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);

		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);
		
		assertEquals(p2.getGameCounter(), 1);
		assertEquals(p1.getGameCounter(), 2);
	}

}
