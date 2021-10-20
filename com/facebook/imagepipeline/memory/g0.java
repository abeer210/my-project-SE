package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import vigqyno.C0188;

/* compiled from: PoolParams */
public class g0 {
    public final int a;
    public final int b;
    public final SparseIntArray c;
    public boolean d;
    public final int e;

    public g0(int i, int i2, SparseIntArray sparseIntArray) {
        this(i, i2, sparseIntArray, 0, C0188.f24, -1);
    }

    public g0(int i, int i2, SparseIntArray sparseIntArray, int i3, int i4, int i5) {
        z50.i(i >= 0 && i2 >= i);
        this.b = i;
        this.a = i2;
        this.c = sparseIntArray;
        this.e = i5;
    }
}
