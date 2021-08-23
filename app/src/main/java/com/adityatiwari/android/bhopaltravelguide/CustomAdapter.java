package com.adityatiwari.android.bhopaltravelguide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private int[] images;
    private LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, int[] images) {
        this.context = applicationContext;
        this.images = images;
        inflater = LayoutInflater.from(applicationContext);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.img_flipper, null);
        ImageView imageView = view.findViewById(R.id.flipper_image);
        imageView.setImageResource(images[position]);
        return view;
    }


}
