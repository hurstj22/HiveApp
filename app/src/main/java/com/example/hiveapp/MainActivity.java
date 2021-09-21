package com.example.hiveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creates the surface view for drawing hexagons on the playable game area
        HiveSurfaceView hiveSurfaceView = (HiveSurfaceView) findViewById(R.id.hiveSurfaceView);
        //delete later
    }

}