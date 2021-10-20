package defpackage;

import android.graphics.Bitmap;
import com.facebook.imageutils.a;

/* renamed from: ze0  reason: default package */
/* compiled from: CloseableStaticBitmap */
public class ze0 extends xe0 {
    private v60<Bitmap> a;
    private volatile Bitmap b;
    private final df0 c;
    private final int d;
    private final int e;

    public ze0(Bitmap bitmap, x60<Bitmap> x60, df0 df0, int i) {
        this(bitmap, x60, df0, i, 0);
    }

    private synchronized v60<Bitmap> p() {
        v60<Bitmap> v60;
        v60 = this.a;
        this.a = null;
        this.b = null;
        return v60;
    }

    private static int r(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    private static int s(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    @Override // defpackage.bf0
    public int a() {
        int i;
        if (this.d % 180 != 0 || (i = this.e) == 5 || i == 7) {
            return s(this.b);
        }
        return r(this.b);
    }

    @Override // defpackage.bf0
    public int c() {
        int i;
        if (this.d % 180 != 0 || (i = this.e) == 5 || i == 7) {
            return r(this.b);
        }
        return s(this.b);
    }

    @Override // defpackage.ye0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        v60<Bitmap> p = p();
        if (p != null) {
            p.close();
        }
    }

    @Override // defpackage.ye0
    public df0 h() {
        return this.c;
    }

    @Override // defpackage.ye0
    public synchronized boolean isClosed() {
        return this.a == null;
    }

    @Override // defpackage.ye0
    public int k() {
        return a.e(this.b);
    }

    @Override // defpackage.xe0
    public Bitmap n() {
        return this.b;
    }

    public synchronized v60<Bitmap> o() {
        return v60.n(this.a);
    }

    public int u() {
        return this.e;
    }

    public int w() {
        return this.d;
    }

    public ze0(Bitmap bitmap, x60<Bitmap> x60, df0 df0, int i, int i2) {
        z50.g(bitmap);
        this.b = bitmap;
        Bitmap bitmap2 = this.b;
        z50.g(x60);
        this.a = v60.F(bitmap2, x60);
        this.c = df0;
        this.d = i;
        this.e = i2;
    }

    public ze0(v60<Bitmap> v60, df0 df0, int i) {
        this(v60, df0, i, 0);
    }

    public ze0(v60<Bitmap> v60, df0 df0, int i, int i2) {
        v60<Bitmap> m = v60.m();
        z50.g(m);
        v60<Bitmap> v602 = m;
        this.a = v602;
        this.b = v602.w();
        this.c = df0;
        this.d = i;
        this.e = i2;
    }
}
