package com.skilldistillery.cards.blackjack;

import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackJackHand extends Hand{

	private static final int BLACKJACK = 21;

	public BlackJackHand() {
		super();
	}
	
	public int getHandValue() {
		int value = 0;
		for (Card card : hand) {
			value += card.getValue();
		}
		return value;
	}
	
	public boolean isBusted() {
		return getHandValue() > BLACKJACK ? true : false;
	}
	
	public boolean isBlackjack() {
		return getHandValue() == BLACKJACK ? true : false;
	}
	
	public List<Card> getHand() {
		return this.hand;
	}

}
