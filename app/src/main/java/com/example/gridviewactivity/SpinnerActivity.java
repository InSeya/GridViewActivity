package com.example.gridviewactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpinnerActivity extends AppCompatActivity {
    Spinner spinner;
    String fruitNames[]={"Apple","Banana","Chickoo","Grapes","Strawberry","Pineapple"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spinner=(Spinner) findViewById(R.id.spinner);

        ArrayAdapter arrayAdapter=new ArrayAdapter(this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item, fruitNames);
        spinner.setAdapter(arrayAdapter);
    }
}
