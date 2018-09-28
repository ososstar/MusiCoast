package com.example.android.musicoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //switch variable for play or pause button
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Display singer details and set an Intent Activity
        ImageView adeleCover = findViewById(R.id.singerCover);
        adeleCover.setImageResource(R.drawable.adele);

        TextView adeleName = findViewById(R.id.singerName);
        adeleName.setText(R.string.adele);

        LinearLayout adele = findViewById(R.id.singer);
        adele.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the View of singer is clicked on.
            @Override
            public void onClick(View view){
                Intent adeleIntent = new Intent(MainActivity.this, AdeleActivity.class);
                startActivity(adeleIntent);
            }
        });

        // Display singer2 details and set an Intent Activity
        ImageView stromaeCover = findViewById(R.id.singerCover2);
        stromaeCover.setImageResource(R.drawable.stromae);

        TextView stromaeName = findViewById(R.id.singerName2);
        stromaeName.setText(R.string.stromae);

        LinearLayout stromae = findViewById(R.id.singer2);
        stromae.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the View of singer2 is clicked on.
            @Override
            public void onClick(View view){
                Intent stromaeIntent = new Intent(MainActivity.this, StromaeActivity.class);
                startActivity(stromaeIntent);
            }
        });

        /*
          show Toast Message for each control Toolbar key
         */
        //show playing previous music message onClick
        ImageView previousButton = findViewById(R.id.previousButton);
        previousButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Playing Previous Music", Toast.LENGTH_SHORT).show();
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
                            Toast.makeText(MainActivity.this, "Playing Music", Toast.LENGTH_SHORT).show();
                            i++;
                            break;

                        case 1:
                            playButton.setImageResource(R.drawable.ic_play_arrow_black_48dp);
                            Toast.makeText(MainActivity.this, "Music is Paused", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(MainActivity.this, "Playing Next Music", Toast.LENGTH_SHORT).show();
            }
        });
    }
}