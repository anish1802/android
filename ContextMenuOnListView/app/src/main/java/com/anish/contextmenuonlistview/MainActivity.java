package com.anish.contextmenuonlistview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView lv;
String[] arr = {"Red", "Blue", "Black"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=findViewById(R.id.lv);

        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        lv.setAdapter(ad);

        registerForContextMenu(lv);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        if (v == lv){
            AdapterView.AdapterContextMenuInfo mi = (AdapterView.AdapterContextMenuInfo) menuInfo;
            menu.setHeaderTitle(arr[mi.position]);
            menu.add("Normal");
            menu.add("Light");
            menu.add("Dark");
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo mi = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        String color = arr[mi.position];

        if (item.getTitle().equals("Normal")) {
            Toast.makeText(this, "Normal"+color+" is selected", Toast.LENGTH_SHORT).show();

        }

        else if (item.getTitle().equals("Light")){
            Toast.makeText(this, "Light"+color+" is selected", Toast.LENGTH_SHORT).show();
        }

        else if (item.getTitle().equals("Dark")){
            Toast.makeText(this, "Dark"+color+" is selected", Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }
}