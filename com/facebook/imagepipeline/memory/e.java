package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.imageutils.a;
import vigqyno.C0201;

/* compiled from: BitmapPoolBackend */
public class e extends t<Bitmap> {
    /* renamed from: d */
    public Bitmap get(int i) {
        Bitmap bitmap = (Bitmap) super.get(i);
        if (bitmap == null || !f(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    /* renamed from: e */
    public int a(Bitmap bitmap) {
        return a.e(bitmap);
    }

    public boolean f(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        boolean isRecycled = bitmap.isRecycled();
        String r2 = C0201.m82(36435);
        if (isRecycled) {
            f60.H(r2, C0201.m82(36436), bitmap);
            return false;
        } else if (bitmap.isMutable()) {
            return true;
        } else {
            f60.H(r2, C0201.m82(36437), bitmap);
            return false;
        }
    }

    /* renamed from: g */
    public void c(Bitmap bitmap) {
        if (f(bitmap)) {
            super.c(bitmap);
        }
    }
}
