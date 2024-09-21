package com.example.gridviewactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class GridViewDemo1Activity extends AppCompatActivity {

    int img[]={R.drawable.apple,R.drawable.banana,R.drawable.chickoo,R.drawable.grapes,R.drawable.fig,R.drawable.dragon,R.drawable.jamun,R.drawable.kiwi,R.drawable.pineapple,R.drawable.strawberry};
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_demo1);
        gridView=(GridView)findViewById(R.id.gridimg);
        GridAdapter gridAdapter=new GridAdapter(getApplicationContext(),img);
           gridView.setAdapter(gridAdapter);

           gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
               @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(GridViewDemo1Activity.this,ImageDemoActivity.class);
                intent.putExtra("img",img[i]);
                startActivity(intent);
            }
        });
    }
}





