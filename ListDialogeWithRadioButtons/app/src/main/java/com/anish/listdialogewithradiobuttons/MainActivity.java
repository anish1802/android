package com.anish.listdialogewithradiobuttons;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button bt;
String[] arr = {"Red", "Blue", "Black", "White"};
int selectedColorIndex=2;

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
            AlertDialog.Builder ab =new  AlertDialog.Builder(MainActivity.this);
            ab.setTitle("Select Your Favorite Color");
            ab.setSingleChoiceItems(arr,selectedColorIndex, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    selectedColorIndex = i;
                }
            });

            ab.setNegativeButton("Submit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this, "Selected color is"+arr[selectedColorIndex], Toast.LENGTH_SHORT).show();
                }
            });

            AlertDialog ad=ab.create();
            ad.show();
        }
    }
}