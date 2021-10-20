package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;
import vigqyno.C0201;

public final /* synthetic */ class y2 implements ThreadFactory {
    public static final ThreadFactory a = new y2();

    private y2() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, C0201.m82(27165));
    }
}
