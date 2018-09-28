package com.example.android.musicoast;

/**
 * {@link Music} represents a Music name that the user wants to play.
 * It contains the details about that song like MusicName, AlbumName, AlbumCover.
 */
public class Music {
    /**
     * The Music Name
     */
    private String mMusicName;
    /**
     * The Album Name
     */
    private String mAlbumName;
    /**
     * The Album Cover
     */
    private int mAlbumCoverId;

    /**
     * Create a new Word object.
     *
     * @param musicName is the music name that will display for the user
     * @param albumName  is the music album name that will display for the user
     * @param albumCoverId is the music album cover that will display for the user
     */
    public Music(String musicName,String albumName, int albumCoverId) {
        mMusicName = musicName;
        mAlbumName = albumName;
        mAlbumCoverId = albumCoverId;
    }
    /**
     * Get the the Music Name
     */
    public String getMusicName(){
        return mMusicName;
    }
    /**
     * Get the the Music Album
     */
    public String getAlbumName(){
        return mAlbumName;
    }
    /**
     * Get the the Music Album Cover
     */
    public int getAlbumCoverId(){
        return mAlbumCoverId;
    }
}
