package com.example.dell.bebop;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class nowplaying extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowplaying);


        mp = MediaPlayer.create(nowplaying.this, R.raw.mpmusic);
        Button bl1 = (Button) findViewById(R.id.libbutton);
        bl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libb1 = new Intent(nowplaying.this, musiclibrary.class);
                startActivity(libb1);
            }
        });

        Button bsd1 = (Button) findViewById(R.id.sdbutton);
        bsd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sdetai = new Intent(nowplaying.this, Songdetails.class);
                startActivity(sdetai);
            }
        });

        Button bpl1 = (Button) findViewById(R.id.plistbutton);
        bpl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playl1 = new Intent(nowplaying.this, playlists.class);
                startActivity(playl1);
            }
        });
    }

    public void play(View v) {
        Toast.makeText(this, "Plays Song", Toast.LENGTH_SHORT).show();
        mp.start();
    }

    public void pause(View v) {
        Toast.makeText(this, "Pauses Song", Toast.LENGTH_SHORT).show();
        mp.pause();
    }

    public void prev(View v) {
        Toast.makeText(this, "Plays previous Song", Toast.LENGTH_SHORT).show();
    }

    public void next(View v) {
        Toast.makeText(this, "Plays next Song", Toast.LENGTH_SHORT).show();
    }

    public void stop(View v) {
        Toast.makeText(this, "Stops Song", Toast.LENGTH_SHORT).show();
        mp.stop();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mp.release();
    }
}
