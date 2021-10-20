package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;

public final class m1 implements iz1<l1> {
    private final iz1<b0> a;
    private final iz1<i3> b;
    private final iz1<x0> c;
    private final iz1<Executor> d;

    public m1(iz1<b0> iz1, iz1<i3> iz12, iz1<x0> iz13, iz1<Executor> iz14) {
        this.a = iz1;
        this.b = iz12;
        this.c = iz13;
        this.d = iz14;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.iz1
    public final /* bridge */ /* synthetic */ l1 a() {
        b0 a2 = this.a.a();
        return new l1(a2, hz1.b(this.b), this.c.a(), hz1.b(this.d));
    }
}
