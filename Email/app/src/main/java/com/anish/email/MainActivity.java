package com.anish.email;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText etEmail, etEmailSubject, etMessage;
Button btSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = findViewById(R.id.etEmail);
        etEmailSubject = findViewById(R.id.etEmailsubject);
        etMessage = findViewById(R.id.etEmail);

        btSend = findViewById(R.id.btSend);


        btSend.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String emailId = etEmail.getText().toString();
        String subject = etEmailSubject.getText().toString();
        String message = etMessage.getText().toString();
        String[] em = {emailId};

        Intent intent1 = new Intent(Intent.ACTION_SEND);
        intent1.putExtra(Intent.EXTRA_EMAIL,em);
        intent1.putExtra(Intent.EXTRA_SUBJECT,subject);
        intent1.putExtra(Intent.EXTRA_TEXT, message);
        intent1.setType("message/rfc822");
        startActivity(intent1);

    }
}