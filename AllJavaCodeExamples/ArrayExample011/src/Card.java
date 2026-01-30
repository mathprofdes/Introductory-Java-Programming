/*-
 * Card
 * Card class a card value and card suit.  Also contains accessor methods and  
 * methods for determining the face value of the card.  
 * Author:  Don Spickler
 * Date: 3/6/2011
 */

public class Card {
	private String value;
	private String suit;

	public Card(String v, String s) {
		value = v;
		suit = s;
	}

	public String getValue() {
		return value;
	}

	public String getSuit() {
		return suit;
	}

	public int getWorth() {
		if (value.equals("A"))
			return 1;
		else if (value.equals("2"))
			return 2;
		else if (value.equals("3"))
			return 3;
		else if (value.equals("4"))
			return 4;
		else if (value.equals("5"))
			return 5;
		else if (value.equals("6"))
			return 6;
		else if (value.equals("7"))
			return 7;
		else if (value.equals("8"))
			return 8;
		else if (value.equals("9"))
			return 9;
		else
			return 10;
	}

	public boolean isAce() {
		return value.equals("A");
	}
}
