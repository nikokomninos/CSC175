
/**
 * The Song class is the blueprint for a Song object. A song object has a title, artist, album, and rating. This class contains methods to access and modify that information.
 * 
 * @author Nikolaos Komninos
 * @version 2023-02-21 
 */

public class Song {
   
//Initialize variables
private String title, artist, album;
private int rating;

    /**
     * Constructor to create song object
     * @param title The title of the song
     * @param artist The artist who released the song
     * @param album The album that the song is on
     * @param rating The rating that the user has given the song
     */
    public Song(String title, String artist, String album, int rating){
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.rating = rating;
    }

    /**
     * Returns the title of a song
     * @return String title, the title of the song
     */
    public String getTitle(){
        return title;
    }

    /**
     * Returns the artist of a song
     * @return String artist, the artist of the song
     */
    public String getArtist(){
        return artist;
    }

    /**
     * Returns the album of a song
     * @return String album, the album of the song
     */
    public String getAlbum(){
        return album;
    }

    /**
     * Returns the user rating of a song
     * @return int Rating, the user rating of the song
     */
    public int getRating(){
        return rating;
    }

    /**
     * Changes the rating of a song
     * @param newRating The new rating of the song that will replace the old rating
     */
    public void setRating(int newRating){
        rating = newRating;
    }

    /**
     * Prints information about the song (title, artist, album, rating)
     */
    public String toString(){
        return ("\"" + title + "\" by " + artist + " on \"" + album + "\" with a rating of " + rating + "/10");
    }

}
