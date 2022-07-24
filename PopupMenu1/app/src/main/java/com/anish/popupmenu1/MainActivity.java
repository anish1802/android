package com.anish.popupmenu1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button bt1;
TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1= findViewById(R.id.bt1);
        tv1= findViewById(R.id.tv1);

        bt1.setOnClickListener(this);
        tv1.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        if (view==bt1){
            PopupMenu popup1 = new PopupMenu(MainActivity.this,bt1);
            Menu m1 = popup1.getMenu();
            m1.add("hello1");
            m1.add("hello2");
            m1.add("hello3");
            m1.add("hello4");
            popup1.show();
           popup1.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
               @Override
               public boolean onMenuItemClick(MenuItem item) {
                  if (item.getTitle().equals("hello1")){
                      Toast.makeText(MainActivity.this, "hello 1 is clicked", Toast.LENGTH_SHORT).show();
                  }
                  if (item.getTitle().equals("hello2")){
                      Toast.makeText(MainActivity.this, "Hello 2 clicked", Toast.LENGTH_SHORT).show();
                  }
                  if (item.getTitle().equals("hello3")){
                      Toast.makeText(MainActivity.this, "hello 4 clicked", Toast.LENGTH_SHORT).show();
                  }
                   return false;
               }
           });

        }
        else if (view==tv1){

            PopupMenu popup1 = new PopupMenu(MainActivity.this,tv1);
            Menu m1 = popup1.getMenu();
            m1.add("welcome1");
            m1.add("welcome2");
            m1.add("welcome3");
            m1.add("welcome4");
            popup1.show();
            popup1.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    if (item.getTitle().equals("welcome1")){
                        Toast.makeText(MainActivity.this, "welcome 1 is clicked", Toast.LENGTH_SHORT).show();
                    }
                    if (item.getTitle().equals("welcome2")){
                        Toast.makeText(MainActivity.this, "welcome 2 clicked", Toast.LENGTH_SHORT).show();
                    }
                    if (item.getTitle().equals("welcome3")){
                        Toast.makeText(MainActivity.this, "welcome 4 clicked", Toast.LENGTH_SHORT).show();
                    }
                    return false;
                }
            });

        }

    }
}