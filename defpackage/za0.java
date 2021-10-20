package defpackage;

import android.graphics.Bitmap;
import defpackage.wa0;

/* renamed from: za0  reason: default package */
/* compiled from: KeepLastFrameCache */
public class za0 implements wa0 {
    private int a = -1;
    private wa0.a b;
    private v60<Bitmap> c;

    private synchronized void g() {
        if (!(this.b == null || this.a == -1)) {
            this.b.a(this, this.a);
        }
        v60.s(this.c);
        this.c = null;
        this.a = -1;
    }

    @Override // defpackage.wa0
    public synchronized v60<Bitmap> a(int i, int i2, int i3) {
        try {
        } finally {
            g();
        }
        return v60.n(this.c);
    }

    @Override // defpackage.wa0
    public void b(int i, v60<Bitmap> v60, int i2) {
    }

    @Override // defpackage.wa0
    public synchronized boolean c(int i) {
        return i == this.a && v60.z(this.c);
    }

    @Override // defpackage.wa0
    public synchronized void clear() {
        g();
    }

    @Override // defpackage.wa0
    public synchronized v60<Bitmap> d(int i) {
        if (this.a != i) {
            return null;
        }
        return v60.n(this.c);
    }

    @Override // defpackage.wa0
    public synchronized void e(int i, v60<Bitmap> v60, int i2) {
        if (v60 != null) {
            if (this.c != null && v60.w().equals(this.c.w())) {
                return;
            }
        }
        v60.s(this.c);
        if (!(this.b == null || this.a == -1)) {
            this.b.a(this, this.a);
        }
        this.c = v60.n(v60);
        if (this.b != null) {
            this.b.b(this, i);
        }
        this.a = i;
    }

    @Override // defpackage.wa0
    public synchronized v60<Bitmap> f(int i) {
        return v60.n(this.c);
    }
}
