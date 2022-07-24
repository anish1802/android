package com.anish.timepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button bt;
TextView tvTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt= findViewById(R.id.bt);
        tvTime = findViewById(R.id.tvTime);

        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == bt){
            Calendar cal = Calendar.getInstance();
            int hr  = cal.get(Calendar.HOUR_OF_DAY);
            int min = cal.get(Calendar.MINUTE);
            TimePickerDialog tp = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int i, int i1) {
              tvTime.setText(i+":"+i1);
                }
            },hr,min,false);
            tp.show();
        }
    }
}