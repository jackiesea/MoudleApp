package com.csh.connectinterface;

public class PMainToEach {
    IMainToNew mNew;
    IMainToSecond mSecond;

    private static PMainToEach mInstance;

    public PMainToEach() {
        try {
            mNew = getImpl("com.csh.newhouse.data_receive.MainToNew");
            mSecond = getImpl("com.csh.secondhouse.data_receive.MainToSecond");
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


    public static PMainToEach getInstance() {
        if (mInstance == null) {
            synchronized (PMainToEach.class) {
                if (mInstance == null) {
                    mInstance = new PMainToEach();
                }
            }
        }
        return mInstance;
    }

    public static IMainToNew getNew() {
        return getInstance().mNew;
    }

    public static IMainToSecond getSecond() {
        return getInstance().mSecond;
    }
}
