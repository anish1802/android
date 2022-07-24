package com.anish.explivitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String nam = getIntent().getStringExtra("name");
      int ag =  getIntent().getIntExtra("age",0);

        Toast.makeText(this, "Name is "+nam+"\n age is "+ag, Toast.LENGTH_SHORT).show();

    }
}