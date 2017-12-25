package com.csh.newhouse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.csh.connectinterface.PEachGetFromMain;

public class NewActivity extends AppCompatActivity {
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        mTextView = findViewById(R.id.text);
    }

    public void onGetMainData(View view) {
        String data = PEachGetFromMain.getNew().getDataFromMainApp(this);
        mTextView.setText(data);
    }
}
