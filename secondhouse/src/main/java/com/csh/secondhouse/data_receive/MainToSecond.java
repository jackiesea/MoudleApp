package com.csh.secondhouse.data_receive;

import android.content.Context;
import android.content.Intent;

import com.csh.connectinterface.IMainToSecond;
import com.csh.secondhouse.SecondActivity;

public class MainToSecond implements IMainToSecond {
    @Override
    public void startActivity(Context context) {
        context.startActivity(new Intent(context, SecondActivity.class));
    }
}
