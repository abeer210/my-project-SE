package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

public final class g5 implements Callable<List<v8>> {
    private final /* synthetic */ d9 a;
    private final /* synthetic */ p4 b;

    public g5(p4 p4Var, d9 d9Var) {
        this.b = p4Var;
        this.a = d9Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<v8> call() throws Exception {
        this.b.a.d0();
        return this.b.a.O().U(this.a.a);
    }
}
