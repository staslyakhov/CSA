
/**
 * Write a description of class CardTester here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class CardTester
{
    /**
    public static void main(String[] args) {
        Card[] arr = new Card[] { new Card("queen", "spades", 10),
                                  new Card("queen", "spades", 10),
                                  new Card("ace", "hearts", 10) }; 
        for (int i=0; i < arr.length; i++) {
            System.out.println("Card " + (i+1) + ":");
            System.out.println(arr[i].getRank());
            System.out.println(arr[i].getSuit());
            System.out.println(arr[i].getPoint());
            System.out.println("");

        }
        System.out.println("Does card 1 equal card 2? " + arr[0].testCard(arr[0], arr[1]));
        System.out.println("Does card 2 equal card 3? " + arr[0].testCard(arr[1], arr[2]));
        System.out.println("");
        System.out.println(arr[0]);
        System.out.println(arr[0].toString());
    }
*/
	public static void main(String[] args) {
        Card c1 = new Card("ace", "hearts", 1);
        Card c2 = new Card("ace", "hearts", 1);
        Card c3 = new Card("ace", "hearts", 2);
        Card c4 = new Card("ace", "spades", 1);
        Card c5 = new Card("king", "hearts", 1);
        Card c6 = new Card("queen", "clubs", 3);
        assert c1.getRank().equals("ace") : "Wrong rank: " + c1.getRank();
        assert c1.getSuit().equals("hearts") : "Wrong suit: " + c1.getSuit();
        assert c1.getPoint() == 1 : "Wrong point value: "
                + c1.getPoint();
        assert c6.getRank().equals("queen") : "Wrong rank: " + c6.getRank();
        assert c6.getSuit().equals("clubs") : "Wrong suit: " + c6.getSuit();
        assert c6.getPoint() == 3: "Wrong point value : "
                + c6.getPoint();
        assert c1.testCard(c1) : "Card doesn't match itself: " + c1;
        assert c1.testCard(c2) : "Duplicate cards aren't equal: " + c1;
        assert !c1.testCard(c3)
                : "Different cards are equal: " + c1 + ", " + c3;
        assert !c1.testCard(c4)
                : "Different cards are equal: " + c1 + ", " + c4;
        assert !c1.testCard(c5)
                : "Different cards are equal: " + c1 + ", " + c5;
        assert !c1.testCard(c6)
                : "Different cards are equal: " + c1 + ", " + c6;
        assert c1.toString().equals("ace of hearts (point value = 1)")
                    : "Wrong toString: " + c1;
        assert c6.toString().equals("queen of clubs (point value = 3)")
                : "Wrong toString: " + c6;
    //	test1CardDeck();
    //	test2CardDeck();
    //	testShuffle();
		System.out.println("All tests passed!");
    }
}
