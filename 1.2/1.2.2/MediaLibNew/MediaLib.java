/**
 * MediaLib descrip.
 * 
 * @author (Stan Lyakhov ) 
 * @version (.1)
 * @date (9/12/2016)
 */
public class MediaLib
{
    public static void main()
    {
        System.out.println("Welcome to your Media Library");
        Song song1 = new Song(5, "Johnny B. Goode", 0.99);
        Song song2 = new Song(10,"symphony 9", 1.29 );
        Song song3 = new Song(6, "hello", 0.99);
        Song song4 = new Song(7, "Let it be ", 1.29);
        Song song5 = new Song(10, "Great song", 0.99);
        Song song6 = new Song(1, "bad song", 1.29);
        Song song7 = new Song(9, "Breath", 1.29);
        Song song8 = new Song(2, "Trash", 0.99);
        Song song9 = new Song(9, "The show must go on", 1.29);
        Song song10 = new Song(7, "Amazing song", 0.99);
        Book book1 = new Book();
        Movie movie1 = new Movie(133);
        Movie movie3 = new Movie(155);
        Book book2 = new Book();
        Movie movie2 = new Movie(97);
        
        
        
        System.out.println(song1.getTitle());
        System.out.print(song1.getRate());
        System.out.println("*");        
        System.out.print(song1.getPrice());
        System.out.println("$");         
        
        System.out.println(song2.getTitle());
        System.out.print(song2.getRate());
        System.out.println("*");
        System.out.print(song2.getPrice());
        System.out.println("$"); 
        
        System.out.println(song3.getTitle());
        System.out.print(song3.getRate());
        System.out.println("*");
        System.out.print(song3.getPrice());
        System.out.println("$"); 
        
        System.out.println(song4.getTitle());
        System.out.print(song4.getRate());
        System.out.println("*");     
        System.out.print(song4.getPrice());
        System.out.println("$"); 
        
        System.out.println(song5.getTitle());  
        System.out.print(song5.getRate());
        System.out.println("*");      
        System.out.print(song5.getPrice());
        System.out.println("$"); 
        
        System.out.println(song6.getTitle());
        System.out.print(song6.getRate());
        System.out.println("*");
        System.out.print(song6.getPrice());
        System.out.println("$");
        
        System.out.println(song7.getTitle());
        System.out.print(song7.getRate());
        System.out.println("*");
        System.out.print(song7.getPrice());
        System.out.println("$"); 
        
                
        System.out.println(song8.getTitle());
        System.out.print(song8.getRate());
        System.out.println("*");
        System.out.print(song8.getPrice());
        System.out.println("$"); 
        
                
        System.out.println(song9.getTitle());
        System.out.print(song9.getRate());
        System.out.println("*");
        System.out.print(song9.getPrice());
        System.out.println("$"); 
        
        System.out.println(song10.getTitle());
        System.out.print(song10.getRate());
        System.out.println("*");
        System.out.print(song10.getPrice());
        System.out.println("$"); 
        System.out.println(" ");
        
        System.out.print("Average Price: "); 
        System.out.print(song10.print2());
        System.out.println("$");
        System.out.print("Average Rating: "); 
        System.out.print(song10.print3());
        System.out.println("*");
        System.out.println("");
       

        
        
        movie1.setTitle("Dr.Ivan");
        System.out.println(movie1.getTitle());
        movie1.setRate(1);
        //movie1.setDuration();
        System.out.print(movie1.getDuration2());
        System.out.print(" Hours ");
        System.out.print(movie1.getDuration());
        System.out.println(" Minutes ");
        
        
        movie2.setTitle("Matrix");
        System.out.println(movie2.getTitle());
        movie2.setRate(9);
        //movie2.setDuration();
        System.out.print(movie2.getDuration2());
        System.out.print(" Hours ");
        System.out.print(movie2.getDuration());
        System.out.println(" Minutes ");
        
        movie3.setTitle("Red");
        System.out.println(movie3.getTitle());
        movie3.setRate(8);
        //movie3.setDuration();
        System.out.print(movie3.getDuration2());
        System.out.print(" Hours ");
        System.out.print(movie3.getDuration());
        System.out.println(" Minutes ");
        System.out.println(" ");
        
        System.out.print(movie2.totalDuration2());
        System.out.print(" Hours ");
        System.out.print(movie2.totalDuraion());
        System.out.println(" Minutes total");
        
        System.out.print(movie2.avgDuration2());
        System.out.print(" Hours ");
        System.out.print(movie2.avgDuraion());
        System.out.print(" Minutes average");
        

        
        //1.2
        MediaFile.writeString(song1.getTitle()+"|" + song1.getRate());
        MediaFile.writeString(song2.getTitle()+"|" + song2.getRate());
        MediaFile.writeString(song3.getTitle()+"|" + song3.getRate());
        MediaFile.writeString(song4.getTitle()+"|" + song4.getRate());
        MediaFile.writeString(song5.getTitle()+"|" + song5.getRate());
        MediaFile.writeString(song6.getTitle()+"|" + song6.getRate());
        MediaFile.writeString(song7.getTitle()+"|" + song7.getRate());
        MediaFile.writeString(song8.getTitle()+"|" + song8.getRate());
        MediaFile.writeString(song9.getTitle()+"|" + song9.getRate());
        MediaFile.writeString(song10.getTitle()+"|" + song10.getRate());
        MediaFile.saveAndClose();
    }
}