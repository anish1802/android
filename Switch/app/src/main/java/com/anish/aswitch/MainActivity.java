package com.anish.aswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
Button bt;
Switch sw1, sw2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt=findViewById(R.id.bt);
        sw1= findViewById(R.id.sw1);
        sw2= findViewById(R.id.sw2);

        bt.setOnClickListener(this);
        sw1.setOnCheckedChangeListener(this);
    }

    @Override
    public void onClick(View view) {
        String result ="";

        if (sw1.isChecked())
            result= result+" sw1 is on";
        else
            result = result+"sw1 is off";

        if(sw2.isChecked())
            result =result+"sw2 is on";
        else
            result= result+"sw2 is off";
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if (compoundButton ==sw1){
            if(isChecked){
                
            }

        }
        else if(compoundButton==sw2){

        }

    }
}