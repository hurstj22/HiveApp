package com.example.hiveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HiveSurfaceView hiveSurfaceView = (HiveSurfaceView) findViewById(R.id.hiveSurfaceView);
    }

}