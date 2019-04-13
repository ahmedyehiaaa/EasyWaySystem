package com.example.ahmed.myproject;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap m_map;
    boolean mapReady=false;


    MarkerOptions Mini;
    MarkerOptions Maghagh1;
    MarkerOptions Maghagh2;
    MarkerOptions Bnimaza1;
    MarkerOptions Bnimaza2;
    MarkerOptions Mata1;
    MarkerOptions Mata2;
    MarkerOptions MiniaHotel;
    MarkerOptions NefertitiHotel;
    MarkerOptions CleopatrHhotel;
    MarkerOptions KentuckyRestaurant;
    MarkerOptions CrepianoResturant;
    MarkerOptions BondokaRestaurant;
    MarkerOptions CookdoorRestaurant;



    static final CameraPosition Minia =CameraPosition.builder()
            .target(new LatLng(28.11827,30.7431))
            .zoom(15)
            .bearing(0)
            .tilt(45)
            .build();

    static final CameraPosition Maghagha =CameraPosition.builder()
            .target(new LatLng(28.63563,30.826))
            .zoom(13)
            .bearing(0)
            .tilt(45)
            .build();

    static final CameraPosition Bnimazar =CameraPosition.builder()
            .target(new LatLng(28.5655,30.80994))
            .zoom(13)
            .bearing(0)
            .tilt(45)
            .build();

    static final CameraPosition Matay =CameraPosition.builder()
            .target(new LatLng(28.4179283,30.7645619))
            .zoom(13)
            .bearing(0)
            .tilt(45)
            .build();

    @Override
    public Resources getResources() {
        return super.getResources();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);

        Maghagh1 = new MarkerOptions()
                .position(new LatLng(28.63563, 30.826))
                .title("بنزينة الشيخ زياد")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map1));

        Maghagh2 = new MarkerOptions()
                .position(new LatLng(28.654602, 30.842002))
                .title("محطة بنزين كامل عبد السميع")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map1));



        Bnimaza1 = new MarkerOptions()
                .position(new LatLng(28.5655, 30.80994))
                .title("بنزينة الغرباوي")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map1));

        Bnimaza2 = new MarkerOptions()
                .position(new LatLng(28.506731, 30.8014154))
                .title("بنزينة التعاون ببني مزار")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map1));


        Mata1 = new MarkerOptions()
                .position(new LatLng(28.41811, 30.76479))
                .title("بنزينة التعاون بمطاي")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map1));


        Mata2 = new MarkerOptions()
                .position(new LatLng(28.3888756, 30.7694677))
                .title("بنزينة التعاون ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map1));



        Mini = new MarkerOptions()
                .position(new LatLng(28.11827, 30.7431))
                .title("بنزينة التعاون بشلبي")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map1));

        MiniaHotel = new MarkerOptions()
                .position(new LatLng(28.1151373, 30.744043))
                .title("فندق الجامعة")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map2));

        NefertitiHotel = new MarkerOptions()
                .position(new LatLng(28.1141058, 30.7497239))
                .title("فندق نفرتيتي وحورس")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map2));


        CleopatrHhotel = new MarkerOptions()
                .position(new LatLng(28.112348, 30.7492948))
                .title("فندي كيلوباترا")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map2));


        KentuckyRestaurant = new MarkerOptions()
                .position(new LatLng(28.108144, 30.7528353))
                .title("مطعم كنتاكي")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map3));


        CrepianoResturant = new MarkerOptions()
                .position(new LatLng(28.1070012, 30.7521138))
                .title("مطعم كريبانو")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map3));


        BondokaRestaurant = new MarkerOptions()
                .position(new LatLng(28.1087638, 30.75213332))
                .title("مطعم  بندقة")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map3));


    CookdoorRestaurant = new MarkerOptions()
                .position(new LatLng(28.1143991 ,30.7464597 ))
                .title("مطعم كوك دور")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map3));


        Button btnMaghagha=(Button)findViewById(R.id.btnMaghagha);
        btnMaghagha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mapReady)
                    flyTo(Maghagha);

            }
        });


        Button btnBnimazar=(Button)findViewById(R.id.btnBnimazar);
        btnBnimazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mapReady)
                    flyTo(Bnimazar);
            }
        });


        Button btnMatay=(Button)findViewById(R.id.btnMatay);
        btnMatay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mapReady)
                    flyTo(Matay);            }
        });


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap map) {
        mapReady = true;
        m_map = map;
        m_map.addMarker(Maghagh1);
        m_map.addMarker(Maghagh2);
        m_map.addMarker(Bnimaza1);
        m_map.addMarker(Bnimaza2);
        m_map.addMarker(Mata1);
        m_map.addMarker(Mata2);
        m_map.addMarker(Mini);
        m_map.addMarker(MiniaHotel);
        m_map.addMarker(NefertitiHotel);
        m_map.addMarker(CleopatrHhotel);
        m_map.addMarker(KentuckyRestaurant);
        m_map.addMarker(CrepianoResturant);
        m_map.addMarker(BondokaRestaurant);
        m_map.addMarker(CookdoorRestaurant);

        flyTo(Minia);
        m_map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
    }


    private void flyTo(CameraPosition target ) {
        m_map.moveCamera(CameraUpdateFactory.newCameraPosition(target));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.action_settings);
        return true;
    }


}
