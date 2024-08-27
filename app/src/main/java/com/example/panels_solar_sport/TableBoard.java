package com.example.panels_solar_sport;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;

import java.util.ArrayList;
import java.util.List;

public class TableBoard extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_board);

        RadarChart radarChart= findViewById(R.id.chart);

        List<RadarEntry>entries1=new ArrayList<>();
        entries1.add(new RadarEntry(80F));
        entries1.add(new RadarEntry(90F));
        entries1.add(new RadarEntry(45F));
        entries1.add(new RadarEntry(75F));
        entries1.add(new RadarEntry(80F));

        List<RadarEntry>entries2=new ArrayList<>();
        entries2.add(new RadarEntry(60F));
        entries2.add(new RadarEntry(75F));
        entries2.add(new RadarEntry(84F));
        entries2.add(new RadarEntry(67F));
        entries2.add(new RadarEntry(80F));

        RadarDataSet dataset1 = new RadarDataSet(entries1,"Capacidad instalada");
        dataset1.setColor(Color.BLUE);
        dataset1.setFillColor(Color.WHITE);
        dataset1.setDrawFilled(true);
        dataset1.setFillAlpha(180);
        dataset1.setLineWidth(4F);
        dataset1.setDrawHighlightCircleEnabled(true);
        dataset1.setDrawHighlightIndicators(false);

        RadarDataSet dataset2 = new RadarDataSet(entries2,"Generación");
        dataset2.setColor(Color.RED);
        dataset2.setFillColor(Color.WHITE);
        dataset2.setDrawFilled(true);
        dataset2.setFillAlpha(180);
        dataset2.setLineWidth(4F);
        dataset2.setDrawHighlightCircleEnabled(true);
        dataset2.setDrawHighlightIndicators(false);

        List<IRadarDataSet>dataSets = new ArrayList<>();
        dataSets.add(dataset1);
        dataSets.add(dataset2);

        RadarData data = new RadarData(dataSets);
        data.setValueTextSize(20f);
        data.setDrawValues(false);


        radarChart.setData(data);

        radarChart.getDescription().setEnabled(false);
        radarChart.animateXY(1000, 1000);
        radarChart.invalidate();






    }
}