import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
        if (containspairsum11(selectedCards) && selectedCards.size() == 2){
            return true;
        }
        return (containsJQK(selectedCards) && selectedCards.size() == 3);
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
        List<Integer> selected = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8);
        if (containspairsum11(selected)) {
            return true;
        }
        else if (containsJQK(selected)) {
            return true;
        }
        return false;
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.  * @return true if the board entries in selectedcards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containspairsum11(List<Integer> selectedcards) {
   //     if (((super.cardAt(selectedcards.get(0)).pointValue()
   //             + (super.cardAt(selectedcards.get(1)).pointValue()) == 11))){
        int sum = 0;
        for (int i : selectedcards) {
            for (int x : selectedcards){
                sum = ((super.cardAt(i)).pointValue()) + ((super.cardAt(x)).pointValue());
                if (sum == 11) {
                return true;

                }
            }
       }
        return false;
	}

	/**
	 * check for a jqk in the selected cards.
	 * @param selectedcards selects a subset of this board.  it is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
        String[] theCards = new String[9];
        for (int i : selectedCards) {
            theCards[i] = (super.cardAt(i).rank());
        }
        if (Arrays.asList(theCards).contains("queen") 
                && Arrays.asList(theCards).contains("jack")
                && Arrays.asList(theCards).contains("king")) {
            return true;
        }
        return false;
	}
}
