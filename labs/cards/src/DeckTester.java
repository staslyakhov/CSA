
/**
 * Write a description of class DeckTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeckTester
{
    public static void main(String[] args) {
        String[] ranks = {"2","3","4","5","6","7","8","9","10", "jack", "queen", "king", "ace"};
        String[] suits = {"diamonds", "hearts", "spades", "clubs"};
        int[] values = {2,3,4,5,6,7,8,9,10, 10, 10, 10, 11};
        Deck deck1 = new Deck(ranks,suits,values);

        /**
         * System.out.println("(full deck) \n"); System.out.println("Deck size:
         * " + deck1.getSize() + "\n"); System.out.println(deck1);
         * System.out.println("is the deck empty? "+ deck1.isEmpty()+ "\n");
         * 
         * System.out.println("\n >>>>>>>>>>>> \n" ); System.out.println("(one
         * card dealt) \n"); deck1.deal(); System.out.println("Deck size: " +
         * deck1.getSize()+ "\n"); System.out.println(deck1);
         * System.out.println("is the deck empty? "+ deck1.isEmpty());
         * 
         * System.out.println("\n >>>>>>>>>>>> \n" ); System.out.println("(all
         * cards dealt) \n"); for (int i=0;i < 51; i++) { deck1.deal(); }
         * System.out.println("Deck size: " + deck1.getSize()+ "\n");
         * System.out.println(deck1); System.out.println("is the deck empty? "+
         * deck1.isEmpty());
         */
        System.out.println("(full deck) \n");
        System.out.println("Deck size: " + deck1.getSize() + "\n");
        System.out.println(deck1);
        System.out.println("is the deck empty? "+ deck1.isEmpty()+ "\n");
        for (int i=0; i<12;i++) {
            deck1.deal();
        }
        deck1.shuffle(deck1.getCards());

        System..println("(Shuflled)");
        System.out.println("Deck size: " + deck1.getSize() + "\n");
        System.out.println(deck1);
        System.out.println("is the deck empty? "+ deck1.isEmpty()+ "\n");

    }
}
