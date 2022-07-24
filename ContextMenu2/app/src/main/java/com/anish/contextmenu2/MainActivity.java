package com.anish.contextmenu2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button bt1;
TextView tv1;
String s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1= findViewById(R.id.tv1);
        bt1= findViewById(R.id.bt1);

        registerForContextMenu(bt1);
        registerForContextMenu(tv1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        if(v == bt1){
            s1 = "bt";
           getMenuInflater().inflate(R.menu.context1,menu);
        }

        else if (v == tv1){
        s1 = "tv";
            getMenuInflater().inflate(R.menu.context2,menu);

        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        if(s1.equals("bt")){
            if (item.getItemId()==R.id.m1) {
                Toast.makeText(this, "H 1", Toast.LENGTH_SHORT).show();
            }
            else if (item.getItemId()==R.id.m2){
                Toast.makeText(this, "H 2", Toast.LENGTH_SHORT).show();
            }
            else if (item.getItemId()==R.id.m3){
                Toast.makeText(this, "H 3", Toast.LENGTH_SHORT).show();
            }
        }
        else if (s1.equals("tv")){
            if (item.getItemId()==R.id.w1) {
                Toast.makeText(this, "w 1", Toast.LENGTH_SHORT).show();
            }
            else if (item.getItemId()==R.id.w2){
                Toast.makeText(this, "w 2", Toast.LENGTH_SHORT).show();
            }
            else if (item.getItemId()==R.id.w3){
                Toast.makeText(this, "w 3", Toast.LENGTH_SHORT).show();
            }
        }

        return super.onContextItemSelected(item);
    }
}