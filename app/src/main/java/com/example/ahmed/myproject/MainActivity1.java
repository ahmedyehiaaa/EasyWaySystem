package com.example.ahmed.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Button map1 = (Button)findViewById(R.id.map1);
        Button map2= (Button)findViewById(R.id.map2);
        Button map3= (Button)findViewById(R.id.map3);
        Button map4= (Button)findViewById(R.id.map4);



        map1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity1.this,MapsActivity.class);
                startActivity(intent);

            }
        });

        map2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity1.this,MapsActivity2.class);
                startActivity(i);

            }
        });

        map3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity1.this,MainActivity3.class);
                startActivity(i);

            }
        });


        map4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity1.this,MapsActivity3.class);
                startActivity(i);

            }
        });

    }



}
