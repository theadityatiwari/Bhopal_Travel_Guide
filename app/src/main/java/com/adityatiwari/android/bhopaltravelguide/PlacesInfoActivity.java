package com.adityatiwari.android.bhopaltravelguide;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlacesInfoActivity extends AppCompatActivity {
    Toolbar toolbar;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_info);
        NestedScrollView rootView = findViewById(R.id.root_view);
        toolbar = findViewById(R.id.toolbar1);
        ImageView placeImage = findViewById(R.id.place_image);
        TextView addressTxt = findViewById(R.id.address_txt);
        ImageView getDirectionImg = findViewById(R.id.get_direction_button);
        TextView openingHourTxt = findViewById(R.id.open_hour_txt);
        TextView entryFeeTxt = findViewById(R.id.entry_fee_txt);
        TextView webSiteTxt = findViewById(R.id.website_txt);
        TextView entryFeeHeader = findViewById(R.id.entry_fee_header);
        TextView visitDurationHeader = findViewById(R.id.visit_duration_header);
        TextView aboutHeader = findViewById(R.id.about_header);
        TextView visitDurationTxt = findViewById(R.id.visit_duration_txt);
        TextView aboutTxt = findViewById(R.id.about_txt);
        CardView entryFeeCard = findViewById(R.id.entry_fee_card);
        CardView webSiteCard = findViewById(R.id.website_card);
        CardView aboutCard = findViewById(R.id.about_card);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            toolbar.setTitle(bundle.getString("PlaceName"));

            //SANCHI STUPA
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.sanchi))){
                placeImage.setImageResource(R.drawable.sanchi_stoop2);
                addressTxt.setText(R.string.sanchi_address);
                openingHourTxt.setText(R.string.sanchi_opening_hours);
                entryFeeTxt.setText(R.string.sanchi_entry_fees);
                webSiteTxt.setText(R.string.sanchi_website);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                visitDurationTxt.setText(R.string.sanchi_visit_duration);
                aboutTxt.setText(R.string.about_sanchi);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "buddhist monuments at sanchi";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });

            }

            //VAN VIHAR
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.van_vihar))){
                placeImage.setImageResource(R.drawable.van_vihar2);
                addressTxt.setText(R.string.van_vihar_address);
                openingHourTxt.setText(R.string.van_vihar_opening_hours);
                entryFeeTxt.setText(R.string.van_vihar_entry_fees);
                visitDurationTxt.setText(R.string.van_vihar_visit_duration);
                webSiteTxt.setText(R.string.van_vihar_website);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_van_vihar);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Van Vihar National Park";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //BIRLA MANDIR
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.birla_mandir_txt))){
                placeImage.setImageResource(R.drawable.birla_mandir2);
                addressTxt.setText(R.string.birla_mandir_address);
                openingHourTxt.setText(R.string.birla_mandir_opening_hours);
                entryFeeTxt.setText(R.string.birla_mandir_entry_fees);
                visitDurationTxt.setText(R.string.birla_mandir_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                aboutTxt.setText(R.string.about_birla_mandir);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Birla Mandir Arera hills bhopal";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //UPPER LAKE
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.upper_lake))){
                placeImage.setImageResource(R.drawable.upper_lake2);
                addressTxt.setText(R.string.upper_lake_address);
                openingHourTxt.setText(R.string.upper_lake_opening_hours);
                entryFeeTxt.setText(R.string.upper_lake_entry_fees);
                visitDurationTxt.setText(R.string.upper_lake_visit_duration);
                webSiteTxt.setText(R.string.upper_lake_website);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_upper_lake);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Upper Lake Bhopal";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //YODHASTHAL ARMY MUSEUM
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.yodhasthal_museum))){
                placeImage.setImageResource(R.drawable.yodhasthal2);
                addressTxt.setText(R.string.yodhasthal_museum_address);
                openingHourTxt.setText(R.string.yodhasthal_museum_opening_hours);
                entryFeeTxt.setText(R.string.yodhasthal_museum_entry_fees);
                visitDurationTxt.setText(R.string.yodhasthal_museum_visit_duration);
                webSiteTxt.setText(R.string.yodhasthal_museum_website);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_yodhasthal_museum);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Yodhasthal Bhopal";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //TAJ-UL-MASJID
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.taj_ul_masjid_name))){
                placeImage.setImageResource(R.drawable.taj_ul_masjid3);
                addressTxt.setText(R.string.taj_ul_masjid_address);
                openingHourTxt.setText(R.string.taj_ul_masjid_opening_hours);
                entryFeeTxt.setText(R.string.taj_ul_masjid_entry_fees);
                visitDurationTxt.setText(R.string.taj_ul_masjid_visit_duration);
                webSiteTxt.setText(R.string.taj_ul_masjid_website);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_taj_ul_masjid);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Taj Ul Masjid BHOPAL";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //KANHA FUN CITY
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.kanha_fun_city))){
                placeImage.setImageResource(R.drawable.kanha_fun_city_img);
                addressTxt.setText(R.string.kanha_fun_city_address);
                openingHourTxt.setText(R.string.kanha_fun_city_opening_hours);
                entryFeeTxt.setText(R.string.kanha_fun_city_entry_fees);
                visitDurationTxt.setText(R.string.kanha_fun_city_visit_duration);
                webSiteTxt.setText(R.string.kanha_fun_city_website);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_kanha_fun_city);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Kanha Fun City";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //SAIR SAPATA
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.sair_sapata))){
                placeImage.setImageResource(R.drawable.sair_sapata_img);
                addressTxt.setText(R.string.sair_sapata_address);
                openingHourTxt.setText(R.string.sair_sapata_opening_hours);
                entryFeeTxt.setText(R.string.sair_sapata_entry_fees);
                visitDurationTxt.setText(R.string.sair_sapata_visit_duration);
                webSiteTxt.setText(R.string.sair_sapata_website);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_sair_sapata);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Sair Sapata Bhopal";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //PEOPLE'S MALL BHOPAL
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.peoples_mall))){
                placeImage.setImageResource(R.drawable.peoples_mall);
                addressTxt.setText(R.string.peoples_mall_address);
                openingHourTxt.setText(R.string.peoples_mall_opening_hours);
                entryFeeTxt.setText(R.string.peoples_mall_entry_fees);
                visitDurationTxt.setText(R.string.peoples_mall_visit_duration);
                webSiteTxt.setText(R.string.peoples_mall_website);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_peoples_mall);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "People's Mall";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //DB CITY MALL BHOPAL
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.db_city_mall))){
                placeImage.setImageResource(R.drawable.db_city_mall);
                addressTxt.setText(R.string.db_city_mall_address);
                openingHourTxt.setText(R.string.db_city_mall_opening_hours);
                entryFeeCard.setVisibility(View.GONE);
                visitDurationTxt.setText(R.string.db_city_mall_visit_duration);
                webSiteTxt.setText(R.string.db_city_mall_website);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_db_city_mall);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Db City Mall";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //MANUABHAN TEKRI
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.manuabhan_tekri))){
                placeImage.setImageResource(R.drawable.manuabhan_tekri);
                addressTxt.setText(R.string.manuabhan_tekri_address);
                openingHourTxt.setText(R.string.manuabhan_tekri_opening_hours);
                entryFeeTxt.setText(R.string.manuabhan_tekri_entry_fees);
                visitDurationTxt.setText(R.string.manuabhan_tekri_visit_duration);
                webSiteTxt.setText(R.string.manuabhan_tekri_website);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_manuabhan_tekri);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Manuabhan Tekri";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //INDIRA GANDHI RASHTRIYA MANAV SANGRAHALAY
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.manav_sangrahalay))){
                placeImage.setImageResource(R.drawable.manav_sangrahalay);
                addressTxt.setText(R.string.manav_sangrahalay_address);
                openingHourTxt.setText(R.string.manav_sangrahalay_opening_hours);
                entryFeeTxt.setText(R.string.manav_sangrahalay_entry_fees);
                visitDurationTxt.setText(R.string.manav_sangrahalay_visit_duration);
                webSiteTxt.setText(R.string.manav_sangrahalay_website);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_manav_sangrahalay);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Manav Sangrahalay";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //GOHAR MAHAL
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.gohar_mahal))){
                placeImage.setImageResource(R.drawable.gohar_mahal);
                addressTxt.setText(R.string.gohar_mahal_address);
                openingHourTxt.setText(R.string.gohar_mahal_opening_hours);
                entryFeeTxt.setText(R.string.gohar_mahal_entry_fees);
                visitDurationTxt.setText(R.string.gohar_mahal_visit_duration);
                webSiteTxt.setText(R.string.gohar_mahal_website);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_gohar_mahal);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Gohar Mahal";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }
            
            //BIRLA MUSEUM
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.birla_museum))){
                placeImage.setImageResource(R.drawable.birla_museum);
                addressTxt.setText(R.string.birla_museum_address);
                openingHourTxt.setText(R.string.birla_museum_opening_hours);
                entryFeeTxt.setText(R.string.birla_museum_entry_fees);
                visitDurationTxt.setText(R.string.birla_museum_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                aboutTxt.setText(R.string.about_birla_museum);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Birla Museum";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //ARCHAEOLOGICAL MUSEUM
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.archaeological_museum))){
                placeImage.setImageResource(R.drawable.archaeological_museum);
                addressTxt.setText(R.string.archaeological_museum_address);
                openingHourTxt.setText(R.string.archaeological_museum_opening_hours);
                entryFeeTxt.setText(R.string.archaeological_museum_entry_fees);
                visitDurationTxt.setText(R.string.archaeological_museum_visit_duration);
                webSiteTxt.setText(R.string.archaeological_museum_website);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_archaeological_museum);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "State Museum Bhopal";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //shaukat mahal
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.shaukat_mahal))){
                placeImage.setImageResource(R.drawable.shaukat_mahal);
                addressTxt.setText(R.string.shaukat_mahal_address);
                openingHourTxt.setText(R.string.shaukat_mahal_opening_hours);
                entryFeeTxt.setText(R.string.shaukat_mahal_entry_fees);
                visitDurationTxt.setText(R.string.shaukat_mahal_visit_duration);
                webSiteTxt.setText(R.string.shaukat_mahal_website);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_shaukat_mahal);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Shaukat Mahal";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });

            }

            //Bharat Bhawan
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.bharat_bhawan))){
                placeImage.setImageResource(R.drawable.bharat_bhawan);
                addressTxt.setText(R.string.bharat_bhawan_address);
                openingHourTxt.setText(R.string.bharat_bhawan_opening_hours);
                entryFeeTxt.setText(R.string.bharat_bhawan_entry_fees);
                visitDurationTxt.setText(R.string.bharat_bhawan_visit_duration);
                webSiteTxt.setText(R.string.bharat_bhawan_website);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_bharat_bhawan);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Bharat Bhavan Near Upper Lake";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }
            
            //RAISEN FORT
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.raisen_fort))){
                placeImage.setImageResource(R.drawable.raisen_fort);
                addressTxt.setText(R.string.raisen_fort_address);
                openingHourTxt.setText(R.string.raisen_fort_opening_hours);
                entryFeeCard.setVisibility(View.GONE);
                visitDurationTxt.setText(R.string.raisen_fort_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                aboutTxt.setText(R.string.about_raisen_fort);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Raisen Fort";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //BHOJPUR TEMPLE
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.bhojpur_temple))){
                placeImage.setImageResource(R.drawable.bhojpur_temple);
                addressTxt.setText(R.string.bhojpur_temple_address);
                openingHourTxt.setText(R.string.bhojpur_temple_opening_hours);
                entryFeeCard.setVisibility(View.GONE);
                visitDurationTxt.setText(R.string.bhojpur_temple_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                aboutTxt.setText(R.string.about_bhojpur_temple);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Bhojpur Temple";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //Malai TEMPLE
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.malai_temple))){
                placeImage.setImageResource(R.drawable.malai_temple);
                addressTxt.setText(R.string.malai_temple_address);
                openingHourTxt.setText(R.string.malai_temple_opening_hours);
                entryFeeCard.setVisibility(View.GONE);
                visitDurationTxt.setText(R.string.malai_temple_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                aboutTxt.setText(R.string.about_malai_temple);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Kanchi Mutt";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //Mata Mandir
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.mata_mandir))){
                placeImage.setImageResource(R.drawable.mata_mandir);
                addressTxt.setText(R.string.mata_mandir_address);
                openingHourTxt.setText(R.string.mata_mandir_opening_hours);
                entryFeeCard.setVisibility(View.GONE);
                visitDurationTxt.setText(R.string.mata_mandir_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                aboutTxt.setText(R.string.about_mata_mandir);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Vindhyavadhni Beejasan Ma Temple Salkanpur";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }



            //Kali Mandir
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.kali_mandir))){
                placeImage.setImageResource(R.drawable.kali_mandir);
                addressTxt.setText(R.string.kali_mandir_address);
                openingHourTxt.setText(R.string.kali_mandir_opening_hours);
                entryFeeCard.setVisibility(View.GONE);
                visitDurationTxt.setText(R.string.kali_mandir_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                aboutTxt.setText(R.string.about_kali_mandir);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Shri Kalika Mandir Dharmarth Nyas, Kalighat";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });

            }
            
            //Jain mandir
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.jain_mandir))){
                placeImage.setImageResource(R.drawable.manuabhan_tekri);
                addressTxt.setText(R.string.jain_mandir_address);
                openingHourTxt.setText(R.string.jain_mandir_opening_hours);
                entryFeeTxt.setText(R.string.jain_mandir_entry_fees);
                visitDurationTxt.setText(R.string.jain_mandir_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                aboutTxt.setText(R.string.about_jain_mandir);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Manuabhan Tekri";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            } 
            
            
            //DAUDI BOHRA MASJID
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.daudi_bohra_masjid))){
                placeImage.setImageResource(R.drawable.daudi_bohra_masjid);
                addressTxt.setText(R.string.daudi_bohra_masjid_address);
                openingHourTxt.setText(R.string.daudi_bohra_masjid_opening_hours);
                entryFeeCard.setVisibility(View.GONE);
                visitDurationTxt.setText(R.string.daudi_bohra_masjid_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                aboutTxt.setText(R.string.about_daudi_bohra_masjid);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Dawoodi Bohra Masjid Bhopal";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            } 
            
            
            //GURUDWARA
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.gurudwara))){
                placeImage.setImageResource(R.drawable.gurudwara);
                addressTxt.setText(R.string.gurudwara_address);
                openingHourTxt.setText(R.string.gurudwara_opening_hours);
                entryFeeCard.setVisibility(View.GONE);
                visitDurationTxt.setText(R.string.gurudwara_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                aboutTxt.setText(R.string.about_gurudwara);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Gurudwara Bhadbhada Road";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //DHAI SEEDHI KI MASJID
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.dhai_seedhiki_masjid))){
                placeImage.setImageResource(R.drawable.dhai_seedhiki_masjid);
                addressTxt.setText(R.string.dhai_seedhiki_masjid_address);
                openingHourTxt.setText(R.string.dhai_seedhiki_masjid_opening_hours);
                entryFeeCard.setVisibility(View.GONE);
                visitDurationTxt.setText(R.string.dhai_seedhiki_masjid_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                aboutTxt.setText(R.string.about_dhai_seedhiki_masjid);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Dhai Seedhi Ki Masjid";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //VITTHAL MARKET MASJID
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.vitthal_masjid))){
                placeImage.setImageResource(R.drawable.vitthal_masjid);
                addressTxt.setText(R.string.vitthal_masjid_address);
                openingHourTxt.setText(R.string.vitthal_masjid_opening_hours);
                entryFeeCard.setVisibility(View.GONE);
                visitDurationTxt.setText(R.string.vitthal_masjid_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                aboutCard.setVisibility(View.GONE);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Vitthal Market Masjid Nuraani";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //Sheetla mata Mandir
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.sheetla_mata_mandir))){
                placeImage.setImageResource(R.drawable.sheetla_mata_mandir);
                addressTxt.setText(R.string.sheetla_mata_mandir_address);
                openingHourTxt.setText(R.string.sheetla_mata_mandir_opening_hours);
                entryFeeCard.setVisibility(View.GONE);
                visitDurationTxt.setText(R.string.sheetla_mata_mandir_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                aboutCard.setVisibility(View.GONE);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Pracheen Shree Sheetla Mata Temple";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            //Neori Mandir
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.neori_mandir))){
                placeImage.setImageResource(R.drawable.neori_mandir);
                addressTxt.setText(R.string.neori_mandir_address);
                openingHourTxt.setText(R.string.neori_mandir_opening_hours);
                entryFeeCard.setVisibility(View.GONE);
                visitDurationTxt.setText(R.string.neori_mandir_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                aboutTxt.setText(R.string.about_neori_mandir);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Neori Mandir";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            //Gufa Mandir
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.gufa_mandir))){
                placeImage.setImageResource(R.drawable.gufa_mandir);
                addressTxt.setText(R.string.gufa_mandir_address);
                openingHourTxt.setText(R.string.gufa_mandir_opening_hours);
                entryFeeCard.setVisibility(View.GONE);
                visitDurationTxt.setText(R.string.gufa_mandir_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                aboutTxt.setText(R.string.about_gufa_mandir);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Cave Temple";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            //Sai baba Mandir
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.sai_mandir))){
                placeImage.setImageResource(R.drawable.sai_mandir);
                addressTxt.setText(R.string.sai_mandir_address);
                openingHourTxt.setText(R.string.sai_mandir_opening_hours);
                entryFeeCard.setVisibility(View.GONE);
                visitDurationTxt.setText(R.string.sai_mandir_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                aboutTxt.setText(R.string.about_sai_mandir);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Sai Baba Mandir Arera colony";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //Moti Masjid
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.moti_masjid))){
                placeImage.setImageResource(R.drawable.moti_masjid);
                addressTxt.setText(R.string.moti_masjid_address);
                openingHourTxt.setText(R.string.moti_masjid_opening_hours);
                entryFeeCard.setVisibility(View.GONE);
                visitDurationTxt.setText(R.string.moti_masjid_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                aboutTxt.setText(R.string.about_moti_masjid);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Moti Masjid";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            //Kalibari Mandir
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.kalibari_mandir))){
                placeImage.setImageResource(R.drawable.kalibari_mandir);
                addressTxt.setText(R.string.kalibari_mandir_address);
                openingHourTxt.setText(R.string.kalibari_mandir_opening_hours);
                entryFeeCard.setVisibility(View.GONE);
                visitDurationTxt.setText(R.string.kalibari_mandir_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                aboutTxt.setText(R.string.about_kalibari_mandir);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Kalibari mandir Awadhpuri";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            //chintaman ganesh
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.chintaman_ganesh))){
                placeImage.setImageResource(R.drawable.chintaman_ganesh);
                addressTxt.setText(R.string.chintaman_ganesh_address);
                openingHourTxt.setText(R.string.chintaman_ganesh_opening_hours);
                entryFeeCard.setVisibility(View.GONE);
                visitDurationTxt.setText(R.string.chintaman_ganesh_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                aboutTxt.setText(R.string.about_chintaman_ganesh);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Shree Chintaman Ganesh Temple";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            // bhimbetka
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.bhim_betka))){
                placeImage.setImageResource(R.drawable.bhim_betka);
                addressTxt.setText(R.string.bhim_betka_address);
                openingHourTxt.setText(R.string.bhim_betka_opening_hours);
                entryFeeTxt.setText(R.string.bhim_betka_entry_fees);
                visitDurationTxt.setText(R.string.bhim_betka_visit_duration);
                webSiteTxt.setText(R.string.bhim_betka_website);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_bhim_betka);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Rock Shelters of Bhimbetka";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            // Bhoj wetland
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.bhoj_wetland))){
                placeImage.setImageResource(R.drawable.bhoj_wetland);
                addressTxt.setText(R.string.bhoj_wetland_address);
                openingHourTxt.setText(R.string.bhoj_wetland_opening_hours);
                entryFeeTxt.setText(R.string.bhoj_wetland_entry_fees);
                visitDurationTxt.setText(R.string.bhoj_wetland_visit_duration);
                webSiteTxt.setText(R.string.bhoj_wetland_website);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_bhoj_wetland);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Bhoj Wetland";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            // Singhori wild life sanctuary
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.singhori_wild_life_sanctuary))){
                placeImage.setImageResource(R.drawable.singhori_wild_life_sanctuary);
                addressTxt.setText(R.string.singhori_wild_life_sanctuary_address);
                openingHourTxt.setText(R.string.singhori_wild_life_sanctuary_opening_hours);
                entryFeeCard.setVisibility(View.GONE);
                visitDurationTxt.setText(R.string.singhori_wild_life_sanctuary_visit_duration);
                webSiteTxt.setText(R.string.singhori_wild_life_sanctuary_website);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_singhori_wild_life_sanctuary);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Singhori Wild Life Sanctuary";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }



            // Kerwa dam
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.kerwa_dam))){
                placeImage.setImageResource(R.drawable.kerwa_dam);
                addressTxt.setText(R.string.kerwa_dam_address);
                openingHourTxt.setText(R.string.kerwa_dam_opening_hours);
                entryFeeTxt.setText(R.string.kerwa_dam_entry_fees);
                visitDurationTxt.setText(R.string.kerwa_dam_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_kerwa_dam);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Kerwa Dam";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            // Halali dam
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.halali_dam))){
                placeImage.setImageResource(R.drawable.halali_dam);
                addressTxt.setText(R.string.halali_dam_address);
                openingHourTxt.setText(R.string.halali_dam_opening_hours);
                entryFeeTxt.setText(R.string.halali_dam_entry_fees);
                visitDurationTxt.setText(R.string.halali_dam_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_halali_dam);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Halali Dam";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            // Bhadbhada dam
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.bhadbhada_dam))){
                placeImage.setImageResource(R.drawable.bhadbhada_dam);
                addressTxt.setText(R.string.bhadbhada_dam_address);
                openingHourTxt.setText(R.string.bhadbhada_dam_opening_hours);
                entryFeeTxt.setText(R.string.bhadbhada_dam_entry_fees);
                visitDurationTxt.setText(R.string.bhadbhada_dam_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_bhadbhada_dam);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Bhadbhada Dam";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            // Vardhman park
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.vardhman_park))){
                placeImage.setImageResource(R.drawable.vardhman_fantasy_park);
                addressTxt.setText(R.string.vardhman_park_address);
                openingHourTxt.setText(R.string.vardhman_park_opening_hours);
                entryFeeTxt.setText(R.string.vardhman_park_entry_fees);
                visitDurationTxt.setText(R.string.vardhman_park_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_vardhman_park);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Vardhman Fantasy Park";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            // kaliyasot dam
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.kaliyasot_dam))){
                placeImage.setImageResource(R.drawable.kaliyasot_dam);
                addressTxt.setText(R.string.kaliyasot_dam_address);
                openingHourTxt.setText(R.string.kaliyasot_dam_opening_hours);
                entryFeeTxt.setText(R.string.kaliyasot_dam_entry_fees);
                visitDurationTxt.setText(R.string.kaliyasot_dam_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_kaliyasot_dam);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Kaliyasot Dam";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            // Kamlanehru udyan
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.kamlanehru_udyan))){
                placeImage.setImageResource(R.drawable.kamlanehru_udyan);
                addressTxt.setText(R.string.kamlanehru_udyan_address);
                openingHourTxt.setText(R.string.kamlanehru_udyan_opening_hours);
                entryFeeTxt.setText(R.string.kamlanehru_udyan_entry_fees);
                visitDurationTxt.setText(R.string.kamlanehru_udyan_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_kamlanehru_udyan);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Kamla Nehru Park BHEL";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            // Tribal museum
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.tribal_museum))){
                placeImage.setImageResource(R.drawable.tribal_museum);
                addressTxt.setText(R.string.tribal_museum_address);
                openingHourTxt.setText(R.string.tribal_museum_opening_hours);
                entryFeeTxt.setText(R.string.tribal_museum_entry_fees);
                visitDurationTxt.setText(R.string.tribal_museum_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_tribal_museum);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Tribal Museum";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            // Madhai
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.madhai))){
                placeImage.setImageResource(R.drawable.madhai);
                addressTxt.setText(R.string.madhai_address);
                openingHourTxt.setText(R.string.madhai_opening_hours);
                entryFeeTxt.setText(R.string.madhai_entry_fees);
                visitDurationTxt.setText(R.string.madhai_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_madhai);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Tribal Museum";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            // Hathaikheda dam
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.hathaikheda_dam))){
                placeImage.setImageResource(R.drawable.hathaikheda_dam);
                addressTxt.setText(R.string.hathaikheda_dam_address);
                openingHourTxt.setText(R.string.hathaikheda_dam_opening_hours);
                entryFeeTxt.setText(R.string.hathaikheda_dam_entry_fees);
                visitDurationTxt.setText(R.string.hathaikheda_dam_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_hathaikheda_dam);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Hathaikheda Dam";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }



            //Katara hill botanical garden
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.katara_hill_botanical_garden))){
                placeImage.setImageResource(R.drawable.katara_hill_botanical_garden);
                addressTxt.setText(R.string.katara_hill_botanical_garden_address);
                openingHourTxt.setText(R.string.katara_hill_botanical_garden_opening_hours);
                entryFeeTxt.setText(R.string.katara_hill_botanical_garden_entry_fees);
                visitDurationTxt.setText(R.string.katara_hill_botanical_garden_visit_duration);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutTxt.setText(R.string.about_katara_hill_botanical_garden);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Katara hill botanical garden";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

            //Hotel rajhansh
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.hotel_rajhansh))){
                placeImage.setImageResource(R.drawable.hotel_rajhansh);
                addressTxt.setText(R.string.hotel_rajhansh_address);
                openingHourTxt.setText(R.string.hotel_rajhansh_opening_hours);
                entryFeeHeader.setText("Cuisines");
                entryFeeTxt.setText(R.string.hotel_rajhansh_cuisines);
                visitDurationHeader.setText("Special diet & Meals");
                visitDurationTxt.setText(R.string.hotel_rajhansh_special_diet_meals);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutHeader.setText("Features");
                aboutTxt.setText(R.string.feature_hotel_rajhansh);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Hotel Rajhansh Ritz Bhopal";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            //Hong Kong Chinese Restaurants
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.hong_kong))){
                placeImage.setImageResource(R.drawable.hong_kong);
                addressTxt.setText(R.string.hong_kong_address);
                openingHourTxt.setText(R.string.hong_kong_opening_hours);
                entryFeeHeader.setText("Cuisines");
                entryFeeTxt.setText(R.string.hong_kong_cuisines);
                visitDurationHeader.setText("Special diet & Meals");
                visitDurationTxt.setText(R.string.hong_kong_special_diet_meals);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutHeader.setText("Features");
                aboutTxt.setText(R.string.feature_hong_kong);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Hong Kong Chinese Restaurants Bhopal";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            //Amer Bakery Hut
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.amer_bakery_hut))){
                placeImage.setImageResource(R.drawable.amer_bakery_hut);
                addressTxt.setText(R.string.amer_bakery_hut_address);
                openingHourTxt.setText(R.string.amer_bakery_hut_opening_hours);
                entryFeeHeader.setText("Cuisines");
                entryFeeTxt.setText(R.string.amer_bakery_hut_cuisines);
                visitDurationHeader.setText("Special diet & Meals");
                visitDurationTxt.setText(R.string.amer_bakery_hut_special_diet_meals);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutHeader.setText("Features");
                aboutTxt.setText(R.string.feature_amer_bakery_hut);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Amer Bakery Hut";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            //Shaan E Bhopal Rail Restaurants
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.shaan_e_bhopal_rail_restaurant))){
                placeImage.setImageResource(R.drawable.shaan_e_bhopal_rail_restaurant);
                addressTxt.setText(R.string.shaan_e_bhopal_rail_restaurant_address);
                openingHourTxt.setText(R.string.shaan_e_bhopal_rail_restaurant_opening_hours);
                entryFeeHeader.setText("Cuisines");
                entryFeeTxt.setText(R.string.shaan_e_bhopal_rail_restaurant_cuisines);
                visitDurationHeader.setText("Special diet & Meals");
                visitDurationTxt.setText(R.string.shaan_e_bhopal_rail_restaurant_special_diet_meals);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutHeader.setText("Features");
                aboutTxt.setText(R.string.feature_shaan_e_bhopal_rail_restaurant);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = getResources().getString(R.string.shaan_e_bhopal_rail_restaurant);
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }



            //Sharma and Vishnu Chinese and Fast Food
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.sharma_and_vishnu))){
                placeImage.setImageResource(R.drawable.sharma_and_vishnu);
                addressTxt.setText(R.string.sharma_and_vishnu_address);
                openingHourTxt.setText(R.string.sharma_and_vishnu_opening_hours);
                entryFeeHeader.setText("Cuisines");
                entryFeeTxt.setText(R.string.sharma_and_vishnu_cuisines);
                visitDurationHeader.setText("Special diet & Meals");
                visitDurationTxt.setText(R.string.sharma_and_vishnu_special_diet_meals);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutHeader.setText("Features");
                aboutTxt.setText(R.string.feature_sharma_and_vishnu);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = getResources().getString(R.string.sharma_and_vishnu);
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            //Sagar Gaire
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.sagar_gaire))){
                placeImage.setImageResource(R.drawable.sagar_gaire);
                addressTxt.setText(R.string.sagar_gaire_address);
                openingHourTxt.setText(R.string.sagar_gaire_opening_hours);
                entryFeeHeader.setText("Cuisines");
                entryFeeTxt.setText(R.string.sagar_gaire_cuisines);
                visitDurationHeader.setText("Special diet & Meals");
                visitDurationTxt.setText(R.string.sagar_gaire_special_diet_meals);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutHeader.setText("Features");
                aboutTxt.setText(R.string.feature_sagar_gaire);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = getResources().getString(R.string.sagar_gaire);
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            //Bapu Ki Kutia
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.bapu_ki_kutia))){
                placeImage.setImageResource(R.drawable.bapu_ki_kutia);
                addressTxt.setText(R.string.bapu_ki_kutia_address);
                openingHourTxt.setText(R.string.bapu_ki_kutia_opening_hours);
                entryFeeHeader.setText("Cuisines");
                entryFeeTxt.setText(R.string.bapu_ki_kutia_cuisines);
                visitDurationHeader.setText("Special diet & Meals");
                visitDurationTxt.setText(R.string.bapu_ki_kutia_special_diet_meals);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutHeader.setText("Features");
                aboutTxt.setText(R.string.feature_bapu_ki_kutia);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Bapu ki Kutia bhopal";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            //Momo Cafe
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.momo_cafe))){
                placeImage.setImageResource(R.drawable.momo_cafe);
                addressTxt.setText(R.string.momo_cafe_address);
                openingHourTxt.setText(R.string.momo_cafe_opening_hours);
                entryFeeHeader.setText("Cuisines");
                entryFeeTxt.setText(R.string.momo_cafe_cuisines);
                visitDurationHeader.setText("Special diet & Meals");
                visitDurationTxt.setText(R.string.momo_cafe_special_diet_meals);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutHeader.setText("Features");
                aboutTxt.setText(R.string.feature_momo_cafe);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Momo Cafe Db mall";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            //Lazeez Hakim
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.lazeez_hakim))){
                placeImage.setImageResource(R.drawable.lazeez_hakim);
                addressTxt.setText(R.string.lazeez_hakim_address);
                openingHourTxt.setText(R.string.lazeez_hakim_opening_hours);
                entryFeeHeader.setText("Cuisines");
                entryFeeTxt.setText(R.string.lazeez_hakim_cuisines);
                visitDurationHeader.setText("Special diet & Meals");
                visitDurationTxt.setText(R.string.lazeez_hakim_special_diet_meals);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutHeader.setText("Features");
                aboutTxt.setText(R.string.feature_lazeez_hakim);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Lazeez Hakim";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            //Indian Coffee House
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.indian_coffee_house))){
                placeImage.setImageResource(R.drawable.indian_coffee_house);
                addressTxt.setText(R.string.indian_coffee_house_address);
                openingHourTxt.setText(R.string.indian_coffee_house_opening_hours);
                entryFeeHeader.setText("Cuisines");
                entryFeeTxt.setText(R.string.indian_coffee_house_cuisines);
                visitDurationHeader.setText("Special diet & Meals");
                visitDurationTxt.setText(R.string.indian_coffee_house_special_diet_meals);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutHeader.setText("Features");
                aboutTxt.setText(R.string.feature_indian_coffee_house);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Indian Coffee House Bhopal";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            //Manohar Dairy and Restaurant
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.manohar_dairy_and_restaurant))){
                placeImage.setImageResource(R.drawable.manohar_dairy_and_restaurant);
                addressTxt.setText(R.string.manohar_dairy_and_restaurant_address);
                openingHourTxt.setText(R.string.manohar_dairy_and_restaurant_opening_hours);
                entryFeeHeader.setText("Cuisines");
                entryFeeTxt.setText(R.string.manohar_dairy_and_restaurant_cuisines);
                visitDurationHeader.setText("Special diet & Meals");
                visitDurationTxt.setText(R.string.manohar_dairy_and_restaurant_special_diet_meals);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutHeader.setText("Features");
                aboutTxt.setText(R.string.feature_manohar_dairy_and_restaurant);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Manohar Dairy and Restaurant Mp Nagar";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            //Bake N Shake
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.bake_n_shake))){
                placeImage.setImageResource(R.drawable.bake_n_shake);
                addressTxt.setText(R.string.bake_n_shake_address);
                openingHourTxt.setText(R.string.bake_n_shake_opening_hours);
                entryFeeHeader.setText("Cuisines");
                entryFeeTxt.setText(R.string.bake_n_shake_cuisines);
                visitDurationHeader.setText("Special diet & Meals");
                visitDurationTxt.setText(R.string.bake_n_shake_special_diet_meals);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutHeader.setText("Features");
                aboutTxt.setText(R.string.feature_bake_n_shake);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Bake N Shake New Market";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            //Zam Zam
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.zam_zam))){
                placeImage.setImageResource(R.drawable.zam_zam);
                addressTxt.setText(R.string.zam_zam_address);
                openingHourTxt.setText(R.string.zam_zam_opening_hours);
                entryFeeHeader.setText("Cuisines");
                entryFeeTxt.setText(R.string.zam_zam_cuisines);
                visitDurationHeader.setText("Special diet & Meals");
                visitDurationTxt.setText(R.string.zam_zam_special_diet_meals);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutHeader.setText("Features");
                aboutTxt.setText(R.string.feature_zam_zam);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Zam Zam Fast Food";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            //Under The Mango Tree
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.under_the_mango_tree))){
                placeImage.setImageResource(R.drawable.under_the_mango_tree);
                addressTxt.setText(R.string.under_the_mango_tree_address);
                openingHourTxt.setText(R.string.under_the_mango_tree_opening_hours);
                entryFeeHeader.setText("Cuisines");
                entryFeeTxt.setText(R.string.under_the_mango_tree_cuisines);
                visitDurationHeader.setText("Special diet & Meals");
                visitDurationTxt.setText(R.string.under_the_mango_tree_special_diet_meals);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutHeader.setText("Features");
                aboutTxt.setText(R.string.feature_under_the_mango_tree);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "Under The Mango Tree";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }


            //La Kuchina
            if(toolbar.getTitle().toString().equalsIgnoreCase(getResources().getString(R.string.la_kuchina))){
                placeImage.setImageResource(R.drawable.la_kuchina);
                addressTxt.setText(R.string.la_kuchina_address);
                openingHourTxt.setText(R.string.la_kuchina_opening_hours);
                entryFeeHeader.setText("Cuisines");
                entryFeeTxt.setText(R.string.la_kuchina_cuisines);
                visitDurationHeader.setText("Special diet & Meals");
                visitDurationTxt.setText(R.string.la_kuchina_special_diet_meals);
                webSiteCard.setVisibility(View.GONE);
                webSiteTxt.setMovementMethod(LinkMovementMethod.getInstance());
                aboutHeader.setText("Features");
                aboutTxt.setText(R.string.feature_la_kuchina);
                getDirectionImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String address = "La kuchina bhopal";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?f=d&daddr="+address));
                        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
                        if (intent.resolveActivity(getPackageManager()) != null) {
                            startActivity(intent);
                        }
                    }
                });
            }

        }

    }

}

