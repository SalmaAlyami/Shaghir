package com.example.salmaali.shaghir;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Salma Ali on 02/08/18.
 */

public class splash extends AppCompatActivity {
    private final int TIME = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent goHome = new Intent(splash.this, MainActivity.class);
                startActivity(goHome);
                finish();
            }
        }, TIME);
    }
}
