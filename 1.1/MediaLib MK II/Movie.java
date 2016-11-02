/**
 * Song descrip.
 * 
 * @author (Stan Lyakhov) 
 * @version (.1)
 * @date (9/12/2016)
 */
public class Movie
{
    // Instance variables - replace the example below with your own
    private int rating;
    private String title;
    private int duration=0;
    public static int totalDuration = 0;
    public static double avgDuration = 0;
    /**
     * Constructor for objects of class Song
     */
    public Movie(int duration)
    {
        // Initialise instance variables
        this.duration = duration;
        rating = 0;
        title = "";
        totalDuration = totalDuration + duration;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String t) {
        title = t;
    }
    public int getRate() {
        return rating;
    }
    public void setRate(int r) {
        rating = r;
    }
    public int getDuration(){
        return duration % 60;
    }
    public void setDuration(int d){
        duration = d;
    }
    public int getDuration2(){
        return duration/60;
    }
    public int totalDuraion(){
        return totalDuration % 60;
    }
    public int totalDuration2(){
        return totalDuration/60;
    }
    public int avgDuraion(){
        avgDuration = (double)totalDuration/3;
        return (int)avgDuration % 60;
    }
    public int avgDuration2(){
        avgDuration = (double)totalDuration/3;        
        return (int)avgDuration/60;
    }
}
