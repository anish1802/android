package com.anish.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
CheckBox cb1, cb2 , cb3 , cb4;
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = findViewById(R.id.cb1);
        cb3 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);


        bt = findViewById(R.id.bt);

        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String selected = "";
        if(cb1.isChecked())
        selected = selected + cb1.getText().toString() + " ,";

        if(cb2.isChecked())
            selected = selected + cb2.getText().toString() + ", ";

        if(cb3.isChecked())
            selected = selected + cb3.getText().toString() + ", ";

        if(cb3.isChecked())
            selected = selected + cb3.getText().toString() + ", ";
        if(selected.isEmpty())
            Toast.makeText(this, "not selected", Toast.LENGTH_SHORT).show();
           else
        Toast.makeText(this, "You have Selected", Toast.LENGTH_LONG).show();

    }
}