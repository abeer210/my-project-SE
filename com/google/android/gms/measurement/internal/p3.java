package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.u;
import java.util.List;
import java.util.Map;

public final class p3 implements Runnable {
    private final q3 a;
    private final int b;
    private final Throwable c;
    private final byte[] d;
    private final String e;
    private final Map<String, List<String>> f;

    private p3(String str, q3 q3Var, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        u.k(q3Var);
        this.a = q3Var;
        this.b = i;
        this.c = th;
        this.d = bArr;
        this.e = str;
        this.f = map;
    }

    public final void run() {
        this.a.a(this.e, this.b, this.c, this.d, this.f);
    }
}
