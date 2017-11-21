package com.sg.kata.tennis.sprint2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerUnitTest {

	private Player p1 = new Player();
	private Player p2 = new Player();

	@Test
	public void should_return_p1_is_the_winner_with_score_6_4() {
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

		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);

		assertTrue(p1.isWinMatch());
		assertEquals(p1.getGameCounter(), 6);
		assertEquals(p2.getGameCounter(), 4);
	}

	@Test
	public void should_return_6_for_p1_and_5_for_p2_and_winMatch_is_False() {
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

		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);
		p1.winPoint(p2);

		assertEquals(p1.getGameCounter(), 6);
		assertEquals(p2.getGameCounter(), 5);
		assertFalse(p1.isWinMatch());

	}

	@Test
	public void should_return_6_6_for_both_of_players_and_tieBreak_true() {
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

		assertFalse(p1.isWinMatch());
		assertFalse(p2.isWinMatch());
		assertEquals(p1.getGameCounter(), 6);
		assertEquals(p2.getGameCounter(), 6);

		assertTrue(p1.isTieBreak());
		assertTrue(p2.isTieBreak());

	}

	@Test
	public void should_return_7_for_p2_and_6_for_p2_and_winMatch_true_with_tieBreak() {
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
		
		assertEquals(p1.getTieBreakScore(), 6);
		assertEquals(p2.getTieBreakScore(), 7);
		
		p2.winPoint(p1); // ************ Match point *************
		
		assertEquals(p1.getGameCounter(), 6);
		assertEquals(p2.getGameCounter(), 7);
		

		assertTrue(p1.isTieBreak());
		assertTrue(p2.isTieBreak());
		
		assertFalse(p1.isWinMatch());
		assertTrue(p2.isWinMatch());
		
	}

}
