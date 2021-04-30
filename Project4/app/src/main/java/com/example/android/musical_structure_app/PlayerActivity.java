package com.example.android.musical_structure_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        setDateDetail();
    }

    private void setDateDetail() {
        //Get extras for Intent
        Intent songIntent = getIntent();
        //Set the name of song for detail
        TextView songTextView = findViewById(R.id.player_song_text_view);
        String songForDetail = songIntent.getStringExtra("song");
        songTextView.setText(songForDetail);
        //Set the name of author for detail
        TextView authorTextView = findViewById(R.id.player_author_text_view);
        String authorForDetail = songIntent.getStringExtra("author");
        authorTextView.setText(authorForDetail);
    }
}