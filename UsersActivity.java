package com.example.manimozhisadasivam.sqlite.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.manimozhisadasivam.sqlite.R;

import static android.R.attr.id;

/**
 * Created by Manimozhi Sadasivam on 10-09-2017.
 */

public class UsersActivity extends AppCompatActivity{

    private TextView textViewName;

    @Override
    protected void onCreate(Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.activity_users);

        textViewName = (TextView) findViewById(R.id.text1);
        String nameFromIntent = getIntent().getStringExtra("EMAIL");
        textViewName.setText("Welcome " + nameFromIntent);

    }
}
