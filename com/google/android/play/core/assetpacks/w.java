package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.common.c;
import java.util.concurrent.Executor;

public final class w implements iz1<v> {
    private final iz1<Context> a;
    private final iz1<l1> b;
    private final iz1<u0> c;
    private final iz1<i3> d;
    private final iz1<x0> e;
    private final iz1<l0> f;
    private final iz1<c> g;
    private final iz1<Executor> h;
    private final iz1<Executor> i;

    public w(iz1<Context> iz1, iz1<l1> iz12, iz1<u0> iz13, iz1<i3> iz14, iz1<x0> iz15, iz1<l0> iz16, iz1<c> iz17, iz1<Executor> iz18, iz1<Executor> iz19) {
        this.a = iz1;
        this.b = iz12;
        this.c = iz13;
        this.d = iz14;
        this.e = iz15;
        this.f = iz16;
        this.g = iz17;
        this.h = iz18;
        this.i = iz19;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.iz1
    public final /* bridge */ /* synthetic */ v a() {
        return new v(((e3) this.a).a(), this.b.a(), this.c.a(), hz1.b(this.d), this.e.a(), this.f.a(), this.g.a(), hz1.b(this.h), hz1.b(this.i));
    }
}
