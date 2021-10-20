package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;

@TargetApi(21)
/* compiled from: BucketsBitmapPool */
public class h extends a<Bitmap> implements d {
    public h(m60 m60, g0 g0Var, h0 h0Var) {
        super(m60, g0Var, h0Var);
        n();
    }

    @Override // com.facebook.imagepipeline.memory.a
    public int i(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.a
    public int k(int i) {
        return i;
    }

    /* renamed from: v */
    public Bitmap b(int i) {
        double d = (double) i;
        Double.isNaN(d);
        return Bitmap.createBitmap(1, (int) Math.ceil(d / 2.0d), Bitmap.Config.RGB_565);
    }

    /* renamed from: w */
    public void f(Bitmap bitmap) {
        z50.g(bitmap);
        bitmap.recycle();
    }

    /* renamed from: x */
    public int j(Bitmap bitmap) {
        z50.g(bitmap);
        return bitmap.getAllocationByteCount();
    }

    /* renamed from: y */
    public Bitmap l(f<Bitmap> fVar) {
        Bitmap bitmap = (Bitmap) super.l(fVar);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    /* renamed from: z */
    public boolean p(Bitmap bitmap) {
        z50.g(bitmap);
        return !bitmap.isRecycled() && bitmap.isMutable();
    }
}
