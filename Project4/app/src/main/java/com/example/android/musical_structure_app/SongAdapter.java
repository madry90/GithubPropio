package com.example.android.musical_structure_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Songs> {

    public SongAdapter(Context context, ArrayList<Songs> object){
        super(context,0,object);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent,false);
        }
        //Get the link Song object located at this position in the list
        Songs currentSong = (Songs)getItem(position);
        //Find the TextView in the list_item.xml layout with the ID song_title_text_view
        TextView titleTextView = (TextView)listItemView.findViewById(R.id.song_title_text_view);
        //Get the title of the song
        //set this text on the titleTextView
        titleTextView.setText(currentSong.getmTitleOfSong());
        //Find the TextView in the list_item.xml layout with the ID author_text_view
        TextView authorTextView = (TextView)listItemView.findViewById(R.id.author_text_view);
        //Get the author of the song
        //set this text on the titleTextView
        authorTextView.setText(currentSong.getmNameOfSinger());

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
