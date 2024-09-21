package com.example.gridviewactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageDemoActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_demo);
        imageView=(ImageView)findViewById(R.id.imageView);

        Intent intent=getIntent();
        imageView.setImageResource(intent.getIntExtra("img",0));
    }
}