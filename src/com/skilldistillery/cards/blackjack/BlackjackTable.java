package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackjackTable {
	private Scanner kb = new Scanner(System.in);
	Player user = new Player();
	BlackJackDealer dealer = new BlackJackDealer();

	public static void main(String[] args) {
		BlackjackTable table = new BlackjackTable();
		table.run();
	}

	public void run() {
		dealer.getDeck().shuffle();
		dealer.dealInitial(user, dealer, 2);
		boolean blackjack = isBlackjack(dealer, user);

		if (!blackjack) {
			System.out.println(user);
			System.out.println("Total: " + user.getHand().getHandValue() + "\n");
			dealer.showOne();

			boolean playing = true;

			while (playing == true) {
				System.out.println("Hit or stay?");
				String choice = kb.nextLine();

				switch (choice) {
				case "hit":
				case "Hit":
				case "HIT":
				case "1":
					playing = !processHit();
					break;
				default:
					playing = false;
				}
			}
			System.out.println("\n");

			if (user.getHand().isBusted()) {
				System.out.println("Busted...");
			} else {
				if (!getDealerCards()) {
					checkWin();
				} else {
					System.out.println("You win!");
				}
			}
		}
		kb.close();
	}

	private boolean processHit() {
		user.hit(dealer);
		System.out.println(user);
		System.out.println("Total: " + user.getHand().getHandValue());
		return user.getHand().isBusted();
	}

	private boolean checkWin() {
		System.out.println("Your Hand: " + user.getHand().getHandValue());
		if (user.getHand().getHandValue() > dealer.getHand().getHandValue()) {
			System.out.println("You won!");
			return true;
		} else {
			System.out.println("Not this time...");
			return false;
		}
	}

	private boolean getDealerCards() {
		boolean bust = false;

		while (bust || dealer.getHand().getHandValue() < 16) {
			dealer.hit(dealer);
			bust = dealer.getHand().isBusted();
		}

		System.out.println(dealer);
		System.out.println("Dealer Total: " + dealer.getHand().getHandValue());
		return bust;
	}

	private boolean isBlackjack(BlackJackPlayer dealer, BlackJackPlayer p1) {
		if (dealer.getHand().isBlackjack() && p1.getHand().isBlackjack()) {
			System.out.println(dealer);
			System.out.println(p1);
			return true;
		} else if (dealer.getHand().isBlackjack() && !p1.getHand().isBlackjack()) {
			System.out.println(dealer);
			System.out.println(p1);
			return true;
		} else if (dealer.getHand().isBlackjack() && p1.getHand().isBlackjack()) {
			System.out.println(dealer);
			System.out.println(p1);
			return true;
		} else
			return false;
	}

}
