package defpackage;

import android.net.Uri;
import defpackage.y50;
import java.io.File;
import vigqyno.C0201;

/* renamed from: ih0  reason: default package */
/* compiled from: ImageRequest */
public class ih0 {
    private final a a;
    private final Uri b;
    private final int c;
    private File d;
    private final boolean e;
    private final boolean f;
    private final od0 g;
    private final rd0 h;
    private final sd0 i;
    private final nd0 j;
    private final qd0 k;
    private final b l;
    private final boolean m;
    private final boolean n;
    private final Boolean o;
    private final kh0 p;
    private final gf0 q;
    private final Boolean r;

    /* renamed from: ih0$a */
    /* compiled from: ImageRequest */
    public enum a {
        SMALL,
        DEFAULT
    }

    /* renamed from: ih0$b */
    /* compiled from: ImageRequest */
    public enum b {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        
        private int a;

        private b(int i) {
            this.a = i;
        }

        public static b b(b bVar, b bVar2) {
            return bVar.d() > bVar2.d() ? bVar : bVar2;
        }

        public int d() {
            return this.a;
        }
    }

    public ih0(jh0 jh0) {
        this.a = jh0.d();
        Uri m2 = jh0.m();
        this.b = m2;
        this.c = s(m2);
        this.e = jh0.q();
        this.f = jh0.o();
        this.g = jh0.e();
        this.h = jh0.j();
        this.i = jh0.l() == null ? sd0.a() : jh0.l();
        this.j = jh0.c();
        this.k = jh0.i();
        this.l = jh0.f();
        this.m = jh0.n();
        this.n = jh0.p();
        this.o = jh0.G();
        this.p = jh0.g();
        this.q = jh0.h();
        this.r = jh0.k();
    }

    public static ih0 a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return jh0.r(uri).a();
    }

    private static int s(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (h70.k(uri)) {
            return 0;
        }
        if (h70.i(uri)) {
            return i60.c(i60.b(uri.getPath())) ? 2 : 3;
        }
        if (h70.h(uri)) {
            return 4;
        }
        if (h70.e(uri)) {
            return 5;
        }
        if (h70.j(uri)) {
            return 6;
        }
        if (h70.d(uri)) {
            return 7;
        }
        if (h70.l(uri)) {
            return 8;
        }
        return -1;
    }

    public nd0 b() {
        return this.j;
    }

    public a c() {
        return this.a;
    }

    public od0 d() {
        return this.g;
    }

    public boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ih0)) {
            return false;
        }
        ih0 ih0 = (ih0) obj;
        if (!y50.a(this.b, ih0.b) || !y50.a(this.a, ih0.a) || !y50.a(this.d, ih0.d) || !y50.a(this.j, ih0.j) || !y50.a(this.g, ih0.g) || !y50.a(this.h, ih0.h) || !y50.a(this.i, ih0.i)) {
            return false;
        }
        kh0 kh0 = this.p;
        m40 m40 = null;
        m40 c2 = kh0 != null ? kh0.c() : null;
        kh0 kh02 = ih0.p;
        if (kh02 != null) {
            m40 = kh02.c();
        }
        return y50.a(c2, m40);
    }

    public b f() {
        return this.l;
    }

    public kh0 g() {
        return this.p;
    }

    public int h() {
        rd0 rd0 = this.h;
        if (rd0 != null) {
            return rd0.b;
        }
        return 2048;
    }

    public int hashCode() {
        kh0 kh0 = this.p;
        return y50.b(this.a, this.b, this.d, this.j, this.g, this.h, this.i, kh0 != null ? kh0.c() : null, this.r);
    }

    public int i() {
        rd0 rd0 = this.h;
        if (rd0 != null) {
            return rd0.a;
        }
        return 2048;
    }

    public qd0 j() {
        return this.k;
    }

    public boolean k() {
        return this.e;
    }

    public gf0 l() {
        return this.q;
    }

    public rd0 m() {
        return this.h;
    }

    public Boolean n() {
        return this.r;
    }

    public sd0 o() {
        return this.i;
    }

    public synchronized File p() {
        if (this.d == null) {
            this.d = new File(this.b.getPath());
        }
        return this.d;
    }

    public Uri q() {
        return this.b;
    }

    public int r() {
        return this.c;
    }

    public boolean t() {
        return this.m;
    }

    public String toString() {
        y50.b d2 = y50.d(this);
        d2.b(C0201.m82(3546), this.b);
        d2.b(C0201.m82(3547), this.a);
        d2.b(C0201.m82(3548), this.g);
        d2.b(C0201.m82(3549), this.p);
        d2.b(C0201.m82(3550), this.k);
        d2.b(C0201.m82(3551), this.h);
        d2.b(C0201.m82(3552), this.i);
        d2.b(C0201.m82(3553), this.j);
        d2.b(C0201.m82(3554), this.r);
        return d2.toString();
    }

    public boolean u() {
        return this.n;
    }

    public Boolean v() {
        return this.o;
    }
}
