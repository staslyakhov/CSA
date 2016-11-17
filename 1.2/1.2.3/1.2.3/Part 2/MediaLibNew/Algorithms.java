
/**
 * Write a description of class Algorithms here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class Algorithms
{ 
    public static void main(){
       Song[] topTenSongs =  {
            new Song("The Twist",4),
            new Song("Smooth",3),
            new Song("Mack the Knife",3),
            new Song("How do I live",7),
            new Song("Party rock anthem",4),
            new Song("I gotta feeling",2),
            new Song("Macarena",6),
            new Song("Physical",10),
            new Song("You light up my life",2),
            new Song("Hey Jude",2)
                             };
                             
        for (Song song : topTenSongs){
            System.out.print("Title: " + song.getTitle());
            System.out.println(". Rating: " + song.getRate());
        }
        ///
        ///
       System.out.println("Best song: " + bestSongs(topTenSongs));
       System.out.println("Worst song: " + worstSongs(topTenSongs));
       countSecond(topTenSongs);
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
  /*  public static String countSecond(Song[] topTenSongs){
        int index = 0;
        int bestSoFar = topTenSongs[0].getRate();
        int secondBest = bestSoFar +1 ;
        ArrayList second = new ArrayList();
        for (int i = 0; i <= topTenSongs.length-1; i++){
            if (topTenSongs[i].getRate() < bestSoFar) {
                bestSoFar = topTenSongs[i].getRate();
                index = i;
            }
        }
        for(int i = 0; i <= topTenSongs.length-1; i++){
            if (topTenSongs[i].getRate() <= secondBest && topTenSongs[i].getRate() > bestSoFar  ) {
                if(topTenSongs[i].getRate() < secondBest){
                    second.clear();
                }    
                secondBest = topTenSongs[i].getRate();
                index = i;
                second.add(topTenSongs[i].getTitle());
                
            }
        }
        String format = second.toString()
        .replace("[", "") 
        .replace("]", "") 
        .trim();     
        return format;
        */    
   
    public static void countSecond(Song[] topTenSongs){
        int bestSoFar = topTenSongs[0].getRate();
        int secondBest = (bestSoFar * 10);
        for (Song secondNum : topTenSongs){
            if (secondNum.getRate() < bestSoFar) {
                bestSoFar = secondNum.getRate();
            }
           // System.out.println(bestSoFar);
        }
        System.out.println(bestSoFar);
        for (Song secondNum : topTenSongs){
            if (secondNum.getRate() < secondBest && secondNum.getRate() > bestSoFar  ) {
                secondBest = secondNum.getRate();
            }    
            System.out.println(secondBest);
        } 
        System.out.println(secondBest);
        for (Song secondNum : topTenSongs){
            if (secondNum.getRate() == secondBest){
                System.out.println(secondNum.getTitle());
            }
        }
    }
}