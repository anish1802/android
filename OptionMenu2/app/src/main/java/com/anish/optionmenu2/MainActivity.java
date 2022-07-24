package com.anish.optionmenu2;

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
        getMenuInflater().inflate(R.menu.my_menu1,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.it1){
            Toast.makeText(this, "Welcome is Selected", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId()==R.id.it2){
            Toast.makeText(this, "java is selected", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId()== R.id.it3){
            Toast.makeText(this, "python is selected", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId()== R.id.sm1){
            Toast.makeText(this, "Submenu1 is selected", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId()== R.id.sm2){
            Toast.makeText(this, "Submenu2 is selected", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}