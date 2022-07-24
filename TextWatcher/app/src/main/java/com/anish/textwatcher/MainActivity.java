package com.anish.textwatcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements TextWatcher {
EditText ed1, ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1= findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);


        ed2.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {


    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        String s1 = ed1.getText().toString();
        String s2 = ed2.getText().toString();

        if (!s1.equals(s2)) {
            ed2.setError("passward missmatch");
            ed2.requestFocus();

        }
    }

        @Override
        public void afterTextChanged (Editable editable){

        }
    }