package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.common.Hand;

public class BlackJackHand extends Hand{

	private static final int BLACKJACK = 21;

	public BlackJackHand() {
		super();
	}
	
	public void hit(Deck deck) {
		if (deck.checkDeckSize() > 0) {
			hand.add(deck.dealCard());
		}
	}
	
	public void showHand() {
		System.out.println("----------------------");
		for (Card card : hand) {
			System.out.println(card);
		}
		System.out.println("----------------------");
	}
	
	public int getHandValue() {
		int value = 0;
		for (Card card : hand) {
			value += card.getValue();
		}
		return value;
	}
	
	public boolean checkBusted() {
		return getHandValue() > BLACKJACK ? true : false;
	}

}
