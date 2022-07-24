package com.anish.datepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button bt;
TextView tvDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = findViewById(R.id.bt);
        tvDate = findViewById(R.id.tvDate);


        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == bt){
            Calendar cal = Calendar.getInstance();
            int yr = cal.get(Calendar.YEAR);
            int mt = cal.get(Calendar.MONTH);
            int dy = cal.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dp = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                    tvDate.setText(i2+","+(i1+1)+","+i);

                }

            },yr,mt,dy);

            dp.show();
        }

    }
}