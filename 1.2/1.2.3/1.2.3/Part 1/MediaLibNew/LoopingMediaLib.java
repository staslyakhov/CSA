
/**
 * Write a description of class LoopingMediaLib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoopingMediaLib
{
    
    public static void main()
    {
        String songInfo = "";
        while (songInfo != null) {
            songInfo = MediaFile.readString();
            if (songInfo != null){
                int pos = songInfo.indexOf("|");
                System.out.print("Title: ");
                System.out.println(songInfo.substring(0,pos));
                System.out.print("Rating: ");
                System.out.println(songInfo.substring(pos+1));
                System.out.println("");
            }          
        }
        MediaFile.saveAndClose();
    }
}

