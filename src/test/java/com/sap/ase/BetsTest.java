package com.sap.ase;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.sap.ase.Bets.BetTooHigh;
import com.sap.ase.Bets.InvalidNumberOfPlayers;

public class BetsTest {

	Bets cut;

	@Before
	public void setup() {
		cut = new Bets();
	}

	@Test
	public void hasNoBets() throws Exception {
		assertFalse(cut.hasBets());
	}

	@Test
	public void hasBets() throws Exception {
		cut.bet("player1", 10);
		assertTrue(cut.hasBets());
	}

	@Test
	public void has2Bets() throws Exception {
		cut.bet("player1",2);
		cut.bet("player2",2);
		assertTrue(cut.areEven());
	}
	
	@Test
	public void differentBets() {
		cut.bet("player1",1);
		cut.bet("player2",2);
		assertFalse(cut.areEven());
	}
	
	@Test(expected = InvalidNumberOfPlayers.class)
	public void noBets()  {
		cut.areEven();
	}
	
	@Test(expected = InvalidNumberOfPlayers.class)
	public void onlyOneBets()  {
		cut.bet("player1",10);
		cut.areEven();
	}
	
	@Test(expected = BetTooHigh.class)
	public void bet2High()  {
		cut.bet("player1",101);
	}
	
	@Test()
	public void twoPlayersMultipleBets()  {
		cut.bet("player1",10);
		cut.bet("player2",11);
		cut.bet("player1",12);
		cut.bet("player2",12);
		assertTrue(cut.areEven());
	}
}