package com.google.android.play.core.assetpacks;

public final class p1 implements iz1<o1> {
    private final iz1<l1> a;
    private final iz1<b0> b;
    private final iz1<i0> c;

    public p1(iz1<l1> iz1, iz1<b0> iz12, iz1<i0> iz13) {
        this.a = iz1;
        this.b = iz12;
        this.c = iz13;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.iz1
    public final /* bridge */ /* synthetic */ o1 a() {
        return new o1(this.a.a(), this.b.a(), this.c.a());
    }
}
