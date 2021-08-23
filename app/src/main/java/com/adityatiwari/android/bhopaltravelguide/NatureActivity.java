package com.adityatiwari.android.bhopaltravelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NatureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list);

        ArrayList<String> placecsList = new ArrayList<>();
        placecsList.add(getResources().getString(R.string.bhim_betka));
        placecsList.add(getResources().getString(R.string.bhoj_wetland));
        placecsList.add(getResources().getString(R.string.singhori_wild_life_sanctuary));
        placecsList.add(getResources().getString(R.string.kerwa_dam));
        placecsList.add(getResources().getString(R.string.halali_dam));
        placecsList.add(getResources().getString(R.string.bhadbhada_dam));
        placecsList.add(getResources().getString(R.string.vardhman_park));
        placecsList.add(getResources().getString(R.string.kaliyasot_dam));
        placecsList.add(getResources().getString(R.string.kamlanehru_udyan));
        placecsList.add(getResources().getString(R.string.tribal_museum));
        placecsList.add(getResources().getString(R.string.madhai));
        placecsList.add(getResources().getString(R.string.hathaikheda_dam));
        placecsList.add(getResources().getString(R.string.katara_hill_botanical_garden));

        PlaceAdapter adapter = new PlaceAdapter(this, placecsList);

        final ListView listView = findViewById(R.id.list);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(NatureActivity.this,PlacesInfoActivity.class);
                intent.putExtra("PlaceName",listView.getItemAtPosition(position).toString());
                startActivity(intent);
            }
        });

        listView.setAdapter(adapter);
    }
}
