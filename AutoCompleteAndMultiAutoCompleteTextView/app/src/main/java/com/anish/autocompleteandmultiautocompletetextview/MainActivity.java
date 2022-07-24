package com.anish.autocompleteandmultiautocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String[] colors = {"Red", "Black", "Blue", "Yellow", "Green"};
    String[] fruits = {"Banana", "Apple", "Mango", "Grapes"};
    AutoCompleteTextView ac1,ac2;
    MultiAutoCompleteTextView mac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ac1 = findViewById(R.id.ac1);
        ac2 = findViewById(R.id.ac2);
        mac = findViewById(R.id.mac);

        ArrayAdapter adColors = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,colors);
        ArrayAdapter adFruits = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,fruits);

        ac1.setAdapter(adColors);
        ac2.setAdapter(adFruits);
        mac.setAdapter(adFruits);

        mac.setThreshold(1);

        mac.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}