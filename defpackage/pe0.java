package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.imagepipeline.platform.f;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: pe0  reason: default package */
/* compiled from: DefaultImageDecoder */
public class pe0 implements qe0 {
    private final qe0 a;
    private final qe0 b;
    private final f c;
    private final qe0 d;
    private final Map<ob0, qe0> e;

    /* renamed from: pe0$a */
    /* compiled from: DefaultImageDecoder */
    class a implements qe0 {
        public a() {
        }

        @Override // defpackage.qe0
        public ye0 a(af0 af0, int i, df0 df0, od0 od0) {
            ob0 u = af0.u();
            if (u == nb0.a) {
                return pe0.this.d(af0, i, df0, od0);
            }
            if (u == nb0.c) {
                return pe0.this.c(af0, i, df0, od0);
            }
            if (u == nb0.j) {
                return pe0.this.b(af0, i, df0, od0);
            }
            if (u != ob0.b) {
                return pe0.this.e(af0, od0);
            }
            throw new oe0(C0201.m82(37887), af0);
        }
    }

    public pe0(qe0 qe0, qe0 qe02, f fVar) {
        this(qe0, qe02, fVar, null);
    }

    private void f(xh0 xh0, v60<Bitmap> v60) {
        if (xh0 != null) {
            Bitmap w = v60.w();
            if (Build.VERSION.SDK_INT >= 12 && xh0.a()) {
                w.setHasAlpha(true);
            }
            xh0.b(w);
        }
    }

    @Override // defpackage.qe0
    public ye0 a(af0 af0, int i, df0 df0, od0 od0) {
        qe0 qe0;
        qe0 qe02 = od0.g;
        if (qe02 != null) {
            return qe02.a(af0, i, df0, od0);
        }
        ob0 u = af0.u();
        if (u == null || u == ob0.b) {
            u = pb0.c(af0.w());
            af0.T(u);
        }
        Map<ob0, qe0> map = this.e;
        if (map == null || (qe0 = map.get(u)) == null) {
            return this.d.a(af0, i, df0, od0);
        }
        return qe0.a(af0, i, df0, od0);
    }

    public ye0 b(af0 af0, int i, df0 df0, od0 od0) {
        return this.b.a(af0, i, df0, od0);
    }

    public ye0 c(af0 af0, int i, df0 df0, od0 od0) {
        qe0 qe0;
        if (af0.A() == -1 || af0.s() == -1) {
            throw new oe0(C0201.m82(21243), af0);
        } else if (od0.e || (qe0 = this.a) == null) {
            return e(af0, od0);
        } else {
            return qe0.a(af0, i, df0, od0);
        }
    }

    public ze0 d(af0 af0, int i, df0 df0, od0 od0) {
        v60<Bitmap> c2 = this.c.c(af0, od0.f, null, i, od0.i);
        try {
            f(od0.h, c2);
            return new ze0(c2, df0, af0.x(), af0.p());
        } finally {
            c2.close();
        }
    }

    public ze0 e(af0 af0, od0 od0) {
        v60<Bitmap> a2 = this.c.a(af0, od0.f, null, od0.i);
        try {
            f(od0.h, a2);
            return new ze0(a2, cf0.d, af0.x(), af0.p());
        } finally {
            a2.close();
        }
    }

    public pe0(qe0 qe0, qe0 qe02, f fVar, Map<ob0, qe0> map) {
        this.d = new a();
        this.a = qe0;
        this.b = qe02;
        this.c = fVar;
        this.e = map;
    }
}
