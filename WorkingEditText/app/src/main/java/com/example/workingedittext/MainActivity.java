package com.example.workingedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
  EditText ed1, ed2;
  Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        bt= findViewById(R.id.bt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               String s1=  ed1.getText().toString();
                String s2=  ed2.getText().toString();

                int i1 = Integer.parseInt(s1);
                int i2 = Integer.parseInt(s2);
             int i3 =   i1+i2;

                Log.v("sum", i3+"");
            }
        });
    }
}