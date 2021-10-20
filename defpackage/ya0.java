package defpackage;

import android.graphics.Bitmap;
import android.util.SparseArray;
import vigqyno.C0201;

/* renamed from: ya0  reason: default package */
/* compiled from: FrescoFrameCache */
public class ya0 implements wa0 {
    private static final Class<?> e = ya0.class;
    private final ec0 a;
    private final boolean b;
    private final SparseArray<v60<ye0>> c = new SparseArray<>();
    private v60<ye0> d;

    public ya0(ec0 ec0, boolean z) {
        this.a = ec0;
        this.b = z;
    }

    public static v60<Bitmap> g(v60<ye0> v60) {
        ze0 ze0;
        try {
            if (v60.z(v60) && (v60.w() instanceof ze0) && (ze0 = (ze0) v60.w()) != null) {
                return ze0.o();
            }
            v60.s(v60);
            return null;
        } finally {
            v60.s(v60);
        }
    }

    private static v60<ye0> h(v60<Bitmap> v60) {
        return v60.B(new ze0(v60, cf0.d, 0));
    }

    private synchronized void i(int i) {
        v60<ye0> v60 = this.c.get(i);
        if (v60 != null) {
            this.c.delete(i);
            v60.s(v60);
            f60.r(e, C0201.m82(26698), Integer.valueOf(i), this.c);
        }
    }

    @Override // defpackage.wa0
    public synchronized v60<Bitmap> a(int i, int i2, int i3) {
        if (!this.b) {
            return null;
        }
        return g(this.a.d());
    }

    @Override // defpackage.wa0
    public synchronized void b(int i, v60<Bitmap> v60, int i2) {
        z50.g(v60);
        v60<ye0> v602 = null;
        try {
            v602 = h(v60);
            if (v602 != null) {
                v60<ye0> a2 = this.a.a(i, v602);
                if (v60.z(a2)) {
                    v60.s(this.c.get(i));
                    this.c.put(i, a2);
                    f60.r(e, C0201.m82(26699), Integer.valueOf(i), this.c);
                }
                v60.s(v602);
            }
        } finally {
            v60.s(v602);
        }
    }

    @Override // defpackage.wa0
    public synchronized boolean c(int i) {
        return this.a.b(i);
    }

    @Override // defpackage.wa0
    public synchronized void clear() {
        v60.s(this.d);
        this.d = null;
        for (int i = 0; i < this.c.size(); i++) {
            v60.s(this.c.valueAt(i));
        }
        this.c.clear();
    }

    @Override // defpackage.wa0
    public synchronized v60<Bitmap> d(int i) {
        return g(this.a.c(i));
    }

    /* JADX INFO: finally extract failed */
    @Override // defpackage.wa0
    public synchronized void e(int i, v60<Bitmap> v60, int i2) {
        z50.g(v60);
        i(i);
        try {
            v60<ye0> h = h(v60);
            if (h != null) {
                v60.s(this.d);
                this.d = this.a.a(i, h);
            }
            v60.s(h);
        } catch (Throwable th) {
            v60.s(null);
            throw th;
        }
    }

    @Override // defpackage.wa0
    public synchronized v60<Bitmap> f(int i) {
        return g(v60.n(this.d));
    }
}
