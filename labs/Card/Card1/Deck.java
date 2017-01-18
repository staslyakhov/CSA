
/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Deck
{
    private int size;
    private List<Card> cards = new ArrayList<Card>();

    //constructor
    public Deck(String[] ranks, String[] suits, int[] values) {
        for (int x=0; x <suits.length; x++) {
            for (int i=0; i<ranks.length; i++) {
                cards.add(new Card(ranks[i], suits[x], values[i]));
            }
        }      
        size = cards.size();
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    } 
    public Card deal() {
        size -= 1;
        return cards.get(size);
    }
    @Override
    public String toString() {
        String rtn = "Undealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
    public int getSize() {
        return size;
    }
}
