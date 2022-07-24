package com.anish.listdialogwithradiobuttons;

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
int selectedColorIndex = 2;
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
            ab.setTitle("Select Your Favrouit Color");
            ab.setSingleChoiceItems(arr,selectedColorIndex, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    selectedColorIndex = i;
                }
            });

            ab.setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this, "Sekected color is "+arr[selectedColorIndex], Toast.LENGTH_SHORT).show();
                }
            });


            ab.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });


            AlertDialog ad = ab.create();
            ad.show();
        }
    }
}