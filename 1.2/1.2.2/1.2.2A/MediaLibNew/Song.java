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
    private double price; 
    private boolean favourite;
    public static int numSongs = 0;
    public static double totalPrice = 0.0;
    public static int totalRating = 0;
    private double avgRating = 0.0;

    /**
     * Constructor for objects of class Song
     */
  
    
    public Song(){
        rating = 0;
        title = "";
        price = 0.0;
        totalPrice = totalPrice + price;
        numSongs ++;
        totalRating = totalRating + rating;
    }
    public Song(String title, double price) {
        this.title = title;
        this.price = price;
    }
        public Song(String title) {
        this.title = title;
        this.price = price;
    }
    public Song(int rating, String title, double price) {
        this.rating = rating;
        this.title = title;
        this.price = price;
        totalPrice = totalPrice + price;
        totalRating = totalRating + rating;
        numSongs ++;
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
    public double getPrice() {
        return price;
    }
    public void setPrice(double p) {
        price = p;
    }
    public void addToFavourites(){
        favourite = true;
    }
    public int print() {
        return numSongs;    
    }
    public double print2() {
        
        return totalPrice/10;   
    }
    public double print3() {
        avgRating = (double) totalRating/10;
        return avgRating;   
    }
    public double print4() {
        return totalRating;   
    }
    public double print5() {
        return totalPrice;   
    }
    public void end(){
        totalRating = 0;
        avgRating = 0;
        numSongs = 0;
        totalPrice = 0;
    }
}