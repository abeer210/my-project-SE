package com.google.android.play.core.assetpacks;

public final class s0 implements iz1<r0> {
    private final iz1<b0> a;
    private final iz1<i3> b;
    private final iz1<v> c;
    private final iz1<x0> d;

    public s0(iz1<b0> iz1, iz1<i3> iz12, iz1<v> iz13, iz1<x0> iz14) {
        this.a = iz1;
        this.b = iz12;
        this.c = iz13;
        this.d = iz14;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.iz1
    public final /* bridge */ /* synthetic */ r0 a() {
        return new r0(this.a.a(), hz1.b(this.b), hz1.b(this.c), this.d.a());
    }
}
