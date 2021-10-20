package defpackage;

import vigqyno.C0201;

/* renamed from: n20  reason: default package */
/* compiled from: ServerConfiguration */
public class n20 {
    public static final i30 r = i30.V1_SERVER_SPLITTING;
    private static final c s = c.OK;
    private final int a;
    private final boolean b;
    private final q20 c;
    private final int d;
    private final i30 e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final m20 l;
    private final int m;
    private final int n;
    private final boolean o;
    private final c p;
    private final long q;

    /* renamed from: n20$c */
    /* compiled from: ServerConfiguration */
    public enum c {
        OK,
        ERROR
    }

    public static b s() {
        return new b();
    }

    public int A() {
        return this.d;
    }

    public int B() {
        return this.n;
    }

    public q20 C() {
        return this.c;
    }

    public c D() {
        return this.p;
    }

    public long E() {
        return this.q;
    }

    public int F() {
        return this.k;
    }

    public i30 G() {
        return this.e;
    }

    public boolean H() {
        return this.f > 0;
    }

    public boolean I() {
        return this.g == 1;
    }

    public boolean J() {
        return this.b;
    }

    public boolean K() {
        return this.o;
    }

    public long L() {
        return (long) ((this.a * 1024) - 5);
    }

    public b M() {
        return N(false);
    }

    public b N(boolean z) {
        return new b(this, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n20.class != obj.getClass()) {
            return false;
        }
        n20 n20 = (n20) obj;
        if (this.a == n20.a && this.b == n20.b && this.c.equals(n20.c) && this.d == n20.d && this.e == n20.e && this.f == n20.f && this.g == n20.g && this.h == n20.h && this.i == n20.i && this.j == n20.j && this.k == n20.k && this.l.equals(n20.l) && this.m == n20.m && this.n == n20.n && this.o == n20.o && this.q == n20.q && this.p == n20.p) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.q;
        return (((((((((((((((((((((((((((((((this.a * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e.ordinal()) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + this.l.hashCode()) * 31) + this.m) * 31) + this.n) * 31) + (this.o ? 1 : 0)) * 31) + this.p.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public int t() {
        return this.h;
    }

    public String toString() {
        return C0201.m82(35016) + this.a + C0201.m82(35017) + this.b + C0201.m82(35018) + this.c + C0201.m82(35019) + this.d + C0201.m82(35020) + this.e + C0201.m82(35021) + this.f + C0201.m82(35022) + this.g + C0201.m82(35023) + this.h + C0201.m82(35024) + this.i + C0201.m82(35025) + this.j + C0201.m82(35026) + this.k + C0201.m82(35027) + this.l + C0201.m82(35028) + this.m + C0201.m82(35029) + this.n + C0201.m82(35030) + this.o + C0201.m82(35031) + this.p + C0201.m82(35032) + this.q + '}';
    }

    public int u() {
        return this.a;
    }

    public int v() {
        return this.f;
    }

    public int w() {
        return this.m;
    }

    public m20 x() {
        return this.l;
    }

    public int y() {
        return this.i;
    }

    public int z() {
        return this.j;
    }

    private n20(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.m = bVar.m;
        this.n = bVar.n;
        this.o = bVar.o;
        this.q = bVar.q;
        this.p = bVar.p;
    }

    /* renamed from: n20$b */
    /* compiled from: ServerConfiguration */
    public static class b {
        private int a;
        private boolean b;
        private q20 c;
        private int d;
        private i30 e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private m20 l;
        private int m;
        private int n;
        private boolean o;
        private c p;
        private long q;

        public b() {
            this.a = 150;
            this.b = true;
            this.c = q20.d;
            this.d = 120;
            this.e = n20.r;
            this.f = 0;
            this.g = 1;
            this.h = 1;
            this.i = 1;
            this.j = 1;
            this.k = 100;
            this.l = m20.b;
            this.m = 1;
            this.n = 1;
            this.o = false;
            this.p = n20.s;
            this.q = 0;
        }

        public b A(int i2) {
            this.j = i2;
            return this;
        }

        public b B(boolean z) {
            this.b = z;
            return this;
        }

        public b C(int i2) {
            this.d = i2;
            return this;
        }

        public b D(int i2) {
            this.n = i2;
            return this;
        }

        public b E(q20 q20) {
            this.c = q20;
            return this;
        }

        public b F(c cVar) {
            this.p = cVar;
            return this;
        }

        public b G(boolean z) {
            this.o = z;
            return this;
        }

        public b H(long j2) {
            this.q = j2;
            return this;
        }

        public b I(int i2) {
            this.k = i2;
            return this;
        }

        public b J(i30 i30) {
            this.e = i30;
            return this;
        }

        public n20 r() {
            return new n20(this);
        }

        public b s(int i2) {
            this.g = i2;
            return this;
        }

        public b t(int i2) {
            this.h = i2;
            return this;
        }

        public b u() {
            this.g = 0;
            return this;
        }

        public b v(int i2) {
            this.a = i2;
            return this;
        }

        public b w(int i2) {
            this.f = i2;
            return this;
        }

        public b x(int i2) {
            this.m = i2;
            return this;
        }

        public b y(m20 m20) {
            this.l = m20;
            return this;
        }

        public b z(int i2) {
            this.i = i2;
            return this;
        }

        public b(n20 n20, boolean z) {
            this.a = n20.a;
            this.b = n20.b;
            this.c = n20.c;
            this.d = n20.d;
            this.e = n20.e;
            this.f = n20.f;
            this.g = n20.g;
            this.h = n20.h;
            this.i = n20.i;
            this.j = n20.j;
            this.k = n20.k;
            this.l = n20.l.d().b();
            this.q = n20.q;
            if (z) {
                this.m = 1;
                this.n = 1;
                this.o = false;
                this.p = n20.s;
                return;
            }
            this.m = n20.m;
            this.n = n20.n;
            this.o = n20.o;
            this.p = n20.p;
        }
    }
}
