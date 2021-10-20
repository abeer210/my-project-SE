package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;

public final class w2 implements iz1<v2> {
    private final iz1<b0> a;
    private final iz1<i3> b;
    private final iz1<v> c;
    private final iz1<m02> d;
    private final iz1<l1> e;
    private final iz1<x0> f;
    private final iz1<l0> g;
    private final iz1<Executor> h;

    public w2(iz1<b0> iz1, iz1<i3> iz12, iz1<v> iz13, iz1<m02> iz14, iz1<l1> iz15, iz1<x0> iz16, iz1<l0> iz17, iz1<Executor> iz18) {
        this.a = iz1;
        this.b = iz12;
        this.c = iz13;
        this.d = iz14;
        this.e = iz15;
        this.f = iz16;
        this.g = iz17;
        this.h = iz18;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.iz1
    public final /* bridge */ /* synthetic */ v2 a() {
        return new v2(this.a.a(), hz1.b(this.b), this.c.a(), this.d.a(), this.e.a(), this.f.a(), this.g.a(), hz1.b(this.h));
    }
}
