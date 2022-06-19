package com.pudge;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        String className = "com.pudge.WeChat";
        final Class<MeiTuanWaiMai> meiTuanWaiMaiClass = MeiTuanWaiMai.class;
        Class<? extends MeiTuanWaiMai> clazz = Class.forName(className).asSubclass(MeiTuanWaiMai.class);
        MeiTuanWaiMai object = clazz.newInstance();
        Method payOnlineMethod = clazz.getMethod("payOnline");
        payOnlineMethod.invoke(object);
    }

    public static void pay(MeiTuanWaiMai meiTuanWaiMai) {
        meiTuanWaiMai.payOnline();
    }

}
