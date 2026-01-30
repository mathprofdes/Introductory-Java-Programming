/*-
 * PokerHand
 * PokerHand class uses an array of 5 cards to simulate a single poker-type hand. 
 * Author:  Don Spickler
 * Date: 3/7/2011
 */

public class PokerHand {
	// Data Members
	private Card hand[] = new Card[5];
	int cardsInHand = 0;

	// Constructor
	public PokerHand() {
		cardsInHand = 0;
	}

	// Empty Hand
	public void clearHand() {
		cardsInHand = 0;
	}

	// Adds a card to the poker hand.
	public void addToHand(Card card) {
		if (cardsInHand < 5)
			hand[cardsInHand++] = new Card(card.getValue(), card.getSuit());
	}

	// Prints out the poker hand.
	public void PrintHand() {
		for (int i = 0; i < cardsInHand; i++) {
			System.out.print(hand[i].toString(false) + " ");
		}
		System.out.println();
	}
}
