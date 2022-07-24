package com.anish.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt = findViewById(R.id.bt);


        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == bt){
            AlertDialog.Builder ab = new AlertDialog.Builder(MainActivity.this);
            ab.setTitle("Aleart Title");

            ab.setMessage("Are you sure want to exit");

            ab.setMessage("Are you sure you want to exit");

            ab.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this, "Positve is Selected", Toast.LENGTH_SHORT).show();
                }
            });

            ab.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this, "Negative is selected", Toast.LENGTH_SHORT).show();
                }
            });

            ab.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this, "Cancle is Selected", Toast.LENGTH_SHORT).show();
                }
            });
            AlertDialog ad = ab.create();
            ad.show();
        }
    }
}