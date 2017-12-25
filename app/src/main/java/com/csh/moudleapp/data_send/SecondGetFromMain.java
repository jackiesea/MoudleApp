package com.csh.moudleapp.data_send;

import android.content.Context;

import com.csh.connectinterface.ISecondGetFromMain;

public class SecondGetFromMain implements ISecondGetFromMain {
    @Override
    public String getDataFromMainApp(Context context) {
        return "用户名：二手房";
    }
}
