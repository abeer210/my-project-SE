package com.google.android.play.core.assetpacks;

import android.content.Context;

public final class d3 implements iz1<i3> {
    private final iz1<Context> a;
    private final iz1<q> b;
    private final iz1<t1> c;

    public d3(iz1<Context> iz1, iz1<q> iz12, iz1<t1> iz13) {
        this.a = iz1;
        this.b = iz12;
        this.c = iz13;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.iz1
    public final /* bridge */ /* synthetic */ i3 a() {
        i3 i3Var = (i3) (z2.b(((e3) this.a).a()) == null ? hz1.b(this.b).a() : hz1.b(this.c).a());
        ty1.g(i3Var);
        return i3Var;
    }
}
