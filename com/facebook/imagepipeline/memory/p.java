package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import java.util.Set;

/* compiled from: DummyTrackingInUseBitmapPool */
public class p implements d {
    private final Set<Bitmap> a = b60.b();

    /* renamed from: b */
    public Bitmap get(int i) {
        double d = (double) i;
        Double.isNaN(d);
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(d / 2.0d), Bitmap.Config.RGB_565);
        this.a.add(createBitmap);
        return createBitmap;
    }

    /* renamed from: c */
    public void a(Bitmap bitmap) {
        z50.g(bitmap);
        this.a.remove(bitmap);
        bitmap.recycle();
    }
}
