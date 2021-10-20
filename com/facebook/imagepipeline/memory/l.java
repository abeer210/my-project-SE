package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

/* compiled from: DefaultByteArrayPoolParams */
public class l {
    public static g0 a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(16384, 5);
        return new g0(81920, 1048576, sparseIntArray);
    }
}
