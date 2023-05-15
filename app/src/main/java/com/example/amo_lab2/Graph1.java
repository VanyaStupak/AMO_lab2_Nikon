package com.example.amo_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;


public class Graph1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        GraphView graph = (GraphView) findViewById(R.id.graph);
        graph.getViewport().setMinX(0);
        graph.getViewport().setMaxX(50000);
        graph.getViewport().setXAxisBoundsManual(true);
        getSupportActionBar().hide();
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint( 10, MainActivity.time[0]),
                new DataPoint(100, MainActivity.time[1]),
                new DataPoint(500, MainActivity.time[2]),
                new DataPoint(800, MainActivity.time[3]),
                new DataPoint(1000, MainActivity.time[4]),
                new DataPoint(3000, MainActivity.time[5]),
                new DataPoint(5000, MainActivity.time[6]),
                new DataPoint(10000, MainActivity.time[7]),
                new DataPoint(30000, MainActivity.time[8]),
                new DataPoint(50000, MainActivity.time[9]),
        });

        graph.addSeries(series);
        StaticLabelsFormatter staticLabelsFormatter = new StaticLabelsFormatter(graph);
    }
    private double countFunc(int x) {
        return (x * (Math.log(x)/Math.log(2)));
    }
}
