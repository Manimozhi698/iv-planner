package com.example.manimozhisadasivam.sqlite.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.manimozhisadasivam.sqlite.R;

/**
 * Created by Manimozhi Sadasivam on 19-10-2017.
 */

public class Describe  extends AppCompatActivity{




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe);
    }

    public void list(View view)
    {
        Intent his=new Intent(this,ListViewActivity.class);
        startActivity(his);
    }
    public void web(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(browserIntent);
    }
    public void pack(View view)
    {
        Intent his=new Intent(this,Webpage1.class);
        startActivity(his);
    }

    public void mail(View view)
    {
        Intent his=new Intent(this,mail.class);
        startActivity(his);
    }


}
