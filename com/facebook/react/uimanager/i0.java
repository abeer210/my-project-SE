package com.facebook.react.uimanager;

import com.facebook.yoga.g;

/* compiled from: Spacing */
public class i0 {
    private static final int[] e = {1, 2, 4, 8, 16, 32, 64, 128, 256};
    private final float[] a;
    private int b;
    private final float c;
    private boolean d;

    public i0() {
        this(0.0f);
    }

    private static float[] c() {
        return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
    }

    public float a(int i) {
        float f = (i == 4 || i == 5) ? Float.NaN : this.c;
        int i2 = this.b;
        if (i2 == 0) {
            return f;
        }
        if ((i2 & e[i]) != 0) {
            return this.a[i];
        }
        if (this.d) {
            char c2 = (i == 1 || i == 3) ? (char) 7 : 6;
            int i3 = this.b;
            int[] iArr = e;
            if ((iArr[c2] & i3) != 0) {
                return this.a[c2];
            }
            if ((i3 & iArr[8]) != 0) {
                return this.a[8];
            }
        }
        return f;
    }

    public float b(int i) {
        return this.a[i];
    }

    public boolean d(int i, float f) {
        boolean z = false;
        if (d.a(this.a[i], f)) {
            return false;
        }
        this.a[i] = f;
        if (g.a(f)) {
            this.b = (e[i] ^ -1) & this.b;
        } else {
            this.b = e[i] | this.b;
        }
        int i2 = this.b;
        int[] iArr = e;
        if (!((iArr[8] & i2) == 0 && (iArr[7] & i2) == 0 && (i2 & iArr[6]) == 0)) {
            z = true;
        }
        this.d = z;
        return true;
    }

    public i0(float f) {
        this.b = 0;
        this.c = f;
        this.a = c();
    }
}
