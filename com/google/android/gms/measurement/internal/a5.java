package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

public final class a5 implements Callable<List<g9>> {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ p4 d;

    public a5(p4 p4Var, String str, String str2, String str3) {
        this.d = p4Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<g9> call() throws Exception {
        this.d.a.d0();
        return this.d.a.O().b0(this.a, this.b, this.c);
    }
}
