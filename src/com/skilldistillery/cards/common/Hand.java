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

	public void hit(Deck deck) {
		if (deck.checkDeckSize() > 0) {
			hand.add(deck.dealCard());
		}
	}

	public abstract int getHandValue();

	@Override
	public String toString() {
		System.out.println("----------------------");
		for (Card card : hand) {
			System.out.println(card);
		}
		System.out.println("----------------------");
		return null;
	}
	
}