package defpackage;

import vigqyno.C0201;

/* renamed from: rl0  reason: default package */
/* compiled from: NativeLoader */
public class rl0 {
    private static sl0 a;

    private rl0() {
    }

    public static synchronized void a(sl0 sl0) {
        synchronized (rl0.class) {
            if (a == null) {
                a = sl0;
            } else {
                throw new IllegalStateException(C0201.m82(28077));
            }
        }
    }

    public static synchronized boolean b() {
        boolean z;
        synchronized (rl0.class) {
            z = a != null;
        }
        return z;
    }

    public static boolean c(String str) {
        synchronized (rl0.class) {
            if (a == null) {
                throw new IllegalStateException(C0201.m82(28078));
            }
        }
        return a.a(str);
    }
}
