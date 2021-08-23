package com.adityatiwari.android.bhopaltravelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ReligiousActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list);
        ArrayList<String> placecsList = new ArrayList<>();
        placecsList.add(getResources().getString(R.string.birla_mandir_txt));
        placecsList.add(getResources().getString(R.string.dhai_seedhiki_masjid));
        placecsList.add(getResources().getString(R.string.taj_ul_masjid_name));
        placecsList.add(getResources().getString(R.string.mata_mandir));
        placecsList.add(getResources().getString(R.string.chintaman_ganesh));
        placecsList.add(getResources().getString(R.string.bhojpur_temple));
        placecsList.add(getResources().getString(R.string.malai_temple));
        placecsList.add(getResources().getString(R.string.kali_mandir));
        placecsList.add(getResources().getString(R.string.moti_masjid));
        placecsList.add(getResources().getString(R.string.jain_mandir));
        placecsList.add(getResources().getString(R.string.gurudwara));
        placecsList.add(getResources().getString(R.string.daudi_bohra_masjid));
        placecsList.add(getResources().getString(R.string.sheetla_mata_mandir));
        placecsList.add(getResources().getString(R.string.vitthal_masjid));
        placecsList.add(getResources().getString(R.string.sai_mandir));
        placecsList.add(getResources().getString(R.string.neori_mandir));
        placecsList.add(getResources().getString(R.string.gufa_mandir));
        placecsList.add(getResources().getString(R.string.kalibari_mandir));


        PlaceAdapter adapter = new PlaceAdapter(this, placecsList);

        final ListView listView = findViewById(R.id.list);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ReligiousActivity.this,PlacesInfoActivity.class);
                intent.putExtra("PlaceName",listView.getItemAtPosition(position).toString());
                startActivity(intent);
            }
        });

        listView.setAdapter(adapter);

    }
}
