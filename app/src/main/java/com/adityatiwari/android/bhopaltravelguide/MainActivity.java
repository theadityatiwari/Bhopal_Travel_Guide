package com.adityatiwari.android.bhopaltravelguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterViewFlipper;
import android.widget.GridView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class MainActivity extends AppCompatActivity {
    //Declaration of adapterViewFlipper.
    AdapterViewFlipper adapterViewFlipper;
    GridView gridView;

    //Getting image resource id.
    int[] IMAGES = {R.drawable.bharat_bhawan,
            R.drawable.cable_bridge,
            R.drawable.nature,
            R.drawable.van_vihar,
            R.drawable.upper_lake,
            R.drawable.birla_mandir2,
            R.drawable.sanchi_stoop2,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //creating a object instance of adapterViewFlipper.
        adapterViewFlipper = findViewById(R.id.adapterViewFlipper);

        //creating a object instance of customAdapter.
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2600);
        adapterViewFlipper.setAutoStart(true);

        //Attraction card onClickListener
        CardView attractionCard = findViewById(R.id.attraction_card);

        attractionCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attractionIntent = new Intent(MainActivity.this,AttractionActivity.class);
                startActivity(attractionIntent);
            }
        });

        //Restaurants card onClickListener
        CardView restaurantCard = findViewById(R.id.restaurant_card);

        restaurantCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantIntent = new Intent(MainActivity.this,RestaurantActivity.class);
                startActivity(restaurantIntent);
            }
        });

        //Nature card onClickListener
        CardView natureCard = findViewById(R.id.nature_card);

        natureCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent natureIntent = new Intent(MainActivity.this,NatureActivity.class);
                startActivity(natureIntent);
            }
        });
        //Religious card onClickListener
        final CardView religiousCard = findViewById(R.id.religious_card);

        religiousCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent religiousIntent = new Intent(MainActivity.this,ReligiousActivity.class);
                startActivity(religiousIntent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.dots_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent rateIntent,sharingIntent,privacyPolicyIntent;

        switch (item.getItemId()){

            case R.id.rate_app:
                String url = "https://play.google.com/store/apps/details?id=com.adityatiwari.android.bhopaltravelguide&hl=en";
                rateIntent = new Intent(Intent.ACTION_VIEW);
                rateIntent.setData(Uri.parse(url));
                startActivity(rateIntent);
            break;

            case R.id.share:
                sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareSubText = "Explore Bhopal with BHOPAL TRAVEL GUIDE";
                String shareBodyText = "https://play.google.com/store/apps/details?id=com.adityatiwari.android.bhopaltravelguide&hl=en";
                sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBodyText);
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, shareSubText);
                startActivity(Intent.createChooser(sharingIntent, "Share Using"));
                break;

            case R.id.privacy_policy:
                String url2 = "https://bhopaltravelguide.blogspot.com/2020/01/bhopal-travel-guide-privacy-policy.html";
                 privacyPolicyIntent = new Intent(Intent.ACTION_VIEW);
                privacyPolicyIntent.setData(Uri.parse(url2));
                startActivity(privacyPolicyIntent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}

