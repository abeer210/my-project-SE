package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import defpackage.fc0;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: bc0  reason: default package */
/* compiled from: AnimatedImageFactoryImpl */
public class bc0 implements ac0 {
    public static zb0 c = g(C0201.m82(2455));
    public static zb0 d = g(C0201.m82(2456));
    private final dc0 a;
    private final oc0 b;

    /* access modifiers changed from: package-private */
    /* renamed from: bc0$a */
    /* compiled from: AnimatedImageFactoryImpl */
    public class a implements fc0.b {
        public a(bc0 bc0) {
        }

        @Override // defpackage.fc0.b
        public void a(int i, Bitmap bitmap) {
        }

        @Override // defpackage.fc0.b
        public v60<Bitmap> b(int i) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bc0$b */
    /* compiled from: AnimatedImageFactoryImpl */
    public class b implements fc0.b {
        public final /* synthetic */ List a;

        public b(bc0 bc0, List list) {
            this.a = list;
        }

        @Override // defpackage.fc0.b
        public void a(int i, Bitmap bitmap) {
        }

        @Override // defpackage.fc0.b
        public v60<Bitmap> b(int i) {
            return v60.n((v60) this.a.get(i));
        }
    }

    public bc0(dc0 dc0, oc0 oc0) {
        this.a = dc0;
        this.b = oc0;
    }

    @SuppressLint({"NewApi"})
    private v60<Bitmap> c(int i, int i2, Bitmap.Config config) {
        v60<Bitmap> d2 = this.b.d(i, i2, config);
        d2.w().eraseColor(0);
        if (Build.VERSION.SDK_INT >= 12) {
            d2.w().setHasAlpha(true);
        }
        return d2;
    }

    private v60<Bitmap> d(tb0 tb0, Bitmap.Config config, int i) {
        v60<Bitmap> c2 = c(tb0.c(), tb0.a(), config);
        new fc0(this.a.a(vb0.b(tb0), null), new a(this)).f(i, c2.w());
        return c2;
    }

    private List<v60<Bitmap>> e(tb0 tb0, Bitmap.Config config) {
        rb0 a2 = this.a.a(vb0.b(tb0), null);
        ArrayList arrayList = new ArrayList(a2.b());
        fc0 fc0 = new fc0(a2, new b(this, arrayList));
        for (int i = 0; i < a2.b(); i++) {
            v60<Bitmap> c2 = c(a2.c(), a2.a(), config);
            fc0.f(i, c2.w());
            arrayList.add(c2);
        }
        return arrayList;
    }

    private ye0 f(od0 od0, tb0 tb0, Bitmap.Config config) {
        Throwable th;
        List<v60<Bitmap>> list;
        v60<Bitmap> v60 = null;
        try {
            int b2 = od0.c ? tb0.b() - 1 : 0;
            if (od0.e) {
                ze0 ze0 = new ze0(d(tb0, config, b2), cf0.d, 0);
                v60.s(null);
                v60.u(null);
                return ze0;
            }
            if (od0.d) {
                list = e(tb0, config);
                try {
                    v60 = v60.n(list.get(b2));
                } catch (Throwable th2) {
                    th = th2;
                    v60.s(null);
                    v60.u(list);
                    throw th;
                }
            } else {
                list = null;
            }
            if (od0.b && v60 == null) {
                v60 = d(tb0, config, b2);
            }
            wb0 d2 = vb0.d(tb0);
            d2.h(v60);
            d2.g(b2);
            d2.f(list);
            we0 we0 = new we0(d2.a());
            v60.s(v60);
            v60.u(list);
            return we0;
        } catch (Throwable th3) {
            th = th3;
            list = null;
            v60.s(null);
            v60.u(list);
            throw th;
        }
    }

    private static zb0 g(String str) {
        try {
            return (zb0) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // defpackage.ac0
    public ye0 a(af0 af0, od0 od0, Bitmap.Config config) {
        tb0 tb0;
        if (c != null) {
            v60<q60> m = af0.m();
            z50.g(m);
            try {
                q60 w = m.w();
                if (w.g() != null) {
                    tb0 = c.i(w.g());
                } else {
                    tb0 = c.g(w.l(), w.size());
                }
                return f(od0, tb0, config);
            } finally {
                v60.s(m);
            }
        } else {
            throw new UnsupportedOperationException(C0201.m82(2457));
        }
    }

    @Override // defpackage.ac0
    public ye0 b(af0 af0, od0 od0, Bitmap.Config config) {
        tb0 tb0;
        if (d != null) {
            v60<q60> m = af0.m();
            z50.g(m);
            try {
                q60 w = m.w();
                if (w.g() != null) {
                    tb0 = d.i(w.g());
                } else {
                    tb0 = d.g(w.l(), w.size());
                }
                return f(od0, tb0, config);
            } finally {
                v60.s(m);
            }
        } else {
            throw new UnsupportedOperationException(C0201.m82(2458));
        }
    }
}
