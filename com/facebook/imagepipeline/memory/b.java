package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import vigqyno.C0201;

/* compiled from: BitmapCounter */
public class b {
    private int a;
    private long b;
    private final int c;
    private final int d;
    private final x60<Bitmap> e;

    /* compiled from: BitmapCounter */
    class a implements x60<Bitmap> {
        public a() {
        }

        /* renamed from: b */
        public void a(Bitmap bitmap) {
            try {
                b.this.a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public b(int i, int i2) {
        boolean z = true;
        z50.b(i > 0);
        z50.b(i2 <= 0 ? false : z);
        this.c = i;
        this.d = i2;
        this.e = new a();
    }

    public synchronized void a(Bitmap bitmap) {
        int e2 = com.facebook.imageutils.a.e(bitmap);
        z50.c(this.a > 0, C0201.m82(36634));
        long j = (long) e2;
        z50.d(j <= this.b, C0201.m82(36635), Integer.valueOf(e2), Long.valueOf(this.b));
        this.b -= j;
        this.a--;
    }

    public synchronized int b() {
        return this.a;
    }

    public synchronized int c() {
        return this.c;
    }

    public synchronized int d() {
        return this.d;
    }

    public x60<Bitmap> e() {
        return this.e;
    }

    public synchronized long f() {
        return this.b;
    }

    public synchronized boolean g(Bitmap bitmap) {
        int e2 = com.facebook.imageutils.a.e(bitmap);
        if (this.a < this.c) {
            long j = (long) e2;
            if (this.b + j <= ((long) this.d)) {
                this.a++;
                this.b += j;
                return true;
            }
        }
        return false;
    }
}
