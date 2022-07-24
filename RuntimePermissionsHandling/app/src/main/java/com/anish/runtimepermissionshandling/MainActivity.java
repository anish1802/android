package com.anish.runtimepermissionshandling;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = findViewById(R.id.bt);

        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == bt){
            if(checkSelfPermission(Manifest.permission.READ_CONTACTS)== PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this, "Application Can Read Contect", Toast.LENGTH_SHORT).show();
            }
             else {
                 requestPermissions(new String[]{Manifest.permission.READ_CONTACTS},12);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode==12){
            if (grantResults[0]==PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this, "Application Can Read Contect", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Contects Permision Required", Toast.LENGTH_SHORT).show();
            }
        }

    }
}