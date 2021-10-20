package defpackage;

import android.net.Uri;
import defpackage.ih0;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import vigqyno.C0201;

/* renamed from: be0  reason: default package */
/* compiled from: ImagePipeline */
public class be0 {
    private static final CancellationException k = new CancellationException(C0201.m82(2336));
    public static final String l = null;
    private final he0 a;
    private final gf0 b;
    private final c60<Boolean> c;
    private final gd0<m40, ye0> d;
    private final gd0<m40, q60> e;
    private final vc0 f;
    private final vc0 g;
    private final wc0 h;
    private AtomicLong i = new AtomicLong();
    private final d50 j;

    /* access modifiers changed from: package-private */
    /* renamed from: be0$a */
    /* compiled from: ImagePipeline */
    public class a implements a60<m40> {
        public a(be0 be0) {
        }

        /* renamed from: b */
        public boolean a(m40 m40) {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: be0$b */
    /* compiled from: ImagePipeline */
    public class b implements a60<m40> {
        public final /* synthetic */ Uri a;

        public b(be0 be0, Uri uri) {
            this.a = uri;
        }

        /* renamed from: b */
        public boolean a(m40 m40) {
            return m40.a(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: be0$c */
    /* compiled from: ImagePipeline */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            int[] iArr = new int[ih0.a.values().length];
            a = iArr;
            iArr[ih0.a.DEFAULT.ordinal()] = 1;
            a[ih0.a.SMALL.ordinal()] = 2;
        }
    }

    static {
        C0201.m83(be0.class, 6);
    }

    public be0(he0 he0, Set<gf0> set, c60<Boolean> c60, gd0<m40, ye0> gd0, gd0<m40, q60> gd02, vc0 vc0, vc0 vc02, wc0 wc0, bh0 bh0, c60<Boolean> c602, c60<Boolean> c603, d50 d50) {
        this.a = he0;
        this.b = new ff0(set);
        this.c = c60;
        this.d = gd0;
        this.e = gd02;
        this.f = vc0;
        this.g = vc02;
        this.h = wc0;
        this.j = d50;
    }

    private a60<m40> q(Uri uri) {
        return new b(this, uri);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    private <T> n70<v60<T>> t(rg0<v60<T>> rg0, ih0 ih0, ih0.b bVar, Object obj, gf0 gf0) {
        boolean z;
        if (oh0.d()) {
            oh0.a(l);
        }
        gf0 k2 = k(ih0, gf0);
        d50 d50 = this.j;
        if (d50 != null) {
            d50.a(obj);
        }
        try {
            ih0.b b2 = ih0.b.b(ih0.f(), bVar);
            String h2 = h();
            if (!ih0.k()) {
                if (h70.k(ih0.q())) {
                    z = false;
                    n70<v60<T>> C = ke0.C(rg0, new xg0(ih0, h2, k2, obj, b2, false, z, ih0.j()), k2);
                    if (oh0.d()) {
                        oh0.b();
                    }
                    return C;
                }
            }
            z = true;
            n70<v60<T>> C2 = ke0.C(rg0, new xg0(ih0, h2, k2, obj, b2, false, z, ih0.j()), k2);
            if (oh0.d()) {
            }
            return C2;
        } catch (Exception e2) {
            n70<v60<T>> b3 = o70.b(e2);
            if (oh0.d()) {
                oh0.b();
            }
            return b3;
        } catch (Throwable th) {
            if (oh0.d()) {
                oh0.b();
            }
            throw th;
        }
    }

    private n70<Void> u(rg0<Void> rg0, ih0 ih0, ih0.b bVar, Object obj, qd0 qd0) {
        gf0 k2 = k(ih0, null);
        d50 d50 = this.j;
        if (d50 != null) {
            d50.a(obj);
        }
        try {
            return le0.B(rg0, new xg0(ih0, h(), k2, obj, ih0.b.b(ih0.f(), bVar), true, false, qd0), k2);
        } catch (Exception e2) {
            return o70.b(e2);
        }
    }

    public void a() {
        c();
        b();
    }

    public void b() {
        this.f.i();
        this.g.i();
    }

    public void c() {
        a aVar = new a(this);
        this.d.c(aVar);
        this.e.c(aVar);
    }

    public n70<v60<ye0>> d(ih0 ih0, Object obj) {
        return e(ih0, obj, ih0.b.FULL_FETCH);
    }

    public n70<v60<ye0>> e(ih0 ih0, Object obj, ih0.b bVar) {
        return f(ih0, obj, bVar, null);
    }

    public n70<v60<ye0>> f(ih0 ih0, Object obj, ih0.b bVar, gf0 gf0) {
        try {
            return t(this.a.g(ih0), ih0, bVar, obj, gf0);
        } catch (Exception e2) {
            return o70.b(e2);
        }
    }

    public n70<v60<ye0>> g(ih0 ih0, Object obj) {
        return e(ih0, obj, ih0.b.BITMAP_MEMORY_CACHE);
    }

    public String h() {
        return String.valueOf(this.i.getAndIncrement());
    }

    public gd0<m40, ye0> i() {
        return this.d;
    }

    public wc0 j() {
        return this.h;
    }

    public gf0 k(ih0 ih0, gf0 gf0) {
        if (gf0 == null) {
            if (ih0.l() == null) {
                return this.b;
            }
            return new ff0(this.b, ih0.l());
        } else if (ih0.l() == null) {
            return new ff0(this.b, gf0);
        } else {
            return new ff0(this.b, gf0, ih0.l());
        }
    }

    public boolean l(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.d.d(q(uri));
    }

    public boolean m(ih0 ih0) {
        if (ih0 == null) {
            return false;
        }
        v60<ye0> v60 = this.d.get(this.h.a(ih0, null));
        try {
            return v60.z(v60);
        } finally {
            v60.s(v60);
        }
    }

    public boolean n(Uri uri) {
        return o(uri, ih0.a.SMALL) || o(uri, ih0.a.DEFAULT);
    }

    public boolean o(Uri uri, ih0.a aVar) {
        jh0 r = jh0.r(uri);
        r.u(aVar);
        return p(r.a());
    }

    public boolean p(ih0 ih0) {
        m40 d2 = this.h.d(ih0, null);
        int i2 = c.a[ih0.c().ordinal()];
        if (i2 == 1) {
            return this.f.k(d2);
        }
        if (i2 != 2) {
            return false;
        }
        return this.g.k(d2);
    }

    public n70<Void> r(ih0 ih0, Object obj) {
        return s(ih0, obj, qd0.MEDIUM);
    }

    public n70<Void> s(ih0 ih0, Object obj, qd0 qd0) {
        if (!this.c.get().booleanValue()) {
            return o70.b(k);
        }
        try {
            return u(this.a.h(ih0), ih0, ih0.b.FULL_FETCH, obj, qd0);
        } catch (Exception e2) {
            return o70.b(e2);
        }
    }
}
