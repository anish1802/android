package com.anish.contextmenu1;

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
            menu.setHeaderTitle("Button 1");
            menu.add("hello 1");
            menu.add("hello 2");
            menu.add("hello 3");
        }
        else if (v==tv1){
            s1="tv";
            menu.setHeaderTitle("Text view 1");
            menu.add("Welcome 1");
            menu.add("Welcome 2");
            menu.add("Welcome 3");
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
       if (s1.equals("bt")){
           if (item.getTitle().equals("hello 1")){
               Toast.makeText(this, "Hello 1 Selected", Toast.LENGTH_SHORT).show();
           }
           else if (item.getTitle().equals("hello 2")){
               Toast.makeText(this, "Hello 2 Selected", Toast.LENGTH_SHORT).show();
           }
           else if (item.getTitle().equals("hello 3")){
               Toast.makeText(this, "hello 3 Selected", Toast.LENGTH_SHORT).show();
           }
       }

       else if (s1.equals("tv")){
           if (item.getTitle().equals("Welcome 1")){
               Toast.makeText(this, "Welcome 1 selected", Toast.LENGTH_SHORT).show();
           }
           else if (item.getTitle().equals("Welcome 2")){
               Toast.makeText(this, "Welcome 2 selected", Toast.LENGTH_SHORT).show();
           }
           else if (item.getTitle().equals("Welcome 3")){
               Toast.makeText(this, "Welcome 3 selected", Toast.LENGTH_SHORT).show();
           }
       }
        return super.onContextItemSelected(item);
    }
}