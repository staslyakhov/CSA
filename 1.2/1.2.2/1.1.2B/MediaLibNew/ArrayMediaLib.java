
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
        Song[] topTenSongs = {
                             new Song("The twist"),
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
                            
       // change the array
        System.out.println("—BEFORE--"); //(This should go before the print out we just made. -- DW)
        for (Song changeSong : topTenSongs) { 
            changeSong = new Song("test");
            System.out.println(changeSong.getTitle());
        }
        for (int i = 0 ; i < (topTenSongs.length) ; i++) { 
            if ((i+1) % 3 != 0 ){
                topTenSongs[i].setPrice(1.29);
            }
            else{
                topTenSongs[i].setPrice(.99);
            }
        }
        
        
      /**  for (int i = 0; i < topTenSongs.length; i++){
       *    topTenSongs[i] = new Song("test");
       *     
       *}
       */         // show the array
        System.out.println("—AFTER--");
        
        for (Song showSong : topTenSongs) {
            System.out.println(showSong.getTitle());
            System.out.println(showSong.getPrice());
        }
        System.out.println("Every 2, for loop");
        for (int i = 0 ; i < topTenSongs.length; i++) {
            if ((i+1) % 2 != 0){
                System.out.println(topTenSongs[i].getTitle());
                System.out.println(topTenSongs[i].getPrice());
            }
        }
        System.out.println("Every 2, for each loop");
        int i = 0;
        for (Song showsong : topTenSongs){
            if ((i+1) % 2 != 0){
                System.out.println(showsong.getTitle());
                System.out.println(showsong.getPrice());
            }
            i ++;
        }

       /**  for (int i = 0; i < sharingFriends.length; i++)            {
        *        System.out.println(sharingFriends[i]);
        *    }
        *for (int n : daysBtwnPurchase)
        *    {
        *        total = total + n;
        *        
        *    }
        * System.out.println(total/daysBtwnPurchase.length);
        * for (Song s: topTenSongs)
        *    {
        *       System.out.println(s.getTitle());
        *    }
        */

    } 
}
