package com.anish.popupmenu2;

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

        bt1=findViewById(R.id.bt1);
        tv1=findViewById(R.id.tv1);

        bt1.setOnClickListener(this);
        tv1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view==bt1){
            PopupMenu popup1 = new PopupMenu(MainActivity.this,bt1);
            Menu m1 = popup1.getMenu();
            getMenuInflater().inflate(R.menu.popup1menu,m1);
            popup1.show();
            popup1.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                   if (item.getItemId()==R.id.m1){
                       Toast.makeText(MainActivity.this, "hello 1 is selected", Toast.LENGTH_SHORT).show();
                   }
                   else if (item.getItemId()==R.id.m2){
                       Toast.makeText(MainActivity.this, "Hello 2 is selected", Toast.LENGTH_SHORT).show();
                   }
                   else if (item.getItemId()==R.id.m3){
                       Toast.makeText(MainActivity.this, "Hello 3 is selected", Toast.LENGTH_SHORT).show();
                   }
                    return false;
                }
            });
        }

        else if (view==tv1){

            PopupMenu popup1 = new PopupMenu(MainActivity.this,tv1);
            Menu m1 = popup1.getMenu();
            getMenuInflater().inflate(R.menu.popupmenu2,m1);
            popup1.show();
            popup1.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    if (item.getItemId()==R.id.i1){
                        Toast.makeText(MainActivity.this, "wlcome 1 is selected", Toast.LENGTH_SHORT).show();
                    }
                    else if (item.getItemId()==R.id.i2){
                        Toast.makeText(MainActivity.this, "Welcome 2 is selected", Toast.LENGTH_SHORT).show();
                    }
                    else if (item.getItemId()==R.id.i3){
                        Toast.makeText(MainActivity.this, "WElcome 3 is selected", Toast.LENGTH_SHORT).show();
                    }
                    return false;
                }
            });

        }
    }
}