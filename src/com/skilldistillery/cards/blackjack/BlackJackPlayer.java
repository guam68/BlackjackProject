package com.skilldistillery.cards.blackjack;


public class BlackJackPlayer {
	BlackJackHand hand;
	
	public BlackJackPlayer() {
		hand = new BlackJackHand();
	}
	
	public void hit(BlackJackDealer dealer) {
		if (dealer.deck.checkDeckSize() > 0) {
			hand.getHand().add(dealer.getDeck().dealCard());
		}
	}
	
	public BlackJackHand getHand() {
		return hand; 
	}
	
}
