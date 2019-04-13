package com.example.ahmed.myproject;



import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap m_map;
    boolean mapRaedy=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        Button btnMap=(Button)findViewById(R.id.btnMap);
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mapRaedy) m_map.setMapType(GoogleMap.MAP_TYPE_NORMAL);

            }
        });


        Button btnHybird=(Button)findViewById(R.id.btnHybird);
        btnHybird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mapRaedy)
                    m_map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
            }
        });


        Button btnSatellite=(Button)findViewById(R.id.btnSatelite);
        btnSatellite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mapRaedy)
                    m_map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
            }
        });



        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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


    @Override
    public void onMapReady(GoogleMap map) {
        m_map = map;
        mapRaedy=true;
        LatLng Minia = new LatLng(28.1003,30.7582);
        CameraPosition target= CameraPosition.builder().target(Minia).zoom(14).build();
        m_map.moveCamera(CameraUpdateFactory.newCameraPosition(target));
    }



}
