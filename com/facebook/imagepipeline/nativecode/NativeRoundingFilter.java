package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;

@u50
public class NativeRoundingFilter {
    static {
        b.a();
    }

    @u50
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    @u50
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);
}
