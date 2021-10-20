package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.u;
import java.lang.Thread;

public final class k4 implements Thread.UncaughtExceptionHandler {
    private final String a;
    private final /* synthetic */ i4 b;

    public k4(i4 i4Var, String str) {
        this.b = i4Var;
        u.k(str);
        this.a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.e().E().a(this.a, th);
    }
}
