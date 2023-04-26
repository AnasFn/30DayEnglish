package com.example.a30dayenglish;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//eriufheuyifhuerfgreref

        TextView tvNewxt = findViewById(R.id.tvNext);
        LinearLayout rate_butt = findViewById(R.id.rate_butt);
        LinearLayout update_butt = findViewById(R.id.update_butt);
        LinearLayout share_butt = findViewById(R.id.share_butt);
        LinearLayout about_butt = findViewById(R.id.about_butt);



        update_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
                }
            }

        });


        rate_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
                }
            }

        });


        share_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ShareCompat.IntentBuilder.from(SplashActivity.this)
                            .setType("text/plain")
                            .setChooserTitle("Chooser title")
                            .setText("http://play.google.com/store/apps/details?id=" + SplashActivity.this.getPackageName())
                            .startChooser();
                } catch(Exception e) {
                    //e.toString();
                }
            }
        });


        about_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this, AboutActivity.class));
            }
        });





        tvNewxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        });


    }
}