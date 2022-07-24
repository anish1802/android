package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button bt1 , bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);

//        bt1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Button 1 is pressed", Toast.LENGTH_LONG).show();
//
//            }
//        });
//
//
//        bt2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Button 2 is pressed", Toast.LENGTH_SHORT).show();
//
//            }
//        });

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view== bt1){
            Toast.makeText(this, "Button 1 is clicked", Toast.LENGTH_SHORT).show();
        }

        else if (view==bt2){
            Toast.makeText(this, "Button 2 is clicked", Toast.LENGTH_SHORT).show();
        }
    }
}