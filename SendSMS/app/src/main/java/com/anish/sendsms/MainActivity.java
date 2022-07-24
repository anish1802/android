package com.anish.sendsms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  Button btSend;
  EditText etNumber,etMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etMessage=findViewById(R.id.etMessage);
        etNumber = findViewById(R.id.etNumber);
        btSend = findViewById(R.id.btSend);


        btSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String msg = etMessage.getText().toString();
        String num = etNumber.getText().toString();

        Intent intent1 = new Intent(Intent.ACTION_VIEW);
        intent1.setData(Uri.parse("smsto:"+num));
        intent1.putExtra("sms_body",msg);
        startActivity(intent1);
    }
}