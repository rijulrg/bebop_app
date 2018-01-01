package com.example.dell.bebop;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class buyFreshTunes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_fresh_tunes);

        Button buyb = (Button) findViewById(R.id.buybutton);
        buyb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(buyFreshTunes.this, "Song has been added", Toast.LENGTH_SHORT).show();
            }
        });

        Button paytm = (Button) findViewById(R.id.paytmbutton);
        paytm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(buyFreshTunes.this, "Redirecting to paytm", Toast.LENGTH_SHORT).show();
                Intent payt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://paytm.com/"));
                startActivity(payt);
            }
        });

        Button credit = (Button) findViewById(R.id.creditbutton);
        credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(buyFreshTunes.this, "Redirecting HDFC Bank payments", Toast.LENGTH_SHORT).show();
                Intent cre = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.billdesk.com/pgidsk/pgmerc/hdfccard/"));
                startActivity(cre);
            }
        });

        Button paypal = (Button) findViewById(R.id.paypalbutton);
        paypal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(buyFreshTunes.this, "Redirecting to paypal", Toast.LENGTH_SHORT).show();
                Intent payp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paypal.com/in/webapps/mpp/home"));
                startActivity(payp);
            }
        });
        Button backnp = (Button) findViewById(R.id.backb);
        backnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent now_playing = new Intent(buyFreshTunes.this, nowplaying.class);
                startActivity(now_playing);
            }
        });

    }
}
