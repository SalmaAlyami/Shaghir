package com.example.salmaali.shaghir;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class busone extends AppCompatActivity {

    ImageView bus1tored;

    ImageView B1A1;
    DatabaseReference mRef;
    int n = 24; //number of seats
    final String empty = "https://firebasestorage.googleapis.com/v0/b/shaghir-8e17a.appspot.com/o/empty.png?alt=media&token=bad3edf5-3ee9-4caa-88d5-0e497c0f65c3";
    final String full = "https://firebasestorage.googleapis.com/v0/b/shaghir-8e17a.appspot.com/o/full.png?alt=media&token=4db0f5b2-a9ae-4c1f-9e2b-ac4ed75173e2";

    final String bus1full = "https://firebasestorage.googleapis.com/v0/b/shaghir-8e17a.appspot.com/o/bus1full.png?alt=media&token=c9757c4f-e947-47b0-926b-472333f7e5be";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busone);
        getSupportActionBar().hide();

        mRef = FirebaseDatabase.getInstance().getReference();
        B1A1 = (ImageView) findViewById(R.id.B1A1);

        bus1tored = (ImageView) findViewById(R.id.bus1);

        mRef.addValueEventListener(new com.google.firebase.database.ValueEventListener() {
            @Override
            public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {

                String name = dataSnapshot.getValue().toString();

                //same goes with all sensors
                if(name.equals("{B1A1=1}")){
                    Glide.with(getApplicationContext()).load(full).into(B1A1);
                    n=n-1; //and same goes to other sensors, again we don't have an actual bus nor 24*8 sensors :p
                }
                else {
                    Glide.with(getApplicationContext()).load(empty).into(B1A1);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //and same goes to other sensors
        if (n == 0){
            Glide.with(getApplicationContext()).load(bus1full).into(bus1tored);
        }

    }

    //this is the geo of the hackathone :))  just to show you how it works, we don't have an actual bus :p

    public void Location (View view){
        Uri MapI = Uri.parse("geo:21.617928, 39.156248");
        Intent GoMap = new Intent(Intent.ACTION_VIEW,MapI);
        GoMap.setPackage("com.google.android.apps.maps");
        startActivity(GoMap);
    }
}
