package com.facebook.common.time;

import android.os.SystemClock;

@u50
public class AwakeTimeSinceBootClock implements b {
    @u50
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @u50
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // com.facebook.common.time.b
    @u50
    public long now() {
        return SystemClock.uptimeMillis();
    }
}
