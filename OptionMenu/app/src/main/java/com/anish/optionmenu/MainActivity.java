package com.anish.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("welcome");
        menu.add("cut");
        menu.add("copy");
        menu.add("paste");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getTitle().equals("welcome")){
            Toast.makeText(this, "welcome is selcted", Toast.LENGTH_SHORT).show();
        }
        else if(item.getTitle().equals("cut")){
            Toast.makeText(this, "cut is selected", Toast.LENGTH_SHORT).show();
        }
        else  if (item.getTitle().equals("copy")){
            Toast.makeText(this, "copy is selected", Toast.LENGTH_SHORT).show();
        }

        else if (item.getTitle().equals("paste")){
            Toast.makeText(this, "paste is selected", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}