
/**
 * Write a description of class CardTester here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class CardTester
{
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
}
