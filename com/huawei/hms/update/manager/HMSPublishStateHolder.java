package com.huawei.hms.update.manager;

import vigqyno.C0201;

public class HMSPublishStateHolder {
    public static final int NOT_CHECKED = 0;
    public static final int NOT_PUBLISHED_YET = 0;
    public static final int PUBLISHED = 0;
    private static int a;
    private static final Object b = new Object();

    static {
        C0201.m83(HMSPublishStateHolder.class, 465);
    }

    public static int getPublishState() {
        int i;
        synchronized (b) {
            i = a;
        }
        return i;
    }

    public static void setPublishState(int i) {
        synchronized (b) {
            a = i;
        }
    }
}
