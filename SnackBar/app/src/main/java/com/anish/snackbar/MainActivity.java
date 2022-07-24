package com.anish.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bt1, bt2, bt3, bt4;
    View vv;
    Snackbar inSb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);

         vv = findViewById(android.R.id.content);
    }

    @Override
    public void onClick(View v) {

        if (v == bt1) {
            Snackbar.make(vv, "This is snackbar", Snackbar.LENGTH_SHORT).setBackgroundTint(getResources().getColor(R.color.my_color)).show();
        } else if (v == bt2) {
            inSb = Snackbar.make(vv, "This is indifinite snackbar", Snackbar.LENGTH_INDEFINITE);
            inSb.show();
        }else if(v==bt3){
           inSb.dismiss();


        }else if(v ==bt4){

            Snackbar.make(vv, "This is snackbar with action", Snackbar.LENGTH_LONG).setAction("hello", new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "hello is clicked", Toast.LENGTH_SHORT).show();
                }
            }).show();
        }
    }
}