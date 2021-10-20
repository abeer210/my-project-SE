package defpackage;

import com.dynatrace.android.agent.u;
import java.security.KeyStore;
import javax.net.ssl.KeyManager;
import vigqyno.C0201;

/* renamed from: c20  reason: default package */
/* compiled from: ConfigurationBuilder */
public class c20 {
    public static final String w = (u.b + C0201.m82(34971));
    private final z10 a;
    private final String b;
    private final String c;
    private boolean d;
    private KeyStore e;
    private KeyManager[] f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private String[] n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private o10 s;
    private boolean t;
    private boolean u;
    private i20 v;

    public c20(z10 z10, String str, String str2) {
        this(z10, str, str2, new e20());
    }

    public c20(z10 z10, String str, String str2, e20 e20) {
        this.n = new String[0];
        this.a = z10;
        this.b = str;
        this.c = str2;
        b(e20.e());
        e(e20.i());
        d(e20.g());
        h(e20.o());
        f(e20.k());
        g(e20.n());
        this.g = e20.h();
        this.h = e20.p();
        this.j = e20.c();
        this.k = e20.b();
        this.m = e20.q();
        this.o = e20.l();
        this.r = e20.d();
        this.l = e20.f();
        this.i = e20.m();
        this.s = null;
        this.e = null;
        this.f = null;
        this.v = e20.j();
    }

    public b20 a() {
        z10 z10;
        String str = this.c;
        String r2 = C0201.m82(34972);
        if (str == null || (z10 = this.a) == null) {
            if (this.q) {
                s30.t(w, r2);
            }
            return null;
        }
        String a2 = a20.a(str, z10 != z10.APP_MON);
        String r1 = C0201.m82(34973);
        if (a2 == null) {
            if (this.q) {
                String str2 = w;
                s30.t(str2, C0201.m82(34974) + this.c + r1);
                s30.t(w, r2);
            }
            return null;
        }
        String b2 = a20.b(this.b);
        if (b2 != null) {
            return new b20(s30.q(s30.o(b2, 250)).replaceAll(C0201.m82(34976), C0201.m82(34977)), a2, this.a, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v);
        }
        if (this.q) {
            String str3 = w;
            s30.t(str3, C0201.m82(34975) + this.b + r1);
            s30.t(w, r2);
        }
        return null;
    }

    public c20 b(boolean z) {
        this.d = z;
        return this;
    }

    public c20 c(boolean z) {
        this.l = z;
        return this;
    }

    public c20 d(boolean z) {
        this.q = z;
        return this;
    }

    public c20 e(boolean z) {
        this.p = z;
        return this;
    }

    public c20 f(String... strArr) {
        String[] c2 = a20.c(strArr);
        if (c2 != null) {
            this.n = c2;
        }
        return this;
    }

    public c20 g(boolean z) {
        if (this.a != z10.APP_MON) {
            this.u = z;
        }
        return this;
    }

    public c20 h(boolean z) {
        this.t = z;
        return this;
    }
}
