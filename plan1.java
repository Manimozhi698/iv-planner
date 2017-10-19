package com.example.manimozhisadasivam.sqlite.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import com.example.manimozhisadasivam.sqlite.R;
import com.example.manimozhisadasivam.sqlite.plan;

public class plan1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan1);
    }
    public void map(View view)
    {
        Intent maps =new Intent(this, plan.class);
        startActivity(maps);
    }
public void share(View view)
{
    Intent exp=new Intent(this,sharing.class);
    startActivity(exp);
}
public void past(View view)
{
    Intent his=new Intent(this,history.class);
    startActivity(his);
}
}
