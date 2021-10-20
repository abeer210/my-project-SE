package com.google.android.play.core.assetpacks;

import java.io.InputStream;

public final class q0 extends n1 {
    public final int c;
    public final long d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public final int j;
    public final InputStream k;

    public q0(int i2, String str, int i3, long j2, String str2, int i4, int i5, int i6, long j3, int i7, InputStream inputStream) {
        super(i2, str);
        this.c = i3;
        this.d = j2;
        this.e = str2;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = j3;
        this.j = i7;
        this.k = inputStream;
    }

    public final boolean a() {
        return this.g + 1 == this.h;
    }
}
