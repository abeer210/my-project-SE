package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;

public final class e2 implements iz1<d2> {
    private final iz1<b0> a;
    private final iz1<i3> b;
    private final iz1<l1> c;
    private final iz1<Executor> d;
    private final iz1<x0> e;

    public e2(iz1<b0> iz1, iz1<i3> iz12, iz1<l1> iz13, iz1<Executor> iz14, iz1<x0> iz15) {
        this.a = iz1;
        this.b = iz12;
        this.c = iz13;
        this.d = iz14;
        this.e = iz15;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.iz1
    public final /* bridge */ /* synthetic */ d2 a() {
        b0 a2 = this.a.a();
        return new d2(a2, hz1.b(this.b), this.c.a(), hz1.b(this.d), this.e.a());
    }
}
