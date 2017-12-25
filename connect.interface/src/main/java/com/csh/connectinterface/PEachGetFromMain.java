package com.csh.connectinterface;

public class PEachGetFromMain {
    INewGetFromMain mNew;
    ISecondGetFromMain mSecond;

    private static PEachGetFromMain mInstance;

    public PEachGetFromMain() {
        try {
            mNew = getImpl("com.csh.moudleapp.data_send.NewGetFromMain");
            mSecond = getImpl("com.csh.moudleapp.data_send.SecondGetFromMain");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private <T> T getImpl(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            return (T) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static PEachGetFromMain getInstance() {
        if (mInstance == null) {
            synchronized (PEachGetFromMain.class) {
                if (mInstance == null) {
                    mInstance = new PEachGetFromMain();
                }
            }
        }
        return mInstance;
    }

    public static INewGetFromMain getNew() {
        return getInstance().mNew;
    }

    public static ISecondGetFromMain getSecond() {
        return getInstance().mSecond;
    }
}
