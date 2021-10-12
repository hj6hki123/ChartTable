package com.example.charttable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;


public class MainActivity extends AppCompatActivity {

    private LineChart charts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        charts=findViewById(R.id.lineChart);
          
    }
}