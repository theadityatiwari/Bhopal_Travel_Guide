package com.adityatiwari.android.bhopaltravelguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<String> {

    public PlaceAdapter(Activity context, ArrayList<String> placesList ){

        super(context, 0, placesList);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_1, parent, false);
        }
        String currentPlace = getItem(position);

        TextView placeName = listItemView.findViewById(R.id.place_name);

        placeName.setText(currentPlace);
        return listItemView;
    }
}
