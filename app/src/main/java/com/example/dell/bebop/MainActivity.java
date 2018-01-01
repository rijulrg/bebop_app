package com.example.dell.bebop;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.net.Uri;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(MainActivity.this, R.raw.mpmusic);

        TextView tvnp = (TextView) findViewById(R.id.np);
        tvnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent now_playing = new Intent(MainActivity.this, nowplaying.class);
                startActivity(now_playing);
            }
        });

        TextView tvl = (TextView) findViewById(R.id.lib);
        tvl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent library = new Intent(MainActivity.this, musiclibrary.class);
                startActivity(library);
            }
        });

        TextView tvpl = (TextView) findViewById(R.id.plist);
        tvpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlist = new Intent(MainActivity.this, playlists.class);
                startActivity(playlist);
            }
        });

        TextView tvsd = (TextView) findViewById(R.id.sdet);
        tvsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songdet = new Intent(MainActivity.this, Songdetails.class);
                startActivity(songdet);
            }
        });


        TextView tvbt = (TextView) findViewById(R.id.buyt);
        tvbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buytune = new Intent(MainActivity.this, buyFreshTunes.class);
                startActivity(buytune);
            }
        });

    }

    public void help(View v) {
        Intent help = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bing.com"));
        startActivity(help);
    }

    public void play(View v) {
        Toast.makeText(this, "Plays Song", Toast.LENGTH_SHORT).show();
        mp = MediaPlayer.create(MainActivity.this, R.raw.mpmusic);
        mp.seekTo(0);
        mp.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mp.release();
    }
}
