package com.adityatiwari.android.bhopaltravelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list);
        final ArrayList<String> placecsList = new ArrayList<>();
        placecsList.add(getResources().getString(R.string.sanchi));
        placecsList.add(getResources().getString(R.string.van_vihar));
        placecsList.add(getResources().getString(R.string.peoples_mall));
        placecsList.add(getResources().getString(R.string.sair_sapata));
        placecsList.add(getResources().getString(R.string.manuabhan_tekri));
        placecsList.add(getResources().getString(R.string.birla_mandir_txt));
        placecsList.add(getResources().getString(R.string.birla_museum));
        placecsList.add(getResources().getString(R.string.upper_lake));
        placecsList.add(getResources().getString(R.string.yodhasthal_museum));
        placecsList.add(getResources().getString(R.string.taj_ul_masjid_name));
        placecsList.add(getResources().getString(R.string.kanha_fun_city));
        placecsList.add(getResources().getString(R.string.db_city_mall));
        placecsList.add(getResources().getString(R.string.manav_sangrahalay));
        placecsList.add(getResources().getString(R.string.gohar_mahal));
        placecsList.add(getResources().getString(R.string.archaeological_museum));
        placecsList.add(getResources().getString(R.string.shaukat_mahal));
        placecsList.add(getResources().getString(R.string.bharat_bhawan));
        placecsList.add(getResources().getString(R.string.raisen_fort));



        PlaceAdapter adapter = new PlaceAdapter(this, placecsList);


        listView = findViewById(R.id.list);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(AttractionActivity.this,PlacesInfoActivity.class);
                intent.putExtra("PlaceName",listView.getItemAtPosition(position).toString());
                startActivity(intent);
            }
        });

        listView.setAdapter(adapter);

    }

}

