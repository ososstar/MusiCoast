package com.example.android.musicoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class StromaeActivity extends AppCompatActivity {
    //switch variable for play or pause button
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        //adding array for Stromae latest album
        ArrayList<Music> musics = new ArrayList<>();
        musics.add(new Music("Ta fête",getString(R.string.racineCarrée),R.drawable.racine_carree));
        musics.add(new Music("Papaoutai",getString(R.string.racineCarrée),R.drawable.racine_carree));
        musics.add(new Music("Bâtard",getString(R.string.racineCarrée),R.drawable.racine_carree));
        musics.add(new Music("Ave Cesaria",getString(R.string.racineCarrée),R.drawable.racine_carree));
        musics.add(new Music("Tous les mêmes",getString(R.string.racineCarrée),R.drawable.racine_carree));
        musics.add(new Music("Formidable",getString(R.string.racineCarrée),R.drawable.racine_carree));
        musics.add(new Music("Moules frites",getString(R.string.racineCarrée),R.drawable.racine_carree));
        musics.add(new Music("Carmen",getString(R.string.racineCarrée),R.drawable.racine_carree));
        musics.add(new Music("Humain à l'eau",getString(R.string.racineCarrée),R.drawable.racine_carree));
        musics.add(new Music("Quand c'est ?",getString(R.string.racineCarrée),R.drawable.racine_carree));
        musics.add(new Music("Sommeil",getString(R.string.racineCarrée),R.drawable.racine_carree));
        musics.add(new Music("Merci",getString(R.string.racineCarrée),R.drawable.racine_carree));
        musics.add(new Music("Avf",getString(R.string.racineCarrée),R.drawable.racine_carree));

        MusicAdapter mainAdapter =
                new MusicAdapter(this, musics);
        ListView mainListView = findViewById(R.id.songListView);
        mainListView.setAdapter(mainAdapter);

        /*
          show Toast Message for each control Toolbar key
         */
        //show playing previous music message onClick
        ImageView previousButton = findViewById(R.id.previousButton);
        previousButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(StromaeActivity.this, "Playing Previous Music", Toast.LENGTH_SHORT).show();
            }
        });
        //Initialise A Toggle button for playing and pausing music, with showing a Toast messages of the music status for the user onClick
        final ImageView playButton = findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                switch (i) {
                    case 0:
                        playButton.setImageResource(R.drawable.ic_pause_black_48dp);
                        Toast.makeText(StromaeActivity.this, "Playing Music", Toast.LENGTH_SHORT).show();
                        i++;
                        break;

                    case 1:
                        playButton.setImageResource(R.drawable.ic_play_arrow_black_48dp);
                        Toast.makeText(StromaeActivity.this, "Music is Paused", Toast.LENGTH_SHORT).show();
                        i--;
                        break;
                }
            }
        });
        //show playing next music message onClick
        ImageView nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(StromaeActivity.this, "Playing Next Music", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
