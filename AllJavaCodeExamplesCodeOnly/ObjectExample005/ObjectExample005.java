/*-
 * ObjectExample005
 * Example of using an array inside an object.  
 * Author:  Don Spickler
 * Date: 3/7/2011
 */

public class ObjectExample005 {

	public static void main(String[] args) {
		Deck cards = new Deck();

		System.out.print("Cards:  ");
		cards.PrintDeck();
		cards.ShuffleDeck();
		System.out.print("Cards:  ");
		cards.PrintDeck();

		System.out.println();

		Deck cards3 = cards.copyDeck();
		System.out.print("Cards:  ");
		cards.PrintDeck();
		System.out.print("Cards3:  ");
		cards3.PrintDeck();

		System.out.println();

		cards.ShuffleDeck();
		System.out.print("Cards:  ");
		cards.PrintDeck();
		System.out.print("Cards3:  ");
		cards3.PrintDeck();

		System.out.println();

		PokerHand hand1 = new PokerHand();
		PokerHand hand2 = new PokerHand();
		cards.RiffleShuffleDeck();
		System.out.print("Cards:  ");
		cards.PrintDeck();

		for (int i = 0; i < 5; i++) {
			hand1.addToHand(cards.dealCard());
			hand2.addToHand(cards.dealCard());
		}

		System.out.println();
		hand1.PrintHand();
		hand2.PrintHand();

		hand1.addToHand(cards.dealCard());
		hand2.addToHand(cards.dealCard());
		System.out.println();

		hand1.PrintHand();
		hand2.PrintHand();

		System.out.println();

		hand1.clearHand();
		hand2.clearHand();
		cards.RiffleShuffleDeck();
		System.out.print("Cards:  ");
		cards.PrintDeck();

		System.out.println();
		hand1.addToHand(cards.dealCard());
		hand2.addToHand(cards.dealCard());
		hand1.PrintHand();
		hand2.PrintHand();

		hand1.addToHand(cards.dealCard());
		hand2.addToHand(cards.dealCard());
		hand1.PrintHand();
		hand2.PrintHand();

		hand1.addToHand(cards.dealCard());
		hand2.addToHand(cards.dealCard());
		hand1.PrintHand();
		hand2.PrintHand();
	}
}
