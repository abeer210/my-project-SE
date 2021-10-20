package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

public final class e5 implements Callable<byte[]> {
    private final /* synthetic */ j a;
    private final /* synthetic */ String b;
    private final /* synthetic */ p4 c;

    public e5(p4 p4Var, j jVar, String str) {
        this.c = p4Var;
        this.a = jVar;
        this.b = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws Exception {
        this.c.a.d0();
        this.c.a.V().v(this.a, this.b);
        throw null;
    }
}
