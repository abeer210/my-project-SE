package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

/* compiled from: DefaultFlexByteArrayPoolParams */
public class m {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static SparseIntArray a(int i, int i2, int i3) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i <= i2) {
            sparseIntArray.put(i, i3);
            i *= 2;
        }
        return sparseIntArray;
    }

    public static g0 b() {
        int i = a;
        return new g0(4194304, i * 4194304, a(131072, 4194304, i), 131072, 4194304, a);
    }
}
