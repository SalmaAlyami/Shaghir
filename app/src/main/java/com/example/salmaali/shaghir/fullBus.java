package com.example.salmaali.shaghir;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class fullBus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_bus);
        getSupportActionBar().hide();
    }

    public void Location (View view){

        Uri MapI = Uri.parse("geo:21.617928, 39.156248");
        Intent GoMap = new Intent(Intent.ACTION_VIEW,MapI);
        GoMap.setPackage("com.google.android.apps.maps");
        startActivity(GoMap);
    }
}
