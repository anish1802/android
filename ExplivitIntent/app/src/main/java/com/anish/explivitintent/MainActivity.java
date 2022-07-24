package com.anish.explivitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt=findViewById(R.id.bt);

        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == bt){
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
           intent.putExtra("name","Anish");
           intent.putExtra("age", 20);

            startActivity(intent);
            finish();
        }

    }
}