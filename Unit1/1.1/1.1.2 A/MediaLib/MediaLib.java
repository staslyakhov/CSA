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
        Song song1 = new Song();
        Book book1 = new Book();
        Movie movie1 = new Movie();
        Song song2 = new Song();
        Book book2 = new Book();
        Movie movie2 = new Movie();
        System.out.println(song1);
        System.out.println(song2);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(movie1);
        System.out.println(movie2);
        song1.setTitle("Johnny B. Goode");
        System.out.println(song1.getTitle());
        song1.setRate(5);
        System.out.println(song1.getRate());
        song2.setTitle("symphony 9");
        System.out.println(song2.getTitle());
        song2.setRate(10);
        System.out.println(song2.getRate());
        book1.setTitle("Textbook");
        System.out.println(book1.getTitle());
        book1.setRate(9);
        System.out.println(book1.getRate());
        book2.setTitle("100 years of solitude");
        System.out.println(book2.getTitle());
        book2.setRate(8);
        System.out.println(book2.getRate());
        movie1.setTitle("Dr.Ivan");
        System.out.println(movie1.getTitle());
        movie1.setRate(1);
        System.out.println(movie1.getRate());
        movie2.setTitle("Matrix");
        System.out.println(movie2.getTitle());
        movie2.setRate(9);
        System.out.println(movie2.getRate());
    }
}