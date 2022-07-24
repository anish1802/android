package com.anish.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, RatingBar.OnRatingBarChangeListener {
RatingBar rb1 , rb2;
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        bt=findViewById(R.id.bt);

        bt.setOnClickListener(this);

        rb2.setOnRatingBarChangeListener(this);

    }

    @Override
    public void onClick(View view) {

        String result ="";

        float f1 = rb1.getRating();
        float f2 = rb2.getRating()
;
        Toast.makeText(this, "Rating 1 is clicked"+f1+"\n Rating 2 is"+f2, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
        Toast.makeText(this, "rating change to "+v, Toast.LENGTH_SHORT).show();
    }
}