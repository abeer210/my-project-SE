package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import defpackage.ih0;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: he0  reason: default package */
/* compiled from: ProducerSequenceFactory */
public class he0 {
    private final ContentResolver a;
    private final ge0 b;
    private final ng0 c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final bh0 g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final sh0 k;
    public rg0<v60<ye0>> l;
    public rg0<af0> m;
    public rg0<af0> n;
    public rg0<Void> o;
    public rg0<Void> p;
    private rg0<af0> q;
    public rg0<v60<ye0>> r;
    public rg0<v60<ye0>> s;
    public rg0<v60<ye0>> t;
    public rg0<v60<ye0>> u;
    public rg0<v60<ye0>> v;
    public rg0<v60<ye0>> w;
    public rg0<v60<ye0>> x;
    public Map<rg0<v60<ye0>>, rg0<v60<ye0>>> y = new HashMap();
    public Map<rg0<v60<ye0>>, rg0<v60<ye0>>> z;

    public he0(ContentResolver contentResolver, ge0 ge0, ng0 ng0, boolean z2, boolean z3, bh0 bh0, boolean z4, boolean z5, boolean z6, boolean z7, sh0 sh0) {
        this.a = contentResolver;
        this.b = ge0;
        this.c = ng0;
        this.d = z2;
        this.e = z3;
        new HashMap();
        this.z = new HashMap();
        this.g = bh0;
        this.h = z4;
        this.i = z5;
        this.f = z6;
        this.j = z7;
        this.k = sh0;
    }

    private rg0<af0> A(rg0<af0> rg0, eh0<af0>[] eh0Arr) {
        return ge0.g(z(eh0Arr), this.b.B(this.b.z(ge0.a(rg0), true, this.k)));
    }

    private static void B(ih0 ih0) {
        z50.g(ih0);
        z50.b(ih0.f().d() <= ih0.b.ENCODED_MEMORY_CACHE.d());
    }

    private synchronized rg0<af0> a() {
        if (oh0.d()) {
            oh0.a(C0201.m82(3888));
        }
        if (this.m == null) {
            if (oh0.d()) {
                oh0.a(C0201.m82(3889));
            }
            this.m = this.b.b(y(this.b.r()), this.g);
            if (oh0.d()) {
                oh0.b();
            }
        }
        if (oh0.d()) {
            oh0.b();
        }
        return this.m;
    }

    private synchronized rg0<af0> b() {
        if (oh0.d()) {
            oh0.a(C0201.m82(3890));
        }
        if (this.n == null) {
            if (oh0.d()) {
                oh0.a(C0201.m82(3891));
            }
            this.n = this.b.b(e(), this.g);
            if (oh0.d()) {
                oh0.b();
            }
        }
        if (oh0.d()) {
            oh0.b();
        }
        return this.n;
    }

    private rg0<v60<ye0>> c(ih0 ih0) {
        try {
            if (oh0.d()) {
                oh0.a(C0201.m82(3892));
            }
            z50.g(ih0);
            Uri q2 = ih0.q();
            z50.h(q2, C0201.m82(3893));
            int r2 = ih0.r();
            if (r2 != 0) {
                switch (r2) {
                    case 2:
                        rg0<v60<ye0>> n2 = n();
                        if (oh0.d()) {
                            oh0.b();
                        }
                        return n2;
                    case 3:
                        rg0<v60<ye0>> l2 = l();
                        if (oh0.d()) {
                            oh0.b();
                        }
                        return l2;
                    case 4:
                        if (i60.c(this.a.getType(q2))) {
                            rg0<v60<ye0>> n3 = n();
                            if (oh0.d()) {
                                oh0.b();
                            }
                            return n3;
                        }
                        rg0<v60<ye0>> j2 = j();
                        if (oh0.d()) {
                            oh0.b();
                        }
                        return j2;
                    case 5:
                        rg0<v60<ye0>> i2 = i();
                        if (oh0.d()) {
                            oh0.b();
                        }
                        return i2;
                    case 6:
                        rg0<v60<ye0>> m2 = m();
                        if (oh0.d()) {
                            oh0.b();
                        }
                        return m2;
                    case 7:
                        rg0<v60<ye0>> f2 = f();
                        if (oh0.d()) {
                            oh0.b();
                        }
                        return f2;
                    case 8:
                        return r();
                    default:
                        throw new IllegalArgumentException(C0201.m82(3894) + s(q2));
                }
            } else {
                rg0<v60<ye0>> o2 = o();
                if (oh0.d()) {
                    oh0.b();
                }
                return o2;
            }
        } finally {
            if (oh0.d()) {
                oh0.b();
            }
        }
    }

    private synchronized rg0<v60<ye0>> d(rg0<v60<ye0>> rg0) {
        rg0<v60<ye0>> rg02;
        rg02 = this.z.get(rg0);
        if (rg02 == null) {
            rg02 = this.b.f(rg0);
            this.z.put(rg0, rg02);
        }
        return rg02;
    }

    private synchronized rg0<af0> e() {
        if (oh0.d()) {
            oh0.a(C0201.m82(3895));
        }
        if (this.q == null) {
            if (oh0.d()) {
                oh0.a(C0201.m82(3896));
            }
            if0 a2 = ge0.a(y(this.b.u(this.c)));
            this.q = a2;
            this.q = this.b.z(a2, this.d && !this.h, this.k);
            if (oh0.d()) {
                oh0.b();
            }
        }
        if (oh0.d()) {
            oh0.b();
        }
        return this.q;
    }

    private synchronized rg0<v60<ye0>> f() {
        if (this.w == null) {
            rg0<af0> h2 = this.b.h();
            if (k70.a && (!this.e || k70.b == null)) {
                h2 = this.b.D(h2);
            }
            this.w = u(this.b.z(ge0.a(h2), true, this.k));
        }
        return this.w;
    }

    private synchronized rg0<v60<ye0>> i() {
        if (this.v == null) {
            this.v = v(this.b.n());
        }
        return this.v;
    }

    private synchronized rg0<v60<ye0>> j() {
        if (this.t == null) {
            this.t = w(this.b.o(), new eh0[]{this.b.p(), this.b.q()});
        }
        return this.t;
    }

    private synchronized rg0<Void> k() {
        if (oh0.d()) {
            oh0.a(C0201.m82(3897));
        }
        if (this.o == null) {
            if (oh0.d()) {
                oh0.a(C0201.m82(3898));
            }
            this.o = ge0.A(a());
            if (oh0.d()) {
                oh0.b();
            }
        }
        if (oh0.d()) {
            oh0.b();
        }
        return this.o;
    }

    private synchronized rg0<v60<ye0>> l() {
        if (this.r == null) {
            this.r = v(this.b.r());
        }
        return this.r;
    }

    private synchronized rg0<v60<ye0>> m() {
        if (this.u == null) {
            this.u = v(this.b.s());
        }
        return this.u;
    }

    private synchronized rg0<v60<ye0>> n() {
        if (this.s == null) {
            this.s = t(this.b.t());
        }
        return this.s;
    }

    private synchronized rg0<v60<ye0>> o() {
        if (oh0.d()) {
            oh0.a(C0201.m82(3899));
        }
        if (this.l == null) {
            if (oh0.d()) {
                oh0.a(C0201.m82(3900));
            }
            this.l = u(e());
            if (oh0.d()) {
                oh0.b();
            }
        }
        if (oh0.d()) {
            oh0.b();
        }
        return this.l;
    }

    private synchronized rg0<Void> p() {
        if (oh0.d()) {
            oh0.a(C0201.m82(3901));
        }
        if (this.p == null) {
            if (oh0.d()) {
                oh0.a(C0201.m82(3902));
            }
            this.p = ge0.A(b());
            if (oh0.d()) {
                oh0.b();
            }
        }
        if (oh0.d()) {
            oh0.b();
        }
        return this.p;
    }

    private synchronized rg0<v60<ye0>> q(rg0<v60<ye0>> rg0) {
        if (!this.y.containsKey(rg0)) {
            this.y.put(rg0, this.b.w(this.b.x(rg0)));
        }
        return this.y.get(rg0);
    }

    private synchronized rg0<v60<ye0>> r() {
        if (this.x == null) {
            this.x = v(this.b.y());
        }
        return this.x;
    }

    private static String s(Uri uri) {
        String valueOf = String.valueOf(uri);
        if (valueOf.length() <= 30) {
            return valueOf;
        }
        return valueOf.substring(0, 30) + C0201.m82(3903);
    }

    private rg0<v60<ye0>> t(rg0<v60<ye0>> rg0) {
        return this.b.c(this.b.b(this.b.d(this.b.e(rg0)), this.g));
    }

    private rg0<v60<ye0>> u(rg0<af0> rg0) {
        if (oh0.d()) {
            oh0.a(C0201.m82(3904));
        }
        rg0<v60<ye0>> t2 = t(this.b.i(rg0));
        if (oh0.d()) {
            oh0.b();
        }
        return t2;
    }

    private rg0<v60<ye0>> v(rg0<af0> rg0) {
        return w(rg0, new eh0[]{this.b.q()});
    }

    private rg0<v60<ye0>> w(rg0<af0> rg0, eh0<af0>[] eh0Arr) {
        return u(A(y(rg0), eh0Arr));
    }

    private rg0<af0> x(rg0<af0> rg0) {
        xf0 xf0;
        if (oh0.d()) {
            oh0.a(C0201.m82(3905));
        }
        if (this.f) {
            xf0 = this.b.k(this.b.v(rg0));
        } else {
            xf0 = this.b.k(rg0);
        }
        wf0 j2 = this.b.j(xf0);
        if (oh0.d()) {
            oh0.b();
        }
        return j2;
    }

    private rg0<af0> y(rg0<af0> rg0) {
        if (k70.a && (!this.e || k70.b == null)) {
            rg0 = this.b.D(rg0);
        }
        if (this.j) {
            rg0 = x(rg0);
        }
        return this.b.l(this.b.m(rg0));
    }

    private rg0<af0> z(eh0<af0>[] eh0Arr) {
        return this.b.z(this.b.C(eh0Arr), true, this.k);
    }

    public rg0<v60<ye0>> g(ih0 ih0) {
        if (oh0.d()) {
            oh0.a(C0201.m82(3906));
        }
        rg0<v60<ye0>> c2 = c(ih0);
        if (ih0.g() != null) {
            c2 = q(c2);
        }
        if (this.i) {
            c2 = d(c2);
        }
        if (oh0.d()) {
            oh0.b();
        }
        return c2;
    }

    public rg0<Void> h(ih0 ih0) {
        B(ih0);
        int r2 = ih0.r();
        if (r2 == 0) {
            return p();
        }
        if (r2 == 2 || r2 == 3) {
            return k();
        }
        Uri q2 = ih0.q();
        throw new IllegalArgumentException(C0201.m82(3907) + s(q2));
    }
}
