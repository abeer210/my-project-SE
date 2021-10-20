package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import vigqyno.C0201;

public final class q8 implements Callable<String> {
    private final /* synthetic */ d9 a;
    private final /* synthetic */ m8 b;

    public q8(m8 m8Var, d9 d9Var) {
        this.b = m8Var;
        this.a = d9Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        f4 f4Var = this.b.L(this.a);
        if (f4Var != null) {
            return f4Var.a();
        }
        this.b.e().H().d(C0201.m82(1937));
        return null;
    }
}
