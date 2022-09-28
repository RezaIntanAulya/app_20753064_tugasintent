package com.example.app_20753064_tugasintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void settings(View view) {
        Intent settings = new Intent(Intent. ACTION_SET_WALLPAPER);
        startActivity(settings);
    }

    public void instagram(View view) {
        String url = "https://www.instagram.com/" ;
        Intent bukaig = new Intent(Intent. ACTION_VIEW);
        bukaig.setData(Uri. parse(url));
        startActivity(bukaig);
    }

    public void tentang(View view) {
        Intent tentang = new Intent(MainActivity.this, Tentang.class);
        startActivity(tentang);
    }
}