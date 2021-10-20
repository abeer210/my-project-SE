package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;

/* compiled from: DummyBitmapPool */
public class o implements d {
    /* renamed from: b */
    public Bitmap get(int i) {
        double d = (double) i;
        Double.isNaN(d);
        return Bitmap.createBitmap(1, (int) Math.ceil(d / 2.0d), Bitmap.Config.RGB_565);
    }

    /* renamed from: c */
    public void a(Bitmap bitmap) {
        z50.g(bitmap);
        bitmap.recycle();
    }
}
