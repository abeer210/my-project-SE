package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;
import vigqyno.C0201;

public final /* synthetic */ class x2 implements ThreadFactory {
    public static final ThreadFactory a = new x2();

    private x2() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, C0201.m82(29391));
    }
}
