
/**
 * Write a description of class ArrayMediaLib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayMediaLib
{
    
    public static void main(){
        double total = 0;       
        String[] sharingFriends = {"Dane", "Otakar", "Tamir", "Andrew", "Dane"};
        int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
        Song[] topTenSongs = {new Song("The twist"),
                             new Song("Smooth"),
                             new Song("Mack the knife"),
                             new Song("How do I live"),
                             new Song("Party rock anthem"),
                             new Song("I gotta feeling"),
                             new Song("Macarena"),
                             new Song("Physical"),
                             new Song("You light up my life"),
                             new Song("Hey Jude")
                             };
                            
        for (int i = 0; i < sharingFriends.length; i++)
            {
                System.out.println(sharingFriends[i]);
            }
        for (int n : daysBtwnPurchase)
            {
                total = total + n;
                
            }
        System.out.println(total/daysBtwnPurchase.length);
        for (Song s: topTenSongs)
            {
                System.out.println(s.getTitle());
            }
    } 
}
