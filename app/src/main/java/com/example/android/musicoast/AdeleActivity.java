package com.example.android.musicoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AdeleActivity extends AppCompatActivity {
    //switch variable for play or pause button
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        //adding array for Adele latest album
        ArrayList<Music> musics = new ArrayList<>();
        musics.add(new Music("Hello",getString(R.string.adeleAlbum25),R.drawable.adele_25));
        musics.add(new Music("Send My Love (To Your New Lover)",getString(R.string.adeleAlbum25),R.drawable.adele_25));
        musics.add(new Music("I Miss You",getString(R.string.adeleAlbum25),R.drawable.adele_25));
        musics.add(new Music("When We Were Young",getString(R.string.adeleAlbum25),R.drawable.adele_25));
        musics.add(new Music("Remedy",getString(R.string.adeleAlbum25),R.drawable.adele_25));
        musics.add(new Music("Water Under the Bridge",getString(R.string.adeleAlbum25),R.drawable.adele_25));
        musics.add(new Music("River Lea",getString(R.string.adeleAlbum25),R.drawable.adele_25));
        musics.add(new Music("Love in the Dark",getString(R.string.adeleAlbum25),R.drawable.adele_25));
        musics.add(new Music("Million Years Ago",getString(R.string.adeleAlbum25),R.drawable.adele_25));
        musics.add(new Music("All I Ask",getString(R.string.adeleAlbum25),R.drawable.adele_25));
        musics.add(new Music("Sweetest Devotion",getString(R.string.adeleAlbum25),R.drawable.adele_25));

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
                Toast.makeText(AdeleActivity.this, "Playing Previous Music", Toast.LENGTH_SHORT).show();
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
                        Toast.makeText(AdeleActivity.this, "Playing Music", Toast.LENGTH_SHORT).show();
                        i++;
                        break;

                    case 1:
                        playButton.setImageResource(R.drawable.ic_play_arrow_black_48dp);
                        Toast.makeText(AdeleActivity.this, "Music is Paused", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(AdeleActivity.this, "Playing Next Music", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
