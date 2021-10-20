package com.google.android.gms.vision;

import android.util.SparseArray;

public final class d {
    private static final Object c = new Object();
    private static int d;
    private SparseArray<Integer> a = new SparseArray<>();
    private SparseArray<Integer> b = new SparseArray<>();

    public final int a(int i) {
        synchronized (c) {
            Integer num = this.a.get(i);
            if (num != null) {
                return num.intValue();
            }
            int i2 = d;
            d++;
            this.a.append(i, Integer.valueOf(i2));
            this.b.append(i2, Integer.valueOf(i));
            return i2;
        }
    }
}
