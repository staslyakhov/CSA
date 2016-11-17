
/**
 * Write a description of class Algorithms here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Algorithms
{
    public static void main(){
       Song[] topTenSongs =  {
            new Song("The Twist",4),
            new Song("Smooth",5),
            new Song("Mack the Knife",2),
            new Song("How do I live",7),
            new Song("Party rock anthem",9),
            new Song("I gotta feeling",8),
            new Song("Macarena",6),
            new Song("Physical",10),
            new Song("You light up my life",5),
            new Song("Hey Jude",1)
                             };
                             
        for (Song song : topTenSongs){
            System.out.print("Title: " + song.getTitle());
            System.out.println(". Rating: " + song.getRate());
        }
        ///
        ///
       System.out.println("Best song: " + bestSongs(topTenSongs));
       System.out.println("Worst song: " + worstSongs(topTenSongs));
    }
    public static String bestSongs(Song[] topTenSongs){
        int index = 0;
        int bestSoFar = topTenSongs[0].getRate();
        for (int i = 0; i <= topTenSongs.length-1; i++){
            if (topTenSongs[i].getRate() < bestSoFar) {
                bestSoFar = topTenSongs[i].getRate();
                index = i;
            }
        }
        return topTenSongs[index].getTitle();
    }    
    public static String worstSongs(Song[] topTenSongs){
        int index = 0;
        int bestSoFar = topTenSongs[0].getRate();
        for (int i = 0; i <= topTenSongs.length-1; i++){
            if (topTenSongs[i].getRate() > bestSoFar) {
                bestSoFar = topTenSongs[i].getRate();
                index = i;
            }
        }
        return topTenSongs[index].getTitle();
    }
}
