package defpackage;

import android.content.Context;
import android.os.Build;
import com.facebook.imagepipeline.platform.f;
import com.facebook.imagepipeline.platform.g;
import vigqyno.C0201;

/* renamed from: ee0  reason: default package */
/* compiled from: ImagePipelineFactory */
public class ee0 {
    private static final Class<?> t = ee0.class;
    private static ee0 u;
    private final bh0 a;
    private final ce0 b;
    private final ud0 c;
    private yc0<m40, ye0> d;
    private fd0<m40, ye0> e;
    private yc0<m40, q60> f;
    private fd0<m40, q60> g;
    private vc0 h;
    private b50 i;
    private qe0 j;
    private be0 k;
    private sh0 l;
    private ge0 m;
    private he0 n;
    private vc0 o;
    private b50 p;
    private oc0 q;
    private f r;
    private xb0 s;

    public ee0(ce0 ce0) {
        if (oh0.d()) {
            oh0.a(C0201.m82(20705));
        }
        z50.g(ce0);
        this.b = ce0;
        this.a = new bh0(ce0.k().b());
        this.c = new ud0(ce0.f());
        if (oh0.d()) {
            oh0.b();
        }
    }

    private xb0 b() {
        if (this.s == null) {
            this.s = yb0.a(n(), this.b.k(), c(), this.b.l().p());
        }
        return this.s;
    }

    private qe0 h() {
        qe0 qe0;
        qe0 qe02;
        if (this.j == null) {
            if (this.b.o() != null) {
                this.j = this.b.o();
            } else {
                xb0 b2 = b();
                if (b2 != null) {
                    qe0 = b2.b(this.b.a());
                    qe02 = b2.c(this.b.a());
                } else {
                    qe02 = null;
                    qe0 = null;
                }
                if (this.b.p() == null) {
                    this.j = new pe0(qe0, qe02, o());
                } else {
                    o();
                    this.b.p().a();
                    throw null;
                }
            }
        }
        return this.j;
    }

    private sh0 j() {
        if (this.l == null) {
            if (this.b.q() == null && this.b.s() == null && this.b.l().m()) {
                this.l = new wh0(this.b.l().d());
            } else {
                this.l = new uh0(this.b.l().d(), this.b.l().g(), this.b.q(), this.b.s());
            }
        }
        return this.l;
    }

    public static ee0 k() {
        ee0 ee0 = u;
        z50.h(ee0, C0201.m82(20706));
        return ee0;
    }

    private ge0 p() {
        if (this.m == null) {
            this.m = this.b.l().e().a(this.b.g(), this.b.z().j(), h(), this.b.A(), this.b.E(), this.b.F(), this.b.l().j(), this.b.k(), this.b.z().h(this.b.v()), d(), g(), l(), r(), this.b.d(), n(), this.b.l().c(), this.b.l().b(), this.b.l().a(), this.b.l().d(), e());
        }
        return this.m;
    }

    private he0 q() {
        boolean z = Build.VERSION.SDK_INT >= 24 && this.b.l().f();
        if (this.n == null) {
            this.n = new he0(this.b.g().getApplicationContext().getContentResolver(), p(), this.b.y(), this.b.F(), this.b.l().o(), this.a, this.b.E(), z, this.b.l().n(), this.b.D(), j());
        }
        return this.n;
    }

    private vc0 r() {
        if (this.o == null) {
            this.o = new vc0(s(), this.b.z().h(this.b.v()), this.b.z().i(), this.b.k().e(), this.b.k().d(), this.b.n());
        }
        return this.o;
    }

    public static synchronized void t(Context context) {
        synchronized (ee0.class) {
            if (oh0.d()) {
                oh0.a(C0201.m82(20707));
            }
            u(ce0.G(context).E());
            if (oh0.d()) {
                oh0.b();
            }
        }
    }

    public static synchronized void u(ce0 ce0) {
        synchronized (ee0.class) {
            if (u != null) {
                f60.w(t, C0201.m82(20708));
            }
            u = new ee0(ce0);
        }
    }

    public ve0 a(Context context) {
        xb0 b2 = b();
        if (b2 == null) {
            return null;
        }
        return b2.a(context);
    }

    public yc0<m40, ye0> c() {
        if (this.d == null) {
            this.d = rc0.a(this.b.b(), this.b.x(), this.b.c());
        }
        return this.d;
    }

    public fd0<m40, ye0> d() {
        if (this.e == null) {
            this.e = sc0.a(c(), this.b.n());
        }
        return this.e;
    }

    public ud0 e() {
        return this.c;
    }

    public yc0<m40, q60> f() {
        if (this.f == null) {
            this.f = cd0.a(this.b.j(), this.b.x());
        }
        return this.f;
    }

    public fd0<m40, q60> g() {
        if (this.g == null) {
            this.g = dd0.a(f(), this.b.n());
        }
        return this.g;
    }

    public be0 i() {
        if (this.k == null) {
            this.k = new be0(q(), this.b.B(), this.b.t(), d(), g(), l(), r(), this.b.d(), this.a, d60.a(Boolean.FALSE), this.b.l().l(), this.b.e());
        }
        return this.k;
    }

    public vc0 l() {
        if (this.h == null) {
            this.h = new vc0(m(), this.b.z().h(this.b.v()), this.b.z().i(), this.b.k().e(), this.b.k().d(), this.b.n());
        }
        return this.h;
    }

    public b50 m() {
        if (this.i == null) {
            this.i = this.b.m().a(this.b.u());
        }
        return this.i;
    }

    public oc0 n() {
        if (this.q == null) {
            this.q = pc0.a(this.b.z(), o(), e());
        }
        return this.q;
    }

    public f o() {
        if (this.r == null) {
            this.r = g.a(this.b.z(), this.b.l().k());
        }
        return this.r;
    }

    public b50 s() {
        if (this.p == null) {
            this.p = this.b.m().a(this.b.C());
        }
        return this.p;
    }
}
