package com.facebook.react.uimanager.events;

import android.util.SparseIntArray;
import vigqyno.C0201;

/* compiled from: TouchEventCoalescingKeyHelper */
public class h {
    private final SparseIntArray a = new SparseIntArray();

    public void a(long j) {
        this.a.put((int) j, 0);
    }

    public short b(long j) {
        int i = this.a.get((int) j, -1);
        if (i != -1) {
            return (short) (65535 & i);
        }
        throw new RuntimeException(C0201.m82(24991));
    }

    public boolean c(long j) {
        return this.a.get((int) j, -1) != -1;
    }

    public void d(long j) {
        int i = (int) j;
        int i2 = this.a.get(i, -1);
        if (i2 != -1) {
            this.a.put(i, i2 + 1);
            return;
        }
        throw new RuntimeException(C0201.m82(24992));
    }

    public void e(long j) {
        this.a.delete((int) j);
    }
}
