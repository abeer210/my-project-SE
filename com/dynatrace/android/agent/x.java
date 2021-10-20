package com.dynatrace.android.agent;

import android.os.SystemClock;

/* compiled from: TimeLineProvider */
public class x {
    private static final long b = (System.currentTimeMillis() - SystemClock.elapsedRealtime());
    public static x c = new x();
    private long a;

    public x() {
        this(b);
    }

    public static long a() {
        return c.b();
    }

    public long b() {
        return this.a + SystemClock.elapsedRealtime();
    }

    public x(long j) {
        this.a = j;
    }
}
