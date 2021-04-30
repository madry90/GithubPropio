package com.example.android.musical_structure_app;

public class Songs {

    private String mNameOfSinger;
    private String mTitleOfSong;

    public Songs(String NameOfSinger, String TitleOfSong) {
        mNameOfSinger = NameOfSinger;
        mTitleOfSong = TitleOfSong;
    }

    public String getmNameOfSinger() {
        return mNameOfSinger;
    }

    public String getmTitleOfSong() {
        return mTitleOfSong;
    }
}
