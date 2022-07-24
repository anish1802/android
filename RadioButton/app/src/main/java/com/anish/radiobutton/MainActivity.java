package com.anish.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

Button bt,  bt2 ;
RadioGroup rg1 , rg2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt=findViewById(R.id.bt);
        rg1=findViewById(R.id.rg1);
        rg2 = findViewById(R.id.rg2);

        bt.setOnClickListener(this);
      
    }

    @Override
    public void onClick(View v) {



            int i1 = rg1.getCheckedRadioButtonId();
            if (i1 == R.id.rbg1)
                Toast.makeText(this, "Male selected", Toast.LENGTH_SHORT).show();
            else if (i1 == R.id.rbg2)
                Toast.makeText(this, "Female selected", Toast.LENGTH_SHORT).show();
            else if (i1 == R.id.rbg3)
                Toast.makeText(this, "Other selected", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "No Selected", Toast.LENGTH_SHORT).show();




            int i2 = rg2.getCheckedRadioButtonId();


            if (i2 == R.id.rbs1)
                Toast.makeText(this, "Bihar", Toast.LENGTH_SHORT).show();
            else if (i2 == R.id.rbs2)
                Toast.makeText(this, "punjab", Toast.LENGTH_SHORT).show();
            else if (i2 == R.id.rbs3)
                Toast.makeText(this, "Haryana", Toast.LENGTH_SHORT).show();
            else if (i2 == R.id.rbs4)
                Toast.makeText(this, "Himachal", Toast.LENGTH_SHORT).show();
            else if (i2 == R.id.rbs5)
                Toast.makeText(this, "Other selected", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "No Selected", Toast.LENGTH_SHORT).show();


    }
}