package com.facebook.yoga;

/* compiled from: YogaMeasureOutput */
public class o {
    public static long a(float f, float f2) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        return ((long) Float.floatToRawIntBits(f2)) | (((long) floatToRawIntBits) << 32);
    }

    public static long b(int i, int i2) {
        return a((float) i, (float) i2);
    }
}
