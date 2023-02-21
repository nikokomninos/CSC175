/**
 * A playlist is a list of 10 songs. This class adds songs to the playlist by initializing song objects and adding them to an array.
 * 
 * @author Nikolaos Komninos
 * @version 2023-02-21
 */

public class Playlist {
    
    /**
     * Main method that initializes song objects and stores them in an array, as well as calling methods from the Song class
     * @param args
     */
    public static void main(String[] args) {
        //Initialize array of Song objects
        Song[] playlist = new Song[10];
        
        //Create new song object
        Song s1 = new Song("Pull Me Under", "Dream Theater", "Images and Words", 10);
        //Store song in the corresponding array index
        playlist[0] = s1;

        Song s2 = new Song("One", "Metallica", "...And Justice For All", 8);
        playlist[1] = s2;

        Song s3 = new Song("The Trooper", "Iron Maiden", "Piece of Mind", 9);
        playlist[2] = s3;

        //Print the entire playlist
        for(int i = 0; i < playlist.length; i++){
            //If there is no song stored in a specific array index
            if(playlist[i] == null){
                System.out.println((i+1) + ". Open Slot");
            }
            //Print object using the class's toString
            else{
            System.out.println((i+1) + "." + playlist[i]);
            }
        }

        //Print the rating of a specific song
        System.out.println("The rating of \"" + s2.getTitle() + "\" by " + s2.getArtist() + " is " + s2.getRating());
        //Change the rating
        s2.setRating(6);
        //Print new rating
        System.out.println("The new rating of \"" + s2.getTitle() + "\" by " + s2.getArtist() + " is " + s2.getRating());

    }
}
