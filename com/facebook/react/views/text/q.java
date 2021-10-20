package com.facebook.react.views.text;

import android.text.Spannable;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: ReactTextUpdate */
public class q {
    private final Spannable a;
    private final int b;
    private final boolean c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    public ReadableMap m;

    public q(Spannable spannable, int i2, boolean z, float f2, float f3, float f4, float f5, int i3, int i4, int i5) {
        this(spannable, i2, z, f2, f3, f4, f5, i3, i4, i5, -1, -1);
    }

    public static q a(Spannable spannable, int i2, boolean z, int i3, int i4, int i5, ReadableMap readableMap) {
        q qVar = new q(spannable, i2, z, i3, i4, i5);
        qVar.m = readableMap;
        return qVar;
    }

    public boolean b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.l;
    }

    public float e() {
        return this.g;
    }

    public float f() {
        return this.d;
    }

    public float g() {
        return this.f;
    }

    public float h() {
        return this.e;
    }

    public int i() {
        return this.k;
    }

    public int j() {
        return this.j;
    }

    public Spannable k() {
        return this.a;
    }

    public int l() {
        return this.h;
    }

    public int m() {
        return this.i;
    }

    public q(Spannable spannable, int i2, boolean z, int i3, int i4, int i5) {
        this(spannable, i2, z, -1.0f, -1.0f, -1.0f, -1.0f, i3, i4, i5, -1, -1);
    }

    public q(Spannable spannable, int i2, boolean z, float f2, float f3, float f4, float f5, int i3, int i4, int i5, int i6, int i7) {
        this.m = null;
        this.a = spannable;
        this.b = i2;
        this.c = z;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = i3;
        this.i = i4;
        this.j = i6;
        this.k = i7;
        this.l = i5;
    }
}
