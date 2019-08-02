package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackJackDealer extends BlackJackPlayer{
	Deck deck = new Deck();

	public BlackJackDealer() {
		super();
	}

	public void showOne() {
		System.out.println("Dealer's Showing: ");
		System.out.println(hand.getHand().get(0));
		System.out.println("----------------------");
	}
	
	public Deck getDeck() {
		return deck;
	}

	public void dealInitial(BlackJackPlayer p1, BlackJackPlayer p2, int amount) {
		for(int i = 0; i<amount; i++) {
			p1.getHand().getCards().add(deck.dealCard());
			p2.getHand().getCards().add(deck.dealCard());
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dealer's Hand: \n");
		builder.append("----------------------\n");
		for (Card card : hand.getHand()) {
			builder.append(card + "\n");
		}
		builder.append("----------------------");
		return builder.toString();
	}

}
