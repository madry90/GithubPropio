package com.example.android.musical_structure_app;

public class Songs {

    private String mNameOfSinger;
    private String mTitleOfSong;

    public Songs(String nameOfSinger, String titleOfSong) {
        mNameOfSinger = nameOfSinger;
        mTitleOfSong = titleOfSong;
    }

    public String getmNameOfSinger() {
        return mNameOfSinger;
    }

    public String getmTitleOfSong() {
        return mTitleOfSong;
    }
}
