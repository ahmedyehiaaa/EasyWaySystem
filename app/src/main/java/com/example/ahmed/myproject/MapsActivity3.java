package com.example.ahmed.myproject;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.StreetViewPanoramaFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public class MapsActivity3 extends FragmentActivity implements OnStreetViewPanoramaReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        StreetViewPanoramaFragment StreetViewPanoramaFragment =
                (StreetViewPanoramaFragment)getFragmentManager()
                        .findFragmentById(R.id.streetviewpanorama);
        StreetViewPanoramaFragment.getStreetViewPanoramaAsync(this);
    }


    @Override
    public void onStreetViewPanoramaReady(StreetViewPanorama Panorama) {

        Panorama.setPosition(new LatLng(37.400546, -122.108668));
        StreetViewPanoramaCamera camera = new StreetViewPanoramaCamera.Builder()
                .bearing(180)
                .build();
        Panorama.animateTo(camera, 1000);

    }
}
