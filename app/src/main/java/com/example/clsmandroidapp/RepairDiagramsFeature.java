package com.example.clsmandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.GridLayout;
import java.util.ArrayList;
import android.view.Menu;
import android.app.Activity;
import android.widget.BaseAdapter;
import android.widget.ImageView;






import com.example.clsmandroidapp.databinding.ActivityFeatureSelectionBinding;




public class RepairDiagramsFeature extends AppCompatActivity {
    GridView repair_diagram_feature;


    private ActivityFeatureSelectionBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repair_diagrams_feature);

        GridView repair_diagram_feature = (GridView) findViewById(R.id.repair_diagram_feature);
        repair_diagram_feature.setAdapter(new ImageAdapter(this));

    }
}