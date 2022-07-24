package com.anish.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
Button bt;
ToggleButton tb1, tb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = findViewById(R.id.bt);
        tb1 = findViewById(R.id.tb1);
        tb2 = findViewById(R.id.tb2);

        tb2.setChecked(true);

        bt.setOnClickListener(this);

        tb1.setOnCheckedChangeListener(this);
        tb2.setOnCheckedChangeListener(this);
    }

    @Override
    public void onClick(View view) {
        String result = "";
        if (tb1.isChecked())
            result = result+"tb1 is on";
        else
            result = result +"tb1 is off";


        if (tb2.isChecked())
            result = result + " tb2 is on ";
        else
            result= result + " tb2 is off";

        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {


        if (compoundButton==tb1){
            if (isChecked){
                Toast.makeText(this, "tb1 is on", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "tb1 is off", Toast.LENGTH_SHORT).show();
            }

        }else if (compoundButton==tb2){

                if (isChecked){
                    Toast.makeText(this, "tb2 is on", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "tb2 is off", Toast.LENGTH_SHORT).show();
                }
        }


    }
}