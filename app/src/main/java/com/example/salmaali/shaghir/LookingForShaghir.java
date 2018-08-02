package com.example.salmaali.shaghir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class LookingForShaghir extends AppCompatActivity {

    ImageView Bus1,Bus2,Bus3,Bus4,Bus5,Bus6,Bus7,Bus8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_looking_for_shaghir);
        getSupportActionBar().hide();


        // all assigned to bus one because all have the same exact criteria
        //again we don't have an actual bus nor 24*8 sensors :p



        Bus1 = (ImageView) findViewById(R.id.bus1);
        Bus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LookingForShaghir.this, busone.class));
            }
        });

        Bus2 = (ImageView) findViewById(R.id.bus2);
        Bus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LookingForShaghir.this, busone.class));
            }
        });

        Bus3 = (ImageView) findViewById(R.id.bus3);
        Bus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LookingForShaghir.this, busone.class));
            }
        });

        Bus4 = (ImageView) findViewById(R.id.bus4);
        Bus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LookingForShaghir.this, busone.class));
            }
        });

        Bus5 = (ImageView) findViewById(R.id.bus5);
        Bus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LookingForShaghir.this, busone.class));
            }
        });

        Bus6 = (ImageView) findViewById(R.id.bus6);
        Bus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LookingForShaghir.this, busone.class));
            }
        });

        Bus7 = (ImageView) findViewById(R.id.bus7);
        Bus7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LookingForShaghir.this, busone.class));
            }
        });

        Bus8 = (ImageView) findViewById(R.id.bus8);
        Bus8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LookingForShaghir.this, busone.class));
            }
        });
    }
}
