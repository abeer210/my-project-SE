package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;

@u50
public class NativeBlurFilter {
    static {
        b.a();
    }

    public static void a(Bitmap bitmap, int i, int i2) {
        z50.g(bitmap);
        boolean z = true;
        z50.b(i > 0);
        if (i2 <= 0) {
            z = false;
        }
        z50.b(z);
        nativeIterativeBoxBlur(bitmap, i, i2);
    }

    @u50
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
