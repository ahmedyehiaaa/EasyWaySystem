package com.example.ahmed.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void goToRestaurants (View view) {
        goToUrl ( "http://www.minia.gov.eg/tourism/torism/rset/default.aspx");
    }

    public void goToHotels (View view) {
        goToUrl ( "http://www.minia.gov.eg/tourism/torism/hotal/default.aspx");
    }

    public void goToWaether (View view) {
        goToUrl ( "http://www.accuweather.com/ar/eg/minya/127067/weather-forecast/127067");
    }

    public void goToLastnews (View view) {
        goToUrl ("http://www.minia.gov.eg/default.aspx");
    }
    public void goToPublicservices (View view) {
        goToUrl ("http://www.minia.gov.eg/services/services_map.aspx");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}