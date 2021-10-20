package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class n0 implements ThreadFactory {
    public static final ThreadFactory a = new n0();

    private n0() {
    }

    public final Thread newThread(Runnable runnable) {
        return k0.a(runnable);
    }
}
