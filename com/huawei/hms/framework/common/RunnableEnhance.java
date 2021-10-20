package com.huawei.hms.framework.common;

import vigqyno.C0201;

public class RunnableEnhance implements Runnable {
    public static final String TRANCELOGO = null;
    private String parentName = Thread.currentThread().getName();
    private Runnable proxy;

    static {
        C0201.m83(RunnableEnhance.class, 625);
    }

    public RunnableEnhance(Runnable runnable) {
        this.proxy = runnable;
    }

    public String getParentName() {
        return this.parentName;
    }

    public void run() {
        this.proxy.run();
    }
}
