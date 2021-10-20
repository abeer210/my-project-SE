package com.facebook.react.views.scroll;

import android.os.SystemClock;
import vigqyno.C0188;

/* compiled from: OnScrollDispatchHelper */
public class b {
    private int a = C0188.f23;
    private int b = C0188.f23;
    private float c = 0.0f;
    private float d = 0.0f;
    private long e = -11;

    public float a() {
        return this.c;
    }

    public float b() {
        return this.d;
    }

    public boolean c(int i, int i2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z = (uptimeMillis - this.e <= 10 && this.a == i && this.b == i2) ? false : true;
        long j = this.e;
        if (uptimeMillis - j != 0) {
            this.c = ((float) (i - this.a)) / ((float) (uptimeMillis - j));
            this.d = ((float) (i2 - this.b)) / ((float) (uptimeMillis - j));
        }
        this.e = uptimeMillis;
        this.a = i;
        this.b = i2;
        return z;
    }
}
