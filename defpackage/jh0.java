package defpackage;

import android.net.Uri;
import defpackage.ih0;
import vigqyno.C0201;

/* renamed from: jh0  reason: default package */
/* compiled from: ImageRequestBuilder */
public class jh0 {
    private Uri a = null;
    private ih0.b b = ih0.b.FULL_FETCH;
    private rd0 c = null;
    private sd0 d = null;
    private od0 e = od0.a();
    private ih0.a f = ih0.a.DEFAULT;
    private boolean g = ce0.h().a();
    private boolean h = false;
    private qd0 i = qd0.HIGH;
    private kh0 j = null;
    private boolean k = true;
    private boolean l = true;
    private Boolean m = null;
    private gf0 n;
    private nd0 o = null;
    private Boolean p = null;

    /* renamed from: jh0$a */
    /* compiled from: ImageRequestBuilder */
    public static class a extends RuntimeException {
        public a(String str) {
            super(C0201.m82(13421) + str);
        }
    }

    private jh0() {
    }

    public static jh0 b(ih0 ih0) {
        jh0 r = r(ih0.q());
        r.v(ih0.d());
        r.t(ih0.b());
        r.u(ih0.c());
        r.w(ih0.e());
        r.x(ih0.f());
        r.y(ih0.g());
        r.z(ih0.k());
        r.B(ih0.j());
        r.C(ih0.m());
        r.A(ih0.l());
        r.D(ih0.o());
        r.E(ih0.v());
        return r;
    }

    public static jh0 r(Uri uri) {
        jh0 jh0 = new jh0();
        jh0.F(uri);
        return jh0;
    }

    public jh0 A(gf0 gf0) {
        this.n = gf0;
        return this;
    }

    public jh0 B(qd0 qd0) {
        this.i = qd0;
        return this;
    }

    public jh0 C(rd0 rd0) {
        this.c = rd0;
        return this;
    }

    public jh0 D(sd0 sd0) {
        this.d = sd0;
        return this;
    }

    public jh0 E(Boolean bool) {
        this.m = bool;
        return this;
    }

    public jh0 F(Uri uri) {
        z50.g(uri);
        this.a = uri;
        return this;
    }

    public Boolean G() {
        return this.m;
    }

    public void H() {
        Uri uri = this.a;
        if (uri != null) {
            if (h70.j(uri)) {
                if (!this.a.isAbsolute()) {
                    throw new a(C0201.m82(31205));
                } else if (!this.a.getPath().isEmpty()) {
                    try {
                        Integer.parseInt(this.a.getPath().substring(1));
                    } catch (NumberFormatException unused) {
                        throw new a(C0201.m82(31203));
                    }
                } else {
                    throw new a(C0201.m82(31204));
                }
            }
            if (h70.e(this.a) && !this.a.isAbsolute()) {
                throw new a(C0201.m82(31206));
            }
            return;
        }
        throw new a(C0201.m82(31207));
    }

    public ih0 a() {
        H();
        return new ih0(this);
    }

    public nd0 c() {
        return this.o;
    }

    public ih0.a d() {
        return this.f;
    }

    public od0 e() {
        return this.e;
    }

    public ih0.b f() {
        return this.b;
    }

    public kh0 g() {
        return this.j;
    }

    public gf0 h() {
        return this.n;
    }

    public qd0 i() {
        return this.i;
    }

    public rd0 j() {
        return this.c;
    }

    public Boolean k() {
        return this.p;
    }

    public sd0 l() {
        return this.d;
    }

    public Uri m() {
        return this.a;
    }

    public boolean n() {
        return this.k && h70.k(this.a);
    }

    public boolean o() {
        return this.h;
    }

    public boolean p() {
        return this.l;
    }

    public boolean q() {
        return this.g;
    }

    @Deprecated
    public jh0 s(boolean z) {
        if (z) {
            D(sd0.a());
            return this;
        }
        D(sd0.d());
        return this;
    }

    public jh0 t(nd0 nd0) {
        this.o = nd0;
        return this;
    }

    public jh0 u(ih0.a aVar) {
        this.f = aVar;
        return this;
    }

    public jh0 v(od0 od0) {
        this.e = od0;
        return this;
    }

    public jh0 w(boolean z) {
        this.h = z;
        return this;
    }

    public jh0 x(ih0.b bVar) {
        this.b = bVar;
        return this;
    }

    public jh0 y(kh0 kh0) {
        this.j = kh0;
        return this;
    }

    public jh0 z(boolean z) {
        this.g = z;
        return this;
    }
}
