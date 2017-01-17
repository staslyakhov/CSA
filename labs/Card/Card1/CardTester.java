
/**
 * Write a description of class CardTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardTester
{
    public static void main() {
        Card[] arr = new Card[] { new Card("ace", "hearts", 14),
                                  new Card("queen", "spades", 12),
                                  new Card("ace", "hearts", 14) };         
        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i].getRank());
            System.out.println(arr[i].getSuit());
            System.out.println(arr[i].getPoint());

        } 
    }
}
