package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> hand;

	public Hand() {
		hand = new ArrayList<>();
	}

	public void resetHand() {
		hand = new ArrayList<>();
	}

	public List<Card> getCards(){
		return hand;
	}

	public abstract int getHandValue();
}