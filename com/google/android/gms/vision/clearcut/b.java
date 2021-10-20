package com.google.android.gms.vision.clearcut;

public final class b {
    private final long a = Math.round(30000.0d);
    private final Object b = new Object();
    private long c = Long.MIN_VALUE;

    public b(double d) {
    }

    public final boolean a() {
        synchronized (this.b) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.c + this.a > currentTimeMillis) {
                return false;
            }
            this.c = currentTimeMillis;
            return true;
        }
    }
}
