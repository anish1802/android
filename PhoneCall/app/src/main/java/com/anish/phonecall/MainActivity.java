package com.anish.phonecall;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btDial, btCall;
EditText edNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCall = findViewById(R.id.btCall);
        btDial = findViewById(R.id.btDial);
        edNumber = findViewById(R.id.edNumber);

        btCall.setOnClickListener(this);
        btDial.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String num = edNumber.getText().toString();

        if (view == btDial){
            Intent intent1 = new Intent(Intent.ACTION_DIAL);
            intent1.setData(Uri.parse("tel:"+num));
            startActivity(intent1);

        }
        else  if (view == btCall){

            if (checkSelfPermission(Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_GRANTED){
                Intent intent1 = new Intent(Intent.ACTION_CALL);
                intent1.setData(Uri.parse("tel:"+num));
                startActivity(intent1);
            }

          else {
              requestPermissions(new String[]{Manifest.permission.CALL_PHONE},345);
            }


        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
     if (requestCode == 345){
          if (grantResults[0]==PackageManager.PERMISSION_GRANTED){
            String num = edNumber.getText().toString();
            Intent intent1 = new Intent(Intent.ACTION_CALL);
            intent1.setData(Uri.parse("tel:"+num));
            startActivity(intent1);
          }
          else
              Toast.makeText(this, "Phone call Permission is Requested", Toast.LENGTH_SHORT).show();
     }
    }
}