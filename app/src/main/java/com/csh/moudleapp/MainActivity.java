package com.csh.moudleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.csh.connectinterface.PMainToEach;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onNewHouse(View view) {
        PMainToEach.getNew().startActivity(this);
    }

    public void onSecondHouse(View view) {
        PMainToEach.getSecond().startActivity(this);
    }
}
