package com.facebook.common.time;

import android.os.SystemClock;

@u50
public class RealtimeSinceBootClock implements b {
    private static final RealtimeSinceBootClock a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @u50
    public static RealtimeSinceBootClock get() {
        return a;
    }

    @Override // com.facebook.common.time.b
    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
