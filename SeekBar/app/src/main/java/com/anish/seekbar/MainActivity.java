package com.anish.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener, View.OnClickListener {
SeekBar sb1 , sb2;
TextView tv1 , tv2 ;
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sb1=findViewById(R.id.sb1);
        sb2=findViewById(R.id.sb2);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        bt=findViewById(R.id.bt);

        sb2.setProgress(20);

        sb1.setOnSeekBarChangeListener(this);
        sb2.setOnSeekBarChangeListener(this);

        bt.setOnClickListener(this);


    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        if(seekBar == sb1){
            tv1.setText(i +"");
        }
        else if(seekBar==sb2){
            tv2.setText(i +"");

        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onClick(View view) {
        int i1 = sb1.getProgress();
        int i2 = sb2.getProgress();
        Toast.makeText(this, "Current value of seekbar 1 is "+sb1+"\n current value of seekbar 2 is "+sb2 , Toast.LENGTH_SHORT).show();
    }
}