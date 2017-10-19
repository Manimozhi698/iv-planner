package com.example.manimozhisadasivam.sqlite.activities;

import android.os.Bundle;

import com.example.manimozhisadasivam.sqlite.R;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;


/**
 * Created by Manimozhi Sadasivam on 19-10-2017.
 */

public class Proceeding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proceeding);

    }
    public void describe(View view)
    {
        Intent his=new Intent(this,Describe.class);
        startActivity(his);
    }
}
