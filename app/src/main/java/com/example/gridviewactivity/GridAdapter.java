package com.example.gridviewactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

//public class GridAdapter {
public class GridAdapter extends BaseAdapter
{
    Context context;
    LayoutInflater inflater;
    int img[];

    public GridAdapter(Context context, int[] img)
    {
        super();
        this.context=context;
        this.img=img;
        inflater=(LayoutInflater.from(context));
    }
    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_grid_view_demo2, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imgView);
        imageView.setImageResource(img[i]);
        return view;
    }
}
