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
    TextView test_user_selection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_selection_screen);

        user_select_owner_button = (Button)findViewById(R.id.select_user_type_owner_button);
        user_select_secretary_button = (Button)findViewById(R.id.select_user_type_secretary_button);
        user_select_supervisor_button = (Button)findViewById(R.id.select_user_type_supervisor_button);
        user_select_mechanic_button = (Button)findViewById(R.id.select_user_type_mechanic_button);

        test_user_selection = (TextView)findViewById(R.id.user_selection_button_label);



        user_select_owner_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalVariables.user_type = "owner";
                test_user_selection.setText(getString(R.string.user_selection_button_label) + " " + getString(R.string.select_user_type_owner_button));
                switchActivities();
            }
        });

        user_select_secretary_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalVariables.user_type = "secretary";
                test_user_selection.setText(getString(R.string.user_selection_button_label) + " " + getString(R.string.select_user_type_secretary_button));
                switchActivities();
            }
        });

        user_select_supervisor_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalVariables.user_type = "supervisor";
                test_user_selection.setText(getString(R.string.user_selection_button_label) + " " + getString(R.string.select_user_type_supervisor_button));
                switchActivities();
            }
        });

        user_select_mechanic_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalVariables.user_type = "mechanic";
                test_user_selection.setText(getString(R.string.user_selection_button_label) + " " + getString(R.string.select_user_type_mechanic_button));
                switchActivities();
            }
        });
    }
    private void switchActivities() {
        Intent switchActivityIntent = new Intent(this, LoginActivity.class);
        startActivity(switchActivityIntent);
    }
}