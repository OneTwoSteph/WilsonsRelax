package com.example.nbacademy.wilsonsrelax;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class relaxamento2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respiracao2);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.relaxamento1);

        mp.start();

        Button play_button = (Button)this.findViewById(R.id.playbutton);
        play_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp.start();
            }
        });

        Button stop_button = (Button)this.findViewById(R.id.stopbutton);
        stop_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp.stop();
            }
        });


    }


}
