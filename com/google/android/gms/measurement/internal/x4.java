package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

public final class x4 implements Callable<List<g9>> {
    private final /* synthetic */ d9 a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ p4 d;

    public x4(p4 p4Var, d9 d9Var, String str, String str2) {
        this.d = p4Var;
        this.a = d9Var;
        this.b = str;
        this.c = str2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<g9> call() throws Exception {
        this.d.a.d0();
        return this.d.a.O().b0(this.a.a, this.b, this.c);
    }
}
