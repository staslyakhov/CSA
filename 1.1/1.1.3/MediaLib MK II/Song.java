/**
 * Song descrip.
 * 
 * @author (Stan Lyakhov) 
 * @version (.1)
 * @date (9/12/2016)
 */
public class Song
{
    // Instance variables - replace the example below with your own
    private int rating;
    private String title;

    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // Initialise instance variables
        rating = 0;
        title = "";
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
}
