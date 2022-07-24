package com.example.imageviewandbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
ImageButton imb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imb = findViewById(R.id.imb);

        imb.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
    }
}