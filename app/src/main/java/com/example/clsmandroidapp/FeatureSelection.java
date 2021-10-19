package com.example.clsmandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FeatureSelection extends AppCompatActivity {

    Button inventory_feature_button, job_checklist_feature_button, repair_diagrams_feature_button, worksheet_feature_button, timesheet_feature_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature_selection);

        inventory_feature_button = (Button)findViewById(R.id.inventory_feature_button);
        job_checklist_feature_button = (Button)findViewById(R.id.job_checklist_feature_button);
        repair_diagrams_feature_button = (Button)findViewById(R.id.repair_diagrams_feature_button);
        worksheet_feature_button = (Button)findViewById(R.id.worksheet_feature_button);
        timesheet_feature_button = (Button)findViewById(R.id.timesheet_feature_button);

        inventory_feature_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        job_checklist_feature_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        repair_diagrams_feature_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchActivityToRepair();
            }
        });

        worksheet_feature_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        timesheet_feature_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

        });

    }
    private void switchActivityToRepair(){
        Intent switchActivityIntent = new Intent(this, RepairDiagramsFeature.class);
        startActivity(switchActivityIntent);
    }
}