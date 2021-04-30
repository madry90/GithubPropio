package com.example.android.musical_structure_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class DanceActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_list);

        //Create an array of dance songs
        ArrayList<Songs> danceSongs =new ArrayList<Songs>();

        //Fill the array with songs
        danceSongs.add(new Songs("Robin","Like a Flame"));
        danceSongs.add(new Songs("Jerry Daley", "Gold"));
        danceSongs.add(new Songs("TranxMission","Time to Wonder"));
        danceSongs.add(new Songs("Double You","Run to Me"));
        danceSongs.add(new Songs("Sensity World","Give it up"));
        danceSongs.add(new Songs("3 Ways", "Real Lofe"));
        danceSongs.add(new Songs("Solar System", "Because of You"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        SongAdapter adapter = new SongAdapter(this,danceSongs);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called play_list, which is declared in the
        // play_list file.
        ListView listView = (ListView)findViewById(R.id.play_list);
        //Make the listView use the adapter created
        listView.setAdapter(adapter);
        // Set OnClickListener on ListView to identify the item on ListView clicked by user
        // Text on the ListView item clicked is passed on to PlayerActivity
        listView.setOnItemClickListener(this);
    }

    /**
     * Method as a result to implement interface AdapterView.OnItemClickListener
     * Method to identify ListView item clicked and launch DetailActivity
     */
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        //Get the selected song
        Songs currentSong = (Songs)adapterView.getItemAtPosition(position);

        //Extract string from Songs object
        String songForDetail = currentSong.getmTitleOfSong();
        String authorForDetail = currentSong.getmNameOfSinger();

        //Sending the name of author and his song to PlayerActivity
        Intent intent = new Intent(this, PlayerActivity.class);
        intent.putExtra("song",songForDetail);
        intent.putExtra("author",authorForDetail);
        startActivity(intent);
    }
}