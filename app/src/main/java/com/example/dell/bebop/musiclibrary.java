package com.example.dell.bebop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class musiclibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musiclibrary);

        Button bnp = (Button) findViewById(R.id.npbuttonl);
        bnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(musiclibrary.this, "Shows List of All Songs", Toast.LENGTH_SHORT).show();
            }
        });

        Button bl = (Button) findViewById(R.id.libbuttonl);
        bl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lib1 = new Intent(musiclibrary.this, nowplaying.class);
                startActivity(lib1);
            }
        });

        Button bsd = (Button) findViewById(R.id.sdbuttonl);
        bsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sdeta = new Intent(musiclibrary.this, Songdetails.class);
                startActivity(sdeta);
            }
        });

        Button bpl = (Button) findViewById(R.id.plistbuttonl);
        bpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playl = new Intent(musiclibrary.this, playlists.class);
                startActivity(playl);
            }
        });
    }


}
