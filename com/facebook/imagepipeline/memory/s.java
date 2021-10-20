package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;

/* compiled from: LruBitmapPool */
public class s implements d {
    public final d0<Bitmap> a = new e();
    private final int b;
    private int c;
    private final h0 d;
    private int e;

    public s(int i, int i2, h0 h0Var, m60 m60) {
        this.b = i;
        this.c = i2;
        this.d = h0Var;
        if (m60 != null) {
            m60.a(this);
        }
    }

    private Bitmap b(int i) {
        this.d.a(i);
        return Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
    }

    private synchronized void e(int i) {
        while (true) {
            if (this.e <= i) {
                break;
            }
            Bitmap pop = this.a.pop();
            if (pop == null) {
                break;
            }
            int a2 = this.a.a(pop);
            this.e -= a2;
            this.d.e(a2);
        }
    }

    /* renamed from: c */
    public synchronized Bitmap get(int i) {
        if (this.e > this.b) {
            e(this.b);
        }
        Bitmap bitmap = this.a.get(i);
        if (bitmap != null) {
            int a2 = this.a.a(bitmap);
            this.e -= a2;
            this.d.b(a2);
            return bitmap;
        }
        return b(i);
    }

    /* renamed from: d */
    public void a(Bitmap bitmap) {
        int a2 = this.a.a(bitmap);
        if (a2 <= this.c) {
            this.d.g(a2);
            this.a.c(bitmap);
            synchronized (this) {
                this.e += a2;
            }
        }
    }
}
