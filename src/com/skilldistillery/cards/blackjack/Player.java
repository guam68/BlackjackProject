package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class Player extends BlackJackPlayer{

	public Player() {
		super();
		hand = new BlackJackHand();
	}	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("----------------------\n");
		for (Card card : hand.getHand()) {
			builder.append(card + "\n");
		}
		builder.append("----------------------");
		return builder.toString();
	}
	
}
