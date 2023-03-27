package com.example.amo_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;


public class Graph1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        GraphView graph = (GraphView) findViewById(R.id.graph);
        getSupportActionBar().setBackgroundDrawable(
                new ColorDrawable(Color.parseColor("#9C6DD6")));
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint( 1, MainActivity.time[0]),
                new DataPoint(100, MainActivity.time[1]),
                new DataPoint(1000, MainActivity.time[2]),
                new DataPoint(10000, MainActivity.time[3]),
                new DataPoint(50000, MainActivity.time[4]),
                new DataPoint(100000, MainActivity.time[5]),
                new DataPoint(500000, MainActivity.time[6]),
                new DataPoint(1000000, MainActivity.time[7]),
                new DataPoint(5000000, MainActivity.time[8]),
                new DataPoint(10000000, MainActivity.time[9]),
//                new DataPoint( 1, countFunc(1)),
//                new DataPoint(100, countFunc(100)),
//                new DataPoint(1000, countFunc(1000)),
//                new DataPoint(10000, countFunc(10000)),
//                new DataPoint(50000, countFunc(50000)),
//                new DataPoint(100000, countFunc(100000)),
//                new DataPoint(500000, countFunc(500000)),
//                new DataPoint(1000000, countFunc(1000000)),
//                new DataPoint(5000000, countFunc(5000000)),
//                new DataPoint(10000000, countFunc(10000000)),
        });

        graph.addSeries(series);

    }
    private double countFunc(int x) {
        return (x * (Math.log(x)/Math.log(2)));
    }
}
