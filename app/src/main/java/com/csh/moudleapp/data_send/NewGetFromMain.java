package com.csh.moudleapp.data_send;

import android.content.Context;

import com.csh.connectinterface.INewGetFromMain;

public class NewGetFromMain implements INewGetFromMain {
    @Override
    public String getDataFromMainApp(Context context) {
        return "用户名：新房";
    }
}
