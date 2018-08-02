package com.example.salmaali.shaghir;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button LFS, Help; //LFS Looking for seat , help is for the help button
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();


        myDialog = new Dialog(this);
        LFS = (Button) findViewById(R.id.LookingForSeat);
        Help = (Button) findViewById(R.id.Help);

        LFS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LookingForShaghir.class));
            }
        });
    }

    public void showPOP(View v) {
        TextView txtclose; //click on it to close the dialog
        myDialog.setContentView(R.layout.activity_help);
        txtclose = (TextView) myDialog.findViewById(R.id.txtClose);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

}
