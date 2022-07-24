package com.anish.floatinglabels;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText ed1 , ed2;
Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1= findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        bt= findViewById(R.id.bt);

        bt.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String s1 = ed1.getText().toString();
        String s2 = ed2.getText().toString();
        Toast.makeText(this, s1+"\n" +s2, Toast.LENGTH_SHORT).show();
    }
}