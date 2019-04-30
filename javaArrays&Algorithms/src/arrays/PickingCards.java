package arrays;

public class PickingCards {

	public static void main(String[] args) {
		// pick 4 cards from a deck
		int numberCards = 4; // we are picking this many cards
		int suit, card;
		String[] suitName = { "spades", "hearts", "diamonds", "clubs" };
		String[] cardName = { "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king" };
		int[] deck = new int[52];
		// initialize cards (in deck)
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		// randomize cards in deck (code from slide 38 - random shuffling)
		for (int i = deck.length - 1; i > 0; i--) {
			// generate an index j randomly with 0 <= j <= i
			int j = (int) (Math.random() * (i + 1));
			// Swap deck[1] with deck[j]
			int temp = deck[i];
			deck[i] = deck[j];
			deck[j] = temp;
		}
		// pick a card
		System.out.println("Your " + numberCards + " cards are: ");
		for (int i = 0; i < numberCards; i++) { // loop numberCards times
			// lazy way to assign names
			card = deck[i] % 13; // value of card corresponds to the cardName array
			suit = deck[i] / 13; // value of suit corresponds to the suitName array
			System.out.println("  The " + cardName[card] + " of " + suitName[suit] + " (" + deck[i] + ")");

		}

	}

}
