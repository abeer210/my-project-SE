package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

public final class u1 implements iz1<t1> {
    private final iz1<String> a;
    private final iz1<v> b;
    private final iz1<x0> c;
    private final iz1<Context> d;
    private final iz1<f2> e;
    private final iz1<Executor> f;

    public u1(iz1<String> iz1, iz1<v> iz12, iz1<x0> iz13, iz1<Context> iz14, iz1<f2> iz15, iz1<Executor> iz16) {
        this.a = iz1;
        this.b = iz12;
        this.c = iz13;
        this.d = iz14;
        this.e = iz15;
        this.f = iz16;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.iz1
    public final /* bridge */ /* synthetic */ t1 a() {
        String a2 = this.a.a();
        v a3 = this.b.a();
        x0 a4 = this.c.a();
        Context b2 = ((e3) this.d).a();
        f2 a5 = this.e.a();
        return new t1(a2 != null ? new File(b2.getExternalFilesDir(null), a2) : b2.getExternalFilesDir(null), a3, a4, b2, a5, hz1.b(this.f));
    }
}
