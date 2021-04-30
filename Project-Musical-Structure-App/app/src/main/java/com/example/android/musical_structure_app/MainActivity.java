package com.example.android.musical_structure_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asignamos los diferentes elementos grafico del layout
        TextView soundtrack = (TextView)findViewById(R.id.soundtrackTextView);
        TextView indie = (TextView)findViewById(R.id.indieTextView);
        TextView dance = (TextView)findViewById(R.id.danceTextView);
        //Asignamos los listener para cada uno de esos elementos
        soundtrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent soundtrackIntent = new Intent(MainActivity.this,SoundtracksActivity.class);
                startActivity(soundtrackIntent);
            }
        });
        indie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent indieIntent = new Intent(MainActivity.this, IndieActivity.class);
                startActivity(indieIntent);
            }
        });
        dance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent danceIntent = new Intent(MainActivity.this, DanceActivity.class);
                startActivity(danceIntent);
            }
        });

    }
}