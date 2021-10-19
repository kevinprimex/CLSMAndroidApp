package com.example.clsmandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.example.GlobalVariables;
import com.example.clsmandroidapp.ui.login.LoginActivity;

public class UserSelection extends AppCompatActivity {

    Button user_select_owner_button, user_select_secretary_button, user_select_supervisor_button, user_select_mechanic_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_selection_screen);

        user_select_owner_button = (Button)findViewById(R.id.select_user_type_owner_button);
        user_select_secretary_button = (Button)findViewById(R.id.select_user_type_secretary_button);
        user_select_supervisor_button = (Button)findViewById(R.id.select_user_type_supervisor_button);
        user_select_mechanic_button = (Button)findViewById(R.id.select_user_type_mechanic_button);




        user_select_owner_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalVariables.user_type = "Owner";
                switchActivities();
            }
        });

        user_select_secretary_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalVariables.user_type = "Secretary";
                switchActivities();
            }
        });

        user_select_supervisor_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalVariables.user_type = "Supervisor";
                switchActivities();
            }
        });

        user_select_mechanic_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalVariables.user_type = "Mechanic";
                switchActivities();
            }
        });
    }
    private void switchActivities() {
        Intent switchActivityIntent = new Intent(this, LoginActivity.class);
        startActivity(switchActivityIntent);
    }
}