package com.csh.newhouse.data_receive;

import android.content.Context;
import android.content.Intent;

import com.csh.connectinterface.IMainToNew;
import com.csh.newhouse.NewActivity;

public class MainToNew implements IMainToNew {
    @Override
    public void startActivity(Context context) {
        context.startActivity(new Intent(context, NewActivity.class));
    }
}
