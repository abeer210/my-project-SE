package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.c;

public final class j2 implements iz1<i2> {
    private final iz1<b0> a;
    private final iz1<i3> b;
    private final iz1<c> c;

    public j2(iz1<b0> iz1, iz1<i3> iz12, iz1<c> iz13) {
        this.a = iz1;
        this.b = iz12;
        this.c = iz13;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.iz1
    public final /* bridge */ /* synthetic */ i2 a() {
        return new i2(this.a.a(), hz1.b(this.b), this.c.a());
    }
}
