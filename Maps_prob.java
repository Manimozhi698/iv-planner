package com.example.manimozhisadasivam.sqlite.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


import com.example.manimozhisadasivam.sqlite.Compactivity;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.Place;
import com.example.manimozhisadasivam.sqlite.R;
import com.google.android.gms.location.places.ui.PlacePicker;

public class Maps_prob extends AppCompatActivity {

    private TextView get_place;
    int PLACE_PICKER_REQUEST=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(false);

        get_place = (TextView) findViewById(R.id.textView);
        get_place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlacePicker.IntentBuilder builder = new PlacePicker.IntentBuilder();

                Intent intent;
                try {
                    intent = builder.build(getApplicationContext());
                    startActivityForResult(intent,PLACE_PICKER_REQUEST);
                } catch (GooglePlayServicesRepairableException e) {
                    e.printStackTrace();
                } catch (GooglePlayServicesNotAvailableException e) {
                    e.printStackTrace();
                }
            }


        });
    }

    private void setSupportActionBar(boolean b) {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data) {
        if (requestCode==PLACE_PICKER_REQUEST) {
            if (resultCode==RESULT_OK) {
                Place place =PlacePicker.getPlace(data,this);
                String address =String.format("Place: %s",place.getAddress());
                get_place.setText(address);
            }
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void comp(View view)
    {
        Intent his=new Intent(this,Proceeding.class);
        startActivity(his);
    }
}