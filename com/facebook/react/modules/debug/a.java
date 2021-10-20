package com.facebook.react.modules.debug;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.d;

/* compiled from: DidJSUpdateUiDuringFrameDetector */
public class a implements NotThreadSafeBridgeIdleDebugListener, ak0 {
    private final d a = d.b(20);
    private final d b = d.b(20);
    private final d c = d.b(20);
    private final d d = d.b(20);
    private volatile boolean e = true;

    private static void c(d dVar, long j) {
        int g = dVar.g();
        int i = 0;
        for (int i2 = 0; i2 < g; i2++) {
            if (dVar.d(i2) < j) {
                i++;
            }
        }
        if (i > 0) {
            for (int i3 = 0; i3 < g - i; i3++) {
                dVar.f(i3, dVar.d(i3 + i));
            }
            dVar.c(i);
        }
    }

    private boolean d(long j, long j2) {
        long f = f(this.a, j, j2);
        long f2 = f(this.b, j, j2);
        if (f == -1 && f2 == -1) {
            return this.e;
        }
        return f > f2;
    }

    private static long f(d dVar, long j, long j2) {
        long j3 = -1;
        for (int i = 0; i < dVar.g(); i++) {
            long d2 = dVar.d(i);
            if (d2 >= j && d2 < j2) {
                j3 = d2;
            } else if (d2 >= j2) {
                break;
            }
        }
        return j3;
    }

    private static boolean g(d dVar, long j, long j2) {
        for (int i = 0; i < dVar.g(); i++) {
            long d2 = dVar.d(i);
            if (d2 >= j && d2 < j2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ak0
    public synchronized void a() {
        this.c.a(System.nanoTime());
    }

    @Override // defpackage.ak0
    public synchronized void b() {
        this.d.a(System.nanoTime());
    }

    public synchronized boolean e(long j, long j2) {
        boolean z;
        boolean g = g(this.d, j, j2);
        boolean d2 = d(j, j2);
        z = true;
        if (!g) {
            if (!d2 || g(this.c, j, j2)) {
                z = false;
            }
        }
        c(this.a, j2);
        c(this.b, j2);
        c(this.c, j2);
        c(this.d, j2);
        this.e = d2;
        return z;
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onBridgeDestroyed() {
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeBusy() {
        this.b.a(System.nanoTime());
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeIdle() {
        this.a.a(System.nanoTime());
    }
}
