package com.sap.ase;

import java.util.HashMap;
import java.util.Map;

public class Bets {

	private Map<String, Integer> betList = new HashMap<>();
	private final int MAX_BET_AMOUNT = 100;

	public boolean hasBets() {
		return betList.size() > 0;
	}

	public void bet(String name, int amount) {
		if (amount > MAX_BET_AMOUNT)
			throw new BetTooHigh();

		betList.put(name, amount);
	}

	public boolean areEven() {
		if (betList.size() <= 1)
			throw new InvalidNumberOfPlayers();
		
		betList.entrySet().stream().max((entry1, entry2) -> {
			if(!entry1.getKey().equals(entry2.getKey())) {
				return 0;
			}

			
			if(entry1.getValue() > entry2.getValue()) {
				return 1;
			} else if(entry1.getValue() < entry2.getValue()) {
				return -1;
			}
			
			return 0;
		});
		return betList.values().toArray()[0].equals(betList.values().toArray()[1]);
	}

	public class InvalidNumberOfPlayers extends RuntimeException {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	}

	public class BetTooHigh extends RuntimeException {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	}

}
