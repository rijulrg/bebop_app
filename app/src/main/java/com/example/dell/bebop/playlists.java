package com.example.dell.bebop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class playlists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        Button newp = (Button) findViewById(R.id.newplay);
        newp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(playlists.this, "Makes new Playlist", Toast.LENGTH_SHORT).show();
            }
        });

        Button nowp = (Button) findViewById(R.id.nowplay);
        nowp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowpl = new Intent(playlists.this, nowplaying.class);
                startActivity(nowpl);
            }
        });

        Button sd = (Button) findViewById(R.id.songdet);
        sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sde = new Intent(playlists.this, Songdetails.class);
                startActivity(sde);
            }
        });

        Button playl = (Button) findViewById(R.id.playlis);
        playl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pla1 = new Intent(playlists.this, musiclibrary.class);
                startActivity(pla1);
            }
        });

    }

    public void newp1(View v) {
        Toast.makeText(this, "Plays Playlist 1 Songs", Toast.LENGTH_SHORT).show();
    }

    public void newp2(View v) {
        Toast.makeText(this, "Plays Playlist 2 Songs", Toast.LENGTH_SHORT).show();
    }

    public void newp3(View v) {
        Toast.makeText(this, "Plays Playlist 3 Songs", Toast.LENGTH_SHORT).show();
    }
}
