package com.adityatiwari.android.bhopaltravelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list);
        ArrayList<String> placecsList = new ArrayList<>();

        placecsList.add(getResources().getString(R.string.hotel_rajhansh));
        placecsList.add(getResources().getString(R.string.hong_kong));
        placecsList.add(getResources().getString(R.string.amer_bakery_hut));
        placecsList.add(getResources().getString(R.string.shaan_e_bhopal_rail_restaurant));
        placecsList.add(getResources().getString(R.string.sharma_and_vishnu));
        placecsList.add(getResources().getString(R.string.manohar_dairy_and_restaurant));
        placecsList.add(getResources().getString(R.string.bake_n_shake));
        placecsList.add(getResources().getString(R.string.sagar_gaire));
        placecsList.add(getResources().getString(R.string.bapu_ki_kutia));
        placecsList.add(getResources().getString(R.string.indian_coffee_house));
        placecsList.add(getResources().getString(R.string.momo_cafe));
        placecsList.add(getResources().getString(R.string.zam_zam));
        placecsList.add(getResources().getString(R.string.under_the_mango_tree));
        placecsList.add(getResources().getString(R.string.lazeez_hakim));
        placecsList.add(getResources().getString(R.string.la_kuchina));


        PlaceAdapter adapter = new PlaceAdapter(this, placecsList);

        final ListView listView = findViewById(R.id.list);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(RestaurantActivity.this,PlacesInfoActivity.class);
                intent.putExtra("PlaceName",listView.getItemAtPosition(position).toString());
                startActivity(intent);
            }
        });

        listView.setAdapter(adapter);
    }
}
