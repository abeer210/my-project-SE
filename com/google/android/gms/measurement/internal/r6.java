package com.google.android.gms.measurement.internal;

import java.util.Map;

public final /* synthetic */ class r6 implements Runnable {
    private final s6 a;
    private final int b;
    private final Exception c;
    private final byte[] d;
    private final Map e;

    public r6(s6 s6Var, int i, Exception exc, byte[] bArr, Map map) {
        this.a = s6Var;
        this.b = i;
        this.c = exc;
        this.d = bArr;
        this.e = map;
    }

    public final void run() {
        this.a.b(this.b, this.c, this.d, this.e);
    }
}
