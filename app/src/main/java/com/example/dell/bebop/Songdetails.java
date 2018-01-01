package com.example.dell.bebop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Songdetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songdetails);
        Button bnp = (Button) findViewById(R.id.libbuttonl);
        bnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lib1 = new Intent(Songdetails.this, nowplaying.class);
                startActivity(lib1);
            }
        });

        Button bl = (Button) findViewById(R.id.sdbuttonl);
        bl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lib1 = new Intent(Songdetails.this, musiclibrary.class);
                startActivity(lib1);
            }
        });

        Button bsd = (Button) findViewById(R.id.plistbuttonl);
        bsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sdeta = new Intent(Songdetails.this, playlists.class);
                startActivity(sdeta);
            }
        });
    }
}
