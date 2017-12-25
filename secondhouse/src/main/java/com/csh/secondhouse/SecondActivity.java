package com.csh.secondhouse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.csh.connectinterface.PEachGetFromMain;

public class SecondActivity extends AppCompatActivity {
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mTextView = findViewById(R.id.text);
    }

    public void onGetMainData(View view) {
        String data = PEachGetFromMain.getSecond().getDataFromMainApp(this);
        mTextView.setText(data);
    }
}
