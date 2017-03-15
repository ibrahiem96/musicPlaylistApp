package com.example.rashid.project2;

/**
 * Created by Ibrahiem on 2/21/2017.
 */

public class Song {

    String title;
    String artist;
    String year;

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    boolean isEnabled;

    Song(String title, String artist, String year, boolean isEnabled){
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.isEnabled = isEnabled;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getYear() {
        return year;
    }


    public String getInfo(){
        return (title + "\n" + artist + "\n" + year);
    }
}
