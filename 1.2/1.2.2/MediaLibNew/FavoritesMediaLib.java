
/**
 * Write a description of class FavoritesMediaLib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FavoritesMediaLib
{
    public static void main()
    {
        String songInfo = "";
        int favorite = 1;
        int pos = 1;
        System.out.println("Favorite songs:");
        System.out.println("---------------");
        while (songInfo != null) {
            songInfo = MediaFile.readString();
            if (songInfo != null){
                pos = songInfo.indexOf("|");
                favorite = Integer.valueOf(songInfo.substring(pos+1));
                if (songInfo != null && favorite >= 8){
                    System.out.println(songInfo.substring(0,pos) +
                    "(" + songInfo.substring(pos+1)+ ")" );
                }
            }          
        }
        MediaFile.saveAndClose();
    }
}

