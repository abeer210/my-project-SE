package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;

@u50
public class Bitmaps {
    static {
        a.a();
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2) {
        boolean z = true;
        z50.b(bitmap2.getConfig() == bitmap.getConfig());
        z50.b(bitmap.isMutable());
        z50.b(bitmap.getWidth() == bitmap2.getWidth());
        if (bitmap.getHeight() != bitmap2.getHeight()) {
            z = false;
        }
        z50.b(z);
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @u50
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
