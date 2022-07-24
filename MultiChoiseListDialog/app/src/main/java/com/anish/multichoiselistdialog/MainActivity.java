package com.anish.multichoiselistdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bt;
    String[] arr = {"Red", "Blue", "Pink", "Black"};
    boolean [] arb = {false, true, false, false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt= findViewById(R.id.bt);

        bt.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if (view == bt){
            AlertDialog.Builder ab = new AlertDialog.Builder(MainActivity.this);
            ab.setTitle("Select your favrouit color");

            ab.setMultiChoiceItems(arr, arb, new DialogInterface.OnMultiChoiceClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                    arb[i] = b;
                }
            });
            ab.setPositiveButton("submit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    String selected = "";
                    for (int g=0; g<arr.length; g++){
                        if (arb[g])
                            selected = selected+arr[g]+",";
                    }
                    if (selected.isEmpty())
                        Toast.makeText(MainActivity.this, "No color selected", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity.this, "Selected color are"+selected, Toast.LENGTH_SHORT).show();
                }
            });

            ab.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });

            AlertDialog ad = ab.create();
            ad.show();
        }

    }
}