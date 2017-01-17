
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card
{
    private String rank;
    private String suit;
    private int point;

    //Constructor
    public Card(String rank, String suit, int point) {
        this.rank = rank;
        this.suit = suit;
        this.point = point;
    }
    
    //Returns true if cards are identical
    public boolean testCard(Card card1, Card card2) {
        return (card1.getRank().equals(card2.getRank()) && card1.getSuit().equals(card2.getSuit()) && card1.getPoint() == card2.getPoint());
    }

    //Rank accessor
    public String getRank() { 
        return rank;
    }

    //Suit accessor
    public String getSuit() {
        return suit;
    }
    //Point accessor
    public int getPoint() {
        return point;
    }
}
